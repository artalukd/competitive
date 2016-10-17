package medium;
import java.util.*;

public class Coins {
	static final int a[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 17, 19, 23};

	public static int branch(int c)
	{	
		if ( 0 <= Arrays.binarySearch(a, c))
		{
			return c;	
		}
		else 
		{	
			return branch( c/2)+ branch(c/3)+branch(c/4);
		}
	}
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		int n[] = new int[10];
		for(int i = 0; i<n.length;i++)
		{
			n[i] = sc.nextInt();
		}
		long startTime = System.nanoTime(); 
		for(int i = 0; i<n.length;i++)
		{
			System.out.println(branch(n[i]));	
		}
		
		long endTime = System.nanoTime();
		System.out.println("Took "+((endTime - startTime)*Math.pow(10, -9)) + " s"); 

	}
}
