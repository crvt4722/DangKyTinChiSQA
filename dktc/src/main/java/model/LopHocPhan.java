package model;

import java.util.ArrayList;

public class LopHocPhan {
	private int id;
	private String ten;
	private int sisotoida,sisothucte;
	private String moTa;
	private MonHocKiHoc monHocKiHoc;
	private ArrayList<LichHoc> dslh;
	public LopHocPhan(int id, String ten, int sisotoida,int sisothucte, String moTa, MonHocKiHoc monHocKiHoc) {
		super();
		this.id = id;
		this.ten = ten;
		this.sisotoida = sisotoida;
		this.sisothucte =sisothucte;
		this.moTa = moTa;
		this.monHocKiHoc = monHocKiHoc;
	}
	public LopHocPhan() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getSisotoida() {
		return sisotoida;
	}
	public void setSisotoida(int sisotoida) {
		this.sisotoida = sisotoida;
	}
	public int getSisothucte() {
		return sisothucte;
	}
	public void setSisothucte(int sisothucte) {
		this.sisothucte = sisothucte;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public MonHocKiHoc getMonHocKiHoc() {
		return monHocKiHoc;
	}
	public void setMonHocKiHoc(MonHocKiHoc monHocKiHoc) {
		this.monHocKiHoc = monHocKiHoc;
	}
	public ArrayList<LichHoc> getDslh() {
		return dslh;
	}
	public void setDslh(ArrayList<LichHoc> dslh) {
		this.dslh = dslh;
	}
	
	
}
