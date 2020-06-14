package com.simplilearn.forloop;

public class BankOpr {

	static int accounts[] = {101,102,103,104,105,106};
	static String accountsNames [] = {"John","Mike","David","Will","Sam","Marry"};
	static double  accountsBalace[] = {948484,102121,1032323,14232,1052321,141246};
	
	public static void main(String[] args) {
		
		BankOpr.showBalace(106);
		BankOpr.depositBalace(106,2324);

	}
	
	public static  void showBalace(int accountNo) {
		for(int i= 0; i<BankOpr.accounts.length;i++) {
			if(BankOpr.accounts[i]== accountNo) {
				System.out.println("The account Number is "+BankOpr.accounts[i]+
						" with user Name "+ BankOpr.accountsNames[i]+
						" with Balance "+ BankOpr.accountsBalace[i]);
			}
		}
	}
	
	public static  void depositBalace(int accountNo,double ammount) {
		for(int i= 0; i<BankOpr.accounts.length;i++) {
			if(BankOpr.accounts[i]== accountNo) {
				
				BankOpr.accountsBalace[i] = BankOpr.accountsBalace[i] + ammount;
				
				System.out.println("The account Number is "+BankOpr.accounts[i]+
						" with user Name "+ BankOpr.accountsNames[i]+
						" with Balance "+ BankOpr.accountsBalace[i]);
			}
		}
	}
	
	// withdraw
}
