<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
  <script src="./js/alert.js"></script>
    <title>Admin Login</title>
    <style>
      body {
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        height: 100vh;
        margin: 0;
        padding: 0;
        background-color: azure;
      }
      form {
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: start;
        background-color: #f2f2f2;
        border-radius: 10px;
        padding: 20px;
        box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
        height: 400px;
        width: 300px;
      }
      label {
        font-weight: bold;
      }
      input[type="email"],
      input[type="password"] {
        width: 100%;
        padding: 10px;
        margin-bottom: 30px;
        margin-top: 10px;
        border-radius: 5px;
        border: none;
        width: 93%;
      }
      input[type="submit"] {
        background-color: #4caf50;
        color: #fff;
        padding: 10px 20px;
        border: none;
        border-radius: 5px;
        cursor: pointer;
      }
      input[type="submit"]:hover {
        background-color: #3e8e41;
      }
      .mainForm {
        margin-top: 50px;
        margin-bottom: 30px;
      }
    </style>
  </head>
  <body>
  <% 
  response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");//HTTP 1.1
	response.setHeader("Pragma","no-cache");//HTTP 1.0
	response.setHeader("Expires","0");//proxies
  %>
 			 
    <form method="post" action="./AdminLoginServlet" >
      <h1><u>Admin Login</u></h1>
      <div class="mainForm">
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required />
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required />
      </div>
      <input type="submit" value="Login" />
    </form>
    <script>
     function msg(f,s,t){
    	  swal(f, s, t);
    	   
      }
      
      
      <%
      if(session.getAttribute("message")=="loginfailed"){  
      %>
      		msg("Login Failed!","Please Enter Valid Email & Password.","error");
      		session.removeAttribute("message");
      <%
      		
      }
      %>
    	  
      
     
    	  
    
    </script>
  </body>
</html>
