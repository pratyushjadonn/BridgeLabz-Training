import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int sumOfNFactorial=1;
        int p;

        for(int i=1;i<=n;i++){

            sumOfNFactorial=sumOfNFactorial*i;
            System.out.println("the factorial of first "+i+":"+sumOfNFactorial);

        }
        System.out.println("the total sum of n factorials:"+sumOfNFactorial);

    }
}
