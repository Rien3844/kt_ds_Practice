package oop;

public class CarTest {
	
	public static void main(String[] args) {
		
		Car kona = new Car();
		System.out.println(kona);
		
		kona.pressEngineStartButton();
		kona.pressGasolinPedal(20);
		// kona의 엔진 상태를 출력한다.
		boolean konaEngineState = kona.isEngineStart;
		System.out.println("Kona Engine : " + konaEngineState);
		
		// kona의 현재 속도를 출력한다.
		int konaSpeed = kona.speed;
		System.out.println("Kona Speed : " + konaSpeed);
		
		System.out.println();
		
		Car carnival = new Car();
		System.out.println(carnival);
		
		carnival.pressEngineStartButton();
		carnival.pressGasolinPedal(200);
		carnival.pressBrakePedal(10);
		
		// carnival의 엔진 상태를 출력한다.
		boolean carnivalEngineState = carnival.isEngineStart;
		System.out.println("Carnival Engine : " + carnivalEngineState);
		
		// carnival의 현재 속도를 출력한다.
		int carnivalSpeed = carnival.speed;
		System.out.println("Carnival Speed : " + carnivalSpeed);

		
	}
}
