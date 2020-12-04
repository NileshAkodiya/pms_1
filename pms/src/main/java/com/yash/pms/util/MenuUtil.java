package com.yash.pms.util;

import java.util.Scanner;

import com.yash.pms.helper.ProductHelper;

public class MenuUtil {
	ProductHelper helper=new ProductHelper();
    
	public void start() {
		System.out.println("enter your choice\n1 for adding a product.\n2 for seeing all product\n3 for searching a product\n4 for updating a product \n5 for deleting a product ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		switch(n) {
		
		case 1:
			helper.case1();
			break;		
		
		case 2:
			helper.case2();
			break;		
			
		case 3:
			helper.case3();
			break;			
		case 4:
			helper.case4();
			break;
		case 5:
			helper.case5();
			break;
			
		default :
			System.out.println("Enter the correct choice");
			start();
			
			
		}
		System.out.println("\nDo you want to continue? enter \n1 for yes\n2 for no");
		int c=sc.nextInt();
		if(c==1)
			start();
		else
			System.out.println("Thanks for using PMS.");
	}
	

}
