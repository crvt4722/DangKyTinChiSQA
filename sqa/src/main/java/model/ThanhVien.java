package model;

import java.sql.Date;

public class ThanhVien {
	private Integer id;
	private String username;
	private String password;
	private String hodem;
	private String ten;
	private Date ngaysinh;
	private String email;
	private String dt;
	private String ghichu;
	private String vaitro;
	
	private DiaChi diaChi;

	public ThanhVien() {}

	public ThanhVien(Integer id, String username, String password, String hodem, String ten, Date ngaysinh,
			String email, String dt, String ghichu, String vaitro, DiaChi diaChi) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.hodem = hodem;
		this.ten = ten;
		this.ngaysinh = ngaysinh;
		this.email = email;
		this.dt = dt;
		this.ghichu = ghichu;
		this.vaitro = vaitro;
		this.diaChi = diaChi;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public DiaChi getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(DiaChi diaChi) {
		this.diaChi = diaChi;
	}

	@Override
	public String toString() {
		return "ThanhVien [id=" + id + ", username=" + username + ", password=" + password + ", hodem=" + hodem
				+ ", ten=" + ten + ", ngaysinh=" + ngaysinh + ", email=" + email + ", dt=" + dt + ", ghichu=" + ghichu
				+ ", vaitro=" + vaitro + ", diaChi=" + diaChi + "]";
	}
}
