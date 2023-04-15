<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <script src="./js/alert.js"></script>
    <meta charset="ISO-8859-1">
    <title>Admin Dashboard</title>

    <style>
      body {
        margin: 0;
      }

      nav {
        background-color: #333;
        color: white;
        display: flex;
        justify-content: space-between;
        align-items: center;
        height: 60px;
        padding: 0px 20px;
        position: fixed;
        top: 0;
        left: 0;
        right: 0;
        z-index: 1;
      }
      nav > span {
        display: flex;
        align-items: center;
        justify-content: center;
      }
      nav > span > img {
        border-radius: 5%;
      }
      

      .container {
        display: flex;
        height: calc(100vh - 100px);
        margin-top: 60px;
      }

      .sidebar {
        width: 200px;
        background-color: #eee;
        padding: 20px;
        height: 100%;
        overflow-y: auto;
        display: flex;
        flex-direction: column;
        align-items: center;
      }
      .sidebar > button {
        width: 182px;
        height: 50px;
        border-radius: 20px;
        margin-bottom: 10px;
        background-color: #4caf50;
        border: 19x solid black;
        color: black;
        cursor:pointer;
      }

      .display {
        flex-grow: 1;
        padding: 20px;
        height: 100%;
        display: flex;
        /* align-items: center; */
        justify-content: center;
        background-color: azure;
        overflow-y: scroll;
      }

      .form {
        margin-bottom: 20px;

        width: 450px;
        padding: 25px;
      }
      form {
        display: flex;
        flex-wrap: wrap;
        justify-content: space-between;
        max-width: 800px;
        margin: auto;
      }

      label {
        display: block;
        margin-bottom: 5px;
        font-weight: bold;
      }

      input,
      select {
        width: 100%;
        padding: 10px;
        margin-bottom: 15px;
        border: 1px solid #ccc;
        border-radius: 4px;
      }

      input[type="date"] {
        -webkit-appearance: none;
        -moz-appearance: none;
        appearance: none;
        padding: 10px;
        margin-bottom: 15px;
        border: 1px solid #ccc;
        border-radius: 4px;
      }

      input:focus,
      select:focus {
        outline: none;
        box-shadow: 0px 0px 4px #ccc;
      }

      button[type="submit"] {
        padding: 10px 20px;
        background-color: #4caf50;
        color: #fff;
        border: none;
        border-radius: 4px;
        cursor: pointer;
      }

      button[type="submit"]:hover {
        background-color: #3e8e41;
      }

      @media only screen and (max-width: 768px) {
        form {
          flex-direction: column;
          max-width: 100%;
        }
      }
    </style>
  </head>
  <body>
    <nav>
      <span
        ><img
          src="./images/header-logo.jpg"
          height="50"
          width="auto"
          alt="logo"
        />&nbsp;&nbsp;
        <%! 
        
        	HttpSession session = null;
        %>
        <%
        	session = request.getSession(false);
            response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");//HTTP 1.1
        	response.setHeader("Pragma","no-cache");//HTTP 1.0
        	response.setHeader("Expires","0");//proxies
        	if(session.getAttribute("email")==null)
        		response.sendRedirect("./AdminLogin.jsp");
     
        %>
       <h3>Welcome <%= session.getAttribute("name") %></h3></span>

      <form action="./logout" method="post" style="cursor: pointer; margin-right: 0px; margin-top:10px;">
    		<input type="submit" value="Logout"  style="cursor: pointer;" />
	 </form>
    </nav>
    <div class="container">
      <div class="sidebar">
        <button onclick="showForm('form1')">Add Student</button>
        <button onclick="showForm('form2')">Add HOD</button>
        <button onclick="showForm('form3')">Add Faculty</button>
        <button onclick="showForm('form4')">Remove Student</button>
        <button onclick="showForm('form5')">Remove HOD</button>
        <button onclick="showForm('form6')">Remove Faculty</button>
        <button onclick="showForm('form7')">Add Subjects</button>
        <button onclick="showForm('form8')">Remove Subjects</button>
        <button onclick="showForm('form9')">Update Subjects</button>
        <button onclick="showForm('form10')">Add Department</button>
        <button onclick="showForm('form11')">Add Course</button>
        <button onclick="showForm('form12')">Enroll Hod with Department</button>
        <button onclick="showForm('form13')">
          Enroll Student with subjects
        </button>
        <button onclick="showForm('form14')">Check Attendance</button>
        <button onclick="showForm('form15')">Update Attendance</button>
        <button onclick="showForm('form16')">Check Students</button>
        <button onclick="showForm('form17')">Check Faculty</button>
        <button onclick="showForm('form18')">Print Data</button>
        <button onclick="showForm('form19')">Share Data</button>
      </div>
      <div class="display">
        <div id="form1" class="form" style="display: none">
          <h2 style="text-align: center">Add Student</h2>
          <form action='./addStudent' method='post'>
            <div>
              <label for="name">Name:</label>
              <input type="text" id="name" name="name" required />
              <br />
              <label for="father-name">Father's Name:</label>
              <input type="text" id="father-name" name="father-name" required />

              <br />
              <label for="mother-name">Mother's Name:</label>
              <input type="text" id="mother-name" name="mother-name" required />
              <br />
              <label for="dob">Date of Birth:</label>
              <input
                type="date"
                id="dob"
                name="dob"
                placeholder="DD/MM/YYYY"
                required
              />
              <br />
              <label for="semester">Semester:</label>
              <select id="semester" name="semester">
                <option value="">Semester</option>
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
                <option value="5">5</option>
                <option value="6">6</option>
                <option value="7">7</option>
                <option value="8">8</option>
              </select>
              <br />
            </div>
            <div style="margin-bottom: 30px">
              <label for="email">Email:</label>
              <input type="text" id="email" name="email" required />
              <br />

              <label for="gender">Gender:</label>
              <select id="gender" name="gender">
                <option value="male">Male</option>
                <option value="female">Female</option>
                <option value="other">Other</option>
              </select>
              <br />
              <label for="religion">Religion:</label>
              <input type="text" id="religion" name="religion" required />
              <br />
              <label for="nation">Country:</label>
              <input type="text" id="nation" name="nation" value="" />
              <br />
              <label for="session">Session:</label>
              <select id="session" name="session">
                <option value="2022-2023">2022-2023</option>
                <option value="2023-2024">2023-2024</option>
                <option value="2024-2025">2024-2025</option>
                <option value="2025-2026">2025-2026</option>
                <option value="2026-2027">2026-2027</option>
                <option value="2027-2028">2027-2028</option>
                <option value="2028-2029">2028-2029</option>
                <option value="2029-2030">2029-2030</option>
              </select>
              <br />
            </div>

            <div>
              <label for="address">Address:</label>
              <input type="text" id="address" name="address" required />
              <br /><label for="city">City:</label>
              <input type="text" id="city" name="city" required />
              <br />
              <label for="pincode">Pincode:</label>
              <input type="text" id="pincode" name="pincode" required />
              <br />
            </div>
            <div>
              <label for="state">State:</label>
              <select id="state" name="state">
                <option value="Andhra Pradesh">Andhra Pradesh</option>
                <option value="Arunachal Pradesh">Arunachal Pradesh</option>
                <option value="Assam">Assam</option>
                <option value="Bihar">Bihar</option>
                <option value="Chhattisgarh">Chhattisgarh</option>
                <option value="Goa">Goa</option>
                <option value="Gujarat">Gujarat</option>
                <option value="Haryana">Haryana</option>
                <option value="Himachal Pradesh">Himachal Pradesh</option>
                <option value="Jharkhand">Jharkhand</option>
                <option value="Karnataka">Karnataka</option>
                <option value="Kerala">Kerala</option>
                <option value="Madhya Pradesh">Madhya Pradesh</option>
                <option value="Maharashtra">Maharashtra</option>
                <option value="Manipur">Manipur</option>
                <option value="Meghalaya">Meghalaya</option>
                <option value="Mizoram">Mizoram</option>
                <option value="Nagaland">Nagaland</option>
                <option value="Odisha">Odisha</option>
                <option value="Punjab">Punjab</option>
                <option value="Rajasthan">Rajasthan</option>
                <option value="Sikkim">Sikkim</option>
                <option value="Tamil Nadu">Tamil Nadu</option>
                <option value="Telangana">Telangana</option>
                <option value="Tripura">Tripura</option>
                <option value="Uttar Pradesh">Uttar Pradesh</option>
                <option value="Uttarakhand">Uttarakhand</option>
                <option value="West Bengal">West Bengal</option>
              </select>
              <br /><label for="mobile-no">Mobile Number:</label>
              <input type="text" id="mobile-no" name="mobile-no" required />
              <br />
            </div>

            <div>
              <label for="10th-school-name">10th School Name:</label>
              <input
                type="text"
                id="10th-school-name"
                name="10th-school-name"
                required
              />

              <br />
              <label for="10th-school-board">10th School Board:</label>
              <input
                type="text"
                id="10th-school-board"
                name="10th-school-board"
                required
              />
              <br /><label for="10th-percentage">10th Percentage:</label>
              <input
                type="text"
                id="10th-percentage"
                name="10th-percentage"
                required
              />
              <br />
              <label for="10th-passout-date">10th Passout Date:</label>
              <input
                type="text"
                id="10th-passout-date"
                name="10th-passout-date"
                placeholder="DD/MM/YYYY"
                required
              />
              <br />
            </div>
            <div>
              <label for="12th-school-name">12th School Name:</label>
              <input
                type="text"
                id="12th-school-name"
                name="12th-school-name"
                required
              />
              <br />
              <label for="12th-school-board">12th School Board:</label>
              <input
                type="text"
                id="12th-school-board"
                name="12th-school-board"
                required
              />
              <br />
              <label for="12th-percentage">12th Percentage:</label>
              <input
                type="text"
                id="12th-percentage"
                name="12th-percentage"
                required
              />
              <br />

              <label for="12th-passout-date">12th Passout Date:</label>
              <input
                type="text"
                id="12th-passout-date"
                name="12th-passout-date"
                placeholder="DD/MM/YYYY"
                required
              />
            </div>
            <button style="margin-left: 40%; margin-bottom: 50px" type="submit">
              Add Student
            </button>
          </form>
        </div>

        <div id="form2" class="form" style="display: none">
          <h2 style="text-align: center">Add HOD</h2>
          <form action='./addHod' method='post'>
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" required />

            <label for="father-name">Father Name</label>
            <input type="text" id="father-name" name="father-name" required />

            <label for="dob">DOB</label>
            <input type="date" id="dob" name="dob" required />

            <label for="mobile">Mobile no</label>
            <input type="number" id="mobile" name="mobile" required />

            <label for="email">Email</label>
            <input type="email" id="email" name="email" required />

            <label for="hodpassword">Password</label>
            <input
              type="password"
              id="hodpassword"
              name="hodpassword"
              required
            />

            <label for="gender">Gender:</label>
            <select id="gender" name="gender" required>
              <option value="">Select Gender</option>
              <option value="1">MALE</option>
              <option value="2">FEMALE</option>
              <option value="3">Others</option>
            </select>
            <br />
            <button style="margin-left: 40%; margin-bottom: 50px" type="submit">
              Add HOD
            </button>
          </form>
        </div>

        <div id="form3" class="form" style="display: none">
          <h2 style="text-align: center">Add Teacher</h2>
          <form action='./addFaculty' method='post'>
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" required />

            <label for="father-name">Father Name</label>
            <input type="text" id="father-name" name="father-name" required />

            <label for="dob">DOB</label>
            <input type="date" id="dob" name="dob" required />

            <label for="mobile">Mobile no</label>
            <input type="number" id="mobile" name="mobile" required />

            <label for="email">Email</label>
            <input type="email" id="email" name="email" required />

            <label for="Qualification">Qualification</label>
            <input
              type="text"
              id="Qualification"
              name="Qualification"
              required
            />

            <label for="Address">Address</label>
            <input type="text" id="Address" name="Address" required />

            <label for="facpassword">Password</label>
            <input
              type="password"
              id="facpassword"
              name="facpassword"
              required
            />

            <label for="gender">Gender:</label>
            <select id="gender" name="gender" required>
              <option value="">Select Gender</option>
              <option value="1">MALE</option>
              <option value="2">FEMALE</option>
              <option value="3">Others</option>
            </select>

            <button style="margin-left: 40%; margin-bottom: 50px" type="submit">
              Add Student
            </button>
          </form>
        </div>
        <div id="form4" class="form" style="display: none">
          <h2 style="text-align: center">Remove Student</h2>
          <form>
            <label for="name">Roll No:</label>
            <input type="text" id="roll no" name="Roll No" required />
            <br />
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" required />
            <br />

            <label for="class">Class:</label>
            <select id="class" name="class" required>
              <option value="">Select Class</option>
              <option value="1">D 1</option>
              <option value="2">D 2</option>
              <option value="3">D 3</option>
              <option value="4">D 4</option>
              <option value="5">D 5</option>
            </select>
            <br />
            <button type="submit">Delete Student</button>
          </form>
        </div>

        <div id="form5" class="form" style="display: none">
          <h2 style="text-align: center">Remove Hod</h2>
          <form>
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" required />
            <br />

            <label for="class">Department:</label>
            <select id="class" name="class" required>
              <option value="">Select Department</option>
              <option value="1">D 1</option>
              <option value="2">D 2</option>
              <option value="3">D 3</option>
              <option value="4">D 4</option>
              <option value="5">D 5</option>
            </select>
            <br />
            <button type="submit">Delete HOD</button>
          </form>
        </div>

        <div id="form6" class="form" style="display: none">
          <h2 style="text-align: center">Remove Teacher</h2>
          <form>
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" required />
            <br />

            <label for="class">Department:</label>
            <select id="class" name="class" required>
              <option value="">Select Department</option>
              <option value="1">D 1</option>
              <option value="2">D 2</option>
              <option value="3">D 3</option>
              <option value="4">D 4</option>
              <option value="5">D 5</option>
            </select>
            <br />
            <button type="submit">Delete Teacher</button>
          </form>
        </div>
        <div id="form7" class="form" style="display: none">
          <h2 style="text-align: center">Add Subject</h2>
          <form action='./addSubject' method='post'>
            <label for="name">Subject Name:</label>
            <input type="text" id="name" name="name" required />

            <label for="code">Subject Code:</label>
            <input type="text" id="code" name="code" required />

            <button style="margin-left: 40%" type="submit">Add Subject</button>
          </form>
        </div>
        <div id="form10" class="form" style="display: none">
          <h2 style="text-align: center">Add Department</h2>
          <form action="./addDepartment" method="post">
            <label for="name">Department Name:</label>
            <input type="text" id="name" name="name" required />

            <button style="margin-left: 40%" type="submit">
              Add Department
            </button>
          </form>
        </div>
        <div id="form11" class="form" style="display: none">
          <h2 style="text-align: center">Add Course</h2>
          <form action="./addCourse" method="post">
            <label for="name">Course Name:</label>
            <input type="text" id="name" name="name" required />

            <button style="margin-left: 40%" type="submit">Add Course</button>
          </form>
        </div>
      </div>
    </div>
    <script>
      function showForm(formId) {
        // Hide all forms
        var forms = document.getElementsByClassName("form");
        for (var i = 0; i < forms.length; i++) {
          forms[i].style.display = "none";
        }
        // Show the selected form
        var form = document.getElementById(formId);
        form.style.display = "block";
      }
      
      function msg(f,s,t){
    	  swal(f, s, t);
    	   
      }
      
      //for student add
      <%
      if(session.getAttribute("message")=="success"){  
      %>
      		msg("Student Added Successfully!","Click ok","success");
      <%
      		session.removeAttribute("message");
      }else if(session.getAttribute("message")=="failure"){
      %>
    	  	msg("Duplicate email id or mobile no!!","Please try again with other credentials.","error");
      <%
      		session.removeAttribute("message");
      }else if(session.getAttribute("message")=="loggedin"){
       %>
       msg("Login Successfull!!","Click ok","success");
       
       
       <%
       session.removeAttribute("message");
      }else{}
      
      %>
      
      //for hod add
      <%
      	if(session.getAttribute("hodmessage")=="success"){
      	%>
      		msg("HOD Added Successfully!","Click ok","success");
      	<%
      		session.removeAttribute("hodmessage");
      	}else if(session.getAttribute("hodmessage")=="failure"){
      		
      	%>
      		msg("Duplicate email id or mobile no!!","Please try again with other credentials.","error");
      	<%
      		session.removeAttribute("hodmessage");
      	}
      %>
      
      //for faculty add
      <%
      	if(session.getAttribute("facultymessage")=="success"){
      	%>
      		msg("Faculty Added Successfully!","Click ok","success");
      	<%
      		session.removeAttribute("facultymessage");
      	}else if(session.getAttribute("facultymessage")=="failure"){
      		
      	%>
      		msg("Duplicate email id or mobile no!!","Please try again with other credentials.","error");
      	<%
      		session.removeAttribute("facultymessage");
      	}
      %>
      
      
    //for subject add
      <%
      	if(session.getAttribute("subjectmessage")=="success"){
      	%>
      		msg("Subject Added Successfully!","Click ok","success");
      	<%
      		session.removeAttribute("subjectmessage");
      	}else if(session.getAttribute("subjectmessage")=="failure"){
      		
      	%>
      		msg("Duplicate email id or mobile no!!","Please try again with other credentials.","error");
      	<%
      		session.removeAttribute("subjectmessage");
      	}
      %>
     
      
    //for department add
      <%
      	if(session.getAttribute("departmentmessage")=="success"){
      	%>
      		msg("Departmnt Added Successfully!","Click ok","success");
      	<%
      		session.removeAttribute("departmentmessage");
      	}else if(session.getAttribute("departmentmessage")=="failure"){
      		
      	%>
      		msg("Something went wrong!!","Please try again with other entry.","error");
      	<%
      		session.removeAttribute("departmentmessage");
      	}
      %>
      
    //for course add
      <%
      	if(session.getAttribute("coursemessage")=="success"){
      	%>
      		msg("Course Added Successfully!","Click ok","success");
      	<%
      		session.removeAttribute("coursemessage");
      	}else if(session.getAttribute("coursemessage")=="failure"){
      		
      	%>
      		msg("Something went wrong!!","Please try again with other entry.","error");
      	<%
      		session.removeAttribute("coursemessage");
      	}
      %>
    	  
    
    </script>
  </body>
  </html>