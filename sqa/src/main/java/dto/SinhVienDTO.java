package dto;

import java.sql.Date;

public class SinhVienDTO {
    private String masv;
    private String username;
    private String password;
    private String hodem;
    private String ten;
    private Date ngaysinh;
    private String email;
    private String dt;
    private String ghichu;
    private String vaitro;
    private String soNha;
    private String toaNha;
    private String xomPho;
    private String phuongXa;
    private String quanHuyen;
    private String tinhThanh;

    public SinhVienDTO() {}

    public SinhVienDTO(String masv, String username, String password, String hodem, String ten, Date ngaysinh,
                       String email, String dt, String ghichu, String vaitro, String soNha, String toaNha,
                       String xomPho, String phuongXa, String quanHuyen, String tinhThanh) {
        this.masv = masv;
        this.username = username;
        this.password = password;
        this.hodem = hodem;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.email = email;
        this.dt = dt;
        this.ghichu = ghichu;
        this.vaitro = vaitro;
        this.soNha = soNha;
        this.toaNha = toaNha;
        this.xomPho = xomPho;
        this.phuongXa = phuongXa;
        this.quanHuyen = quanHuyen;
        this.tinhThanh = tinhThanh;
    }

    // Các phương thức getter/setter
    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
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

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public String getToaNha() {
        return toaNha;
    }

    public void setToaNha(String toaNha) {
        this.toaNha = toaNha;
    }

    public String getXomPho() {
        return xomPho;
    }

    public void setXomPho(String xomPho) {
        this.xomPho = xomPho;
    }

    public String getPhuongXa() {
        return phuongXa;
    }

    public void setPhuongXa(String phuongXa) {
        this.phuongXa = phuongXa;
    }

    public String getQuanHuyen() {
        return quanHuyen;
    }

    public void setQuanHuyen(String quanHuyen) {
        this.quanHuyen = quanHuyen;
    }

    public String getTinhThanh() {
        return tinhThanh;
    }

    public void setTinhThanh(String tinhThanh) {
        this.tinhThanh = tinhThanh;
    }

	@Override
	public String toString() {
		return "SinhVienDTO [masv=" + masv + ", username=" + username + ", password=" + password + ", hodem=" + hodem
				+ ", ten=" + ten + ", ngaysinh=" + ngaysinh + ", email=" + email + ", dt=" + dt + ", ghichu=" + ghichu
				+ ", vaitro=" + vaitro + ", soNha=" + soNha + ", toaNha=" + toaNha + ", xomPho=" + xomPho
				+ ", phuongXa=" + phuongXa + ", quanHuyen=" + quanHuyen + ", tinhThanh=" + tinhThanh + "]";
	}
}
