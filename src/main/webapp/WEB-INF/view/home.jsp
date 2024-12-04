<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
    <h2>Welcome to the Home Page!</h2>
    <p>This is a protected page. You are logged in.</p>
    <a href="<c:url value='/logout'/>">Logout</a>
</body>
</html>