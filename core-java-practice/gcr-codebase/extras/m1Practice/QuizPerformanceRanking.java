package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class Student {
	String name;
	String course;
	int q1,q2,q3;
	int total;
    public Student(String name,String course,int q1,int q2,int q3,int total) {
    	this.name=name;
    	this.course=course;
    	this.q1=q1;
    	this.q2=q2;
    	this.q3=q3;
    	this.total=total;
    
	}
	
}

public class QuizPerformanceRanking {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		int n =sc.nextInt();
		sc.nextLine();
		
		List<Student> ls=new ArrayList<>();
		String[] inp=new String[n];
		
		for(int i=0;i<n;i++) {
			inp[i]=sc.nextLine();
		}
		
		for(int i =0;i<n;i++) {
			String[] input=inp[i].split(" ");
			if(input[0].equals("Record")) {
				String name=input[1];
				String course=input[2];
				int q1=Integer.parseInt(input[3]);
				int q2=Integer.parseInt(input[4]);
				int q3=Integer.parseInt(input[5]);
				int total=q1+q2+q3;
				ls.add(new Student(name, course, q1, q2, q3, total));	
			}
			if(input[0].equals("Top")) {
				String key=input[1];
				if(key.equals("Q1")||key.equals("Q2")||key.equals("Q3")) {
					
					int max=Integer.MIN_VALUE;
					int score=0;
					
					for(Student s:ls) {
						if(key.equals("Q1")) {
							score=s.q1;
						}
						if(key.equals("Q2")) {
							score=s.q2;
						}
						if(key.equals("Q3")) {
							score=s.q3;
						}
						
						max=Math.max(max, score);
					}
					for(Student a:ls) {
						if(key.equals("Q1")) {
							score=a.q1;
						}
						if(key.equals("Q2")) {
							score=a.q2;
						}
						if(key.equals("Q3")) {
							score=a.q3;
						}
						if(score==max){
                            System.out.println(a.name+" "+score);
                        }
					}
				}
				else {
					int max=Integer.MIN_VALUE;
					
					for(Student s:ls) {
						int score=0;
						if(s.course.equals(key)) {
							score=s.total;
							max=Math.max(score, max);
						}
					}
					for(Student s:ls) {
						if(s.course.equals(key) && s.total==max) {
							System.out.println(s.name+" "+s.total);
						}
					}
				}
			}
		}
			
	}

}
