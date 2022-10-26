
public class FuncStaticTset {

	public static void main(String[] args) {
		FuncStatic fs = new FuncStatic();
//		fs.iv = 10;
//		//fs.cv = 20;
//		FuncStatic.cv=20;//fs.cv = 20;와 같은 의미 스태틱이라 객체 생성없이 사용할수있다는걸 보여줌
//		
//		fs.instanceMethod();  =iv
//		//fs.staticMethod();   =cv
//		FuncStatic.staticMethod();//fs.staticMethod();와 같은 의미 스태틱이라 객체 생성없이 사용할수있다는걸 보여줌
		
		fs.instanceMethod();//인스터스 메소드
		FuncStatic.staticMethod();// 스태틱메소드랑 객체생성 필요없음
	}


}
