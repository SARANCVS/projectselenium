package org.bank;

public class BankInfo extends AxisBank{
	public void savings() {
System.out.println("10000");
	}
	public void fixed() {
System.out.println("5000");
	}
	public static void main(String[] args) {
		BankInfo a=new BankInfo();
				a.savings();
				a.fixed();
				a.deposit();
		         
	}
}
