<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<title>Đăng ký môn học</title>
<link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
<style>
<%@include file ="/css/styles.css"%></style>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous" />
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
	crossorigin="anonymous"></script>
</head>
<body>
	<!-- nav -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container">
			<a class="navbar-brand" href="/dktc/home">Trang chủ</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav ms-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link" href="/dktc/home">Trang
							chủ</a></li>
					<li class="nav-item"><a class="nav-link"
						href="/dktc/nganh-kihoc">Đăng ký tín chỉ</a></li>
					<li class="nav-item"><a class="collapse navbar-collapse"
						id="navbarNavDarkDropdown">
							<ul class="navbar-nav">
								<li class="nav-item dropdown text-light"><a
									class="nav-link dropdown-toggle" href="#"
									id="navbarDarkDropdownMenuLink" role="button"
									data-bs-toggle="dropdown" aria-expanded="false">
										Tài khoản </a>
									<ul class="dropdown-menu dropdown-menu-dark"
										aria-labelledby="navbarDarkDropdownMenuLink">
										<li><a class="dropdown-item" href="#">Đăng xuất</a></li>
									</ul></li>
							</ul>
					</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<!-- main -->
	<c:set var="tongTc" value="0" />
	<div class="container-fluid">
		<div class="m-2">
			<div>
				<h1 class="display-4">Đăng ký tín chỉ</h1>
				<hr class="my-4" />
				<h2 class="text-center">Đăng ký học</h2>
				<div>
					<div class="row">
						<h4 class="col-lg-3 col-sm-6">Mã sinh viên </h4>
						<h4 class="col-lg-9 col-sm-6">${sessionScope.infoSVK.sinhVien.maSV}</h4>
					</div>
					<div class="row">
						<h4 class="col-lg-3 col-sm-6">Họ và tên </h4>
						<h4 class="col-lg-9 col-sm-6">${sessionScope.infoSVK.sinhVien.hodem} ${sessionScope.infoSVK.sinhVien.ten}</h4>
					</div>
					<div class="row mb-5">
						<h4 class="col-lg-3 col-sm-6">Ngành học </h4>
						<h4 class="col-lg-9 col-sm-6">${sessionScope.infoSVK.khoa.ten}</h4>
					</div>
					<div class="row mb-3">
						<div class="col-lg-6 col-sm-12">
							<h4>Các lớp đã đăng ký</h4>
						</div>
						<c:forEach items="${sessionScope.listDk}" var="i">

							<c:set var="tongTc"
								value="${tongTc + i.lopHP.monHocKiHoc.monHoc.stc}" />
						</c:forEach>
						<div class="col-lg-6 col-sm-12">
							<h4>Tổng số tín chỉ: ${tongTc}</h4>
							<c:set var="tongTcSession" value="${Integer.parseInt(tongTc)}" scope="session" />

						</div>
						<h4 style="color:red">${requestScope.error}</h4>
					</div>
					<div>
						<table class="table table-bordered border-secondary">
							<thead>
								<tr class="text-center align-middle">
									<th scope="col">TT</th>
									<th scope="col">Mã môn học</th>
									<th scope="col">Tên môn học</th>
									<th scope="col">Số tín chỉ</th>
									<th scope="col">Tên lớp học phần</th>
									<th scope="col">Xem lịch</th>
									
									<th scope="col">Xóa</th>
								</tr>
							</thead>
							<tbody>
								<c:set var="count" value="1" />
								<c:forEach items="${sessionScope.listDk}" var="i">
									<tr>
										<td style="text-align: center; padding: 0 15px 0 15px;">${count}</td>
										<td style="text-align: center; padding: 0 15px 0 15px;">${i.lopHP.monHocKiHoc.monHoc.id}</td>
										<td style="text-align: center; padding: 0 15px 0 15px;">${i.lopHP.monHocKiHoc.monHoc.ten}</td>
										<td style="text-align: center; padding: 0 15px 0 15px;">${i.lopHP.monHocKiHoc.monHoc.stc}</td>
										
										<td style="text-align: center; padding: 0 15px 0 15px;">${i.lopHP.ten}</td>

										<td style="text-align: center;padding: 0 15px 0 15px;"><a href="/dktc/xemtkb?idLHP=${i.lopHP.id}&tenLHP=${i.lopHP.ten}">Click de
												xem</a>
										
										<td style="text-align: center; padding: 0 15px 0 15px;"><a
											href="/dktc/xoadangki?idLHP=${i.lopHP.id}"
											onclick="return confirm('Bạn muốn xóa lớp học phần khỏi danh sách đăngkí?');">Xóa</a></td>
											<c:set var="count" value="${count + 1}" />
									</tr>
								</c:forEach>
							</tbody>
						</table>
						<div>
							<div class="d-flex justify-content-evenly">
								<a href="/dktc/home" class="btn btn-secondary">Về trang chủ</a> <a
									href="/dktc/chon-monhoc" class="btn btn-warning">Tiếp tục</a>
									
								<button class="btn btn-primary"><a href="/dktc/luudangki" style="text-decoration: none; color: white">Lưu đăng kí</a></button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	
</body>
</html>
