<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>

    <TITLE>CRM-Customer Relationship manager</TITLE>
    <link type="text/css" rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/add-doctor-style.css/"/>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>
</head>
<body>
<div id="wrapper">
    <div id="header">
        <H2>Gydytojų pridėjimo forma</H2>
    </div>
</div>
<div id="container">
    <h3>Išsaugoti gydytoją</h3>
    <form:form action="saveDoctor" modelAttribute="doctor" method="post">
        <%--         saveDoctor maping in controler !!!!!!--%>
        <table>
            <tbody>
            <tr>
                <td><label> Vardas: </label></td>
                <td><form:input path="firstName"></form:input></td>
            </tr>
            <tr>
            <td><label> Pavardė: </label></td>
            <td><form:input path="lastName"></form:input></td>
            </tr>
            <tr>
                <td><label> Specialybė: </label></td>
                <td><form:input path="specialization"></form:input></td>
            </tr>
            <tr>
                <td><label> Kabinetas: </label></td>
                <td><form:input path="cabinet"></form:input></td>
            </tr>
            <tr>
                <Td></Td>
                <td><input type="submit" value="Išsaugoti" class.save></td>
            </tr>
            </tbody>
        </table>
    </form:form>
    <div style="clear: both;"></div>
    <p>
        <input type="button" value="Atgal į sąrašą"
               onclick="window.location.href='${pageContext.request.contextPath}/doctor/list'; return false;"
               class="add-button">
    </p>
</div>

</body>
</html>