
public class DataTest {

	public static void main(String[] args) {
		Data d = new Data(); // 복습할때 주석 처리하지말고 고정해두기 //객체 생성함,매개변수 
		
//		d.x =10;////세번째 코딩
//		Data d2 = copy(d);//호출 코드 => 첫번째 코딩 부분이 반복된다라고 생각하기
//		System.out.println(d.x);//10
//		System.out.println(d2.x);//10	
//	 }
//	static Data copy(Data d) {		
//		Data tmp = new Data();// 또 다른 객체를 생성함
//		tmp.x = d.x;	
//		return tmp;
	}
}
		
//		d.x = 10;//// 첫번째 코딩
//		System.out.println(d.x);//10
//		
//		change(d.x);//d.x를 10이라고 써도 무방하다, change를 쓰면 호출(다음코드에 대입이라고 생각하자)이 되어 그래서 int x가 10 하지만 -밑에줄 연결-
//		                                    // x가 1000이여서  결과값이 1000이 먼저오고 다시 change의 d.x로 돌아와서 10이되고  -밑에줄 연결-
//		System.out.println(d.x);}            //System.out.println(d.x);에 대입 되면서 마지막으로 10이 산출된다
	
		//두번째 코딩
//	    d.x = 10;
//	    System.out.println(d.x);//10
//	    change(d);
//	    System.out.println(d.x);//1000
//	}	
	
	
	////첫번째 코딩
//	static void change(int x) {
//		x= 1000;
//		System.out.println("change() : " + x);}}

		
	
	//두번째 코딩
//		static void change(Data d) {//매개변수(=Data d = new Data();) Data d는 주소값을 받는다
//			d.x = 1000;
//			System.out.println("chagnge():"+ d.x);//change():1000
//	}
//}
