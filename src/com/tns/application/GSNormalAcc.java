package com.tns.application;

import com.tns.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {
	
	private static final float Charges = 0;
	private static float deliveryCharge=50;


	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges, deliveryCharge);
		// TODO Auto-generated constructor stub
	}

	
	
   	
	public GSNormalAcc() {
		super(accNo, accNm, Charges, deliveryCharge);
		
		// TODO Auto-generated constructor stub
	}




	public void bookProduct(float charges) {
		System.out.println("Dear Normal User, Your Charges are: "+charges+" with Delivery Charges is: "+deliveryCharge);
		
	}


	@Override
	public String toString() {
		return "GSNormalAcc [deliveryCharge=" + getDeliveryCharge() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}
