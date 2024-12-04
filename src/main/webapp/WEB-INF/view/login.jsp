<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h2>Login Page</h2>
    <form action="<c:url value='/login'/>" method="post">
        <div>
            <label for="username">Username:</label>
            <input type="text" name="username" id="username" required />
        </div>
        <div>
            <label for="password">Password:</label>
            <input type="password" name="password" id="password" required />
        </div>
        <div>
            <input type="submit" value="Login" />
        </div>
        <c:if test="${not empty param.error}">
            <div style="color:red;">Invalid username or password.</div>
        </c:if>
        <c:if test="${not empty param.logout}">
            <div style="color:green;">You have been logged out.</div>
        </c:if>
    </form>
</body>
</html>