<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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