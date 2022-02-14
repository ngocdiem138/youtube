<%@ page contentType="text/html;charset=UTF-8; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/common/taglibs.jsp" %>

<jsp:useBean id="histories" scope="request" type="java.util.List"/>
<jsp:useBean id="cs" scope="request" type="com.youtube.services.ICommonService"/>

<!DOCTYPE html>
<html lang="en">

<head>
    <link rel="stylesheet" type="text/css" href="<c:url value='/templates/history/css/history.css'/>">
    <link rel="stylesheet" type="text/css" href="<c:url value='/templates/history/css/history_responsive.css'/>">
    <title>History</title>
</head>

<body>
<hr>
<p class="heading fw-600">Lịch sử xem</p>
<div class="fw-600 main">
    <c:if test='${histories.size() == 0}'>
        <p class="fw-600 mx-auto">Không có lịch sử xem nào gần đây</p>
    </c:if>
    <c:if test='${histories.size() != 0}'>
        <c:forEach var="history" items="${histories}">
            <a href="<c:url value="/watch?v=${history.videoId}"/>">
                <img src="<c:url value="${history.video.avatarUrl}"/>" alt="">
                <div>
                    <p class="name m-0">
                        <c:out value="${history.video.name}"/>
                    </p>
                    <p class="username">
                        <c:out value="${history.video.user.name}"/> &#183;
                        <c:out value="${cs.formatNumber(history.video.views)}"/> lượt xem
                    </p>
                    <p class="more--info">
                        <c:out value="${cs.formatXML(history.video.content)}" escapeXml="false"/>
                    </p>
                </div>
            </a>
        </c:forEach>
    </c:if>
</div>

<script type="text/javascript" src="<c:url value='/templates/common/js/common.js'/>"></script>
<script type="text/javascript" src="<c:url value='/templates/history/js/history.js'/>"></script>
</body>

</html>
