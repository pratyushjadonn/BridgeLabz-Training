import java.util.Scanner;

public class armsStrong {
    static int count(int number) {
        int count = 0;
        while (number > 0) {
            number=number/10;
            count++;
        }
        return count;
    }
   static boolean check_arms(int number ,int n){
        int sum=0;
        int p=number;
        while(number>0){
            int rem=number%10;
            sum=(int)(sum+Math.pow(rem,n));
            number=number/10;
        }
        if(p==sum){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
        int n=count(number);
        System.out.println(n);
        System.out.println(check_arms(number,n));






    }
}
