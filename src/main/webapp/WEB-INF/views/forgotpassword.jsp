<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Forgot Password</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f7fc;
            margin: 0;
            padding: 0;
        }

        .container {
            width: 100%;
            max-width: 400px;
            margin: 50px auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }

        h3 {
            text-align: center;
            color: #333;
            font-size: 24px;
            margin-bottom: 20px;
        }
        
        h5 {
            text-align: center;
           }

        .form-group {
            margin-bottom: 15px;
        }

        input[type="email"], input[type="password"] {
            width: 100%;
            padding: 12px;
            margin: 8px 0;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
            font-size: 14px;
        }

        input[type="submit"] {
            width: 100%;
            padding: 14px;
            background-color: #4CAF50;
            border: none;
            border-radius: 4px;
            color: white;
            font-size: 16px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }

        .footer {
            text-align: center;
            margin-top: 20px;
            color: #777;
            font-size: 14px;
        }

        .footer a {
            text-decoration: none;
            color: #4CAF50;
        }

        .footer a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>

    <div class="container">
        <h3>Forgot Password</h3>

		<h5 style="color:red" id="UpdatePasswordFailed">${errorMsg}</h5>

        <form action="updatepassword" method="post">
            <div class="form-group">
                <input type="email" name="userEmail" placeholder="Enter your email" required>
            </div>
            <div class="form-group">
                <input type="password" name="userPassword" placeholder="Enter your new password" required>
            </div>
            <input type="submit" value="Submit">
        </form>

        <div class="footer">
            <p>Remembered your password? <a href="loginform">Login here</a></p>
        </div>
    </div>

</body>
</html>
