package model;

public class GiangVien extends NhanVien {
	private BoMon boMon;
	
	public GiangVien() {
		super();
	}

	public GiangVien(String viTri) {
		super(viTri);
		// TODO Auto-generated constructor stub
	}

	public GiangVien(String viTri, BoMon boMon) {
		super(viTri);
		this.boMon = boMon;
	}

	public BoMon getBoMon() {
		return boMon;
	}

	public void setBoMon(BoMon boMon) {
		this.boMon = boMon;
	}


	
	
	
}
