import java.util.*;
/**
 * RandomNum.java 
 *
 * @author: Javier Espinosa
 * Assignment #: 11
 * 
 * Brief Program Description: A program that will generate random numbers
 * 
 *
 */

public class RandomNum  
{
   public static void main(String[] args)
   {
       Random Number = new Random();
       
       //System.out.println(Number.nextInt());
       Random gen = new Random();
       System.out.println(gen.nextInt());
       System.out.println(gen.nextInt(11));
       System.out.println(gen.nextInt(11));
       System.out.println(gen.nextInt(11));
       System.out.println(gen.nextInt(11));
       System.out.println(gen.nextInt(11));
       
       int numone = gen.nextInt(15);
       int numtwo = gen.nextInt(15);
       int numthree = numone + numtwo;
       System.out.println(numthree);
       
       System.out.println(gen.nextDouble());
   }
}

