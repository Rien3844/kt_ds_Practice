package homework;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 2; i <= 100000; i++) {
			int count = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j ==0) {
					count++;
				}
			}
			
			if(count == 2) {
				System.out.println(i);
			}
		}
	}

}
// 1. 2 ~ 100000까지의 숫자(i)를 반복문으로 나열한다.
// 2. 이중 반복문을 이용해 1 ~ i까지 나머지가 0이 되는 수를 찾고 나머지가 0이되는 숫자값에서 count를 올려준다.
// 3. 소수 = 약수가 1과 자신만 있는수 이므로 count = 2인 수가 소수.
// 4. 해당 숫자를 출력한다.
