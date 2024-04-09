package model;

public class DiaChi {
	private int id;
	private String sonha,toanha,xompho,phuongxa, quanhuyen,tinh;
	public DiaChi() {
		
	}
	public DiaChi(int id, String sonha, String toanha, String xompho, String phuongxa, String quanhuyen, String tinh) {
		this.id = id;
		this.sonha = sonha;
		this.toanha = toanha;
		this.xompho = xompho;
		this.phuongxa = phuongxa;
		this.quanhuyen = quanhuyen;
		this.tinh = tinh;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSonha() {
		return sonha;
	}
	public void setSonha(String sonha) {
		this.sonha = sonha;
	}
	public String getToanha() {
		return toanha;
	}
	public void setToanha(String toanha) {
		this.toanha = toanha;
	}
	public String getXompho() {
		return xompho;
	}
	public void setXompho(String xompho) {
		this.xompho = xompho;
	}
	public String getPhuongxa() {
		return phuongxa;
	}
	public void setPhuongxa(String phuongxa) {
		this.phuongxa = phuongxa;
	}
	public String getQuanhuyen() {
		return quanhuyen;
	}
	public void setQuanhuyen(String quanhuyen) {
		this.quanhuyen = quanhuyen;
	}
	public String getTinh() {
		return tinh;
	}
	public void setTinh(String tinh) {
		this.tinh = tinh;
	}
	
	
	
}
