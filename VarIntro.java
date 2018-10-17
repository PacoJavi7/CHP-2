
/**
 * VarIntro.java 
 *
 * @author: Javier Espinosa
 * Assignment #: 7
 * 
 * Brief Program Description: Introduce us into variables
 * 
 *
 */

public class VarIntro 
{
   public static void main(String[] args)
   {
       //Step 1 Declraing the variable:
       int numStudents;
       //Step 2 initialize the variable
       numStudents = 22; 
       System.out.println(numStudents);
       double gpa = 3.4;
       // Always left side getting the right side getting what is on the other side:
       //3.4 = double gpa;
       gpa = 3.7;
       // once a bucket is determined other things can not be ut in gpa = "I am awesome";
       gpa = 4;
       boolean passing = true;
       
       gpa = 3;
       
       System.out.println(gpa);
       
       String name = "Javier";
       String course = new String("APCS");
       System.out.println("My name is "+  name + ". Nice to meet you");
       
       System.out.println(4 + 5);
    
       System.out.println("4 + 5");
     
       System.out.println("4"+ 5);
     
       System.out.println("4"+"5");
      
       System.out.println("4 + 5 = " + (4 + 5));
       
       System.out.println(4 + 5);
       System.out.println(4 - 5);
       System.out.println(4 * 5);
       
       System.out.println(5.0 / 2);
       
       int question = 7;
       int correct = 5;
       System.out.println("My score is " + (1.0* correct / question));
       System.out.println(5%2);// = 1
       System.out.println(8%3);// = 2
       System.out.println(3%8);// = 3
       System.out.println(8%0);// = does not work
       
       
   }
}
