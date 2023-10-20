<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://callidora.lk/jsp/template-inheritance" prefix="layout"%>

<layout:extends name="base">
    <layout:put block="content" type="REPLACE">

        <c:if test="${not isUserLoggedIn}">
            <a href="login">Login</a>
            <br/>
            <a href="register">Register</a>
        </c:if>

        <c:if test="${isUserLoggedIn}">

        <h1>Update Product</h1>

        <br/>
        <hr/>
        <br/>

        <table>
            <tr>
                <th>Product Title: </th>
                <td><input type="text" id="update_product_title" value="${model.title}"/> </td>
            </tr>
            <tr>
                <th>Product Price: </th>
                <td><input type="text" id="update_product_price" value="${model.price}"/> </td>
            </tr>
            <tr>
                <td></td>
                <td><button onclick="updateProduct('${model.id}');">Update Product</button> </td>
            </tr>
        </table>

        <br/>
        <br/>

        <br/>
        <hr/>
        <br/>

        <a href="${BASE_URL}products">Back</a>

        </c:if>

    </layout:put>
</layout:extends>