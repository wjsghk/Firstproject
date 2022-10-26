
public class Car1 {
	//속성
	String color;//인스턴스 변수 스태틱을 안썼으니까
	String gearType;//인스턴스 변수 스태틱을 안썼으니까
	int door;//인스턴스 변수 스태틱을 안썼으니까
	
	//생성자  - 멤버변수(인스턴스)를 초기화한다.
	//     -클래스의 이름과 동일하게 작성한다.
	//     -객체를 생성하는 시점에 한번만 호출되어야 한다.
	//     -기본생성자는 생략가능하다(다른생성자가 없을때)
	//     -생성자 오버로딩을 가능하다
	//     -모든 클래스는 생성자를 포함한다
	
	Car1(){//생성자(실행문이 있는거)  vs 기본생성자(실행문이 없는거)
		color = "blue";//매개변수 3개
		gearType = "st";
		door = 3;
		//실행문
	}
	Car1(String c){
		color = c;//매개변수1개
	}
	Car1(String c, String g){
		color = c;//매개변수2개
		gearType = g;
	}
	Car1(String c,String g,int d){
		color = c;
		gearType = g;
		door = d;
		
		//this 부분 Car1 클래스의 간편버전 이라고 생각하기, 주로 많이 이용함
//Car1(String color){
//		this(color,"Auto");//다른생성자의 호출
//	}
//	Car1(String color, String gearType){
//		this(color,gearType,4);
//	}
//	Car1(String color, String gearType,int door){
//		this.color = color;
//		this.gearType = gearType;
//		this.door = door;
	}
}
