<jsp:useBean id="sService" scope="request" type="com.youtube.services.ISubscribeService"/>
<jsp:useBean id="cs" scope="request" type="com.youtube.services.ICommonService"/>
<jsp:useBean id="videos" scope="request" type="java.util.List"/>
<jsp:useBean id="userChannel" scope="request" type="com.youtube.entities.User"/>
<%--@elvariable id="user" type="com.youtube.entities.User"--%>
<%@ page contentType="text/html;charset=UTF-8; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/common/taglibs.jsp" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <link rel="stylesheet" href="<c:url value='/templates/channel/channel.css'/>" type="text/css">
    <link rel="stylesheet" href="<c:url value='/templates/channel/css/channel_responsive.css'/>" type="text/css">
    <title>Channel</title>
</head>

<body>
<div id="userchannel">
    <figure>
        <img id="chanelcoverimage" src="<c:url value='${userChannel.coverChannelUrl}'/> " alt="Channel Cover Image">
    </figure>

    <!-- begin aboutchanel -->
    <div id="aboutchanel">
        <figure>
            <img id="avtmychanel" src="<c:url value='${userChannel.avatarChannelUrl}'/> " alt="avatar">
            <div>
                <p><c:out value='${userChannel.nameChannel}'/></p>
                <span id="sldangki"><c:out
                        value='${userChannel.subscribe == 0 ? 0 : cs.formatNumber(userChannel.subscribe)}'/>
                        &nbsp;người đăng ký</span>
            </div>
        </figure>
        <input type="submit" value="${sService.isSubscribed(userChannel.id, user.id) ? 'ĐÃ ĐĂNG KÝ' : 'ĐĂNG KÝ'}"
               id="btn-subscribe"
               class="cursor-p ${sService.isSubscribed(userChannel.id, user.id) ? 'subscribed' : ''}"/>
    </div>
    <!-- end aboutchanel -->

    <!-- begin videochanel -->
    <div class="d-flex fw-600" id="videochanel">
        <c:forEach var='video' items='${videos}'>
            <a href="<c:url value='/watch?v=${video.id}'/>">
                <img src="<c:url value='${video.avatarUrl}'/> " alt="video">
                <div class="info ">
                    <p class="name m-0"><c:out value='${video.name}'/></p>
                    <p class="user m-0"><c:out value='${video.user.nameChannel}'/></p>
                    <p class="moreinfo m-0">
                        <c:out value='${video.views == 0 ? 0 : cs.formatNumber(video.views)}'/>
                        &nbsp;lượt xem •&nbsp;
                        <c:out value='${cs.distanceTime(video.postingTime)}'/>
                    </p>
                </div>
            </a>
        </c:forEach>

    </div>
    <!-- end videochanel -->
    <c:if test="${user.id ==userChannel.id}">
        <a href="<c:url value='/channelManage?id=${userChannel.id}'/>" class="h-40px d-block lh-40px" style="padding-left: 200px;">
            <i class="fal fa-file-video"></i>
            <span>Quản lý video của bạn</span>
        </a>
   </c:if>
    <button></button>
    <!-- begin introducechanel -->
    <div id="introducechanel">
        <p id="namechanel">Tên Channel: <c:out value='${userChannel.nameChannel}'/></p>
        <p id="email">Email liên hệ: <c:out value='${userChannel.email}'/></p>
        <p id="createdate">Ngày thành lập: <c:out value='${cs.formatTime(userChannel.createdOn)}'/></p>

    </div>
    <!-- end introducechanel -->
</div>
<script src="<c:url value='/templates/common/js/common.js'/>"></script>
<script src="<c:url value='/templates/channel/js/channel.js'/>" type="text/javascript"></script>
<script>

    const urlAPI = {
        User: 'http://localhost:8080/api-user',
        Video: 'http://localhost:8080/api-video',
        Comment: 'http://localhost:8080/api-comment',
        Subscribe: 'http://localhost:8080/api-subscribe',
        ComInteract: 'http://localhost:8080/api-com-interact',
        VidInteract: 'http://localhost:8080/api-vid-interact'
    }

    // Subscribe
    const subscribeChannel = function () {

        let isSub = ${sService.isSubscribed(userChannel.id, user.id)};
        console.log(isSub);
        // Quantity subscribe
        let subscribes = ${userChannel.subscribe};

        const btnSubscribe = $('#btn-subscribe');

        btnSubscribe.onclick = function () {

            if (${user != null}) {

                if (isSub) {

                    // subscribed
                    callAPI(urlAPI.Subscribe + '?userId=' + ${userChannel.id}, {
                        method: 'DELETE'
                    }).then(isSuccess => {
                        if (!isSuccess) {
                            return false;
                        }
                    });
                    btnSubscribe.value = 'ĐĂNG KÝ';
                    subscribes--;

                } else {

                    // subscribe
                    callAPI(urlAPI.Subscribe + '?userId=' + ${userChannel.id}, {
                        method: 'POST'
                    }).then(isSuccess => {
                        if (!isSuccess) {
                            return false;
                        }
                    });
                    btnSubscribe.value = 'ĐÃ ĐĂNG KÝ';
                    subscribes++;
                }

                btnSubscribe.classList.toggle('subscribed');
                $('#sldangki').innerHTML = formatNumber(subscribes) + ' người đăng ký';
                isSub = !isSub;
            } else {
                window.alert('Bạn chưa đăng nhập!');
            }
        }
    }

    const callAPI = function (url, options) {
        return fetch(url, options)
            .then((resp) => {
                return resp.json();
            })
            .then((valueOfResponse) => {
                return valueOfResponse;
            })
        // .catch((err) => {
        //     window.alert(err);
        // })
    }

    const formatNumber = function (number) {
        let result;
        if (number > 1000000) {
            let coefficient = number / 1000000;
            result = (coefficient.toFixed(1) - coefficient ? coefficient : coefficient.toFixed(1)) + ' Tr';
        } else if (number > 1000) {
            let coefficient = number / 1000;
            result = (coefficient.toFixed(1) - coefficient ? coefficient : coefficient.toFixed(1)) + ' N';
        } else {
            result = number;
        }
        return result;
    }

    const main = function () {
        subscribeChannel();
    }

    main();

</script>
</body>
</html>