package com.simplilearn.dowhileloop;

public class DoWhileLoop2 {

	public static void main(String[] args) {
		
		String playersList[] = {"Sachin","Kholi","Usuf","Raina","Dhoni"};
		
		int index = 0;
		do {
			System.out.println("The Player No. "+index + " and the name is "+ playersList[index]);
			index ++;
			
		}while(index < playersList.length);
		

	}

}
