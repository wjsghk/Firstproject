import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		//배열 :동일한 타입의 변수를 여러개 정의 하는것
//	int a,b,c,d,e;
//	a = 10;
//	b = 20;
//	c = 30;
//	d = 40;
//	e = 50;
	
	//정수!! 배열 1번째 방식
//	int[] arr; //배열의 선언
//	arr = new int[5]; //배열의 생성
	//배열 2번째 방식
//	int arr[] =new int[5];
	//3번째 방식
//	int arr [] = {10,20,30,40,50};
//    
//	arr[0] = 10;
//	arr[1] = 20;
//	arr[2] = 30;
//	arr[3] = 40;
//	arr[4] = 50;
//	System.out.println(arr[0]);
//	System.out.println(arr[1]);
//	System.out.println(arr[2]);
//	System.out.println(arr[3]);
//	System.out.println(arr[4]);
	
		//문자!! 배열방식
	//char ci [] = new char[4];
//	char ci [] = {'G','o','o','d'};
//	ci[0] = 'G';
//	ci[1] = 'o';
//	ci[2] = 'o';
//	ci[3] = 'd';
//	System.out.println(ci[0]);
		
//		//문자열!! 배열방식
//		String [] str = {"java", "jsp","DB"};
//		
//		System.out.println(str[1]);
//		str[2] = "html";
//		System.out.println(str[2]);
		
//		int x = 10;
//		int y;
//		y = x;   //y는 x;의 값과 동일하게 된다.
		
//		int[]arr1 = {1,2,3,4,5};
//		int[]arr2;
//		arr2= arr1; // arr2가 배열변수고 주소값이다.
//		System.out.println(arr1[1]);
//		System.out.println(arr2[1]);
//		arr2[3] = 10; //[ ] {1,2,3,4,}에서의 3번쨰 오는 주소값인 3을 말한다
//		System.out.println(arr1[3]);
//		System.out.println(arr2[3]);
	
	    //배열의 활용
		//순사처리
		//반복문
//		int[]arr =new int[5]; //쓰기작업
//		for(int i=0;i < arr.length;i++) {//arr.ienth(= new int [5]여서 i<5와 같은 의미다)
//			arr[i] = 1;  //인덱스 0번에 1를 넣어주세요 라는 뜻...4번에 1를 넣어주세요
//	
//		}
//		for(int i=0;i < arr.length;i++)//읽기작업
//			System.out.println(arr[1]);
		
//		int[] arr = new int[10];
//		for(int i=0;i<arr.length;i++) {//i = 0,1,2,3,4,5,6,7,8,9
//			arr[i] = i + 1;
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}  //=>1,2,3,4,5,6,7,8,9,10
//		int sum  = 0; //합 구해보기 
//		for(int i=0;i<arr.length;i++) {
//			sum += arr[i];		
//		}
//		System.out.println(sum); //=>55
//		//짝수의 합과 홀수의 합 구하기
//		int odd = 0;
//		int even = 0;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i] % 2 ==1){
//			odd += arr[i];
//		}else {
//			even += arr[i];
//		}
//		}
//		System.out.println("홀수 : " + odd);
//		System.out.println("짝수 : " + even);
		
		//항상된(=each)(=간편하고 단순해진) for문 형태
//		for(변수 : 배열변수명) {
//			실행문
//		}
//		int[] arr = {1,2,3,4,5};
//		for(int i : arr) {
//			System.out.println(i);
//		}
//		int sum = 0;
//		for(int i : arr) {
//			sum +=i;
//		}
//		System.out.println(sum); //=>15가 나온다
		
		//문자열 형식의 배열,항상된(=each)(=간편하고 단순해진)for문의 형태
//		String[] str = {"사과","딸기","포도"};
//		for(String s : str) {
//			System.out.println(s);
//		}
		
		//난수 1~100사이값 중에 10개를 배열 값으로 초기화한다
		//배열의 값을 출력한다
