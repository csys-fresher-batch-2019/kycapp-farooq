package kycservice;

public interface KycDAO {
	
public boolean verifyAadharCardNumber(KycServices service) throws DbException;	

public boolean verifyAadharCardWithAddress(KycServices service) throws DbException;

public boolean verifyPanCard(KycServices service) throws DbException;

public boolean verifyRationCard(KycServices service) throws DbException;
	

}
