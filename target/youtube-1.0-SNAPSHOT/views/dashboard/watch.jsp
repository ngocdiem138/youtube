<jsp:useBean id="sService" scope="request" type="com.youtube.services.ISubscribeService"/>
<jsp:useBean id="video" scope="request" type="com.youtube.entities.Video"/>
<jsp:useBean id="videos" scope="request" type="java.util.List"/>
<jsp:useBean id="cs" scope="request" type="com.youtube.services.ICommonService"/>
<jsp:useBean id="vService" scope="request" type="com.youtube.services.IVideoService"/>
<jsp:useBean id="cService" scope="request" type="com.youtube.services.ICommentService"/>
<%--@elvariable id="user" type="com.youtube.entities.User"--%>
<jsp:useBean id="comments" scope="request" type="java.util.List"/>
<%@ page contentType="text/html;charset=UTF-8; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/common/taglibs.jsp" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <link rel="stylesheet" type="text/css" href="<c:url value='/templates/watch/css/watch.css'/>">
    <link rel="stylesheet" type="text/css" href="<c:url value='/templates/watch/css/watch_responsive.css'/>">
    <title><c:out value='${video.name}'/></title>
</head>

<body>

<!-- begin: primary -->
<div id="primary" class="w-100">
    <div class="video fw-600">
        <c:out value='${video.src}' escapeXml='false'/>
        <p class="hashtag m-0">
            <c:out value='${video.hashtag}'/>
        </p>
        <p class="name m-0">
            <c:out value='${video.name}'/>
        </p>
        <p class="views-time m-0">
            <c:out value='${video.views == 0 ? 0 : cs.addFPoint(video.views)}'/>
