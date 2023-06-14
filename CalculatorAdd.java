import java.util.Scanner;

public class CalculatorAdd
{
  
  public static void main(String[] args)
  {
    Addition();
    System.out.println("Addition Ended");
    //subtraction();
	}
	
  
  public static void Addition()
  {
    Scanner input = new  Scanner(System.in);
    int a,b, sum;
    System.out.println("Enter the first number !");
    a = input.nextInt();
    System.out.println("Enter the second number !");
    b = input.nextInt();
    sum = a + b;
    System.out.printf("The sum of a and b is %d%n", sum);
    
  }
  }