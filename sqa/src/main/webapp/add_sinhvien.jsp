<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Them sinh vien</title>
</head>
<body>
<h1>Thêm Sinh Viên</h1>
    <form action="saveSinhVien" method="POST" object="sinhvien">
        <label for="masv">Mã SV:</label>
        <input type="text" id="masv" name="masv"><br><br>

        <label for="username">Username:</label>
        <input type="text" id="username" name="username"><br><br>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password"><br><br>

        <label for="hodem">Họ đệm:</label>
        <input type="text" id="hodem" name="hodem"><br><br>

        <label for="ten">Tên:</label>
        <input type="text" id="ten" name="ten"><br><br>

        <label for="ngaysinh">Ngày sinh:</label>
        <input type="date" id="ngaysinh" name="ngaysinh"><br><br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email"><br><br>

        <label for="dt">Điện thoại:</label>
        <input type="tel" id="dt" name="dt"><br><br>

        <label for="ghichu">Ghi chú:</label>
        <input type="text" id="ghichu" name="ghichu"><br><br>

        <label for="vaitro">Vai trò:</label>
        <input type="text" id="vaitro" name="vaitro"><br><br>

        <label for="soNha">Số nhà:</label>
        <input type="text" id="soNha" name="soNha"><br><br>

        <label for="toaNha">Tòa nhà:</label>
        <input type="text" id="toaNha" name="toaNha"><br><br>

        <label for="xomPho">Xóm phố:</label>
        <input type="text" id="xomPho" name="xomPho"><br><br>

        <label for="phuongXa">Phường xã:</label>
        <input type="text" id="phuongXa" name="phuongXa"><br><br>

        <label for="quanHuyen">Quận huyện:</label>
        <input type="text" id="quanHuyen" name="quanHuyen"><br><br>

        <label for="tinhThanh">Tỉnh thành:</label>
        <input type="text" id="tinhThanh" name="tinhThanh"><br><br>

        <input type="submit" value="Thêm Sinh Viên">
    </form>
</body>
</html>