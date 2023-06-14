package exersiceone;
import java.util.Scanner;
public class ExersiceOneForSoresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner in = new Scanner(System.in);
   
   System.out.println("pls inter the Rdius of the circle");
   double Radius = in.nextDouble();
   
//   using Area
    double area = Math.PI *Radius * Radius;
    System.out.println("pls inter the area of circle:" + area);
   
	}

}
