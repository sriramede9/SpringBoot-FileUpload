<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Get Image!!!</h2>



<%--     <img alt="bunny hop image"  src="<c:url value= '<%=request.getParameter("image")%>' />" />
 --%>
<%--     <img alt="bunny hop image"  src="<c:url value="C://temp//adp_details.PNG" />" />
 --%>
<img alt="testImage" src='C://temp//adp_details.PNG'>



<h1>${path}</h1>

 <table>
            <c:forEach items="${path}" var="file">    
                <tr>
                    <td>OriginalFileName:</td>
                    <td>${file}</td>
                </tr>
                <tr>
                    <td>Type:</td>
                    <td></td>
                </tr>
            </c:forEach>
            
            
  <%--           <%
   String[] colors = ${path};
   for (int i = 0; i < colors.length; i++) {
      out.print("<P>" + colors[i] + "</p>");
   }
%> --%>
            
        </table>


</body>
</html>