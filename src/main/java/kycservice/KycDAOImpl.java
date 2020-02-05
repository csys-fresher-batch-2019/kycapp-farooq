package kycservice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class KycDAOImpl implements KycDAO {

	public boolean verifyAadharCardNumber(KycServices service) throws Exception {

		boolean result = false;
Connection connection=null;
		try {
			 connection = TestConnect.getConnection();
			String sql = "select aadhar_card_number,user_name,dob from aadharcard where aadhar_card_number=? and user_name=? and dob=?";
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setLong(1, service.getAadharCardNumber());
			stmt.setString(2, service.getName());
			java.sql.Date date = java.sql.Date.valueOf(service.getDob());
			stmt.setDate(3, date);

			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				result = true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			connection.close();
		}

		return result;
	}

	public boolean verifyPanCard(KycServices service) throws Exception {

		boolean result = false;
		Connection connection=null;
		try {
			 connection = TestConnect.getConnection();
			String sql = "select pan_card_number,user_name,dob from aadharcard where pan_card_number=? and user_name=? and dob=? ";
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, service.getPanCardNumber());
			//System.out.println(service.getPanCardNumber());
			stmt.setString(2, service.getName());
			java.sql.Date date = java.sql.Date.valueOf(service.getDob());
			stmt.setDate(3, date);

			ResultSet rs = stmt.executeQuery();
			
			if (rs.next()) {
				result = true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			connection.close();
		}

		return result;

		
		
	}

	public boolean verifyRationCard(KycServices service) throws Exception {
		
		boolean result = false;
		Connection connection=null;
		
	 try {
		connection = TestConnect.getConnection();
			String sql = "select ration_card_number,user_name,dob from aadharcard where ration_card_number=? and user_name=? and dob=? ";
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, service.getRationCardNumber());
			stmt.setString(2, service.getName());
			java.sql.Date date = java.sql.Date.valueOf(service.getDob());
			stmt.setDate(3, date);

			ResultSet rs = stmt.executeQuery();
			
			if (rs.next()) {
				result = true;
			}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 finally {
		 connection.close();
	 }

		return result;

		
		
		
	}

	public boolean VerifyAadharCardWithAddress(KycServices service) throws Exception {
		boolean result = false;

		Connection connection=null;
		try {
			connection = TestConnect.getConnection();
			String sql = "select aadhar_card_number,user_name,dob from aadharcard where aadhar_card_number=? and user_name=? and dob=? and address=?";
			PreparedStatement stmt = connection.prepareStatement(sql);
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			connection.close();
		}
		
		return result;
	}

}
