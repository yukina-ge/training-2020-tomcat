<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="model.student.Student" %>
<%
Student student = (Student)request.getAttribute("student");
%>
<html>
  <head><title>HelloWorld!</title></head>
  <body>
    <h1> 生徒詳細 </h1>
    
    <table border="1">

      <tr>
        <th>生徒番号</th>
        <td><%= student.getId().getValue() %></td>
      </tr>

      <tr>
        <th>生徒名</th>
        <td><%= student.getName().fullName() %></td>
      </tr>

      <tr>
        <th>性別</th>
        <td><%= student.getGender().getLabel() %></td>
      </tr>

      <tr>
        <th>学年</th>
        <td><%= student.getClassRoom().getGrade().getValue() + "年生" %></td>
      </tr>

      <tr>
        <th>クラス</th>
        <td><%= student.getClassRoom().getClassName().getValue() + "組" %></td>
      </tr>

    </table>
  </body>
</html>
