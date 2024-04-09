<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
     <title>Login</title>
     <style><%@include file="/css/styles.css"%></style> 
	</head>
  <body>
  <div class="container d-flex justify-content-center align-items-center" style="height: 100vh;">
    <div class="card" style="width: 400px;">
      <div class="card-body">
        <h3 class="card-title text-center mb-4">Login</h3>
        <form method="post">
          <div class="mb-3">
            <label for="username" class="form-label">Username</label>
            <input type="text" class="form-control" id="username" placeholder="Enter username" name="username" >
          </div>
          <div class="mb-3">
            <label for="password" class="form-label">Password</label>
            <input type="password" class="form-control" id="password" placeholder="Enter password" name="password">
          </div>
          <button type="submit" class="btn btn-primary">Login</button>
        </form>
      </div>
    </div>
  </div>
</body>
</html>