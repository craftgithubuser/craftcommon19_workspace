package artimaticOperation;

public class SumFirst10N {

	public static void main(String[] args) {
		//Exercise 4: Write a program that prints the first ten terms of the Fibonacci series (0, 1, 1, 2, 3, 5, 8, 13, 21, 34).
		int Sum = 0, i ;
		for(i =1; i<=10; i++){
			Sum = Sum + i;
		}
		System.out.println("The total of the first 10 natural numbers: " + Sum);

	}

}
