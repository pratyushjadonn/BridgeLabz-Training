package scenario.based.StreamBuzz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Program {
	 List<CreatorStats> EngagementBoard =new ArrayList<>();
	 
	 public void RegisterCreator(CreatorStats record) {
		 EngagementBoard.add(record);
		 System.out.println("Creator registered successfully");
		 
	 }
	 public HashMap<String,Integer > GetTopPostCounts (List<CreatorStats> records, double likeThreshold){
		HashMap<String, Integer> dict=new HashMap<>();
	    for(CreatorStats i:records) {
	    	int count=0;
	    	for(double like: i.weeklyLikes) {
	    		if(like>= likeThreshold) {
	    			count++;
	    		}
	    	}
	    	if(count>0) {
	    		dict.put(i.creatorName,count);
	    	}
	    }
	    return dict;	 
	 }
	 
	 public double CalculateAverageLikes() {
		 double sum=0;
		 int totalWeeks=0;
		 for(CreatorStats list: EngagementBoard) {
		      for(double likes:list.weeklyLikes) {
		    	  sum+=likes;
		    	  totalWeeks++;
			 }
		 }
		 return sum/totalWeeks;
		 	 
	 }
	 
	 	 

}
