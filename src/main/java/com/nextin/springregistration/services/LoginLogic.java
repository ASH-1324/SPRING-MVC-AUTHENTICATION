package com.nextin.springregistration.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.nextin.springregistration.beans.User;
import com.nextin.springregistration.utilities.JdbcConnector;

public class LoginLogic {

	public static int loginLogic(User user) {

		int flag = 0;

		String query = "select email, password from userdata";

		try (Connection connection = JdbcConnector.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {

			ResultSet resultSet = statement.executeQuery();

			while (resultSet.next()) {
				String emailFromDb = resultSet.getString("email");
				String passwordFromDb = resultSet.getString("password");

				if (user.getUserEmail().equals(emailFromDb) && user.getUserPassword().equals(passwordFromDb)) {
					flag = 1;
					break;
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			System.out.println("Jdbc Connection class is not found : " + e1.getMessage());
			e1.printStackTrace();
		}

		return flag;

	}
}
