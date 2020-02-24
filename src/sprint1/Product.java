package sprint1;

import java.util.Scanner;

public class Product {
    int supplierId;
    String name;
    String address; 
	double phoneNo;

	public int supplierId() {
		System.out.println("enter the supplierId");
		Scanner sc = new Scanner(System.in);
		supplierId = sc.nextInt();
		sc.close();
			return supplierId;		
	}
	
	public String name() {
		System.out.println("enter the name");
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		sc.close();
			return name;
	}
	
	public String address() {
		System.out.println("enter address");
		Scanner sc = new Scanner(System.in);
		address = sc.next();
		sc.close();
			return address;
	}
	
	public double phoneNo() {
		System.out.println("enter the phoneNo");
		Scanner sc = new Scanner(System.in);
		phoneNo = sc.nextDouble();
		sc.close();
			return phoneNo;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}

}