//		int[] arr = new int[10];
//		for(int i =0;i<arr.length;i++) {
//			int ran = (int)(Math.random() * 100)+1;
//			arr[i] = ran;
//		}
//		for(int i =0;i<arr.length;i++) {
//			System.out.println(arr[i]);	
//		}
//		
//		System.out.println("======");
//		int max = arr[0];    //결과 나온것 중에 가장 큰 값을 구하시오
//		int min = arr[0];  //결과 나온것 중에 가장 작은 값을 구하시오
//		for(int i = 0;i < arr.length;i++) {
//			if(max < arr[i] ) {
//				max = arr[i];
//			}
//				if(min > arr[i]) {
//					min = arr[i];
//				}
//			}
//		System.out.println("max = " + max);
//		System.out.println("min = " + min);
	
		//난수를 사용하여 0~9 값으로 초기화 한다. 
		//실행결과
//	    0 -2개(난수여서 랜덤으로 된다)
//	    1- 0개(난수여서 랜덤으로 된다)
//	    .
//	    .
//		9-3개(난수여서 랜덤으로 된다)
//	    int[] arr= new int[10];
//	    for(int i =0;i<arr.length;i++) {
//	    	int ran = (int)(Math.random() * 10);
//	    	arr[i] = ran;//ran을 위에 (int)(Math.random() * 10);대입 하면 ex)arr[0] => 0~9까지 랜덤으로 들어온다
//	    }
//	    for(int i =0;i<arr.length;i++) {
//	    	System.out.print(arr[i] + ",");
//	    }
//	    int []cntArr = new int[10];  //(=int n0=0,n1=0,n2=0,n3=0,n4=0,n5=0,n6=0,n7=0,n8=0,n9=0;)이거랑 같은 의미다
//	    
//	    for(int i =0;i<arr.length;i++) {
//	    			cntArr[arr[i]]++;//cntArr[0]++; 이라고 생각하자
//	    		}
//	  System.out.println();
//	  for(int i =0;i<cntArr.length;i++) { //cnt 카운트 센다 라고 생각하자
//	    System.out.println(i + "-" + cntArr[i]+"개");
//	    }
	 
//		실행결과
//		60점은 7등입니다.
//		70점은 6등입니다.
//		80점은 4등입니다.
//		90점은 2등입니다.
//		75점은 5등입니다.
//		.
//		.
//		30점은 10등입니다.
//		int[] score = {60,70,80,90,75,85,95,50,45,30};
//		int[]rank = {1,1,1,1,1,1,1,1,1,1};//   1로 초기화한다(=배열한다)
//		for(int i = 0; i< score.length;i++) {
//			for(int j = 0;j<score.length;j++) {
//				if(score[i] <score[j]){
//					rank[i]++;
//				}
//			}
//		}
//		for(int i = 0;i<score.length;i++) {
//			System.out.println(score[i] + "점은" + rank[i] + "동 입니다.");
//		}
//		scroe[0] <score[0]  // 60 <60  rank[0]->1   rank[0]은 위에 int[]rank = {1,1,1,1,1,1,1,1,1,1};의 첫번째를 말하는거다
//		scroe[0] <score[1]  // 60 <70 rank[0]->2
//		scroe[0] <score[2]  //...rank[0]->3
//		scroe[0] <score[3]  //...rank[0]->4
//		scroe[0] <score[4]  rank[0]->5
//		scroe[0] <score[5]  rank[0]->6
//		scroe[0] <score[6]  rank[0]->7등
//		scroe[0] <score[7]  rank[0]->7  //60보다 점수가 낮아져서 7등 등수가 된다
//		scroe[0] <score[8]  rank[0]->7   //60보다 점수가 낮아져서 7등 등수가 된다
//		scroe[0] <score[9]  //60<90 rank[0]->7  //60보다 점수가 낮아져서 7등 등수가 된다  =>rank = {7,1,1,1,1,1,1,1,1,1}
//		
//		scroe[1] <score[0]  rank[1]->0   rank[1]은 위에 int[]rank = {1,1,1,1,1,1,1,1,1,1};의 2번째 1를 말하는거다 ,70점을 60점과 비교해서 작으니까 안바뀐다
//		scroe[1] <score[1]  rank[1]->1   
//		scroe[1] <score[2]  rank[1]->2
//		scroe[1] <score[3]  rank[1]->3
//		scroe[1] <score[4]  rank[1]->4
//		scroe[1] <score[5]  rank[1]->5
//		scroe[1] <score[6]  rank[1]->6
//		scroe[1] <score[7]  rank[1]->6
//		scroe[1] <score[8]  rank[1]->6
//		scroe[1] <score[9]  rank[1]->6 60보다 점수가 낮아져서 7등 등수가 된다  =>rank = {7,1,1,1,1,1,1,1,1,1}
		
		
		//정렬 : 오름 (1,2,3,4,5) 내림(5,4,3,2,1)
