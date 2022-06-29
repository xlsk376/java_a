package A1_기본이론;
/*

[출력 종류 ]
1) 줄바꿈 있는출력  : System.out.println("d");
2) 줄바꿈 없는 출력 : System.out.print("a"); 
3) 그냥 줄바꿈  :    System.out.println(); 

*/
public class 기본이론4_출력문종류 {
	public static void main(String[] args) {
		System.out.print("a");
		System.out.print("b");
		System.out.print("c");
		
		System.out.println(); // 아무 내용도 안적으면 줄바꿈이 된다. 
		
		System.out.println("d");
		System.out.println("e");
		System.out.println("f");
		
		System.out.println(); 
		System.out.println("안녕하세요.");
		System.out.println("----------------------");
		System.out.print("abc");
		System.out.println("def.");
		System.out.println("----------------------");
	}
}