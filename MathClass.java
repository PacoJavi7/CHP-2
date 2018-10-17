import java.lang.Math;
/**
 * Math.java 
 *
 * @author: Javier Espinosa
 * Assignment #: Learning
 * 
 * Brief Program Description: Do Math
 * 
 *
 */

public class MathClass
{
   public static void main(String[] args)
   {
     System.out.println(Math.PI);
     System.out.println(Math.pow(2,4));
     System.out.println((int)Math.pow(2,4));
     int num1 = 5, num2 = 7;
     System.out.println(Math.max(num1,num2));
       
      System.out.println();
      System.out.println(Math.random());
      System.out.println(Math.random());
      System.out.println(Math.random());
      System.out.println(Math.random());
       System.out.println(Math.random());
       System.out.println(Math.random());
       
       //Simulate a 6 sided die roll using math.random but no nextInt
    for (int i = 0; i<10; i++){
       System.out.println((int)(Math.random()*5)+1);
   
    }
}
}
