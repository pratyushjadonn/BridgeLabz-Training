package scenario.based.StreamBuzz;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
public class StreamBuzzMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Program program=new Program();
		System.out.println("Welcome to Stream buzz");
		while(true) {
	    
		System.out.println("1. Register Creator\n"+
				"2. Show Top posts\n"+ 
				"3. Calculate Average Likes\n"+
				"4. Exit\n" +
				"Enter you choice:\n ");
		int choice=sc.nextInt();
		switch (choice) {
		case 1: {
			System.out.println("Enter Creator Name");
			String name=sc.next();
			System.out.println("Enter weekly Likes (Week 1 to 4)");
			double[] likes=new double[4];
			for(int i=0;i<4;i++) {
				likes[i]=sc.nextDouble();
			}
			CreatorStats record=new CreatorStats(name, likes);
			program.RegisterCreator(record);
		    break;
		}
		case 2: {
			System.out.println("Enter Like threshold");
			double threshold=sc.nextDouble();
			List<CreatorStats> record=program.EngagementBoard;
			HashMap<String,Integer> dic=program.GetTopPostCounts(record, threshold);
			if(dic.isEmpty()) {
				System.out.println("No top-performing posts this week");
	
			}
			else {
                for (HashMap.Entry<String, Integer> entry : dic.entrySet()) {
                    System.out.println(entry.getKey() + " - " + entry.getValue());
                }
            }
			break;
				
		}
		case 3: {
			System.out.println("Overall average weekly likes: "+program.CalculateAverageLikes());
			break;	
		}
		case 4:{
			System.out.println("Logging off - Keep Creating with StreamBuzz!");
            return;	
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
		
	}
		
	}

}
