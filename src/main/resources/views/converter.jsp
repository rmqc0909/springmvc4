<%--
  Created by IntelliJ IDEA.
  User: xiedan
  Date: 2017/1/10
  Time: 上午7:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>HttpMessageConverter Demo</title>
</head>
<body>
    <div id="resp"></div><input type="button" onclick="req();" value="请求"/>

<script src="assets/js/jquery.js" type="text/javascript"></script>
<script>
    function req() {
        $.ajax({
            url: "convert",
            data: "1-xiedan",
            type: "POST",
            contentType: "application/x-wisely",
            success: "哈哈"
        });
    }
</script>

</body>
</html>
