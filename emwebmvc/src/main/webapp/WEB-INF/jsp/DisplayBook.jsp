<%@ page isELIgnored="false" %> 
<html>
<body>
	<form action="bookCRUD">
	<table align=center width=50%>
	<tr>
		<th>Book Id</th>
		<td><input type=text name=bookid value=${book.bookid }></td>
		</tr>
		<tr>
		<th>Book Title</th>
		<td><input type=text name=title value=${book.title }></td>
		</tr>
		<tr>
		<th>Book Price</th>
		<td><input type=text name=price value=${book.price }></td>
		</tr>
		<tr>
		<th>Book Author</th>
		<td><input type=text name=author value=${book.author }></td>
		</tr>
		<tr>
		<td><input type=submit value="Add_Book" name="sub"></td>
		<td><input type=submit value="Del_Book" name="sub"></td>
		<td><input type=submit value="Mod_Book" name="sub"></td>
		<td><input type=submit value="Get_Book" name="sub"></td>
		</tr>
	</table>
	</form>
</body>
</html>