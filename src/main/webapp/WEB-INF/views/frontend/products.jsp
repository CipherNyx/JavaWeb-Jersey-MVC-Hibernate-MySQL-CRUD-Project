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

            <h1>Products</h1>

            <table>
                <tr>
                    <th>Search Products By Title : </th>
                    <td><input type="text" id="product_search" onkeyup="productSearch();"/></td>
                </tr>
            </table>

            <br/>

            <div id="product_view_table">
                <table>
                    <thead style="text-align: center">
                    <tr>
                        <th>ID</th>
                        <th>Title</th>
                        <th>Price</th>
                        <th>Action</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="product" items="${model}">
                        <tr>
                            <td>${product.id}</td>
                            <td>${product.title}</td>
                            <td>${product.price}</td>
                            <td>
                                <button onclick="deleteProduct('${product.id}');">Delete</button>
                                <button onclick="editProduct('${product.id}');">Edit</button>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>

        <br/>
        <hr/>
        <br/>

        <h1>Add Product</h1>

        <table>
            <tr>
                <th>Product Title: </th>
                <td><input type="text" id="product_title"/> </td>
            </tr>
            <tr>
                <th>Product Price: </th>
                <td><input type="text" id="product_price"/> </td>
            </tr>
            <tr>
                <td></td>
                <td><button onclick="addProduct();">Add Product</button></td>
            </tr>
        </table>

        <br/>
        <br/>

        <br/>
        <hr/>
        <br/>

        <a href="${BASE_URL}">Home</a>

        </c:if>

    </layout:put>
</layout:extends>