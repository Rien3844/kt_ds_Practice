package com.ktdsuniversity.edu.implement;

/*
 * Before 구조
 * TV
 * SamsungSmartTV
 * 		SamsungTV(TV + SamsungSmartTV)
 * LgSmartTV
 * 		LgTV(TV + LgSmartTV)
 * 
 * After 구조
 * TV
 * 		SamsungSmartTV
 * 			SamsungTV
 * 		LgSmartTV	
 * 			LgTV
*/
public interface SamsungSmartTV extends TV {
	void runNetflix();

	void runMenu();

	void runCoupangPlay();
}
