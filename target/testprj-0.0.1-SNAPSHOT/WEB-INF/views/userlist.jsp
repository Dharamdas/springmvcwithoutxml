<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h2>Spring MVC and List Example</h2>

	<c:if test="${not empty user}">

		<ul>
			<c:forEach var="u" items="${user}">
			<table border="1">
			   <tr>
			     <td>${u.username}</td>
			     <td>${u.firstname}</td>
			     <td>${u.lastname}</td>
			     <td>${u.email}</td>
			     <td>${u.address}</td>
			      <td>${u.phone}</td>
			   </tr>
			</table>
				
			</c:forEach>
		</ul>

	</c:if>
</body>
</html>