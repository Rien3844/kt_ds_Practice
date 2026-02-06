package com.ktdsuniversity.edu.fp.basic.stream.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.ktdsuniversity.edu.fp.basic.stream.object.Dish;
import com.ktdsuniversity.edu.fp.basic.stream.object.DishList;
import com.ktdsuniversity.edu.fp.basic.stream.object.DishType;
import com.ktdsuniversity.edu.fp.basic.stream.object.FoodType;

public class StreamBasic {

	public void printDishUseFor() {
		System.out.println("전체 요리 목록 - 칼로리가 500미만인 - for");
		List<Dish> dishList = DishList.makeDishList();

		for (Dish dish : dishList) {
			if (dish.getCalories() < 500) {
				System.out.println(dish);
			}
		}

		System.out.println("------------------------------");
	}

	public void printDishUseStream() {
		System.out.println("전체 요리 목록 - 칼로리가 500 미만인 -  List.forEach");
		List<Dish> dishList = DishList.makeDishList();

//		dishList.forEach(dish -> System.out.println(dish));
//		dishList.forEach(System.out::println); // 둘다 가능

		dishList.forEach(dish -> {
			if (dish.getCalories() < 500) {
				System.out.println(dish);
			}
		});

		System.out.println("------------------------------");
		System.out.println("전체 요리 목록 - Stream");
		// Stream을 사용할 수 있는 대상 - List, Set
		dishList // List<Dish>
				.stream()// Stream<Dish>
				.forEach(dish -> System.out.println(dish));

		System.out.println("------------------------------");
		dishList.stream().peek(dish -> {
					System.out.println("첫번째 filter를 수행하기 이전의 인스턴스 값");
					System.out.println("1. " + dish.getName());
					System.out.println("1. " + dish.getCalories());
					System.out.println("1. " + dish.getFoodType());
					System.out.println("1. " + dish.getDishType());
			   }).filter(dish -> dish.getCalories() < 500).peek(dish -> {
					System.out.println("두번째 filter를 수행하기 이전의 인스턴스 값");
					System.out.println("2. " + dish.getName());
					System.out.println("2. " + dish.getCalories());
					System.out.println("2. " + dish.getFoodType());
					System.out.println("2. " + dish.getDishType());
			   }).filter(dish -> dish.getFoodType() == FoodType.MEAT).peek(dish -> {
					System.out.println("세번째 filter를 수행하기 이전의 인스턴스 값");
					System.out.println("3. " + dish.getName());
					System.out.println("3. " + dish.getCalories());
					System.out.println("3. " + dish.getFoodType());
					System.out.println("3. " + dish.getDishType());
			   }).forEach(dish -> System.out.println(dish));

		System.out.println("------------------------------");
		dishList.stream().filter(dish -> dish.getDishType() == DishType.FISH).peek(dish -> {
			System.out.println("네번째 filter를 수행한 이후의 인스턴스 값");
			System.out.println("4. " + dish.getName());
			System.out.println("4. " + dish.getCalories());
			System.out.println("4. " + dish.getFoodType());
			System.out.println("4. " + dish.getDishType());
		}).forEach(dish -> System.out.println(dish));

	}

	public void printEvenNumbers() {

		List<Integer> numbers = Arrays.asList(1, 23, 12, 3, 4, 324, 2, 512, 36, 31467, 25, 6725, 782, 574, 3, 4523,
				1513, 72, 36, 432, 643, 51, 3461, 346, 2, 2, 2, 2, 2, 2);

		System.out.println("------------------------------");

		// 1. numbers에 있는 값을 전부 2를 곱해서 짝수로 만들어 출력한다.
		numbers.stream()
			   .map(number -> number * 2)
			   .forEach(System.out::println);

		System.out.println("------------------------------");

		// 2. numbers에 있는 값에서 중복된 숫자는 모두 제거하고 나머지 숫자에 전부 2를 곱해서 짝수로 만들어 출력한다.
		numbers.stream() // String<Integer>
			   .distinct()//중복된 값 제거 // Stream<Integer>
			   .map(number -> number * 2) // Stream<Integer>
			   .forEach(System.out::println); // Stream<Integer>
		System.out.println("------------------------------");
	}
	//Collect 실습(joining)
	public String makeString() {
		// 모든 VEGETABLES 음식 메뉴의 이름들을 ","로 연결한 문자열을 반환한다.
		List<Dish> dishList = DishList.makeDishList();
		String dishesName = dishList.stream() // Stream<Dish>
									.filter(dish -> dish.getFoodType() == FoodType.VEGETABLES) // Stream<Dish>
									.map(Dish::getName) // Stream<String>
									.collect(Collectors.joining(", ")); // 안에 뭘 쓰냐에 따라 반환값이 달라짐.
		
		return dishesName;
	}
	//변경 불가능한 toList (add, delete ... 불가)
	public List<Dish> getHealthyDishes(){
		List<Dish> dishes = DishList.makeDishList();
		List<Dish> result = dishes.stream()
								  .filter(dish -> dish.getCalories() < 400)
								  .toList();
		return result;
	}
	
	// 변경 가능한 toList (add, delete ... 가능)
	public List<Dish> getHealthyDishes2(){
		List<Dish> dishes = DishList.makeDishList();
		List<Dish> result = dishes.stream()
								  .filter(dish -> dish.getCalories() < 400)
								  .collect(Collectors.toList());
		return result;
	}

	public static void main(String[] args) {
		StreamBasic basic = new StreamBasic();
		
		basic.printDishUseFor();
		
		basic.printDishUseStream();
		
		basic.printEvenNumbers();
		
		String dishesName = basic.makeString();
		System.out.println(dishesName);
		
		List<Dish> result = basic.getHealthyDishes();
		System.out.println(result);
		result.add(new Dish("곱창", FoodType.MEAT, 3000, DishType.MEAT)); 
		// 수정 불가능한 리스트에 add를 하면 추가가 안되기에 에러 발생.

		List<Dish> result2 = basic.getHealthyDishes2();
		System.out.println(result2);
		result2.add(new Dish("곱창", FoodType.MEAT, 3000, DishType.MEAT));

	}
}
