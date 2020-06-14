package com.simplilearn.whileloop;

public class WhileLoop3 {

	public static void main(String[] args) {
		
		// List Of IPs
		String ips[] = {"192.168.2.3","192.168.2.13","192.168.2.23","192.168.2.33","192.168.2.43"};
		
		int index = 0;		
		while(index < ips.length) {
			// logic
			System.out.println("The Ip :"+ips[index]);
			index++;
		}
		
//		"192.168.2.23"  replace with "192.168.2.123"
		System.out.println("--------------------------------------");
		int ind = 0;
		String searchIp  = "192.168.2.23";
		String replaceIp  = "192.168.2.123";
		
		while(ind < ips.length) {
			// replace ip
			
			if(searchIp.equals(ips[ind])) {
				ips[ind] = replaceIp;
			}			
			ind++;
		}
		
		System.out.println("After replacing Ip");
		
		int i = 0;		
		while(i < ips.length) {
			// logic
			System.out.println("The Ip :"+ips[i]);
			i++;
		}
	}

}

