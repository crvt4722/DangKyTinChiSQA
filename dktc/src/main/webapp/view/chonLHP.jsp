<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta
      name="viewport"
      content="width=device-width, initial-scale=1, shrink-to-fit=no"
    />
    <title>Chọn lớp học phần</title>
    <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
     <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
      crossorigin="anonymous"
    />
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
      crossorigin="anonymous"
    ></script>
  </head>
  <body>
    <!-- nav -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
      <div class="container">
        <a class="navbar-brand" href="/dktc/home">Trang chủ</a>
        <button
          class="navbar-toggler"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#navbarSupportedContent"
          aria-controls="navbarSupportedContent"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
            <li class="nav-item"><a class="nav-link" href="/dktc/home">Trang chủ</a></li>
            <li class="nav-item">
              <a class="nav-link" href="/dktc/nganh-kihoc">Đăng ký tín chỉ</a>
            </li>
            <li class="nav-item">
              <a class="collapse navbar-collapse" id="navbarNavDarkDropdown">
                <ul class="navbar-nav">
                  <li class="nav-item dropdown text-light">
                    <a
                      class="nav-link dropdown-toggle"
                      href="#"
                      id="navbarDarkDropdownMenuLink"
                      role="button"
                      data-bs-toggle="dropdown"
                      aria-expanded="false"
                    >
                      Tài khoản
                    </a>
                    <ul
                      class="dropdown-menu dropdown-menu-dark"
                      aria-labelledby="navbarDarkDropdownMenuLink"
                    >
                      <li><a class="dropdown-item" href="/sqa/logout">Đăng xuất</a></li>
                    </ul>
                  </li>
                </ul>
              </a>
            </li>
          </ul>
        </div>
      </div>
    </nav>

    <!-- main -->
    <div class="container-fluid">
      <div class="m-2">
        <div>
          <h1 class="display-4">Đăng ký tín chỉ</h1>
          <hr class="my-4" />
          <h2 class="text-center">Chọn lớp học phần</h2>
          <div>
            <div>
              <div class="row mb-3">
                <h4 class="col-lg-3 col-sm-12">Tên môn học</h4>
                <h4 class="col-lg-9 col-sm-12">${requestScope.tenMH}</h4>
              </div>
              <table class="table table-bordered border-secondary">
                <thead>
                  <tr class="text-center align-middle">
                    <th scope="col">TT</th>
                    <th scope="col">Mã lớp</th>
                    <th scope="col">Tên lớp học phần</th>
                    <th scope="col">Sĩ số tối đa</th>
                    <th scope="col">Số lượng thực tế</th>
                    <th scope="col">Xem lịch</th>
                    <th scope="col">Chọn</th>
                  </tr>
                </thead>
                <tbody>
                  <c:set var="count" value="1" />
                  <c:forEach items="${sessionScope.listLHP}" var="i">

			<tr>
        <td style="text-align: center; padding: 0 15px 0 15px;">${count}</td>
				<td style="text-align: center; padding: 0 15px 0 15px;">${i.id}</td>
				<td style="text-align: center; padding: 0 15px 0 15px;">${i.ten}</td>
				<td style="text-align: center; padding: 0 15px 0 15px;">${i.sisotoida}</td>
				<td style="text-align: center; padding: 0 15px 0 15px;">${i.sisothucte}</td>
				<td style="text-align: center; padding: 0 15px 0 15px;">
					<a href = "/dktc/xemtkb?idLHP=${i.id}&tenLHP=${i.ten}" >Xem lịch</a>
				</td>
				<c:choose>
			    <c:when test="${i.sisotoida > i.sisothucte}">
			        <td style="text-align: center; padding: 0 15px 0 15px;">
				<a href="/dktc/themdangki?idLHP=${i.id}">Chọn</a></td>
			    </c:when>
			    <c:otherwise>
			        <td style="text-align: center; padding: 0 15px 0 15px;">
				<a href="/dktc/themdangki?idLHP=${i.id}" style=" color: #ccc;pointer-events: none;">Chọn</a></td>
			    </c:otherwise>
				</c:choose>
        <c:set var="count" value="${count + 1}" />
			</tr>

		</c:forEach>
                </tbody>
              </table>
              <div>
                <div class="d-flex justify-content-evenly">
                  <a href="javascript:history.back()" class="btn btn-secondary">Quay lại</a>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </body>
</html>
