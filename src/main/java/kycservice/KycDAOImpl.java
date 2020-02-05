package kycservice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class KycDAOImpl implements KycDAO {

	Logger logger = Logger.getInstance();
	
	public boolean verifyAadharCardNumber(KycServices service) throws Exception {

		boolean result = false;
Connection connection=null;
PreparedStatement stmt=null;
		try {
			 connection = TestConnect.getConnection();
			String sql = "select aadhar_card_number,user_name,dob from aadharcard where aadhar_card_number=? and user_name=? and dob=?";
			stmt = connection.prepareStatement(sql);
			stmt.setLong(1, service.getAadharCardNumber());
			stmt.setString(2, service.getName());
			java.sql.Date date = java.sql.Date.valueOf(service.getDob());
			stmt.setDate(3, date);

			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				result = true;
			}
		} catch (Exception e) {
			logger.error(e);
		}
		finally {
			if(connection!=null) {
				connection.close();	
			}
			if(stmt!=null) {
				stmt.close();	
			}
			
		}

		return result;
	}

	public boolean verifyPanCard(KycServices service) throws Exception {

		boolean result = false;
		Connection connection=null;
		PreparedStatement stmt=null;
		try {
			 connection = TestConnect.getConnection();
			String sql = "select pan_card_number,user_name,dob from aadharcard where pan_card_number=? and user_name=? and dob=? ";
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, service.getPanCardNumber());
			stmt.setString(2, service.getName());
			java.sql.Date date = java.sql.Date.valueOf(service.getDob());
			stmt.setDate(3, date);

			ResultSet rs = stmt.executeQuery();
			
			if (rs.next()) {
				result = true;
			}
		} catch (Exception e) {
			logger.error(e);
			
		}finally {
			if(connection!=null) {
				connection.close();	
			}
			if(stmt!=null) {
				stmt.close();	
			}
			
		}

		return result;

		
		
	}

	public boolean verifyRationCard(KycServices service) throws Exception {
		
		boolean result = false;
		Connection connection=null;
		PreparedStatement stmt=null;
		
	 try {
		connection = TestConnect.getConnection();
			String sql = "select ration_card_number,user_name,dob from aadharcard where ration_card_number=? and user_name=? and dob=? ";
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, service.getRationCardNumber());
			stmt.setString(2, service.getName());
			java.sql.Date date = java.sql.Date.valueOf(service.getDob());
			stmt.setDate(3, date);

			ResultSet rs = stmt.executeQuery();
			
			if (rs.next()) {
				result = true;
			}
	} catch (Exception e) {
		logger.error(e);
	}
	 finally {
		 if(connection!=null) {
				connection.close();	
			}
			if(stmt!=null) {
				stmt.close();	
			}
			
	 }

		return result;

		
		
		
	}

	public boolean VerifyAadharCardWithAddress(KycServices service) throws Exception {
		boolean result = false;

		Connection connection=null;
		PreparedStatement stmt=null;
		try {
			connection = TestConnect.getConnection();
			String sql = "select aadhar_card_number,user_name,dob from aadharcard where aadhar_card_number=? and user_name=? and dob=? and address=?";
			stmt = connection.prepareStatement(sql);
			stmt.setLong(1, service.getAadharCardNumber());
			stmt.setString(2, service.getName());
			java.sql.Date date = java.sql.Date.valueOf(service.getDob());
			stmt.setDate(3, date);
			stmt.setString(4, service.getAddress());

			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				result = true;
			}

		} catch (Exception e) {
			logger.error(e);
		}finally {
			if(connection!=null) {
				connection.close();	
			}
			if(stmt!=null) {
				stmt.close();	
			}
			
			
		}
		
		return result;
	}

}
