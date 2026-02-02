package homework.list_map;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindFlight {

	public void findFlight() {

		String inputflight;
		Scanner sc = new Scanner(System.in);
		System.out.println("비행기 편의 이름을 입력하면, 좌석 현황을 볼 수 있습니다.");
		System.out.println("비행기 편의 이름을 입력하세요. : ");
		inputflight = sc.nextLine();
		System.out.println("입력된 비행기 편 : " + inputflight);
		if (inputflight.equals("0001")) {
			System.out.println("\"" + inputflight + "\"" + " 편은 존재하지 않습니다.");
		}
	}

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("0002");
		names.add("0003");
		names.add("0004");
		names.add("0005");
	}
}
