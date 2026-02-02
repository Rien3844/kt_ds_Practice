package homework.list_map;

public class FlightReservInfo {
	private int seatNum;
	private boolean isReserv;
	
	public FlightReservInfo(int seatNum, boolean isReserv) {
		this.seatNum = seatNum;
		this.isReserv = isReserv;
	}

	public int getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}

	public boolean isReserv() {
		return isReserv;
	}

	public void setReserv(boolean isReserv) {
		this.isReserv = isReserv;
	}

	@Override
	public String toString() {
		return "FlightReservInfo [seatNum=" + seatNum + ", isReserv=" + isReserv + "]";
	}
	
	
}
