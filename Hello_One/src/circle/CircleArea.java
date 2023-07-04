package circle;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
					   
		   Scanner input = new Scanner(System.in);
		   System.out.println("Enter radius of the circle and click enter");
		   float radius = input.nextFloat();
		   float pi =3.14234f;
		   double Area = (radius*radius) * pi;
		   System.out.println("Area of the circle is = " + Area);
		   // approximation of the result
		   System.out.println("Area of the circle is:" + String.format("%.3f", Area));
		   	   
		   
	}

}