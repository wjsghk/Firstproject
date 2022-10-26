import java.util.Scanner;

public class LoopTest {

	public static void main(String[] args) {
		//반복문 : 실행문을 여러번 동작하게 한다.
		//for문 , while문, do-while문
//		for(초기값;조건식;증감식) {
//			실행문
//		}
//		for(int i=0;i<10;i++) {//0~9까지 작동한다
//			System.out.println(i + ": hellow");
//		}
		
//		for(int i=0;i<10;i+=2) {//0,2,4,8
//			System.out.println(i + "Hellow");
//		}
		
//		for(int i=10;i>0;i--) {//10~1
//			System.out.println(i + ": hellow");
//		}
		
//		for(;true;) {//무한반복문
//			System.out.println("hellow");
//		}
		
//		int k = 1;
//		for(int i=1;1<=10;i++) {
//			System.out.println(k++);
//		}
		
	//1~10사이의 정수값중에 짝수 출력
//		for(int i=1;i<=10;i++) {
//			if(i % 2 == 0 ) {//i를 2로 나누고 나머지가 0이다
//				System.out.println(i);
//			}
//		}
		
		//1 + 2 + 3 +  + 10 =>55
//		int sum = 0;
//		for(int i=1;i<=10;i++) {
//		sum += i;  //sum = sum + i; 이렇게도 사용 할 수 있다.
//	               //	0     0     1
//	               //	3     1     2
//	               //	6     3     3
//                 //.....
//			System.out.println(sum);
//		}
		
//		//1~10까지의 정수 중에 홀수에 합과 짝수에 합을 각각 구해서 출력
//		int odd =  0;
//		int even = 0;
//		for(int i=1;i<=10;i++) {
//			if(i % 2 == 1) {
//				odd += i;//홀수의 합
//			}else {
//				even += i;//짝수의 합
//			}
//		}
//		System.out.println("홀수 : " + odd);
//		System.out.println("짝수 : " + even);
		
		//for문 과 while문 비교해서 봐보기
//		초기값 while(조건식) {
//		실행문
//		증감식
//	}
	
//		int i = 1;
//		while(i <= 10) {
//			System.out.println(i);
//			i++;
//		}
		
//		int i =10;
//		while(i > 0) {
//			System.out.println(i);
//			i--;
//		}
		
//		int sum = 0;
//		int i = 1;
//		while(i <= 10) {
//			sum += i;
//			System.out.println(sum);
//			i++;
//			}
		
//		while(true) {
//			System.out.println("hellow");
//			
//		}
		
//		boolean flag = true;
//		int cnt = 0;
//		while(flag) {
//			cnt++;
//			System.out.println(cnt);
//			if(cnt > 100) {
//				flag = false;}}
		
//	for() { //n=5  n * m =>5*5=>25
//		for() {//m=5
//			실행문
//		}
//	}
	
		//for문 중첩  //실행순서는 초기값,조건값,실행값,증감 순서대로
//		int k = 1;                 
//		for(int i = 0;i<5;i++) {//바깥쪽 for문 한번 돌때 뒤에 for문 5번 반복된다.
//			for(int j = 0;j<5;j++)//(=실행값)처럼 생각하자 {
//				System.out.println(k++);
//			}
//		}
//		i   j
//		0   0
//		0   1
//		0   2
//		0   3
//		0   4
		
//		1   0
//		1   1
//		1   2
//		1   3
//		1   4
//		
//		4   0
//		4   1
//		4   2
//		4   3
//		4   4
		
		//구구단 for문으로 작성법1
//		for(int i =2; i<=9;i++) {
//			for(int j = 1;j<=9;j++) {
//				System.out.println(i + "x" + j + "=" + i*j);
//			}
//			System.out.println("===");
//		}
		//구구단 작성법2
//		for(int i =1; i<=9;i++) {
//			for(int j = 2;j<=9;j++) {
//				System.out.print(j + "x" + i + "=" + j*i + " ");
//			}
//			System.out.println();
//		}
		
		//while문의 중첩구조 
//		초기값
//		while(조건식) {
//			while(조건식) (=실행문,증감식2이랑 똑같은말 ) {
//		}   
//			증감식1
//		int k = 1;
//		int i = 0;
//		while(i<5) {
//			int j=0;
//			while(j<5) {
//		System.out.println(k++);
//				j++;
//		}
//			i++;
//		}
		
//		//구구단 while문으로 작성법
//		int i = 2;
//		while(i<=9) {
//			int j=1;
//			while(j<=9) {
//			System.out.println(i + "x" + j + "=" + i*j);
//			j++;
//		}
//			i++;
//		}

//		//for문 다른방식의 중첩방법
//		for(int i = 0,j =10; i <10; i++,j--) {
//			System.out.println("i :" + i + "," + "j :" + j);
//		}
		
//		int s = 0;
//		int i;
//		for(i=0;i<10;i++,s++) {
//			System.out.println("i :" + i + "," + "s :" + s);
//		}
//		System.out.println(i);
		
		//do while문
//		초기값
//		do {
//			실행문
//			증감식
//		}while(조건식);
		
//		int i =1;
//		do {
//			System.out.println(i);
//			i++;
//		}while( i<=10);
		
//		//1+(1+2)+(1+2+3)+(1+2+3+4)...+(1+2+3+...10)의 결과를 출력
//		int sum =0;
//		int tot =0;
//		for(int i=1;i<=10;i++) {
//			sum += i;
//			tot += sum;
//		}
//		System.out.println(sum);
//		System.out.println(tot);
		
		//반복문의제어 
		//break, continue
		//조건문안에서 사용한다.
//		for(int i=1;i<=10;i++) {
//			if(i >5) {break;//반복문의 종료가 된다.
//			}
//			System.out.println(i);
//		}
		
//		int k=1;
//		for(int i=0;i<=10;i++) {
//			System.out.println("i = " + i);
//			for(int j=0;j<=10;j++) {
//				System.out.println("k = " + k++);
//				if( k % 3 ==0) {
//					break;
//				}
//				
//			}
//		}
////		i j k
////		0 0 1
////		0 1 2 
////		0 2 3
////		1 0 3 
////		...
		
//	for(int i=1;i<=10;i++) {
//		if(i % 2 == 1) {
//			continue;    // 홀수 일때 continue 시행되면서 홀수는 안나오고 다시 반복문 진행되면서 짝수가 나올때 짝수값이 출력된다
//		}
//		System.out.println(i);	
//	}
		
		//12345->1+2+3+4+5->15
		//12345 % 10->5
		//12345 / 10->1234
		//1234  % 10->4
		//1234  / 10->123...
		//num >0
//		Scanner sc =new Scanner(System.in);
//		System.out.println("정수를 입력하세요");
//		int num = sc.nextInt();
//		int sum = 0;   //while의 초기값
//		while(num>0) {
//			sum += num % 10;      ////sum = sum +(num%10)   cf:sum+=i; => sum=sum+i
//			num = num / 10;
//		}
//		System.out.println(sum);
		
		//방정식 2x + 4y =10의 모든 해를 구하시오.단,x와y는 정수이고 각각의 범위는
		//0<=x<=10, 0<=y<=10이다.
		//[실행결과]
		//x= 1,y= 2
		//x= 3,y= 1
		//x= 5,y= 0  for문 중첩사용하면서 해결하기
//		for(int x =0;x <=10;x++) {
//			for(int y =0;y <=10;y++) {
//				if(2*x + 4*y ==10) {
//				System.out.println(x + "," + y);
//			}
//			
//		}
//		}
		
		//1+(-2)+3+(-4)+...과 같은 식으로 계속 더 해 나갔을때, 몇까지 더해야 총합이
		//100이상이 되는지 출력하세요
//		int sum = 0;
//		int s = 1;
//		int num = 0;
//		int i;
//		for( i =1;true;i++,s=-s) {//true 무제한 반복으로 가고 s는 -s라는 증감을 나타냄
//			num = s * i;
//			sum += num;    //(sum=sum+num;)
//			if(sum >= 100) {
//				break;
//			}
//		}
//		System.out.println(sum +","+i);
		
//		Scanner sc = new Scanner(System.in);
//		int sel;
//		while(true) {
//			System.out.println("번호를 선택하세요");
//			System.out.println("1.빨간색 2.녹색 3.파란색 4.종료");
//			sel =sc.nextInt();
//			if(sel == 1) {
//				System.out.println("빨간색 선택");
//			}else if(sel ==2) {
//				System.out.println("녹색 선택");
//			}else if(sel ==3) {
//				System.out.println("파란색 선택");
//			}else if(sel ==4) {
//				break;
//			}
//		}
		
//		//난수(랜덤)  =무제한 랜덤 숫자라고 생각하자
//		//Math.random()  //0.0 <= r <1.0 -> 0.0 ~ 0.999999
		//System.out.println(Math.random());
		////Math.random() * 10 // 0.0 ~ 9.99999...
		////(int)(Math.random() * 10) //0~9
		////(int)(Math.random() * 10) +1 //1~10
//		System.out.println((int)(Math.random() * 10)+1 );
		
		//(int)(Math.random() //* 난수의개수(난수의 최대값~난수의 최소값 +1)) +난수의 최소값
//		System.out.println((int)(Math.random() * 3)+1);

		//가위바위보 게임1 
//		int com;
//		int me;
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			com = (int)(Math.random() * 3)+1;
//			System.out.println("1.가위 2.바위 3.보 :");
//			me = sc.nextInt();
//			System.out.println("com = " + com +", me = " + me);
//		}
		
		//가위바위보게임 2   1번이기면 끝나기                
		//내가 win                            
		//내가 lose                           
 		//둘이 same   
		//           com  me           
	    // 1 가위          1    1  ->0
		// 2 바위          1    2  ->-1   me win
 	 	// 3 보            1    3  ->-2   com win
//		int com;
//		int me;
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			com = (int)(Math.random() * 3)+1;
//			System.out.println("1.가위 2.바위 3.보 :");
//			me = sc.nextInt();
//			//System.out.println("com = " + com +" me = " + me);	
//			int result = com -me;
//					if( result == -1 || result ==2) {
//						System.out.println("you win");
//						break;
//					}else if(result == 0) {
//						System.out.println("tie");
//					}else {
//						System.out.println("you lose");
//					}
//		}
		
//		//가위바위보 3 3번이길때 끝내기
//		Scanner sc = new Scanner(System.in);
//		int com;
//		int me;
//		int correctCnt = 0;
//		while(true) {
//			com = (int)(Math.random() * 3)+1;
//			System.out.println("1.가위 2.바위 3.보 :");
//			me = sc.nextInt();	
//			int result = com -me;
//					if( result == -1 || result ==2) {
//						System.out.println("you win");
//						correctCnt++;
//						System.out.println("이긴횟수 : " + correctCnt +"회"); //이긴횟수 숫자 카운트 
//						if(correctCnt ==3) {                                //이긴횟수 3번이기면 종료됨
//							break;
//						}
//					}else if(result == 0) {
//						System.out.println("tie");
//					}else {
//						System.out.println("you lose");
//						}
//	}
		
		//가위바위보4 3번안에 승리 없으면 종료
//		int com;
//		int me;
//		int correctCnt = 0; //1번 승리하면 종료된다는 변수 표시한 거
//		Scanner sc = new Scanner(System.in);
//		int end = 0;  //3번안에 승리 없으면 종료된다는 변수 표시한 거
//		while(true) {
//			end++;
//			if(end == 4) {                //3번안에 승리 없으면 종료
//				System.out.println("3번의 도전기회를 다 사용하셨습니다.");
//				break;
//				}
//				com = (int)(Math.random() * 3)+1;
//			System.out.println("1.가위 2.바위 3.보 :");
//			me = sc.nextInt();
//			int result = com -me;
//					if( result == -1 || result ==2) {
//						System.out.println("you win");
//						correctCnt++;
//						System.out.println("이긴횟수 : " + correctCnt +"회"); //이긴횟수 숫자 카운트 
//						if(correctCnt ==1) {                               //이긴횟수가 1번 하면 종료됨
//							break;
//						}
//					}else if(result == 0) {
//						System.out.println("tie");
//					}else {
//						System.out.println("you lose");
//						}
//	}
		
		
		
		
		
		
		
		
	}
}
