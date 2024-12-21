package com.nextin.springregistration.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.nextin.springregistration.beans.User;
import com.nextin.springregistration.utilities.JdbcConnector;

public class ForgotPasswordLogic {
	public static int updatePassword(User user) {

		int flag = 0;

		String query2 = "UPDATE userdata SET password = ? WHERE email = ?";

		try (Connection connection = JdbcConnector.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(query2);) {

			preparedStatement.setString(1, user.getUserPassword());
			preparedStatement.setString(2, user.getUserEmail());

			int update = preparedStatement.executeUpdate();

			System.out.println("data found in db : " + update);

			if (update > 0) {
				flag = 1;
			}

		} catch (ClassNotFoundException e) {
			System.out.println("updation of password is failed");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Jdbc Connection class is not found : " + e.getMessage());
			e.printStackTrace();
		}

		return flag;

	}
}
