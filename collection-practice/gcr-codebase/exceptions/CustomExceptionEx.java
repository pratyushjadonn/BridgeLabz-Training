package Exceptions;

import java.util.*;
class CustomException extends Exception{
   CustomException(String msg){
	   super(msg);
   }
}

public class CustomExceptionEx{
    public static void main(String []args){
      Scanner sc=new Scanner(System.in);
      int age=sc.nextInt();
      try {
          validateAge(15);
      } catch (CustomException e) {
          System.out.println("Caught custom exception: " + e.getMessage());
      }
  }

    public static void validateAge(int age) throws CustomException{
        if(age<18){
            throw new CustomException("invalid Age");
        }
    }
}
