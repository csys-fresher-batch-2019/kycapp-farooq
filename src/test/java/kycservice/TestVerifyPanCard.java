package kycservice;

import java.time.LocalDate;
import java.time.Month;

public class TestVerifyPanCard {

	public static void main(String[] args) {

		KycDAO obj = new KycDAOImpl();
		KycServices s = new KycServices("AA999999999","mohamed farooq",LocalDate.of(1999, Month.JANUARY, 1));

		try {
			boolean result=obj.verifyPanCard(s);
			System.out.println(result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
