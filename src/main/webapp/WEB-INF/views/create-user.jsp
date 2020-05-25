<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>create user</title>
</head>
<body>
<h2>create User!!</h2>


<form:form modelAttribute="u" action="formaction" method="post" enctype="multipart/form-data">
    <table>
        <tr>
            <td>First Name:</td>
            <td>
                <form:input path="name" />
            </td>
        </tr>
         <tr>
            <td>Upload Image:</td>
            <td>
                <input type="file" name='file' />
            </td>
             <tr>
            <td>Upload Image:</td>
            <td>
                <input type="file" name='file' />
            </td>
        </tr>
           <tr>
            <td colspan="2">
                <input type="submit" value="Save Changes" />
            </td>
        </tr>
    </table>
</form:form>
      

</body>
</html>