<%--            <fmt:formatNumber value = "${video.views}" type = "currency"/>--%>
            &nbsp;lượt xem •&nbsp;
            <c:out value='${cs.formatTime(video.postingTime)}'/>
        </p>
        <div class="interaction">
            <i id="btn-like-video"
               class="fal fa-thumbs-up ${vService.isLikedByUser(video.id, user.id) ? 'active' : ''}">
            </i>
            <span id="quantity-like-video">
                <c:out value='${video.likes == 0 ? 0 : cs.formatNumber(video.likes)}'/>
            </span>
            <i id="btn-dislike-video"
               class="fal fa-thumbs-down ${vService.isDislikedByUser(video.id, user.id) ? 'active' : ''}">
            </i>
            <span id="quantity-dislike-video">
                <c:out value='${video.dislikes == 0 ? 0 : cs.formatNumber(video.dislikes)}'/>
            </span>
            <i class="fal fa-share"></i>
            <span>SHARE</span>
            <i class="fal fa-save"></i>
            <span>LƯU</span>
            <i class="fal fa-ellipsis-h"></i>
        </div>
    </div>
    <hr/>
    <div class="content">
        <div class="info d-flex">
            <a href="<c:url value='/channel?id=${video.userId}'/>" class="profile d-flex">
                <figure>
                    <img class="rounded-circle" src="<c:url value='${video.user.avatarChannelUrl}'/>"
                         alt="avatar"/>
                </figure>
                <div class="fw-600">
                    <p class="m-0"><c:out value='${video.user.name}'/></p>
                    <span>
                        <c:out value='${video.user.subscribe == 0 ? 0 : cs.formatNumber(video.user.subscribe)}'/>
                        &nbsp;người đăng ký
                    </span>
                </div>
            </a>
            <div id="btn-subscribe"
                 class="btn-sub h-40px rounded cursor-p lh-40px ${sService.isSubscribed(video.userId, user.id) ? 'subscribeb' : ''}">
                <c:out value='${sService.isSubscribed(video.userId, user.id) ? \'ĐÃ ĐĂNG KÝ\' : \'ĐĂNG KÝ\'}'/>
            </div>
        </div>
        <div class="expander">
            <c:forEach var='content' items='${cs.formatXML(video.content)}'>
                <p class="fw-600"><c:out value='${content}' escapeXml='false'/></p>
            </c:forEach>
        </div>
    </div>
    <hr/>
    <div class="comments">
        <div class="heading fw-600">
            <span id="quantity-comment"><c:out value='${comments.size() == 0 ? 0 : cs.formatNumber(comments.size())} bình luận'/></span>
            <span>
                <i class="fal fa-sort-amount-up-alt"></i>
                SẮP XẾP THEO
            </span>
        </div>
        <c:if test='${user != null}'>
            <div class="add-comment">
                <figure>
                    <img src="<c:url value='${user.avatarUrl}'/>" alt="avatar"/>
                </figure>
                <label>
                    <input class="w-100" name="comment_content" type="text" placeholder="Bình luận công khai...">
                </label>
            </div>
            <div class="save-comment">
                <button class="cancel cursor-p">HỦY</button>
                <button id="btn-add-comment" type="submit" class="save cursor-p text-white rounded h-40px lh-40px">
                    BÌNH LUẬN
                </button>
            </div>
        </c:if>
        <c:if test='${comments != null}'>
            <div id="render-comment">
                <c:forEach var='comment' items='${comments}'>
                    <div class="comment" data-id="${comment.id}">
                        <figure>
                            <img src="<c:url value='${comment.user.avatarUrl}'/>" alt="avatar">
                        </figure>
                        <div>
                            <div class="name">
                                <a href="<c:url value='/channel?id=${comment.userId}'/>"><c:out
                                        value='${comment.user.name}'/></a>
                                <span><c:out value='${cs.distanceTime(comment.time)}'/></span>
                            </div>
                            <div class="comment-content">
                                <c:out value='${comment.content}'/>
                                <div class="interaction" data-id="${comment.id}">
                                    <span class="${cService.isLikedByUser(comment.id, user.id) ? 'btn__likecomment active' : 'btn__likecomment'}"
                                          data-isLike="${cService.isLikedByUser(comment.id, user.id) ? true : false}"
                                          data-likes="${comment.likes}">
                                        <i class="fal fa-thumbs-up"></i>
                                        <span class="quantity--like">${cs.formatNumber(comment.likes)}</span>
                                    </span>
                                    <span class="${cService.isDislikedByUser(comment.id, user.id) ? 'btn__dislikecomment active' : 'btn__dislikecomment'}"
                                          data-isDislike="${cService.isDislikedByUser(comment.id, user.id) ? true : false}"
                                          data-dislikes="${comment.dislikes}">
                                        <i class="fal fa-thumbs-down"></i>
                                        <span class="quantity--dislike">${cs.formatNumber(comment.dislikes)}</span>
                                    </span>
                                    <c:if test='${comment.userId == user.id}'>
                                        <span class="comment--crud">
                                            <i class="fal fa-ellipsis-v options w-40px h-40px lh-40px text-center rounded-circle"></i>
                                            <div class="comment-edit-delete bg-white rounded">
                                                <div class="cursor-p edit-comment" data-id="${comment.id}">
                                                    <i class="fal fa-edit"></i>
                                                    <span>Chỉnh sửa</span>
                                                </div>
                                                <div class="cursor-p delete-comment" data-id="${comment.id}">
                                                    <i class="fal fa-trash-alt"></i>
                                                    <span>Xóa</span>
                                                </div>
                                            </div>
                                        </span>
                                    </c:if>
                                </div>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </c:if>
    </div>
</div>
<!-- end: primary -->

<!-- begin: secondary -->
<div id="secondary">
    <c:forEach var='video' items='${videos}'>
        <a href="<c:url value='/watch?v=${video.id}'/>" class="session">
            <figure>
                <img src="<c:url value='${video.avatarUrl}'/>" alt="${video.avatarUrl}">
            </figure>
            <div>
                <p class="name">
                    <c:out value='${video.name}'/>
                </p>
                <p class="user">
                    <c:out value='${video.user.name}'/>
                </p>
                <p class="info">
                    <c:out value='${video.views == 0 ? 0 : cs.formatNumber(video.views)}'/>
                    &nbsp;lượt xem •&nbsp;
                    <c:out value='${cs.distanceTime(video.postingTime)}'/>
                </p>
            </div>
        </a>
    </c:forEach>
</div>
<!-- end: secondary -->

