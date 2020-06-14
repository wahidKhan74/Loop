package com.simplilearn.whileloop;

public class WhileLoop2 {

	public static void main(String[] args) {
		
		// ordered collection of similar type of values
		int numArr [] = { 10, 200,30,40,500 };
		
		int i = 0;
		
		while(i< 5) {
			System.out.println("The index : "+i);
			System.out.println("The values : "+numArr[i]);
			i++;  // i = i+1;
		}
		System.out.println("------------------------------------");
		// create while loop to sum array
		int sum  = 0;
		int j = 0;
		while(j < numArr.length) {
			sum = sum + numArr[j];
			j++;
		}
		System.out.println("The sum Value :"+sum);
		System.out.println("The Average Value :"+sum / numArr.length);
	}

}
