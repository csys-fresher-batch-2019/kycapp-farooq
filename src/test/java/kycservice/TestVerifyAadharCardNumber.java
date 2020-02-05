package kycservice;

import java.time.LocalDate;
import java.time.Month;

import com.chainsys.kycservice.KycDAOImpl;

public class TestVerifyAadharCardNumber {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		KycDAO obj = new KycDAOImpl();
		KycServices s = new KycServices(9999999999999999L,"mohamed farooq",LocalDate.of(1999, Month.JANUARY, 1));

		try {
			boolean result=obj.verifyAadharCardNumber(s);
			System.out.println(result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
