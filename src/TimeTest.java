//Time 클래스와 연결됨  =>Time 클래스 안에 속해있다 생각하기
public class TimeTest {

	public static void main(String[] args) {
		
		//Time t1,t2,t3;//time 선언
		Time[]time = new Time[3];//[3]= 3배열생성하라~     () 객체 생성한 TvTest랑 비교
		for(int i=0;i<time.length;i++) {//Time t1,t2,t3;//time 선언을 반복문 형태로 바꾼거
			time[i]=new Time();//for문에 실행문
		}
		//time[0] = new Time(); //time 생성,  time[0]의 hour,minute ,second가 배열된다
		time[0].hour = 10;
		time[0].minute= 29;
		time[0].second= 33;
		
		//time[1] = new Time();
		time[1].hour = 3;
		time[1].minute = 45;
		time[1].second = 11;
		
		//time[2] = new Time();
		time[2].hour = 5;
		time[2].minute = 15;
		time[2].second = 53;
		
		for(Time t : time) {//each for 문  =>for(변수 : 배열레퍼런스){반복작업문} 책p135  
			System.out.println(t.hour + "시 " + t.minute + "분 " + t.second + "초 ");
		}
		System.out.println(time[0].hour + "시 " + time[0].minute + "분 " + time[0].second + "초 ");
		System.out.println(time[1].hour + "시 " + time[1].minute + "분 " + time[1].second + "초 ");
		System.out.println(time[2].hour + "시 " + time[2].minute + "분 " + time[2].second + "초 ");
	}

}
