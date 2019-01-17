// A Java program to demonstrate simple lambda expressions
import java.util.ArrayList;

class Sample
{
	public static void main(String args[])
	{
		// Creating an ArrayList with elements
		// {1, 2, 3, 4}
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		arrList.add(4);
		arrList.add(5);
		arrList.add(6);

		// Using lambda expression to print all elements
		// of arrList
    System.out.println("Printing out the array");
		arrList.forEach(n -> System.out.println(n));

		// Using lambda expression to print even elements
		// of arrList
    System.out.println("Printing out even numbers");
		arrList.forEach(n -> { if (n%2 == 0) System.out.println(n); });
	}
}
