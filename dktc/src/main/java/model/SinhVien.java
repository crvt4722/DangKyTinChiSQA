package model;

import java.util.Date;

public class SinhVien  extends ThanhVien{
	private String maSV;

	public SinhVien(String maSV) {
		this.maSV = maSV;
	}
	
	public SinhVien() {
	}

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	
}