//		int[]arr = {2,4,1,5,3};
//		//오름차순 나타내기
//	    for(int i = 0;i<arr.length;i++) {
//	    	for(int j=i + 1;j<arr.length;j++) {
//	    		if(arr[i] > arr[j]) {//내림차순으로 바꾸꿀려면 '>' 를 '<' 로 바꿔주면된다
//	    			int tmp;
//	    			tmp = arr[i];
//	    			arr[i] = arr[j];
//	    			arr[j] = tmp;
//	    		}
//	    	}
//	    }
//	    for(int i = 0;i<arr.length;i++) {
//	    	System.out.print(arr[i] + ",");
//	    }
//	    
	    
//		for(int i =0;i<arr.length * 5;i++) {
//		int x = (int)(Math.random() * 5);
//		int y = (int)(Math.random() * 5);
//		int tmp;
//		tmp = arr[x];                           //temp->x
//		arr[x] =arr[y];                   
//		arr[y]=tmp;                     //x->y                 //y->tmp
//		}
//		
//		for(int i =0;i<arr.length;i++) {
//			System.out.println(arr[i] + ",");
//		}
		
//		int tmp;
//		tmp = arr[1];
//		arr[1] = arr[3];
//		arr[3] =tmp;
		
//		int x = 10;
//		int y = 20;
//		int tmp = 0;
		
//		tmp = x;
//		x = y;
//		y = tmp;
		
		//실행결과 메달 많이 딴 순서 
		//김연아 메달 10개 1등
		//홍길동 메달   3개 2등
		//손흥민 메달   2개 3등
		
//		String[] name = {"홍길동","손흥민","김연아"};
//		int[] medal = {3,2,10};  //10,3,2를 내림차순으로
//		for(int i = 0;i<medal.length;i++) {
//	    	for(int j=i + 1;j<medal.length;j++) {
//	    		if(medal[i] < medal[j]) {//내림차순으로 바꾸꿀려면 <를 >로 바꿔주면된다
//	    			int tmp;
//	    			tmp = medal[i];
//	    			medal[i] = medal[j];
//	    			medal[j] = tmp;
//	    			String nTmp;
//	    			nTmp = name[i];
//	    			name[i] = name[j];
//	    			name[j] = nTmp;
//	    		}
//	    	}
//	    }
//	    for(int i = 0;i<medal.length;i++) {
//	    	System.out.println(name[i] + " 메달" + medal[i] +"개 "+ (i+1) + "등");
//	    }
	
//		배열-1차원
//		   -다차원(2차원) 정방형,비정방형                  tip 3차원까지는 거의 이용안한다.
//		int[][] score = new int[5][3];      //2차원열 예시
//		score = new int[행][열];  //*행 -세로 ,열 -가로
//		score = new int[5][3];
//		score[0][0]=1;
//		score[0][1]=2;
//		score[0][2]=3;
//		score[1][0]=4;
//		score[1][1]=5;
//		score[1][2]=6;
//		score[4][2]=15;
//		System.out.println(score[0][0]);
//		System.out.println(score[0][1]);
//		System.out.println(score[0][2]);
//		System.out.println(score[4][2]);
		
		//다차원 배열 다른방식
//		int[][] score= {
//				{1,2,3},
//				{4,5,6},
//				{7,8,9},
//				{10,11,12},
//				{13,14,15},
//		};
//		for(int i =0;i<5;i++) {//행이 5개
//			for(int j =0;j<3;j++) {//열이 3개
//				System.out.print(score[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		
//------------------------------------6일차 진도
		
		//int[][]score=new int[5][3]
//		int[][] score= {
//				{1,2,3},
//				{4,5,6},
//				{7,8,9},
//				{10,11,12},
//				{13,14,15},
//		};
//		for(int i =0;i<score.length;i++) {//행이 5개
//			for(int j =0;j<score[i].length;j++) {//열이 3개
//				System.out.print(score[i][j] + " ");
//			}
//			System.out.println();
//		}
//		//다른방법 each for문
//		for(int[] i :score) {//다차원 배열 형식의 each(=향상된) for문 형식, []=> n번째 행 부분을 나타냄,
//			for(int j : i) {//2번째 행렬이라 나온거  n번째 행과열을 나타냄
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
		
		//1~10까지를 나타내라
