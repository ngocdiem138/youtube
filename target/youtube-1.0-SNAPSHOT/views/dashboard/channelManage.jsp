<jsp:useBean id="videos" scope="request" type="java.util.List"/>
<jsp:useBean id="userChannel" scope="request" type="com.youtube.entities.User"/>
<%--<jsp:useBean id="category" scope="request" type="com.youtube.daos.impls.CategoryDAO"/>--%>
<%--<%@elvariable id="user" type="com.youtube.entities.User"%>--%>
<%@ page contentType="text/html;charset=UTF-8; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/common/taglibs.jsp" %>

<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Quản lý kênh</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    <link rel="stylesheet" type="text/css" href="<c:url value='/templates/channel/channelManage/css/channelManage.css'/>">
    <script>
        $(document).ready(function () {
            // Activate tooltip
            $('[data-toggle="tooltip"]').tooltip();

            // Select/Deselect checkboxes
            var checkbox = $('table tbody input[type="checkbox"]');
            $("#selectAll").click(function () {
                if (this.checked) {
                    checkbox.each(function () {
                        this.checked = true;
                    });
                } else {
                    checkbox.each(function () {
                        this.checked = false;
                    });
                }
            });
            checkbox.click(function () {
                if (!this.checked) {
                    $("#selectAll").prop("checked", false);
                }
            });
        });
    </script>
    <!-- JS tạo nút bấm di chuyển trang start -->
    <script src="http://1892.yn.lt/blogger/JQuery/Pagging/js/jquery.twbsPagination.js" type="text/javascript"></script>
    <!-- JS tạo nút bấm di chuyển trang end -->
    <script type="text/javascript">
        $(function () {
            var pageSize = 5; // Hiển thị 6 sản phẩm trên 1 trang
            showPage = function (page) {
                $(".contentPage").hide();
                $(".contentPage").each(function (n) {
                    if (n >= pageSize * (page - 1) && n < pageSize * page)
                        $(this).show();
                });
            }
            showPage(1);
            ///** Cần truyền giá trị vào đây **///
            var totalRows = document.getElementsByClassName("contentPage").length; // Tổng số sản phẩm hiển thị
            var iTotalPages = Math.ceil(totalRows / pageSize);
            var btnPage = iTotalPages; // Số nút bấm hiển thị di chuyển trang
            if (iTotalPages > 5) btnPage = 5;

            var obj = $('#pagination').twbsPagination({
                totalPages: iTotalPages,
                visiblePages: btnPage,
                onPageClick: function (event, page) {
                    console.info(page);
                    showPage(page);
                }
            });
            console.info(obj.data());
        });
    </script>
</head>

<body>
<div class="container-xl">
    <div class="table-responsive">
        <div class="table-wrapper">
            <div class="table-title">
                <div class="row">
                    <div class="col-sm-6">
                        <h2>Quản lý kênh của bạn <b>${userChannel.name}</b></h2>
                    </div>
                    <div class="col-sm-6">
                        <a href="#addEmployeeModal" class="btn btn-success" data-toggle="modal"><i
                                class="material-icons">&#xE147;</i> <span>Thêm video mới</span></a>
                        <a href="#deleteEmployeeModal" class="btn btn-danger" data-toggle="modal"><i
                                class="material-icons">&#xE15C;</i> <span>Xóa</span></a>
                    </div>
                </div>
            </div>
            <table class="table table-striped table-hover">
                <thead>
                <tr>
                    <th>
                                <span class="custom-checkbox">
                                    <input type="checkbox" id="selectAll">
                                    <label for="selectAll"></label>
                                </span>
                    </th>
                    <th>Tên</th>
                    <th>Hashtag</th>
                    <th>Link video</th>
                    <th>Link ảnh</th>
                    <th>Nội dung mô tả</th>
                    <th>Actions</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var='video' items='${videos}' varStatus="status">
                    <tr class="contentPage">
                        <td>
                                <span class="custom-checkbox">
                                    <input type="checkbox" id="${video.id}" name="options[]" value="1">
                                    <label for="${video.id}"></label>
                                </span>
                        </td>
                        <td>${video.name}</td>
                        <td>${video.hashtag}</td>
                        <td>${video.src}</td>
                        <td>${video.avatarUrl}</td>
                        <td>${video.content}</td>
                        <td>
                            <a href="#editEmployeeModal" class="edit" data-toggle="modal"><i class="material-icons"
                                                                                             data-toggle="tooltip"
                                                                                             title="Edit">&#xE254;</i></a>
                            <a href="#deleteEmployeeModal" class="delete" data-toggle="modal"><i
                                    class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <!-- Hiên thị nút bấm -->
            <div class="clearfix">
                <div class="hint-text">Showing <b>5</b> out of <b>${videos.size()}</b> entries</div>
                <ul id="pagination"></ul>
            </div>
        </div>
    </div>
