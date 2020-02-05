package kycservice;

import java.time.LocalDate;
import java.time.Month;

public class TestAadharWithAddress {

	public static void main(String[] args) {

		KycDAO obj = new KycDAOImpl();
		KycServices s = new KycServices(9999999999999999L,"mohamed farooq",LocalDate.of(1999, Month.JANUARY, 1),"chainsys");
		try {
			boolean result=obj.verifyAadharCardWithAddress(s);
			System.out.println(result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
