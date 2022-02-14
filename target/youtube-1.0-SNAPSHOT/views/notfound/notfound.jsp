<%@ page contentType="text/html;charset=UTF-8" language="Java" %>
<%@ include file="/common/taglibs.jsp" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>404 not found</title>
    <link rel="stylesheet" href="<c:url value='/templates/common/vendor/bootstrap/css/bootstrap.min.css'/>"
          type="text/css" media="all">
    <link rel="shortcut icon" href="<c:url value='https://www.youtube.com/s/desktop/0ac1422e/img/favicon_96x96.png'/>">
    <link rel="stylesheet" href="<c:url value='/templates/notfound/css/style.css'/>" type="text/css" media="all">
</head>
<body>
<section class="page_404">
    <div class="container">
        <div class="row">
            <div class="col-sm-12 ">
                <div class="col-sm-10 col-sm-offset-1 text-center m-auto">
                    <div class="four_zero_four_bg">
                        <h1 class="text-center ">404</h1>
                    </div>
                    <div class="contant_box_404">
                        <h3 class="h2">
                            Look like you're lost
                        </h3>
                        <p>the page you are looking for not avaible!</p>
                        <a href="<c:url value='/home'/>" class="link_404">Go to Home</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<script src="<c:url value='/templates/common/vendor/jquery/jquery.min.js'/>"></script>
<script src="<c:url value='/templates/common/vendor/bootstrap/js/bootstrap.min.js'/>"></script>
</body>
</html>
