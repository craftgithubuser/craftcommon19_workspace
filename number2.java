//package addnumber2;
import java.until.Scanner;
public class number2 {

  public static void main(String[] args) {
    
    int num1,num2,sum;
    Scanner Scanner;
    
    Scanner=new Scanner(System.in);
    //Take two integer input from user and
    //store it in variable num1 and num2
    System.out.println("Enter first number");
    num1=Scanner.nextInt();
    
    /*
    * call getSum by passing num1 and num2 as Parameter 
    */
    sum=getSum(num1,num2);
    System.out.println("sum of"+num1 +"and"+num2+"=+sum");
  }
    Public  static int getSum(int num1,int num2) {
      int Sum;
      Sum= num1+num2;
      return Sum;
    }
    {