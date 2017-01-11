<%--
  Created by IntelliJ IDEA.
  User: xiedan11
  Date: 2017/1/11
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>servlet async support</title>
</head>
<body>
<script type="text/javascript" src="assets/js/jquery.js"></script>
<script type="text/javascript">
    deferred();
    function deferred() {
        $.get('defer',function (data) {
            console.log(data);
            deferred();
        });
    }
</script>
</body>
</html>
