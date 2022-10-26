//p146 메소드부분 ,클래스와 객체부분(4단원)
public class Func {
	//메소드=함수라고도 불린다 : 객체의 기능을 구현한다.
//	리턴타입 메소드명([매개변수1..]) { []대괄호는 필요가 없을 때 생략 가능하다
//	         실행문
//	     [return 값]
//	}
	//리턴타입  : void,기본자료형 ,참조형을 이용한다
	//메소드명  : 낙타표기법
	//매개변수  : 예시) int x(기본형) , double d(기본형), TV t(참조형)
	//return : 리턴타입이 void가 아닌 경우에 반드시 사용한다. 기본자료형,참조형에 return을 같이 써준다.
	
	void add() {//메소드의 선언부(=시그니쳐)
		System.out.println(2+3);//메소드의 구현부(=실제 메소드가 하는 일)
	}
	void add2(int x, int y) {//Func 클래스에 있는 f.add2(10,20); 이거여서 x=10,y=20이된다
		System.out.println(x+y);
	
	}
	int add3(int x,int y) {
		int sum = x+y;
		return sum;//메소드 객체여서 return을 이용한다 생각하자
	}
	
	//sub()//빼기
	//mul()//곱하기
	//div()//나누기
	int sub(int x,int y) {//int x ,int y는  미지수
		int sub =x-y;
		return sub;
	}
	int mul(int x,int y) {
		int sum2 =x*y;
		return sum2;
	}
	double div(double x,double y) {//실수를 나타내고 싶을때double를 쓴다는걸 예시로 보여줌
		double div =x/y;
		return div;
	}
	
	//test클래스에 f.test(10,20);
//	             f.test(20,10);  해제해주기
	void test(int x, int y) {
		if(x<y) {
			System.out.println("함수의 종료");
			return;//함수의 즉시 종료를 나타낸다  cf:break는 반복문에 즉시종료
		}
		int result = x +y;
		System.out.println(result);
	}
	
	
	
	int test2(int x, int y) {
		int result;
		if(x > y) {
			result =  x;			
		}else { //if , return 이 같이 쓸 때는 2가지를 파악해야 돼서 else가 나온다
			result =  y;//else 때문에 y가 20
		}return result;
	}
		
		void call1() {
			System.out.println("Call1");
			call2();
		}
		void call2() {
			System.out.println("Call2");
			call3();
		}
		void call3() {
			System.out.println("Call3");
		
		
		}
		
		
		
	}

