package kycservice;

public interface KycDAO {
	
public boolean verifyAadharCardNumber(KycServices service) throws Exception;	

public boolean VerifyAadharCardWithAddress(KycServices service) throws Exception;

public boolean verifyPanCard(KycServices service) throws Exception;

public boolean verifyRationCard(KycServices service) throws Exception;
	

}
