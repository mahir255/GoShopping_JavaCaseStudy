package com.tns.application;

import com.tns.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc{
	private static final float Charges=0;
	
	
	public float getCharges() {
		return Charges;
	}

	public GSPrimeAcc() {
		super(accNo, accNm, Charges, isPrime);
		// TODO Auto-generated constructor stub
	}

	public void bookProduct(float charges) {
		System.out.println("Dear Prime User, Your Product Charges are: "+charges);
		
	}

	@Override
	public String toString() {
		return "GSPrimeAcc [Charges=" + Charges + ", isprime=" + isPrime() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	};
	
	
}
