package kycservice;

public interface KycDAO {
	
public boolean verifyAadharCardNumber(KycServices service) throws DbException;	

public boolean VerifyAadharCardWithAddress(KycServices service) throws DbException;

public boolean verifyPanCard(KycServices service) throws DbException;

public boolean verifyRationCard(KycServices service) throws DbException;
	

}
