package scenario.based;
import java.util.Scanner;
public class SandeepFitnessChallengeTracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int countPushups=0;
		int days=0;
		String dayStatus;
		while(true) {
			System.out.println("Enter the Day Status(Active/Rest)");
			dayStatus=scanner.next();
			if(dayStatus.equals("Active")) {
			System.out.println("Enter the complete a pushup in a day");
			int pushup=scanner.nextInt();
			countPushups+=pushup;
			days++;
			}
			else {
				continue;
			}
			System.out.println("Total Pushups : " +countPushups);
			System.out.println("Average (Total Pushups/total days ): "+(countPushups/days));
		}

	}

}
