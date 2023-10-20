<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://callidora.lk/jsp/template-inheritance" prefix="layout"%>

<layout:extends name="base">
    <layout:put block="content" type="REPLACE">

        <layout:put block="head_title" type="REPLACE">
            <title>Login Page</title>
        </layout:put>

        <h1>Login</h1>

        <table>
            <tr>
                <th>Username: </th>
                <td><input type="text" id="username"/> </td>
            </tr>
            <tr>
                <th>Password: </th>
                <td><input type="password" id="password"/> </td>
            </tr>
            <tr>
                <td></td>
                <td><button onclick="login();">Login</button> </td>
            </tr>
        </table>

        <br/>
        <br/>

        <a href="${BASE_URL}">Home</a>

    </layout:put>
</layout:extends>