//		int num = 1;
//    	int[][] arr = new int[2][5];   //2행 5열이다
//		for(int i=0;i<arr.length;i++) {//행 을 나타낸다 0,1
//			for(int j=0;j<arr[i].length;j++){//열 을 나타낸다 0,1,2,3,4
//				arr[i][j] = (i*5)+ j + 1; //=>1,2,3,4,5  //i는 0,1이니까 0대입하고 j를 0~4까지 대입하면된다
//				                         //=>6,7,8,9,10   i는 0,1이니까 1대입하고 j를 0~4까지 대입하면된다 
//			}
//		}
//		for(int[] i : arr) {
//			for(int j : i) {
//				System.out.print(j + " ");
//			}
//		}
//		System.out.println();
		
//		int[][]arr = new int[5][3];
//		for(int i=0;i<arr.length;i++) {  //행(세로)을 나타냄
//			for(int j=0;j<arr[i].length;j++) {//[i]는 열(가로)를 나타냄
//				arr[i][j] = (i * 3) + j + 1;
//			}
//		}
//		for(int[] i : arr) {
//			for(int j : i) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
		
//		*               //0,0			                             
//		**              //1,0 1,1
//		***   ==>       //2,0 2,1 2,3
//		****            //3,0 3,1 3,2 3,3
//		*****           //4,0 4,1 4,2 4,3 4,4
//		char[][] star = new char[5][5];
//		for(int i=0;i<star.length;i++) {  //i가 행 j가 열
//			for(int j=0;j<star[i].length;j++) {   
//				if( i >=j) {
//					star[i][j] = '*';
//				}
//			}
//		}
//			for(char[]i : star){
//				for(char j : i) {
//					System.out.print(j + " ");
//				}
//				System.out.println();
//		}

////			*****   0,0 0,1 0,2 0,3 0,4  
////			****    1,0 1,1 1,2 1,3
////			***     2,0 2,1 2,2
////			**      3,0 3,1 
////			*       4,0
			
//			char[][] star = new char[5][5];
//			for(int i=0;i<star.length;i++) {
//				for(int j=0;j<star[i].length;j++) {   
//					if( i +j<=4) {
//						star[i][j] = '*';
//					}
//				}
//			}
//				for(char[]i : star){
//					for(char j : i) {//2차원 행렬이라 더 추가적으로 나온거다 
//						System.out.print(j + " ");
//					}
//					System.out.println();
//			}

		
//		    *
//		   **
//		  ***
//		 ****
//		*****
//		char[][] star = new char[5][5];
//		for(int i=0;i<star.length;i++) {
//			for(int j=0;j<star[i].length;j++) {   
//				if( i + j>=4) {// i가 0일때 j는 4 ..i가4일때 j는0,1,2,3,4가 된다
//					star[i][j] = '*';
//				}
//			}
//		}
//			for(char[]i : star){
//				for(char j : i) {//2차원 행렬이라 더 추가적으로 나온거다 
//					System.out.print(j + " ");
//				}
//				System.out.println();
//		}
			
//			   *
//			  ***
//			 *****
//			*******
//		   *********
//		Scanner sc = new Scanner(System.in);
//		System.out.println("행의 크기를 입력하세요");
//		int row = sc .nextInt(); 
//		int col = row * 2 -1;   //row은 행이고 col은 열에 포함되는 *개수
//		
//			char[][] star = new char[row][col];
//			for(int i=0;i<star.length;i++) {
//				int starCnt = 2 *i +1;   //1,3,5,7,9
//				int starStart = star.length -(i+1);    //4,3,2,1
//				for(int j=starStart;j<starStart + starCnt;j++) { 
//						star[i][j] = '*';
//					}
//				}
//				for(char[]i : star){
//					for(char j : i) {//2차원 행렬이라 더 추가적으로 나온거다 
//						System.out.print(j + " ");
//					}
//					System.out.println();
//			}
		
		
		// 이 부분은 읽어보기만 너무 어려운파트(449줄~494줄)
