package kycservice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kycservice.Loggerutil.Logger;

public class KycDAOImpl implements KycDAO {

	Logger logger = Logger.getInstance();

	public boolean verifyAadharCardNumber(KycServices service) throws DbException {

		boolean result = false;
		String sql = "select aadhar_card_number,user_name,dob from aadharcard where aadhar_card_number=? and user_name=? and dob=?";
			try (Connection connection = TestConnect.getConnection();
					PreparedStatement stmt = connection.prepareStatement(sql)) {

				stmt.setLong(1, service.getAadharCardNumber());
				stmt.setString(2, service.getName());
				java.sql.Date date = java.sql.Date.valueOf(service.getDob());
				stmt.setDate(3, date);

				try(ResultSet rs = stmt.executeQuery();) {
					
					if (rs.next()) {
						result = true;
					}
				} catch (Exception e) {
					logger.error(e);//supress
					throw new DbException("INVALID AADHAR CARD NUMBER");
				}
			} catch (SQLException e1) {
				throw new DbException("UNABLE TOM EXECUTE QUERY");
			} catch (Exception e1) {
				
				throw new DbException("INVALID AADHAR CARD NUMBER");
			}

			return result;
		} 
	

	public boolean verifyPanCard(KycServices service) throws DbException {

		boolean result = false;
		String sql = "select pan_card_number,user_name,dob from aadharcard where pan_card_number=? and user_name=? and dob=? ";
	

			try (Connection connection = TestConnect.getConnection();
					PreparedStatement stmt = connection.prepareStatement(sql)) {
				stmt.setString(1, service.getPanCardNumber());
				stmt.setString(2, service.getName());
				java.sql.Date date = java.sql.Date.valueOf(service.getDob());
				stmt.setDate(3, date);

				try(ResultSet rs = stmt.executeQuery();) {

					

					if (rs.next()) {
						result = true;
					}
				} catch (Exception e) {
					throw new DbException("INVALID PAN CARD");

				}
			} catch (SQLException e1) {
				throw new DbException("unable to process");
			} catch (Exception e1) {
				throw new DbException("unable to process");
			}
			return result;

		} 	

	public boolean verifyRationCard(KycServices service) throws DbException {

		boolean result = false;
		String sql = "select ration_card_number,user_name,dob from aadharcard where ration_card_number=? and user_name=? and dob=? ";
	
			try (Connection connection = TestConnect.getConnection();

					PreparedStatement stmt = connection.prepareStatement(sql);) {

				stmt.setString(1, service.getRationCardNumber());
				stmt.setString(2, service.getName());
				java.sql.Date date = java.sql.Date.valueOf(service.getDob());
				stmt.setDate(3, date);

				try(ResultSet rs = stmt.executeQuery();) {
					

					if (rs.next()) {
						result = true;
					}
				} catch (Exception e) {
					logger.error(e);
					throw new DbException("INVALID RATION CARD NUMBER");
				}
			} catch (SQLException e1) {
				throw new DbException("unable to process");
			} catch (Exception e1) {
				throw new DbException("unable to process");
			}
			return result;
		} 
	public boolean VerifyAadharCardWithAddress(KycServices service) throws DbException {
		boolean result = false;

		
			String sql = "select aadhar_card_number,user_name,dob from aadharcard where aadhar_card_number=? and user_name=? and dob=? and address=?";
		
			try(Connection connection = TestConnect.getConnection();
					PreparedStatement stmt = connection.prepareStatement(sql)){
			
			
		
			stmt.setLong(1, service.getAadharCardNumber());
			stmt.setString(2, service.getName());
			java.sql.Date date = java.sql.Date.valueOf(service.getDob());
			stmt.setDate(3, date);
			stmt.setString(4, service.getAddress());
try(		ResultSet rs = stmt.executeQuery();) {
	

	
			if (rs.next()) {
				result = true;
			}

		} catch (Exception e) {
			logger.error(e);
			throw new DbException("INVALID AADHAR CARD NUMBER");
		} 

			} catch (SQLException e1) {
				throw new DbException("unable to process");
			} catch (Exception e1) {
				throw new DbException("unable to process");
			}
			return result;
	}}
