package homework.list_map;

public class FlightReservInfo {
	private int seatNum;
	private Reserve reserve;
	
	public FlightReservInfo(int seatNum, Reserve reserve) {
		this.seatNum = seatNum;
		this.reserve = reserve;
	}

	public int getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}

	public Reserve getReserve() {
		return reserve;
	}
	
	public void setReserve(Reserve reserve) {
		this.reserve = reserve;
	}

	@Override
	public String toString() {
		return "FlightReservInfo [seatNum=" + seatNum + ", isReserv=" + reserve + "]";
	}
	
	
}
