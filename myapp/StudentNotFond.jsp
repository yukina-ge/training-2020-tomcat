<%@ page contentType="text/html; charset=UTF-8" %>

<html>
  <head><title>生徒詳細</title></head>
  <body>
    <h1> 生徒詳細 </h1>
    <%= request.getParameter("id") %>
    <p>生徒がみつかりませんでした。</p>
  </body>
</html>
