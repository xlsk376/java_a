package A4_몫과나머지_알고리즘;

public class 몫과나머지_알고리즘_공책_문제 {
	public static void main(String[] args) {	
		 /*
        	[문제]
	        	명수는 친구의 생일 선물로 4000원짜리 필통 1개와 700원짜리 공책 몇권을 사려고 한다. 
	        	명수는 13000원을 가지고있을때 공책은 최대 몇권 까지 구입할수있을까?
	        	
	        	13000 - 4000 = 9000 원 -> 필통을 사고 남은돈 = 9000원
	        	700 x a = 9000 -> 9000/700

		  */
		System.out.println(9000/700);
		System.out.println((13000-4000)/700 + "권");
     }
}