package com.nextin.springregistration.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.nextin.springregistration.beans.User;
import com.nextin.springregistration.utilities.JdbcConnector;

public class SignUpLogic {

	public static int insertData(User user) {
		int flag = 0;

		String query = "INSERT INTO userdata (name, email, phoneNumber, password) VALUES (?, ?, ?, ?)";

		try (Connection connection = JdbcConnector.getConnection();
				PreparedStatement statement = connection.prepareStatement(query)) {

			statement.setString(1, user.getUserName());
			statement.setString(2, user.getUserEmail());
			statement.setString(3, user.getUserPhoneNumber());
			statement.setString(4, user.getUserPassword());

			int update = statement.executeUpdate();

			if (update > 0) {
				flag = 1;
			}


		} catch (SQLException e) {
			System.err.println("Error while inserting data: " + e.getMessage());
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			System.out.println("Jdbc Connection class is not found : " + e1.getMessage());
			e1.printStackTrace();
		}

		return flag;
	}
}
