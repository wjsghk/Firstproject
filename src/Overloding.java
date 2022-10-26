
public class Overloding {
//오버로딩 : 메소드는 정의시 사용하는 방법
	//1. 메소드의 이름을 동일하게 정의한다.
	//2. 단 메개변수의 타입 또는 갯수는 달라야한다. void add(매개변수){}
	//3. 리턴타입과는 무관하다
	//4. 객체의 다형성을 구형한 형식 ex)ol.add();(ol=알파벳 O,L이다)
//	                          ol.add(3);
//	                          ol.add(3L);
//	                          ol.add(2,3);
//	                          ol.add(2,3L);
//	                          ol.add(2L,3);
	
	//같은 이름으로 사용 할 수 없다 
	int x;//변수
	//int x;//중복으로 사용불가능 
	void add() {} //메소드   =>ol.add();
	//void add() {} //중복을 사용 불가능
	void add(int x) {} // 안에 변수가 다를 때 void add 까지 이름은 동일하게 가능함 =>ol.add(3);
	void add(long x) {} //타입이 다를 때 사용가능 long,int...	=>ol.add(3L);
	void add(int x ,int y) {}//개수 다를 떄 사용가능   =>ol.add(2,3);
	void add(int x ,long y) {}//개수랑 타입이 다를 때 사용가능
	void add(long x ,int y) {}
}
