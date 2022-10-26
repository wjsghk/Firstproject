
public class MemberInit {

	//멤버변수
	//자동초기화 ->명시초기화->초기활출력->생성자에 의한 초기화
	int x;
	int y;
	static int cv = 100;
	static int count;
	{//인스턴스 초기화 블럭(객체가 생성될때마다 호출)
		System.out.println("인스턴스 초기화 블럭");
		x=10;
		y=20;
	}
	static {//static(=클래스) 초기화블럭(객체생성시 딱 한번만 호출)
		System.out.println("static 초기화 블럭");
		count = 1000;
	}
	
	MemberInit(int x,int y){
		System.out.println("생성자의 호출");
		this.x = x;
		this.y = y;
		
	}
}
