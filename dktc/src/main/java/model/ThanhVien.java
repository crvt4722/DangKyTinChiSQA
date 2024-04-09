package model;

import java.util.Date;

public class ThanhVien {
	private int id;
	private String username,password,hodem,ten;
	private Date ngaysinh;
	private String email,dt,ghichu,vaitro;
	private DiaChi diachi;
	public ThanhVien() {
		
	}
	public ThanhVien(String username, String password, String hodem, String ten, Date ngaysinh, String email, String dt,
			String ghichu, String vaitro, DiaChi diachi) {
		super();
		this.username = username;
		this.password = password;
		this.hodem = hodem;
		this.ten = ten;
		this.ngaysinh = ngaysinh;
		this.email = email;
		this.dt = dt;
		this.ghichu = ghichu;
		this.vaitro = vaitro;
		this.diachi = diachi;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getHodem() {
		return hodem;
	}
	public void setHodem(String hodem) {
		this.hodem = hodem;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public Date getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDt() {
		return dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}
	public String getGhichu() {
		return ghichu;
	}
	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}
	public String getVaitro() {
		return vaitro;
	}
	public void setVaitro(String vaitro) {
		this.vaitro = vaitro;
	}
	public DiaChi getDiachi() {
		return diachi;
	}
	public void setDiachi(DiaChi diachi) {
		this.diachi = diachi;
	}
	
	
}
