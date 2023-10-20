<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://callidora.lk/jsp/template-inheritance" prefix="layout"%>

<layout:extends name="base">
    <layout:put block="content" type="REPLACE">

        <h1>Home</h1>

        <c:if test="${not isUserLoggedIn}">
            <a href="login">Login</a>
            <br/>
            <br/>
            <a href="register">Register</a>
            <br/>
            <br/>
        </c:if>

        <c:if test="${isUserLoggedIn}">
            <h3>Users</h3>
            <table>
                <tr>
                    <th>ID</th>
                    <th>Username</th>
                    <th></th>
                </tr>
                <c:forEach var="user" items="${model}">
                    <tr>
                        <td>${user.id}</td>
                        <td>${user.username}</td>
                        <c:if test="${not (user.username eq userLogged.username)}">
                            <td><button onclick="deleteUser('${user.id}');">Delete</button></td>
                        </c:if>
                    </tr>
                </c:forEach>
            </table>
        </c:if>

        <hr/>
        <br/>
        <a href="${BASE_URL}products">Products</a>
        <br/>
        <br/>

    </layout:put>
</layout:extends>