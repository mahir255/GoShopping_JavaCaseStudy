package com.tns.framework;

public abstract class NormalAcc extends ShopAcc {
	protected static float deliveryCharge=50 ;

	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges);
		this.deliveryCharge = deliveryCharge;
	}
	
	public void bookProduct(float deliveryCharge)
	{
		System.out.println("Charges are:"+deliveryCharge);
	}

	public float getDeliveryCharge() {
		return deliveryCharge;
	}

	public void setDeliveryCharge(float deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}
	
	@Override
	public String toString() {
		return "NormalAcc [deliveryCharge=" + deliveryCharge + ", accNo=" + accNo + ", charges=" + charges
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

	
	
}
