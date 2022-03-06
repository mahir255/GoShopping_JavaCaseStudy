package com.tns.application;
import com.tns.framework.*;

public class GSShopFactory implements ShopFactory {

	@Override
	public PrimeAcc getNewPrimeAccount(int AccNo, String accNm, float charges, boolean isPrime) {
		GSPrimeAcc gsprime = new GSPrimeAcc();
		return gsprime;
	}

	@Override
	public NormalAcc getNewNormalAccount(int AccNo, String accNm, float charges, float deliveryCharges) {
		GSNormalAcc gsnormal = new GSNormalAcc(AccNo, accNm, deliveryCharges, deliveryCharges);
		return gsnormal;
	}

}
