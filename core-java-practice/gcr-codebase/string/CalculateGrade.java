package string;
import java.util.Random;
import java.util.Scanner;
public class CalculateGrade {
    static Random r=new Random();
    static int[][] generateScores(int n){
        int[][] a=new int[n][3];
        for(int i=0;i<n;i++)
            for(int j=0;j<3;j++)
                a[i][j]=10+r.nextInt(91);
        return a;
    }
    static double[][] calculateStats(int[][] m){
        double[][] v=new double[m.length][4];
        for(int i=0;i<m.length;i++){
            int t=m[i][0]+m[i][1]+m[i][2];
            double avg=t/3.0;
            double p=t/3.0;
            v[i][0]=Math.round(t*100.0)/100.0;
            v[i][1]=Math.round(avg*100.0)/100.0;
            v[i][2]=Math.round(p*100.0)/100.0;
            v[i][3]=Math.round((p/100.0)*10000.0)/100.0;
        }
        return v;
    }
    static char[] calculateGrade(double[][] d){
        char[] g=new char[d.length];
        for(int i=0;i<d.length;i++){
            double p=d[i][3];
            if(p>=80) g[i]='A';
            else if(p>=70) g[i]='B';
            else if(p>=60) g[i]='C';
            else if(p>=50) g[i]='D';
            else if(p>=40) g[i]='E';
            else g[i]='R';
        }
        return g;
    }
    static void display(int[][] s,double[][] d,char[] g){
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPercent\tGrade");
        for(int i=0;i<s.length;i++){
            System.out.println(
                s[i][0]+"\t"+s[i][1]+"\t"+s[i][2]+"\t"+
                d[i][0]+"\t"+d[i][1]+"\t"+d[i][3]+"\t"+g[i]
            );
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] scores=generateScores(n);
        double[][] data=calculateStats(scores);
        char[] grades=calculateGrade(data);
        display(scores,data,grades);
    }
}