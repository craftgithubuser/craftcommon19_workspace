package exersiceone;
import java.util.Scanner;
public class ExersiceTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner input = new Scanner(System.in);
  String cont;
  do {
  System.out.println("pls inter any integer number:");
  int value = input .nextInt();
  String result = (value%2 ==0)? "you entered even number": "you entered odd number";
  System.out.println(result +"\n");
  System.out.println("press y to continue:");
  cont = input.next();
  }while(cont.equalsIgnoreCase("y"));
	}

}