</div>
<!-- Add Modal HTML -->
<div id="addEmployeeModal" class="modal fade">
    <div class="modal-dialog">
        <div class="modal-content">
            <form action="channelManage">
                <div class="modal-header">
                    <h4 class="modal-title">Thêm video</h4>
                    <input type="hidden" name="action" value="Add">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                        <label>Tên</label>
                        <input type="text" name="name" class="form-control" required>

                    </div>
                    <div class="form-group">
                        <label>Hashtag</label>
                        <input type="text" name="hashtag" class="form-control" required>
                    </div>
                    <div class="form-group">
                        <label>Link video</label>
                        <textarea type="text" name="src" class="form-control" required></textarea>
                    </div>
                    <div class="form-group">
                        <label>Link ảnh</label>
                        <input type="text" name="avatarUrl" class="form-control" required>
                    </div>
                    <div class="form-group">
                        <label>Nội dung mô tả</label>
                        <input type="text" name="context"class="form-control" required>
                    </div>
                </div>
                <div class="form-group">
                    <label>Thể loại</label>
                    <select name="categoryID" class="form-control">
                        <c:forEach var="cate" items="${categorys}">
                            <option value="${cate.id}"> ${cate.name} </option>
                        </c:forEach>
                    </select>
                </div>
                <div class="modal-footer">
                    <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                    <input type="submit" class="btn btn-success" value="Add">
                </div>
            </form>
        </div>
    </div>
</div>
<!-- Edit Modal HTML -->
<div id="editEmployeeModal" class="modal fade">
    <div class="modal-dialog">
        <div class="modal-content">
            <form>
                <div class="modal-header">
                    <h4 class="modal-title">Sửa Video</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                        <label>Tên</label>
                        <input type="text" class="form-control" required>
                    </div>
                    <div class="form-group">
                        <label>Hashtag</label>
                        <input type="email" class="form-control" required>
                    </div>
                    <div class="form-group">
                        <label>Link video</label>
                        <textarea class="form-control" required></textarea>
                    </div>
                    <div class="form-group">
                        <label>Link ảnh</label>
                        <input type="text" class="form-control" required>
                    </div>
                    <div class="form-group">
                        <label>Nội dung mô tả</label>
                        <input type="text" class="form-control" required>
                    </div>
                </div>
                <div class="modal-footer">
                    <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                    <input type="submit" class="btn btn-info" value="Save">
                </div>
            </form>
        </div>
    </div>
</div>
<!-- Delete Modal HTML -->
<div id="deleteEmployeeModal" class="modal fade">
    <div class="modal-dialog">
        <div class="modal-content">
            <form>
                <div class="modal-header">
                    <h4 class="modal-title">Xóa Video</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                </div>
                <div class="modal-body">
                    <p>Bạn chắc chắc xóa hết những video bạn vừa chọn?</p>
                    <p class="text-warning"><small>Lưu ý rằng hành động này sẽ không thể phục hồi.</small></p>
                </div>
                <div class="modal-footer">
                    <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                    <input type="submit" class="btn btn-danger" value="Delete">
                </div>
            </form>
        </div>
    </div>
</div>
</body>

</html>
