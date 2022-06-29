package A4_몫과나머지_알고리즘;

public class 몫과나머지_알고리즘_시간분초_문제 {
	public static void main(String[] args) {	
		/*
		 *  [문제] 
		 *  	123123초 는 몇시간 몇분 몇초인가 ?	
		 *  1시간 = 60분 = 60*60초 = 3600초	, 1분 = 60초
		 *  1분 : 60초 = x분 : 123123초	
		 *  123123/60 = x분
		 *  123123%60 = 3초
		 *  1시간 : 60분 = x시간 : 2052분 
		 *  2052/60 = 34 시간
		 *  2052/60 의 나머지가 분
		 *  시간 = 3600초 
		 *  분
		 *  123123/3600*3600 => 몫이 계산
		 *  곱하기 나누기 시 무조건 앞부터 순서대로 계산
		 */
		 System.out.println(123123/3600);
		 System.out.println((123123%3600)/60);
		 System.out.println((123123%3600)%60);
		 System.out.println();
		 System.out.println(123123/60);
		 System.out.println(123123%60);
		 System.out.println((123123/60)/60);
		 System.out.println((123123/60)%60);
		 System.out.println();
		 System.out.println(123123/3600 + "시간");
		 System.out.println((123123 - (123123/3600*3600)) / 60 + "분"); 
		 System.out.println((123123 % 3600) / 60 + "분");
		 System.out.println(123123 % 60 + "초");
		 System.out.println((123 - (123/360*360)) / 60);
		 System.out.println();
		 System.out.println((123123 - (123123/3600*3600)));
		 System.out.println((123123/3600*3600));
			
			
		
     }
}