<%@ page contentType="text/html;charset=UTF-8" language="JAVA" %>
<%@ include file="/common/taglibs.jsp" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta charset="UTF-8" content="">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title><dec:title default="Home"/></title>
    <link rel="shortcut icon" href="<c:url value='https://www.youtube.com/s/desktop/0ac1422e/img/favicon_96x96.png'/>">
    <link rel="stylesheet" type="text/css"
          href="<c:url value='/templates/common/vendor/bootstrap/css/bootstrap.min.css'/>">
    <link rel="stylesheet" type="text/css" href="<c:url value='/templates/common/font/awesome/css/all.css'/>">
    <link rel="stylesheet" type="text/css" href="<c:url value='/templates/common/css/base.css'/>">
    <link rel="stylesheet" type="text/css" href="<c:url value='/templates/common/css/common.css'/>">
    <link rel="stylesheet" type="text/css" href="<c:url value='/templates/header/header.css'/>">
    <link rel="stylesheet" type="text/css" href="<c:url value='/templates/header/css/header_responsive.css'/>">
    <dec:head/>
</head>

<body>

<div class="main">

    <%-- header --%>
    <%@ include file='/common/dashboard/header.jsp' %>
    <%-- header --%>

    <%-- container --%>
    <div id="container">
        <dec:body/>
    </div>
    <%-- container --%>

</div>

<script type="text/javascript" src="<c:url value='/templates/common/vendor/jquery/jquery.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/templates/common/vendor/bootstrap/js/bootstrap.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/templates/header/js/header.js'/>"></script>
</body>
</html>
