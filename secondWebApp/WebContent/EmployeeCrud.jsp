<%@ page import="com.del.second.entity.Employee, com.del.second.dao.EmployeeDAO" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
	Employee e = (Employee)request.getAttribute("emp");
	if(e==null) e = new Employee();

%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="EmployeeDetailsServlet" method=get>
	<table align=center bgcolor=lightblue >
			<tr>
				<th>Employee Id</th>
				<td><input type=text name=empid value=<%=e.getEmpid() %>></td>
			</tr>
			<tr>
				<th>Employee Name</th>
				<td><input type="text" name=ename value=<%=e.getName() %>></td>
			</tr>
			<tr>
				<th>Salary</th>
				<td><input type="text" name=salary value=<%=e.getSalary() %>></td>
			</tr>
			<tr>
				<th>DOJ</th>
				<td><input type=Date name=doj value=<%=e.getObj() %>></td>
			</tr>
			<tr>
				<td><input type=submit value=Add name="sub"></td>
				<td><input type=submit value=Remove name="sub"></td>
				<td><input type=submit value=Modify name="sub"></td>
				<td><input type=submit value=Show name="sub"></td>
				<td><input type=submit value="Show all" name="sub"></td>
			</tr>
		</table>
</form>

</body>
</html>