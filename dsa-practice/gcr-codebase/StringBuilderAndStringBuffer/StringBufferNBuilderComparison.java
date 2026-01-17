package stringbuilder_stringbuffer;
import java.util.*;
public class StringBufferNBuilderComparison {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//size of the array
		int n=1000000;
		String[] stringArray=new String[n];
		for(int i=0;i<n;i++) {
			stringArray[i]="Hello";
		}
		//method call
		concatenationUsingStringBuilder(stringArray);
		concatenationUsingStringBuffer(stringArray);
		
	}
	public static String concatenationUsingStringBuilder(String[] stringArray) {
		StringBuilder stringbuilder=new StringBuilder();
		//time before starting the operation
		long startBuilder=System.nanoTime();
		for(int i=0;i<stringArray.length;i++) {
			stringbuilder.append(stringArray[i]);
		}
		//time after ending the operation
		long endBuilder=System.nanoTime();
		//time taken by the stringbuilder to append strings from a string array
		long builderTime=endBuilder-startBuilder;
		System.out.println("Time take by String Builder to concateante string is : "+builderTime+" nanoSeconds");
		return stringbuilder.toString();
	}
	public static String concatenationUsingStringBuffer(String[] stringArray) {
		StringBuffer stringbuffer=new StringBuffer();
		//time before starting the operation
		long startBuffer=System.nanoTime();
		for(int i=0;i<stringArray.length;i++) {
			stringbuffer.append(stringArray[i]);
		}
		//time after ending the operation
		long endBuffer=System.nanoTime();
		//time taken by the stringbuffer to append strings from a string array
		long bufferTime=endBuffer-startBuffer;
		System.out.println("Time take by String Buffer to concateante string is : "+bufferTime+" nanoSeconds");
		return stringbuffer.toString();
	}

}
