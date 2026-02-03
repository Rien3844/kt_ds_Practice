package homework.list_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Practice_1 {

	public static void printFlightReservInfo(Map<String, List<FlightReservInfo>> flightList) {
		String inputFlightNum = "";

		Scanner sc = new Scanner(System.in);

		System.out.println("비행기 편의 이름을 입력하면, 좌석 현황을 볼 수 있습니다.");
		while (true) {// 1.반복-비행기 확인
			System.out.println("비행기 편의 이름을 입력하세요 : ");
			inputFlightNum = sc.nextLine();

			List<FlightReservInfo> flightNum = flightList.get(inputFlightNum);
			if (flightNum == null) {
				System.out.println("\"" + inputFlightNum + "\"" + "편은 존재하지 않습니다.");
				continue; // 다음 입력으로 넘어감
			}
			if (!flightNum.get(0).isReserv() && !flightNum.get(1).isReserv() && !flightNum.get(2).isReserv()
					&& !flightNum.get(3).isReserv() && !flightNum.get(4).isReserv() && !flightNum.get(5).isReserv()
					&& !flightNum.get(6).isReserv() && !flightNum.get(7).isReserv() && !flightNum.get(8).isReserv()) {
				System.out.println("예약 가능한 좌석이 없습니다. 다른 비행기 편을 이용해 주세요.");
			} else {
				if (!flightNum.isEmpty()) {
					System.out.println("\"" + inputFlightNum + "\"" + "편의 좌석 현황입니다. (O: 예약 가능, X: 예약 불가능)");

					for (int i = 0; i < flightNum.size(); i++) {
						String status;
						if (flightNum.get(i).isReserv()) {
							status = "O";
						} else {
							status = "X";
						}
						System.out.print(i + 1 + " : " + status + ", ");
					}
					while (true) {// 2.반복-좌석 예약
						System.out.println("좌석 예약을 하려면 번호를 입력하세요 : ");
						int getSeatNum = sc.nextInt();
						sc.nextLine(); // 버퍼에 남은 개행문자 제거

						FlightReservInfo selectSeat = flightNum.get(getSeatNum - 1);
						if (selectSeat.isReserv()) {
							System.out.println("\"" + getSeatNum + "\"" + "번 좌석을 예약하시겠습니까? (y/n) : ");
							String confirm = sc.next();
							if (confirm.equalsIgnoreCase("y")) {
								selectSeat.setReserv(false);
								System.out.println("\"" + getSeatNum + "\"" + "번 좌석이 예약되었습니다.");
							} else if (confirm.equalsIgnoreCase("n")) {
								System.out.println("예약이 취소되었습니다.");
							} else {
								System.out.println("옳바른 값을 입력해주세요.");
							}
							System.out.println("\"" + inputFlightNum + "\"" + "편의 좌석 현황입니다. (O: 예약 가능, X: 예약 불가능)");

							for (int i = 0; i < flightNum.size(); i++) {
								String status;
								if (flightNum.get(i).isReserv()) {
									status = "O";
								} else {
									status = "X";
								}
								System.out.print(i + 1 + " : " + status + ", ");
							}
						} else {
							System.out.println("\"" + getSeatNum + "\"" + "번 좌석은 이미 예약된 좌석입니다. 다른 좌석을 입력하세요 : ");
						}
					}
				}
			}
		}

	}

	public static void main(String[] args) {

		Map<String, List<FlightReservInfo>> flightList = new HashMap<>();

		flightList.put("0002", new ArrayList<>());
		flightList.put("0003", new ArrayList<>());
		flightList.put("0004", new ArrayList<>());

		List<FlightReservInfo> reserv0002 = flightList.get("0002");
		reserv0002.add(new FlightReservInfo(1, true));
		reserv0002.add(new FlightReservInfo(2, true));
		reserv0002.add(new FlightReservInfo(3, true));
		reserv0002.add(new FlightReservInfo(4, true));
		reserv0002.add(new FlightReservInfo(5, false));
		reserv0002.add(new FlightReservInfo(6, true));
		reserv0002.add(new FlightReservInfo(7, true));
		reserv0002.add(new FlightReservInfo(8, true));
		reserv0002.add(new FlightReservInfo(9, true));
		// 1: O, 2: O, 3: O, 4: O, 5: X, 6: O, 7: O, 8: O, 9: O
		List<FlightReservInfo> reserv0003 = flightList.get("0003");
		reserv0003.add(new FlightReservInfo(1, false));
		reserv0003.add(new FlightReservInfo(2, false));
		reserv0003.add(new FlightReservInfo(3, false));
		reserv0003.add(new FlightReservInfo(4, false));
		reserv0003.add(new FlightReservInfo(5, false));
		reserv0003.add(new FlightReservInfo(6, false));
		reserv0003.add(new FlightReservInfo(7, false));
		reserv0003.add(new FlightReservInfo(8, false));
		reserv0003.add(new FlightReservInfo(9, false));
		// 1: X, 2: X, 3: X, 4: X, 5: X, 6: X, 7: X, 8: X, 9: X
		List<FlightReservInfo> reserv0004 = flightList.get("0004");
		reserv0004.add(new FlightReservInfo(1, true));
		reserv0004.add(new FlightReservInfo(2, false));
		reserv0004.add(new FlightReservInfo(3, true));
		reserv0004.add(new FlightReservInfo(4, true));
		reserv0004.add(new FlightReservInfo(5, false));
		reserv0004.add(new FlightReservInfo(6, true));
		reserv0004.add(new FlightReservInfo(7, true));
		reserv0004.add(new FlightReservInfo(8, false));
		reserv0004.add(new FlightReservInfo(9, false));
		// 1: O, 2: X, 3: O, 4: O, 5: X, 6: O, 7: O, 8: X, 9: X

		// List
		printFlightReservInfo(flightList);
	}
}
//1. 비행기편 이름 입력(0001)(1번 반복문) 
//비행기 편의 이름을 입력하면, 좌석 현황을 볼 수 있습니다.
//
//비행기 편의 이름을 입력하세요:  0001
//
// 
//1-1. 없을경우
//"0001" 편은 존재하지 않습니다.
//
//다른 비행기 편의 이름을 입력하세요: 0002
//
// 
//1-2. 있을경우
//"0002" 편의 좌석 현황입니다. (O: 예약 가능, X: 예약 불가능)
//
//1: O, 2: O, 3: O, 4: O, 5: X, 6: O, 7: O, 8: O, 9: O
//
// 
//2. 좌석 예약(2번 반복문)
//좌석 예약을 하려면 번호를 입력하세요: 5
//2-1. 좌석이 예약된 경우
//"5"번 좌석은 이미 예약된 좌석입니다. 다른 좌석을 입력하세요: 3
//2-2. 좌석이 비어있을경우
//"3"번 좌석을 예약하시겠습니까? (y/N): y
//
//"3"번 좌석이 예약되었습니다.
//
// 
//2-3. 이후 예약한 좌석이 X -> O로 바뀌고 예약현황 띄워줌. 이후 다시 1.으로 반복
//"0002" 편의 좌석 현황입니다. (O: 예약 가능, X: 예약 불가능)
//
//1: O, 2: O, 3: X, 4: O, 5: X, 6: O, 7: O, 8: O, 9: O
//
// 
//
//비행기 편의 이름을 입력하면, 좌석 현황을 볼 수 있습니다.
//
//비행기 편의 이름을 입력하세요:  0003
//
//"0003" 편의 좌석 현황입니다. (O: 예약 가능, X: 예약 불가능)
//
//1: X, 2: X, 3: X, 4: X, 5: X, 6: X, 7: X, 8: X, 9: X
//
// 
//
//예약 가능한 좌석이 없습니다. 다른 비행기 편을 이용해 주세요.
//
//비행기 편의 이름을 입력하면, 좌석 현황을 볼 수 있습니다.
//
//비행기 편의 이름을 입력하세요:  0004
//
//.... 무한반복