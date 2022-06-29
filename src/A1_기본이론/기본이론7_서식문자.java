package A1_기본이론;

/*
 * # 출력문의 종류 -> 번외 : 서식문자가 먼저 사용. 그이후 ln 출력등장
 * 1. System.out.println();
 * 1) ln = new line
 * 2) 줄바꿈 가능
 * -----------------------------------
 * 2. System.out.print();
 * 1) 줄바꿈 불가
 * -----------------------------------
 * 3. System.out.printf("", ); (f:format)
 * 1) 서식문자 출력
 * 2) 종류
 * . %d : 정수
 * . %f : 실수
 * . %c : 문자 1개
 * . %s : 문자 여러개
 */
public class 기본이론7_서식문자 {
	public static void main(String[] args) {
		
		System.out.println("-------------------------------");
		System.out.printf("%d", 10);
		System.out.println();	
		System.out.println("-------------------------------");
		System.out.printf("%f", 3.14);// 소수점 개수는 기본6자리 	
		System.out.println();
		System.out.printf("%.2f", 3.14); // 소수점 개수를 제어할수있다. 
		System.out.println();
		System.out.printf("%.20f", 3.14); // 소수점 개수를 제어할수있다. 
		System.out.println();
		System.out.println("-------------------------------");
		System.out.printf("%c", 'b');
		System.out.println();
		System.out.println("-------------------------------");
		System.out.printf("%s", "출력문의이해");
		System.out.println();
		System.out.println("-------------------------------");		
		String fruit = "사과";
		int cnt = 5;
		System.out.printf("%s가 %d개 있습니다.", fruit, cnt);
		System.out.println();
		System.out.println("-------------------------------");

	}
}