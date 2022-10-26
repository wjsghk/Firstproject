import java.util.Scanner;

public class Oper {

	public static void main(String[] args) {
		//산술연산자 
		//+,-,*,/(나누기),%(나머지)
		
//		int x = 5;
//		int y = 2;
//				
//				System.out.println(x/y);  //2
//				System.out.println(x%y);  //1
		
		//int x = 5;
		
		//상수= 변하지 않는 수 vs 변수 = 변하는 수 
		
		//final double PI = 3.14;  =>상수
		//PI = 2.34;    //PI 파이는 3.14 고정된 상수 여서 오류가 난거 
		//System.out.println(PI);
		
		//형변환(자료형 or 데이터타입)
		//int -> double
		//boolean은 형변환이 안된다     
		
		//byte(1바이트) < short(2바이트) < int(4바이트) < long(8바이트) < float(4바이트)< double(8바이트)
		//          char(2바이트)      <                     <-정수      실수->
		//작은 쪽에서 큰 쪽으로 변환을 자동형변환----------------> 
		//큰쪽에서 작은쪽으로 변환을 강제형변환<----------------------
		
		//자동병현환 예시)byte b = 85;
		//            int i =b;

		//강제형 변환 예시 int i = 85;
		//            byte b =(byte)i;
		
//		int i = 300;
//		byte b = (byte)i;
//		System.out.print(b); //강제형변환시 값의 손실이 있다 그래서 300이 44로 결과가 나온다.
		
//		double d = 3.14;
//		int i = (int)d;
//		System.out.println(i); // 정수만 넘어간다 그래서 3이 나온다
		
//		int i = 3;
//		double d = i;
//		System.out.println(d);
		
//		byte b = 65;
//		char c = (char)b;  char은 문자열이여서
//		System.out.println(c); //A는 숫자 65여서  a는 87이였나??

//		int x = 10; 
//		int y = 20; 
//		int result = x + y;  //30 나온다
//		
//		byte b1 = 10;
//		byte b2 = 20;
//		byte result = (byte)(b1 + b2);  // byte b = (byte)(int + int)  => 연산과정에서 오류가 나온다

		//연산시 int보다 작은 정수타일은 모두 int형으로 자동형변환된다
//		byte + byte => int + int 
//		byte + short => int + int 
//		char + byte  =>int + int 	
		
//		int + long => long + long   *단위가 큰걸로 통일한다
//		int + float => float + float
//	    float + double => double + double
		
		//int x = 5;
		//int y = 2;
		//double result = x /y;  //2.0이 나온다
		//double result = x % y;    //1.0이 나온다
		//System.out.println(result);
		
//		int x = 3;
//		int y = 5;
//		//double result =(double) x /y; //0.0이 나온다 ,//(double)붙이면 0.6
//		double result = x %y;
//		System.out.println(result);
		
		//String str = "java";
		//double ver = 1.8;
		//String result = str + ver; //"java" + "1.8" => java1.8 이 나온다
		//String + anyType => String
		//String + double => string + string => string
		
		// + 연산자는 산술, 연결, 부호 세가지 기능이 있다
		
		//증감연산자 : 값을 1증가 .1감소 
		//++.--
		//변수에만 사용가능 
		//전치,후치  
//		int x = 10;
//		++x;
//		System.out.println(x); //11이 나온다
//		x++;
//		System.out.println(x); //12나온다
//		--x;
//		System.out.println(x); //11나온다
//		x--;
//		System.out.println(x); //10이 나온다
		
		//int x = 10;
		//int y = 0;
//		y = ++x + 10;
//		System.out.println("x ="+ x + "," + "y =" + y); // x는 11이 ,y는 21이 나온다
		
		//y = x++ + 10;     //x는 11이고 y는 20이 나온다  후치할때는  ++를 나중에 계산한다~~
		//System.out.println("x ="+ x + "," + "y =" + y);// x는 11이 ,y는 20이 나온다
		
		//대입연산자
		//변수에 사용되는 연산자
		// = , +- , -- , *= , /= , <,<= , |= .....
		
//		int x = 10;
//		x += 10; //x = x + 10이랑 같은 내용이다
//		System.out.println(x); //20이 나온다
//		
//		x -=10;   위에가 20이니까 대입해서 10이 나옴
//		System.out.println(x);//10이 나온다
//		
//		x *= 2;
//		System.out.println(x);//20이 나온다
		
		//비교연산자
		// 5 > 3
		// <, >,<=,>=,==,!=    *!는 not의미이다
		//true, false
		
//		int x = 10;
//		int y = 20;
//		System.out.println(x < y); //true가 나온다.
//		System.out.println(x > y); //false가 나온다
		
//		System.out.println(x <= y);//f
//		System.out.println(x >= y);//t
//		System.out.println(x == y);//f
//		System.out.println(x != y);//t
		
		//논리연산자
		//&&(=and) ,||(=or) ,!(=not)
		//두가지 이상의 조건을 확인할떄 사용한다.
		
	 //   int x = 10;
	 //   int y = 20;
		
//		System.out.println(x == 10);
//		System.out.println(y == 20);
		
		//x == 10 && y == 20 //true && true => true
//		System.out.println(x == 10 && y == 20);//true && true => true
//		System.out.println(x == 10 && y == 30); //true&& false => false
//		System.out.println(x == 30 && y == 50);//false && false => false
		
		//true && true => true
	    //true && false => false
		//false && true => false
    	//false && false => false
		
//		 int x = 10;
//	     int y = 20;
//	     int z = 30;
//	     System.out.println(x == 10 || y == 20);//true or true =>true
//	     System.out.println(x == 30 || y == 20);//true or false=>true
//	     System.out.println(x == 30 || y == 50);//false or false=>false
	     
	    //true || true => true
        //true || false => true
    	//false || true => true
	   	//false || false => false
	     
		//!true -> false
		//!false ->true
//		int x = 10;
//		System.out.println(!(x == 10));//false
		
		//ex) 3.45 <= 2 는 double <= int -> double <= double이 돼서 => double가 된다
	
		//조건연산자(삼함연산자)
		//조건식                     ? 결과1 : 결과2 
		//(true or false) ? (true) (false)
//		int x = 10;
//		int y = 20;
//		
//		int result = (x > y ) ? x : y;
//		System.out.println(result);//y가 돼서 20이 나온다
		
//		int age = 20;
//		String rs = (age >= 20) ? "성인 입니다" : "미성년입니다";
//		System.out.println(rs);
		
		
		//연습문제 
		// 456 -> 400, 111-> 100 
//		Scanner sc = new Scanner(System.in);
//		System.out.println("백의 자리숫자를 입력하세요: ");
//		int num = sc.nextInt();	
//		System.out.println("입력받은 값 : " + num);
//		System.out.println("연산되어진 결과 :" + num / 100 * 100); //456/100 =>4 * 100 => 400
		
		// 333 -> 331, 777 -> 771
//		Scanner sc = new Scanner(System.in);
//		System.out.println("백의 자리숫자를 입력하세요: ");
//		int num = sc.nextInt();
//		System.out.println("입력받은 값 : " + num);
//		System.out.println("연산되어진 결과 :" + ( num / 10 * 10  + 1));
		
		//10의배수
		//19->20 , 81->90
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요: ");
//		int num = sc.nextInt();
//		System.out.println("입력받은 값 : " + num);
//		System.out.println("연산되어진 결과 :" + ( num / 10  * 10 + 10));
		
		//19 ->1, 81 ->9 , 24 ->6
//		Scanner sc = new Scanner(System.in);
//		System.out.println("십의 자리숫자를 입력하세요: ");
//		int num = sc.nextInt();
//		System.out.println(10 - num % 10);

		//사과의 개수를 입력받는다.
		//한 바구니에 10개의 사과를 담을수 있다.
		//그럼 몇개의 바구니가 필요할까요
		//123개 -> 13개 , 456 ->46개
		//xx개의 바구니가 필요합니다.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("사과의개수를 입력하세요: ");
//		int num = sc.nextInt();
//		System.out.println("바구니가 몇개 필요할까요 :" + ( num / 10  +1));
		
		//논리연산자
//		int x = 5;
//		System.out.println(x >= 0 && x<= 10); //true
//		System.out.println(x <=0 || x>= 10); //false
		
	}

}
