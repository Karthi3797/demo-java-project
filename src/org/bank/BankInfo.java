package org.bank;

public class BankInfo implements FuelDetails {

	

	@Override
	public void diesel() {
		System.out.println("diesel");
		
		
	}

	@Override
	public void petrol() {
		System.out.println("petrol");
		
		
	}
	public void fuel() {
		System.out.println("fuel");
	}
	public static void main(String[] args) {
		BankInfo b = new BankInfo();
		FuelDetails f= new BankInfo();
		f.diesel();
		f.petrol();
		b.fuel();
		
	}

}