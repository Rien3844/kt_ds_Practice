package com.ktdsuniversity.edu.fp.basic.stream.advanced;

import java.util.List;
import java.util.Optional;

public class CityTest {

	public static void main(String[] args) {
		List<City> cities = City.loadCityData();
		cities.forEach(System.out::println);
		
//		//StateId가 3907인 City의 CountryName을 출력
//		for(City city: cities) {
//			if(city.getStateId() == 3907) {
//				System.out.println(city.getCountryName());
//			}
//		}
		
		System.out.println("-----------------------------------------");

		//stream으로 구현
		cities
			.stream() // Stream<City>
			.filter(city -> city.getStateId() == 3907) // Stream<City>
//			.map(city -> city.getCountryName()) // Stream<String>
			.map(City::getCountryName)
//			.forEach(countryName -> System.out.println(countryName));
			.distinct() // Stream<String>
			.forEach(System.out::println);
		
		System.out.println("-----------------------------------------");
		
		//countryName 이 "South Korea"인 City의 _native를 출력
		cities
		.stream()
		.filter(city -> city.getCountryName().equals("South Korea"))
		.forEach(city -> System.out.println(city.get_native()));
		

		System.out.println("-----------------------------------------");
		
		//countryName 이 "South Korea"이면서 City의 _native의 길이가 3이상인 City의 _native를 출력

		cities
		.stream()
		.filter(city -> city.getCountryName().equals("South Korea"))
		.filter(city -> city.get_native().length() >= 3)
		.forEach(city -> System.out.println(city.get_native()));
		
		System.out.println("-----------------------------------------");
		
		cities
		.stream()
		.filter(city -> city.getCountryName().equals("South Korea"))
		.filter(city -> city.get_native().length() >= 3)
		.skip(3) // 앞의 3개 넘어감
		.limit(3) // 3개만 가져옴
		.forEach(city -> System.out.println(city.get_native()));

		System.out.println("-----------------------------------------");
		
		// _native의 값이 한글로만 이루어진 값 중에서 _native의 길이가 4글자 이상인 것의 name을 중복없이 조회한다.
		cities
		.stream()
		.filter(city -> city.get_native().matches("^[가-힣]{4,}$"))// 한글로만 이루어진(^[가-힣]$) 4글자 이상({4,})
		// 정규 표현식 - ^ : 시작한다 [가-힣] : 한글 {4,} : 4글자 이상 $ :끝난다
//		.filter(city -> city.get_native().length() >= 4)
		.map(City::getName) // name을 조회
		.distinct() // 중복없이
		.map(String::length) // name의 길이 // Stream<Integer>
		.filter(length -> length >= 10) // 10 이상인
		.distinct() // 중복없이
		.forEach(System.out::println);

		System.out.println("-----------------------------------------");

		// ex) 한글로만 이루어져 있는가?
		String name = "김선우";
		System.out.println(name + "은 한글로만 이루어져 있는가?" + name.matches("^[가-힣]+$"));

		System.out.println("-----------------------------------------");
		
		// 애월읍의 StateName을 출력한다.
		Optional<City> found = cities.stream() // Stream<City>
									.filter(city -> city.getName().equals("Gaigeturi")) // Stream<City>
									.findFirst(); // Optional<City>
		
		System.out.println(found.orElse(null).getStateName());
		
		System.out.println("-----------------------------------------");
		
		// Optional에 없는값 넣기.
		Optional<City> found2 = cities.stream() // Stream<City>
				.filter(city -> city.getName().equals("d213sa1")) // Stream<City>
				.findFirst(); // Optional<City>
		
		System.out.println(found2.orElse(null));
//		System.out.println(found2.orElse(null).getStateName()); // null.getStateName()이므로 에러발생.

		// 에러가 나오지 않게 하려면?
		// Case 1
//		City city = found2.orElse(null);
//		if(city != null) {
//			System.out.println(city.getStateName());
//		}
		
		// Case 2
//		if(found2.isPresent()) { // 결과가 Optional.empty가 아니라면
//			System.out.println(found2.get().getStateName());
//		} // 메모리 적게사용은 
		
		// Case 3
		City city = found2.orElse(new City(""));
		System.out.println(city.getStateName());
		
		cities.stream()
				.peek(_city -> System.out.println(_city.getCountryCode()))
				.filter(_city -> true)
				.map(_city -> _city.get_native());
		
		System.out.println("~~~~~~~~");
		
	}
}
