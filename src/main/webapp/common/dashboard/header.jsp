<%--@elvariable id="key" type="java.lang.String"--%>
<%--@elvariable id="user" type="com.youtube.entities.User"--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/common/taglibs.jsp" %>

<header class="d-flex">
    <%-- begin: start --%>
    <div id="start" class="d-flex my-auto">
        <div id="menu-bar" class="text-center w-40px h-40px cursor-p">
            <i class="fal fa-bars lh-40px"></i>
        </div>
        <a href="<c:url value='/home'/>" id="logo" class="my-auto">
            <img class="w-100px" src="<c:url value='/templates/header/img/logo.png'/>" alt="logo">
        </a>
    </div>
    <%-- end: start --%>
    <%-- begin: menu bar behavior --%>
    <div id="menu-behavior" class="bg-white position-absolute">
        <div class="session">
            <a href="<c:url value='/home'/>" class="active h-40px d-block lh-40px">
                <i class="fal fa-home-lg-alt"></i>
                <span>Trang chủ</span>
            </a>
            <a href="<c:url value=''/>" class="h-40px d-block lh-40px">
                <i class="fal fa-compass"></i>
                <span>Khám phá</span>
            </a>
            <a href="<c:url value=''/>" class="h-40px d-block lh-40px">
                <i class="fal fa-list-alt"></i>
                <span>Kênh đăng kí</span>
            </a>
        </div>
        <hr class="m-0">
        <div class="session">
            <a href="<c:url value=''/>" class="h-40px d-block lh-40px">
                <i class="fal fa-photo-video"></i>
                <span>Thư viện</span>
            </a>
            <a href="<c:url value='/history'/>" class="h-40px d-block lh-40px">
                <i class="fal fa-history"></i>
                <span>Video đã xem</span>
            </a>
            <a href="<c:url value='/channel'/>" class="h-40px d-block lh-40px">
                <i class="fal fa-file-video"></i>
                <span>Video của bạn</span>
            </a>
            <a href="<c:url value=''/>" class="h-40px d-block lh-40px">
                <i class="fal fa-clock"></i>
                <span>Xem sau</span>
            </a>
            <a href="<c:url value=''/>" class="h-40px d-block lh-40px">
                <i class="fal fa-thumbs-up"></i>
                <span>Video đã thích</span>
            </a>
        </div>
        <c:if test="${user.subscribes != null}">
            <hr class="m-0">
            <div class="session session-channel">
                <p>KÊNH ĐĂNG KÝ</p>
                <c:forEach var='subscribe' items='${user.subscribes}'>
                    <c:if test='${subscribe != null}'>
                        <a href="<c:url value='/channel?id=${subscribe.userId}'/>" class="h-40px d-block lh-40px">
                            <figure class="d-inline-block w-40px">
                                <img class="rounded-circle" src="<c:url value='${subscribe.user.avatarChannelUrl}'/>"
                                     alt="">
                            </figure>
                            <span><c:out value='${subscribe.user.nameChannel}'/></span>
                        </a>
                    </c:if>
                </c:forEach>
            </div>
        </c:if>
        <hr class="m-0">
        <div class="session">
            <p>DỊCH VỤ KHÁC CỦA YOUTUBE</p>
            <a href="<c:url value=''/>" class="h-40px d-block lh-40px">
                <i class="fal fa-gamepad-alt"></i>
                <span>Trò chơi</span>
            </a>
            <a href="<c:url value=''/>" class="h-40px d-block lh-40px">
                <i class="fal fa-signal-stream"></i>
                <span>Sự kiện trực tiếp</span>
            </a>
            <a href="<c:url value=''/>" class="h-40px d-block lh-40px">
                <i class="fal fa-trophy"></i>
                <span>Thể thao</span>
            </a>
        </div>
        <hr class="m-0">
        <div class="session">
            <a href="<c:url value=''/>" class="h-40px d-block lh-40px">
                <i class="fal fa-cog"></i>
                <span>Cài đặt</span>
            </a>
            <a href="<c:url value=''/>" class="h-40px d-block lh-40px">
                <i class="fal fa-flag-alt"></i>
                <span>Lịch sử báo cáo</span>
            </a>
            <a href="<c:url value=''/>" class="h-40px d-block lh-40px">
                <i class="fal fa-question-circle"></i>
                <span>Trợ giúp</span>
            </a>
            <a href="<c:url value=''/>" class="h-40px d-block lh-40px">
                <i class="fal fa-exclamation-square"></i>
                <span>Gửi phản hồi</span>
            </a>
        </div>
        <hr class="m-0">
        <div class="session session-info">
            <div>
                <a href="<c:url value=''/>">Giới thiệu</a>
                <a href="<c:url value=''/>">Báo chí</a>
                <a href="<c:url value=''/>">Liên hệ với chúng tôi</a>
                <a href="<c:url value=''/>">Người sáng tạo</a>
                <a href="<c:url value=''/>">Quảng cáo</a>
                <a href="<c:url value=''/>">Nhà phát triển</a>
            </div>
            <div>
                <a href="<c:url value=''/>">Điều khoản</a>
                <a href="<c:url value=''/>">Quyền riêng tư</a>
                <a href="<c:url value=''/>">Chính sách và an toàn</a>
                <a href="<c:url value=''/>">Cách Youtube hoạt động</a>
                <a href="<c:url value=''/>">Thử các tính năng mới</a>
            </div>
            <div class="copy-right">
                &copy; 2021 Google LLC
            </div>
        </div>
    </div>
    <%-- end: menu bar behavior--%>
    <%-- begin: center --%>
    <div id="center" class="d-flex my-auto">
        <form action="<c:url value="/search"/>" method="GET">
            <label>
                <input value="${key}" required name="key" type="text" placeholder="Tìm kiếm"
                       class="rounded-left lh-40px"/>
            </label>
        </form>
        <i id="btn-search" class="fal fa-search btn-search text-center lh-40px cursor-p rounded-right"></i>
        <i class="fal fa-microphone btn-voice text-center lh-40px cursor-p w-40px rounded-circle"></i>
    </div>
    <%-- end: center --%>
    <%-- begin: end --%>
    <div id="end" class="d-flex my-auto">
        <i class="fal fa-video-plus text-center w-40px h-40px lh-40px cursor-p"></i>
        <i class="fal fa-tv-alt text-center w-40px h-40px lh-40px cursor-p"></i>
        <i class="fal fa-bell text-center w-40px h-40px lh-40px cursor-p"></i>
        <c:if test='${user != null}'>
            <img src="<c:url value='${user.avatarUrl}'/>" class="w-40px h-40px lh-40px cursor-p rounded-circle"
                 alt="avatar"
                 id="avatar">
        </c:if>
        <c:if test='${user == null}'>
            <a href="<c:url value='https://accounts.google.com/o/oauth2/auth?scope=email&redirect_uri=http://localhost:8080/login-google&response_type=code
    &client_id=405005216042-agfg4sovu79svdpqoimekpi1gn635ei6.apps.googleusercontent.com&approval_prompt=force'/>"
               class="login h-40px lh-40px rounded text-center">Đăng nhập</a>
        </c:if>
    </div>
    <%-- end: end --%>

    <%-- profile --%>
    <c:if test='${user != null}'>
        <div id="profile" class="position-absolute bg-white">
            <div class="session session-info">
                <figure>
                    <img src="<c:url value='${user.avatarUrl}'/>" class="w-40px rounded-circle" alt="avatar">
                </figure>
                <div>
                    <p class="name">${user.name}</p>
                    <a href="<c:url value=''/>">Quản lý tài khoản Google của ...</a>
                </div>
            </div>
            <hr class="m-0">
            <div class="session">
                <a href="<c:url value='/channel?id=${user.id}'/>" class="d-block h-40px lh-40px">
                    <i class="fal fa-user-circle"></i>
                    <span>Kênh của bạn</span>
                </a>
                <a href="<c:url value=''/>" class="d-block h-40px lh-40px">
                    <i class="fal fa-donate"></i>
                    <span>Giao dịch mua và gói thành viên</span>
                </a>
                <a href="<c:url value=''/>" class="d-block h-40px lh-40px">
                    <i class="fal fa-cog"></i>
                    <span>YouTube Studio</span>
                </a>
                <a href="<c:url value='https://accounts.google.com/o/oauth2/auth?scope=email&redirect_uri=http://localhost:8080/login-google&response_type=code
    &client_id=405005216042-agfg4sovu79svdpqoimekpi1gn635ei6.apps.googleusercontent.com&approval_prompt=force'/>"
                   class="d-block h-40px lh-40px">
                    <i class="fal fa-user-plus"></i>
                    <span>Chuyển đổi tài khoản</span>
                    <i class="fal fa-chevron-right arrow-right"></i>
                </a>
                <a href="<c:url value='/login-google?action=logout'/>" class="d-block h-40px lh-40px">
                    <i class="fal fa-arrow-to-right"></i>
                    <span>Đăng xuất</span>
                </a>
            </div>
            <hr class="m-0">
            <div class="session">
                <a href="<c:url value=''/>" class="d-block h-40px lh-40px">
                    <i class="fal fa-moon"></i>
                    <span>Giao diện: giao diện thiết bị</span>
                    <i class="fal fa-chevron-right arrow-right"></i>
                </a>
                <a href="<c:url value=''/>" class="d-block h-40px lh-40px">
                    <i class="fal fa-language"></i>
                    <span>Ngôn ngữ: Tiếng Việt</span>
                    <i class="fal fa-chevron-right arrow-right"></i>
                </a>
                <a href="<c:url value=''/>" class="d-block h-40px lh-40px">
                    <i class="fal fa-globe-africa"></i>
                    <span>Địa điểm: Việt Nam</span>
                    <i class="fal fa-chevron-right arrow-right"></i>
                </a>
                <a href="<c:url value=''/>" class="d-block h-40px lh-40px">
                    <i class="fal fa-cogs"></i>
                    <span>Cài đặt</span>
                </a>
                <a href="<c:url value=''/>" class="d-block h-40px lh-40px">
                    <i class="fal fa-shield-check"></i>
                    <span>Dữ liệu của bạn trong YouTube</span>
                </a>
                <a href="<c:url value=''/>" class="d-block h-40px lh-40px">
                    <i class="fal fa-question-circle"></i>
                    <span>Trợ giúp</span>
                </a>
                <a href="<c:url value=''/>" class="d-block h-40px lh-40px">
                    <i class="fal fa-exclamation-square"></i>
                    <span>Gửi phản hồi</span>
                </a>
                <a href="<c:url value=''/>" class="d-block h-40px lh-40px">
                    <i class="fal fa-keyboard"></i>
                    <span>Phím tắt</span>
                </a>
            </div>
            <hr class="m-0">
            <div class="session">
                <a href="<c:url value=''/>" class="d-block h-40px lh-40px">
                    <span>Chế độ hạn chế: Đã tắt</span>
                    <i class="fal fa-chevron-right arrow-right"></i>
                </a>
            </div>
        </div>
    </c:if>
    <%-- end: profile --%>
</header>