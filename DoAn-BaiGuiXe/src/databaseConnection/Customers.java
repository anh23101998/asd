package databaseConnection;

public class Customers {
	private String MaXe;
	private String sImage1;
	private String sImage2;
	private String sTime;
	private String sDate;

	public Customers() {

	}

	public Customers(String MaXe) {
		this.MaXe = MaXe;
	}

	public Customers(String MaXe, String sImage1, String sImage2, String sTime, String sDate) {

		this.MaXe = MaXe;
		this.sImage1 = sImage1;
		this.sImage2 = sImage2;
		this.sTime = sTime;
		this.sDate = sDate;
	}

	public String getMaXe() {
		return MaXe;
	}

	public void setMaXe(String maXe) {
		MaXe = maXe;
	}

	public String getsImage1() {
		return sImage1;
	}

	public void setsImage1(String sImage1) {
		this.sImage1 = sImage1;
	}

	public String getsImage2() {
		return sImage2;
	}

	public void setsImage2(String sImage2) {
		this.sImage2 = sImage2;
	}

	public String getsTime() {
		return sTime;
	}

	public void setsTime(String sTime) {
		this.sTime = sTime;
	}

	public String getsDate() {
		return sDate;
	}

	public void setsDate(String sDate) {
		this.sDate = sDate;
	}

	@Override
	public String toString() {
		return "Customers [MaXe=" + MaXe + ", sImage1=" + sImage1 + ", sImage2=" + sImage2 + ", sTime=" + sTime
				+ ", sDate=" + sDate + "]";
	}

	
}