//		char[][]star = {
//				{'*','*',' ',' ',' '},
//				{'*','*',' ',' ',' '},
//				{'*','*','*','*','*'},
//				{'*','*','*','*','*'},
//				};
//		for(int i =0;i<star.length;i++) {
//			for(int j=0;j<star[i].length;j++){
//				System.out.print(star[i][j]);
//			}
//			System.out.println();
//		}
		
////		****
////		****
////		**
////		**
////		**
//		char[][]result = new char[star[0].length][star.length];//5,4
//		for(int i =0;i<star.length;i++) {
//			for(int j=0;j<star[i].length;j++){
//				int x=j;
//				int y=3 - i;
//				result[x][y] = star[i][j];
//			}
//		}
//		System.out.println();
//		System.out.println();
//		for(char[]i : result) {
//			for(char j : i) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		
//		실행결과
//				번호 국어  영어   수학  총점     평균
//				1   10  10  30  30   10.0
//				2   20  20  20  60   20.0
//				3   30  30  30  90   30.0
//				4   40  40  40  120  40.0
//				5   50  50  50  150  50.0
//			     합계    150 150 150 450				
//		int[][]score = {
//			{10,10,10,},
//			{20,20,20,},
//			{30,30,30,},
//			{40,40,40,},
//			{50,50,50,}	
//		};
//		
//		System.out.println("번호 국어  영어  수학  총점  평균");
//		int sum;//총점
//		int korTot = 0;
// 		int engTot = 0;
//		int mathTot= 0;
//		for(int i=0;i<score.length;i++) {
//			korTot += score[i][0];   //국어 합계
//			engTot += score[i][1];   //영어 합계
//			mathTot += score[i][2];  //수학 합계
//			sum = 0;   //총점 나타내려고
//			System.out.print(" " +( i + 1) + " ");//우선순위 문제로 ()소괄호 이용한다   ,   " "는 띄어쓰기용 
//			for(int j =0;j<score[i].length;j++) {
//				sum += score[i][j];//총점 
//				System.out.print(" " + score[i][j] + " ");
//			}
//			System.out.print(" " + sum);
//			double avg = sum / (double)score[i].length; //  평균값 나타내는 방법 ,  double 쓴 이유는 평균은 실수로 써서 
//		    System.out.print("  " + avg);
//			System.out.println();
//		}
//		int totScore = korTot + engTot + mathTot;// 합계,총점을 나타내는거
//		System.out.println("합계"+"  " + korTot+" " + engTot +" " + mathTot+ "  "+ totScore);

		
		// 다차원배열의 총복습
		//25개의 값을 구성할수있는 2차원배열 생성
//		int[][]bingo = new int[5][5]; 
//		//배열에 1~50까지의 난수를 초기화한다.
//		for(int i =0; i<bingo.length;i++){
//			for(int j =0; j<bingo[i].length;j++){
//				bingo[i][j] = (int)(Math.random()*50)+1;
//			}
//		}
//		for(int i =0; i<bingo.length;i++){
//			for(int j =0; j<bingo[i].length;j++){
//			System.out.print(bingo[i][j]+" ");
//			}
//			System.out.println();
//		}
//================================================================================================ 7일차
		
		
		//값을 입력하고 배열의 같은 값이 있으면 0으로 변경한다.
//		Scanner sc = new Scanner(System.in);
//		boolean flage = true;
//		int num;
//		int sum =0;////while 초기문
//		while(flage) {
//			System.out.println("숫자입력:");
//			num = sc.nextInt();
//			sum = 0;
//			for(int i =0; i<bingo.length;i++){
//				for(int j =0; j<bingo[i].length;j++){
//					if(bingo[i][j] == num) {
//						bingo[i][j] = 0;
//					}
//					sum += bingo[i][j];
//				System.out.print(bingo[i][j]+" ");
//		}
//			System.out.println();
//	}
//		//배열의 모든값이 0으로 변경되면 전체반복문 종료
//		System.out.println("sum = " + sum);
//		if(sum ==0) {//sum이 0이 됐다
//		flage= false;   //false 일 때 반복문 종료시킨다고 생각
//		}
//	}
//		System.out.println("Game Over");
		
	
		
		
		
		
		
	
		
	}
}

	