
public class Card {
	//속성
	//멤버변수(자동초기화 된다) 1) 인스턴스는 변수 -int age , 
	//                   2) 클래스(=스태틱)변수 -static int size  특징  1.필요에 따라서 선언(n;)과 동시에 초기화한다.
	//                                                           2.생성(new)없이 사용가능하다
	//                                                           3.공유되어 진다.
	int iv;
	static int cv = 100;
	void channel() {
		int x; //지역변수(강제초기화한다)지역변수는 메소드에 위치함
	}
	
	//속성 : 숫자, 모양, 크기(높이 넓이),...
	int number; //인스턴스 변수
	String kind;//인스턴스 변수
	static int height = 100; //클래스 변수  높이와 넓이는 다 동일하기 때문에 스태틱으로 쓴다
	static int width =80;    //클래스 변수  높이와 넓이는 다 동일하기 때문에 스태틱으로 쓴다
	
	
	
	
	
	
}
