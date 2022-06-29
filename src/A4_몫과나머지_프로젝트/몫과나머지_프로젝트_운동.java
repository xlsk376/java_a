package A4_몫과나머지_프로젝트;

public class 몫과나머지_프로젝트_운동 {
	
	public static void main(String[] args) {
		/*
		 * [문제]
		 	승환이는 일정한 빠르기로 운동장을 5바퀴도는 데 1시간 15분걸렸습니다. 		 
		  	7바퀴를 도는데는 얼마나 걸릴까요? (시간분 으로 표현)
		  	
		    1 : x분 = 5 : 75분
		    75/5 => 1바퀴시 걸리는 분 : 15분
		    
		    7*15 = 105분
		    105/60 = 1
		 */
		System.out.println(75/5);
		System.out.println(7*15);
		System.out.println(105/60);
		System.out.println(105%60);
		System.out.println(105/60 + "시간 " + 105%60 + "분");
	}
	
}