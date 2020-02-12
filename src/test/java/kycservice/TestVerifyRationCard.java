package kycservice;

import java.time.LocalDate;
import java.time.Month;

import com.chainsys.kycservice.KycDAOImpl;

public class TestVerifyRationCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		KycDAO obj = new KycDAOImpl();
		KycServices s = new KycServices("99A9999999",LocalDate.of(1999, Month.JANUARY, 1),"mohamed farooq");

		try {
			boolean result=obj.verifyRationCard(s);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
