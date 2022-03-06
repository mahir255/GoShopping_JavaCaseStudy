package com.tns.entrypoint;


import com.tns.application.*;
import com.tns.framework.*;

public class Entry {
	public static void main(String[] args) 
	{
		//Assigning instance of GSShopFactory to ShopFactory reference.
		GSShopFactory gssfactory= new  GSShopFactory();
		
		gssfactory.getNewPrimeAccount(101, "MAHIR", 1000, true);
		gssfactory.getNewNormalAccount(102, "mahir2", 1000, 60);
		
	// Instantiate GSPrimeAcc and refer it through reference PrimeAcc.
		
		GSPrimeAcc gspacc=new GSPrimeAcc();
		gspacc.getAccNm();
		gspacc.getAccNo();
		gspacc.getCharges();
		
	     // Invoking bookproduct and toString method
	     	gspacc.bookProduct(1000);
	     	gspacc.toString();
		
		
	// Instantiate GSNormalAcc and refer it through reference NormalAcc.
		
		GSNormalAcc gsnacc=new GSNormalAcc();
		
		gsnacc.getAccNm();
		gsnacc.getAccNo();
		gsnacc.getDeliveryCharge();
		gsnacc.getCharges();
		
		// Invoking bookproduct and toString method
     	gsnacc.bookProduct(1000);
     	gsnacc.toString();
	
		
	}
}
