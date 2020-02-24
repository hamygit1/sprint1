package com.capgemini.DAO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		SupplierRepository a1 = new SupplierRepository(0,12345,"Manoj","Delhi");
		SupplierRepository a2 = new SupplierRepository(1,12346,"Atal","Bihar");
		SupplierRepository a3 = new SupplierRepository(2,12349,"Harshit","Aligarh");
		ArrayList<SupplierRepository> list=new ArrayList<>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Enter the value");
		Scanner sc=new Scanner(System.in);
		i=sc.nextInt();
		System.out.println("Your Id is"+list.get(i));
	}

	
}
	