
//public class Person {클래스 함수로만은 출력이 안돼고 클래스 메인함수가 포함된 곳에서 출력이 가능하다.
	
	
	//속성 : 눈,코,입,팔,다리....이름,나이,키,몸무게,성격
	//변수(=배열)
	
	//기능(행위)걷기,달리기,말,...자기소개
	//메소드(=함수)

public class Tv {//클래스 안에 있는게 멤버변수  vs 주제 메소드에 있는게 지역변수
	//객체(보여지고 보여지지않은 대상이라고 한다) : 상속,다향성,캡슐화(=정보은닉),
	
	//속성=변수(배열) - 크기,전원버튼,채널,볼륨,색상,인터넷....
	
	//기능(행위)=매소드(함수) - 전원 On/Off, 채널Up/Down ,볼륨Up/Down
	
	//속성,변수(=배열)
	boolean power;//전원버튼  (참 거짓)         false
	int channel;//채널는 정수여서 int 쓴다              0
	int volumn;//볼륨  (정수)                  0
	String color;//색상은 문자열이여서 스트링 쓴다   null
	String model;//모델                                    null
	int year;//제조연도                                         0
	String company;//제조사                              null
	
	void Power() {//전원 On/Off  void=메소드
		power = !power; //!=not
	}
	void channelUp() {//채널Up/Down
		channel++;
	}
    void channelDown() {//채널Up/Down
        channel--;
	}
    void volumnUp() {//볼륨Up/Down
		volumn++;
	}
    void volumnDown() {//볼륨Up/Down
		volumn--;
	}
    void showlnfo() {
    	System.out.println(power);
    	System.out.println(color);
    }
}

