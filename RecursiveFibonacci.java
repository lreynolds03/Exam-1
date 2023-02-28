/*********************
 * 
 * Liam Reynolds
 * Professor Cates
 * 02/28/23
 * nth Fibonacci Term (recursive) - Algorithm 1.6
 * 
 * Description: This program finds the nth term in the fibonacci sequence using recursion, 
 * and also times how long it takes to run for a given input
 * 
 * */

import java.util.Scanner;
	
public class RecursiveFibonacci {
	
	public static int fib(int n) {
		
		if(n <= 1) {
			return n;
		}
		else {
			return fib(n-1) + fib(n-2);
		}
        	
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("What term would you like to find?: ");
		int term = input.nextInt();
		
		//start time measurement
		// I had to time the method call because I couldn't figure out how to incorporate it within the algorithm
		// Since there are return statements within the algorithm, it wasn't able to time it properly
		// as the code to stop the timer had to come after the return statement and couldn't be reached
		long startTime = System.nanoTime();
		
		fib(term);

		//calculate how long it took
        long endTime = System.nanoTime();
        
        //calculate how long it took to run algorithm
        long totalTime = endTime+startTime;
        
        System.out.println("The " + term + "th term in the fibonacci sequence is " + fib(term));
        
        System.out.print("It took "+ totalTime + "ns.");
		
		input.close();
		
	}
	
}