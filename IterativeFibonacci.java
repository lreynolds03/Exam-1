/*********************
 * 
 * Liam Reynolds
 * Professor Cates
 * 02/28/23
 * nth Fibonacci Term (recursive) - Algorithm 1.6
 * 
 * Description: This program finds the nth term in the fibonacci sequence using iteration, 
 * and also times how long it takes to run for a given input
 * 
 *********************/

import java.util.Scanner;

public class IterativeFibonacci {
	
	public static int fib(int n) {
		
		//start time measurement
		long startTime = System.nanoTime();
		
		int i;
		int[] array = new int[n];
		
		// starting fibonacci sequence at 1 instead of zero to match recursive algorithm,
		// otherwise would be one term behind in the sequence for each input 
		array[0] = 1;
		array[1] = 1;
		
		if (n > 0) {
			for(i = 2; i < n; i++) {
				array[i] = array[i-1] + array[i-2];
			}
	
		}
		
		//calculate how long it took
        long endTime = System.nanoTime();
        
        //calculate how long it took to run algorithm
        long totalTime = endTime-startTime;
        
        System.out.println("It took "+ totalTime + "ns.");
       
        return array[n-1];
        	
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("What term would you like to find?: ");
		int term = input.nextInt();
		
		System.out.print("The " + term + " term in the fibonacci sequence is " + fib(term));
		
		input.close();
		
	}

}
