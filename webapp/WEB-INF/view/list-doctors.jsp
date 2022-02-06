<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE HTML>
    <html>
    <head>
        <title>Implementing css and javascript</title>
        <link type="text/css" rel="stylesheet"
        <%--              kelias iki srs arba resources--%>
              href="${pageContext.request.contextPath}/resources/css/style.css"/>
    </head>
    <body>
 <div id = "wrapper">
      <div id = "header">
          <h2> Gydytojų sąrašas</h2>
      </div>
 </div>
    <div id="container">
        <div id="content">
            <input type="button" value="Prideti gydytoja" onclick="window.location.href='showFormForAdd'; return false;" class="add-button">
        </div>
        <table >
            <tr>
                <th>Vardas</th>
                <th>Pavarde</th>
                <th>Specilizacija</th>
                <th>Kabinetas</th>
            </tr>
<%--            looop a--%>
            <c:forEach var="doctors" items="${doctors}">
                <tr>
                    <td>${doctors.firstName}</td>
                    <td>${doctors.lastName}</td>
                    <td>${doctors.specialization}</td>
                    <td>${doctors.cabinet}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
    </body>
    </html>