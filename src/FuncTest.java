
public class FuncTest {

	public static void main(String[] args) {
		Func f = new Func();//객체여서 주석 처리 안하고 고정해놓기
		
//		f.add(); ////함수의 호출  =>System.out.println(2+3);를 실행한다는 뜻 cf:DataTest 부분 참고
//		f.add2(10,20);
//		f.add2(100,200);//위에 객체가 같고 숫자만 달라서 재사용을 한다고 한다.
//		System.out.println(f.add3(5,8));
//		int sum = f.add3(15, 20);//sum은 35가 된다.
//		System.out.println(sum);
//		//sub()//빼기
//		int sub = f.sub(5, 3);
//		System.out.println(sub); 
//		//mul()//곱하기
//		int sum2 = f.mul(5, 3);
//		System.out.println(sum2);
//		 //div()//나누기
//		double div = f.div(5, 3);
//		System.out.println(div);
		
//		f.test(10,20);
//		f.test(20,10);
		
		int result = f.test2(10, 20);
		System.out.println(result);
		int result2 = f.test2(20, 10);
		System.out.println(result2);
		
		f.call1();
		
		
		
		
	}

}