<script type="text/javascript" src="<c:url value='/templates/common/js/common.js'/>"></script>
<script type="text/javascript" src="<c:url value='/templates/watch/js/watch.js'/>"></script>
<script>

    // Url of API
    const urlAPI = {
        User: 'http://localhost:8080/api-user',
        Video: 'http://localhost:8080/api-video',
        Comment: 'http://localhost:8080/api-comment',
        Subscribe: 'http://localhost:8080/api-subscribe',
        ComInteract: 'http://localhost:8080/api-com-interact',
        VidInteract: 'http://localhost:8080/api-vid-interact'
    }

    // Constructor of video
    const video = {
        id: ${video.id},
        name: `${video.name}`,
        src: `${video.src}`,
        views: ${video.views},
        postingTime: `${video.postingTime}`,
        likes: ${video.likes},
        dislikes: ${video.dislikes},
        avatarUrl: `${video.avatarUrl}`,
        userId: ${video.userId}
    }

    // quantity of comment
    let commentQuantity = ${video.comments.size()};

    // Interaction of video
    const videoInteraction = function () {

        // Check user like or dislike or undefine
        let interaction = 0;
        if (${vService.isLikedByUser(video.id, user.id)}) {
            interaction = 1;
        }
        if (${vService.isDislikedByUser(video.id, user.id)}) {
            interaction = -1;
        }

        const btnLike = $('#btn-like-video');
        const btnDislike = $('#btn-dislike-video');

        btnLike.onclick = function () {
            btnInteractionClick(true);
        };

        btnDislike.onclick = function () {
            btnInteractionClick(false);
        };

        let btnInteractionClick = function (isBtnLike) {

            // Check user of scope not null
            if (${user != null}) {

                // Body of api
                const bodyAPI = JSON.stringify({
                    isLike: isBtnLike,
                    videoId: video.id
                });

                // Interaction is define
                let defineInteraction = function (isBtnLike) {

                    if ((interaction === -1 && isBtnLike) || (interaction === 1 && isBtnLike === false)) {
                        callAPI(urlAPI.VidInteract, {
                            method: 'PUT',
                            body: bodyAPI
                        }).then(isSuccess => {
                            if (!isSuccess) {
                                return false;
                            }
                        });

                    } else {
                        callAPI(urlAPI.VidInteract + `?id=` + video.id, {
                            method: 'DELETE'
                        }).then(isSuccess => {
                            if (!isSuccess) {
                                return false;
                            }
                        });
                    }
                    return true;
                }

                // Interaction is undefine
                let undefineInteraction = function () {
                    callAPI(urlAPI.VidInteract, {
                        method: 'POST',
                        body: bodyAPI
                    }).then(isSuccess => {
                        if (!isSuccess) {
                            return false;
                        }
                    });
                    return true;
                };

                switch (interaction) {
                    case -1: {
                        if (defineInteraction(isBtnLike)) {
                            if (isBtnLike) {
                                btnDislike.classList.remove('active');
                                btnLike.classList.add('active');
                                video.likes++;
                                video.dislikes--;
                                interaction = 1;
                            } else {
                                btnDislike.classList.remove('active');
                                video.dislikes--;
                                interaction = 0;
                            }
                        }
                        break;
                    }
                    case 0: {
                        if (undefineInteraction()) {
                            if (isBtnLike) {
                                btnLike.classList.add('active');
                                video.likes++;
                                interaction = 1;
                            } else {
                                btnDislike.classList.add('active');
                                video.dislikes++;
                                interaction = -1;
                            }
                        }

                        break;
                    }
                    case 1: {
                        if (defineInteraction(isBtnLike)) {
                            if (isBtnLike) {
                                btnLike.classList.remove('active');
                                video.likes--;
                                interaction = 0;
                            } else {
                                btnLike.classList.remove('active');
                                btnDislike.classList.add('active');
                                video.likes--;
                                video.dislikes++;
                                interaction = -1;
                            }
                        }
                        break;
                    }
                }

                $('#quantity-like-video').innerHTML = formatNumber(video.likes);
                $('#quantity-dislike-video').innerHTML = formatNumber(video.dislikes);
            } else {
                window.alert("Bạn chưa đăng nhập!");
            }
        };
    };

    // Subscribe
    const subscribeChannel = function () {

        let isSub = ${sService.isSubscribed(video.userId, user.id)};

        // Quantity subscribe
        let subscribes = ${video.user.subscribe};

        const btnSubscribe = $('#btn-subscribe');

        btnSubscribe.onclick = function () {

            if (${user != null}) {

                if (isSub) {

                    // subscribed
                    callAPI(urlAPI.Subscribe + '?userId=' + video.userId, {
                        method: 'DELETE'
                    }).then(isSuccess => {
                       if (!isSuccess) {
                           return false;
                       }
                    });
                    btnSubscribe.innerHTML = 'ĐĂNG KÝ';
                    subscribes--;

                } else {

                    // subscribe
                    callAPI(urlAPI.Subscribe + '?userId=' + video.userId, {
                        method: 'POST'
                    }).then(isSuccess => {
                        if (!isSuccess) {
                            return false;
                        }
                    });
                    btnSubscribe.innerHTML = 'ĐÃ ĐĂNG KÝ';
                    subscribes++;
                }

                btnSubscribe.classList.toggle('subscribeb');
                $('#primary .content .info a span').innerHTML = formatNumber(subscribes) + ' người đăng ký';
                isSub = !isSub;
            } else {
                window.alert('Bạn chưa đăng nhập!');
            }
        }
    }

    // Add a comment
    const addComment = function () {

        const input = $('#primary .add-comment input');
        const fromAction = $('#primary .comments .save-comment');
        const btnCancel = $('#primary .comments .save-comment .cancel');
        const btnAddComment = $('#primary #btn-add-comment');

        let isDisplayAddComment = false;

        // Toggle input
        if (input != null) {
            input.onclick = () => {
                if (!isDisplayAddComment) {
                    fromAction.style.display = 'block';
                    isDisplayAddComment = true;
                }
            }
        }

        // Toggle input
        if (btnCancel != null) {
            btnCancel.onclick = () => {
                if (isDisplayAddComment) {
                    fromAction.style.display = 'none';
                    isDisplayAddComment = false;
                    input.value = '';
                }
            }
        }

        // Add a comment
        if (btnAddComment != null) {
            btnAddComment.onclick = () => {
                let commentContent = input.value;
                if (commentContent === '') {
                    return false;
                }

                // Insert into database
                callAPI(urlAPI.Comment, {
                    method: 'POST',
                    body: JSON.stringify({
                        content: commentContent,
                        videoId: video.id
                    })
                }).then((id) => {
                    if (id === null) {
                        alert('Không thành công!');
                        return false;
                    }

                    // render page
                    let renderComment = $('#render-comment');
                    renderComment.innerHTML = `
                        <div class="comment" data-id="` + id + `">
                            <figure>
                                <img src="<c:url value='${user.avatarUrl}'/>" alt="avatar">
                            </figure>
                            <div>
                                <div class="name">
                                    <a href="<c:url value='/channel?id=${user.id}'/>">${user.name}</a>
                                    <span>0 giây trước</span>
                                </div>
                                <div class="comment-content">
                                    ` + commentContent + `
                                    <div class="interaction" data-id="` + id + `">
                                        <span class="btn__likecomment" data-isLike="false" data-likes="0">
                                            <i class="fal fa-thumbs-up"></i>
                                            <span class="quantity--like">0</span>
                                        </span>
                                        <span class="btn__dislikecomment" data-isDislike="false" data-dislikes="0">
                                            <i class="fal fa-thumbs-down"></i>
                                            <span class="quantity--dislike">0</span>
                                        </span>
                                        <span class="comment--crud">
                                            <i class="fal fa-ellipsis-v options w-40px h-40px lh-40px text-center rounded-circle"></i>
                                            <div class="comment-edit-delete bg-white rounded">
                                                <div class="cursor-p edit-comment" data-id=` + id + `>
                                                    <i class="fal fa-edit"></i>
                                                    <span>Chỉnh sửa</span>
                                                </div>
                                                <div class="cursor-p delete-comment" data-id=` + id + `>
                                                    <i class="fal fa-trash-alt"></i>
                                                    <span>Xóa</span>
                                                </div>
                                            </div>
                                        </span>
                                    </div>
                                </div>
                            </div>
                        </div>
                    ` + renderComment.innerHTML;
                    fromAction.style.display = 'none';
                    commentQuantity++;
                    $('#quantity-comment').innerHTML = formatNumber(commentQuantity) + ` bình luận`;
                    input.value = '';
                    isDisplayAddComment = false;
                    editOrDeleteComment();
                    commentInteraction();
                })
            }
        }
    }

    // Edit or delete comment
    const editOrDeleteComment = function () {

        const options = $$('#primary .comments .options');
        const formActions = $$('#primary .comments .comment-edit-delete');
        const commentCruds = $$('#primary .comments .comment--crud');

        options.forEach((option, index) => {
            option.onclick = () => {
                if (formActions[index].style.display === 'block') {
                    formActions[index].style.display = 'none';
                } else {
                    formActions[index].style.display = 'block';
                }
            }
        });

        commentCruds.forEach((commentCrud) => {

            let btnEdit = commentCrud.querySelector('.edit-comment');
            let btnDelete = commentCrud.querySelector('.delete-comment');
            let id = btnDelete.getAttribute('data-id');

            btnEdit.onclick = () => {

            }

            btnDelete.onclick = () => {
                callAPI(urlAPI.Comment + '?id=' + id, {
                    method: 'DELETE'
                }).then((isSuccess) => {
                    if (!isSuccess) {
                        return false;
                    }
                });

                const comments = $$('.comment');
                comments.forEach((comment) => {
                    if (comment.getAttribute('data-id') === id) {
                        comment.innerHTML = ``;
                        commentQuantity--;
                        $('#quantity-comment').innerHTML = formatNumber(commentQuantity) + ` bình luận`;
                    }
                });
            }
        });
    }

    // Interaction of comment
    const commentInteraction = function () {

        const interactionComments = $$('#primary .comment .interaction');

        interactionComments.forEach((interactionComment) => {

            const id = interactionComment.getAttribute('data-id');
            const btnLike = interactionComment.querySelector('.btn__likecomment');
            const btnDislike = interactionComment.querySelector('.btn__dislikecomment');

            // Check user like or dislike or undefine
            let interaction = 0;
            if (btnLike.getAttribute('data-isLike') === 'true') {
                interaction = 1;
            }
            if (btnDislike.getAttribute('data-isDislike') === 'true') {
                interaction = -1;
            }

            let likes = parseFloat(btnLike.getAttribute('data-likes'));
            let dislikes = parseFloat(btnDislike.getAttribute('data-dislikes'));

            btnLike.onclick = function () {
                btnInteractionClick(true);
            }
            btnDislike.onclick = function () {
                btnInteractionClick(false);
            }

            let btnInteractionClick = function (isBtnLike) {

                if (${user != null}) {

                    // Body of api
                    const bodyAPI = JSON.stringify({
                        isLike: isBtnLike,
                        commentId: id
                    });

                    // Interaction is define
                    let defineInteraction = function (isBtnLike) {

                        // is mode dislike
                        if ((interaction === -1 && isBtnLike) || (interaction === 1 && isBtnLike === false)) {
                            callAPI(urlAPI.ComInteract, {
                                method: 'PUT',
                                body: bodyAPI
                            }).then(isSuccess => {
                                if (!isSuccess) {
                                    return false;
                                }
                            });

                        } else {
                            callAPI(urlAPI.ComInteract + `?id=` + id, {
                                method: 'DELETE'
                            }).then(isSuccess => {
                                if (!isSuccess) {
                                    return false;
                                }
                            });
                        }
                        return true;
                    }

                    // Interaction is undefine
                    let undefineInteraction = function () {
                        callAPI(urlAPI.ComInteract, {
                            method: 'POST',
                            body: bodyAPI
                        }).then(isSuccess => {
                            if (!isSuccess) {
                                return false;
                            }
                        });
                        return true;
                    };

                    switch (interaction) {
                        case -1: {
                            if (defineInteraction(isBtnLike)) {
                                if (isBtnLike) {
                                    btnDislike.classList.remove('active');
                                    btnLike.classList.add('active');
                                    likes++;
                                    dislikes--;
                                    interaction = 1;
                                } else {
                                    btnDislike.classList.remove('active');
                                    dislikes--;
                                    interaction = 0;
                                }
                            }
                            break;
                        }
                        case 0: {
                            if (undefineInteraction()) {
                                if (isBtnLike) {
                                    btnLike.classList.add('active');
                                    likes++;
                                    interaction = 1;
                                } else {
                                    btnDislike.classList.add('active');
                                    dislikes++;
                                    interaction = -1;
                                }
                            }
                            break;
                        }
                        case 1: {
                            if (defineInteraction(isBtnLike)) {
                                if (isBtnLike) {
                                    btnLike.classList.remove('active');
                                    likes--;
                                    interaction = 0;
                                } else {
                                    btnLike.classList.remove('active');
                                    btnDislike.classList.add('active');
                                    likes--;
                                    dislikes++;
                                    interaction = -1;
                                }
                            }
                            break;
                        }
                    }
                    btnLike.querySelector('.quantity--like').innerHTML = formatNumber(likes);
                    btnDislike.querySelector('.quantity--dislike').innerHTML = formatNumber(dislikes);
                } else {
                    window.alert("Bạn chưa đăng nhập!");
                }
            }
        })
    }

    const nextVideo = function () {
        // setInterval(function () {
        //     let iframe = $('#primary iframe');
        //     console.log(!iframe.getCurrentTime ? 0.0 : iframe.getCurrentTime());
        // }, 1000);
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
        videoInteraction();
        subscribeChannel();
        addComment();
        editOrDeleteComment();
        commentInteraction();
        nextVideo();
    }

    main();

</script>

</body>

</html>