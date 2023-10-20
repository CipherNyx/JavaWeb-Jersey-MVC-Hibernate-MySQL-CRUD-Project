<%@ page import="lk.jiat.webapp.entity.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://callidora.lk/jsp/template-inheritance" prefix="layout"%>

<%
    boolean isUserLoggedIn = false;
    if(request.getSession().getAttribute("isUserLoggedIn") != null){
        isUserLoggedIn = (boolean) request.getSession().getAttribute("isUserLoggedIn");
    }
    pageContext.setAttribute("isUserLoggedIn",isUserLoggedIn);
%>

<html>
<head>

    <layout:block name="head_title">
        <title>Home Page</title>
    </layout:block>

    <link rel="stylesheet" href="${BASE_URL}assets/css/style.css"/>

    <layout:block name="style">
    </layout:block>

</head>
<body>

<hr/>

<c:if test="${not isUserLoggedIn}">
    <jsp:include page="../frontend/include/header.jsp"/>
</c:if>

<c:if test="${isUserLoggedIn}">
    <jsp:include page="../frontend/include/header_user.jsp"/>
</c:if>

<hr/>

<layout:block name="content">
</layout:block>

<hr/>

<jsp:include page="../frontend/include/footer.jsp"/>

<hr/>

<script src="${BASE_URL}assets/js/main.js"></script>

<script>
    const BASE_URL = ${BASE_URL};
</script>
</body>
</html>
