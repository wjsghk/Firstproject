import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		//�迭 :������ Ÿ���� ������ ������ ���� �ϴ°�
//	int a,b,c,d,e;
//	a = 10;
//	b = 20;
//	c = 30;
//	d = 40;
//	e = 50;
	
	//����!! �迭 1��° ���
//	int[] arr; //�迭�� ����
//	arr = new int[5]; //�迭�� ����
	//�迭 2��° ���
//	int arr[] =new int[5];
	//3��° ���
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
	
		//����!! �迭���
	//char ci [] = new char[4];
//	char ci [] = {'G','o','o','d'};
//	ci[0] = 'G';
//	ci[1] = 'o';
//	ci[2] = 'o';
//	ci[3] = 'd';
//	System.out.println(ci[0]);
		
//		//���ڿ�!! �迭���
//		String [] str = {"java", "jsp","DB"};
//		
//		System.out.println(str[1]);
//		str[2] = "html";
//		System.out.println(str[2]);
		
//		int x = 10;
//		int y;
//		y = x;   //y�� x;�� ���� �����ϰ� �ȴ�.
		
//		int[]arr1 = {1,2,3,4,5};
//		int[]arr2;
//		arr2= arr1; // arr2�� �迭������ �ּҰ��̴�.
//		System.out.println(arr1[1]);
//		System.out.println(arr2[1]);
//		arr2[3] = 10; //[ ] {1,2,3,4,}������ 3���� ���� �ּҰ��� 3�� ���Ѵ�
//		System.out.println(arr1[3]);
//		System.out.println(arr2[3]);
	
	    //�迭�� Ȱ��
		//����ó��
		//�ݺ���
//		int[]arr =new int[5]; //�����۾�
//		for(int i=0;i < arr.length;i++) {//arr.ienth(= new int [5]���� i<5�� ���� �ǹ̴�)
//			arr[i] = 1;  //�ε��� 0���� 1�� �־��ּ��� ��� ��...4���� 1�� �־��ּ���
//	
//		}
//		for(int i=0;i < arr.length;i++)//�б��۾�
//			System.out.println(arr[1]);
		
//		int[] arr = new int[10];
//		for(int i=0;i<arr.length;i++) {//i = 0,1,2,3,4,5,6,7,8,9
//			arr[i] = i + 1;
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}  //=>1,2,3,4,5,6,7,8,9,10
//		int sum  = 0; //�� ���غ��� 
//		for(int i=0;i<arr.length;i++) {
//			sum += arr[i];		
//		}
//		System.out.println(sum); //=>55
//		//¦���� �հ� Ȧ���� �� ���ϱ�
//		int odd = 0;
//		int even = 0;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i] % 2 ==1){
//			odd += arr[i];
//		}else {
//			even += arr[i];
//		}
//		}
//		System.out.println("Ȧ�� : " + odd);
//		System.out.println("¦�� : " + even);
		
		//�׻��(=each)(=�����ϰ� �ܼ�����) for�� ����
//		for(���� : �迭������) {
//			���๮
//		}
//		int[] arr = {1,2,3,4,5};
//		for(int i : arr) {
//			System.out.println(i);
//		}
//		int sum = 0;
//		for(int i : arr) {
//			sum +=i;
//		}
//		System.out.println(sum); //=>15�� ���´�
		
		//���ڿ� ������ �迭,�׻��(=each)(=�����ϰ� �ܼ�����)for���� ����
//		String[] str = {"���","����","����"};
//		for(String s : str) {
//			System.out.println(s);
//		}
		
		//���� 1~100���̰� �߿� 10���� �迭 ������ �ʱ�ȭ�Ѵ�
		//�迭�� ���� ����Ѵ�
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
//		int max = arr[0];    //��� ���°� �߿� ���� ū ���� ���Ͻÿ�
//		int min = arr[0];  //��� ���°� �߿� ���� ���� ���� ���Ͻÿ�
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
	
		//������ ����Ͽ� 0~9 ������ �ʱ�ȭ �Ѵ�. 
		//������
//	    0 -2��(�������� �������� �ȴ�)
//	    1- 0��(�������� �������� �ȴ�)
//	    .
//	    .
//		9-3��(�������� �������� �ȴ�)
//	    int[] arr= new int[10];
//	    for(int i =0;i<arr.length;i++) {
//	    	int ran = (int)(Math.random() * 10);
//	    	arr[i] = ran;//ran�� ���� (int)(Math.random() * 10);���� �ϸ� ex)arr[0] => 0~9���� �������� ���´�
//	    }
//	    for(int i =0;i<arr.length;i++) {
//	    	System.out.print(arr[i] + ",");
//	    }
//	    int []cntArr = new int[10];  //(=int n0=0,n1=0,n2=0,n3=0,n4=0,n5=0,n6=0,n7=0,n8=0,n9=0;)�̰Ŷ� ���� �ǹ̴�
//	    
//	    for(int i =0;i<arr.length;i++) {
//	    			cntArr[arr[i]]++;//cntArr[0]++; �̶�� ��������
//	    		}
//	  System.out.println();
//	  for(int i =0;i<cntArr.length;i++) { //cnt ī��Ʈ ���� ��� ��������
//	    System.out.println(i + "-" + cntArr[i]+"��");
//	    }
	 
//		������
//		60���� 7���Դϴ�.
//		70���� 6���Դϴ�.
//		80���� 4���Դϴ�.
//		90���� 2���Դϴ�.
//		75���� 5���Դϴ�.
//		.
//		.
//		30���� 10���Դϴ�.
//		int[] score = {60,70,80,90,75,85,95,50,45,30};
//		int[]rank = {1,1,1,1,1,1,1,1,1,1};//   1�� �ʱ�ȭ�Ѵ�(=�迭�Ѵ�)
//		for(int i = 0; i< score.length;i++) {
//			for(int j = 0;j<score.length;j++) {
//				if(score[i] <score[j]){
//					rank[i]++;
//				}
//			}
//		}
//		for(int i = 0;i<score.length;i++) {
//			System.out.println(score[i] + "����" + rank[i] + "�� �Դϴ�.");
//		}
//		scroe[0] <score[0]  // 60 <60  rank[0]->1   rank[0]�� ���� int[]rank = {1,1,1,1,1,1,1,1,1,1};�� ù��°�� ���ϴ°Ŵ�
//		scroe[0] <score[1]  // 60 <70 rank[0]->2
//		scroe[0] <score[2]  //...rank[0]->3
//		scroe[0] <score[3]  //...rank[0]->4
//		scroe[0] <score[4]  rank[0]->5
//		scroe[0] <score[5]  rank[0]->6
//		scroe[0] <score[6]  rank[0]->7��
//		scroe[0] <score[7]  rank[0]->7  //60���� ������ �������� 7�� ����� �ȴ�
//		scroe[0] <score[8]  rank[0]->7   //60���� ������ �������� 7�� ����� �ȴ�
//		scroe[0] <score[9]  //60<90 rank[0]->7  //60���� ������ �������� 7�� ����� �ȴ�  =>rank = {7,1,1,1,1,1,1,1,1,1}
//		
//		scroe[1] <score[0]  rank[1]->0   rank[1]�� ���� int[]rank = {1,1,1,1,1,1,1,1,1,1};�� 2��° 1�� ���ϴ°Ŵ� ,70���� 60���� ���ؼ� �����ϱ� �ȹٲ��
//		scroe[1] <score[1]  rank[1]->1   
//		scroe[1] <score[2]  rank[1]->2
//		scroe[1] <score[3]  rank[1]->3
//		scroe[1] <score[4]  rank[1]->4
//		scroe[1] <score[5]  rank[1]->5
//		scroe[1] <score[6]  rank[1]->6
//		scroe[1] <score[7]  rank[1]->6
//		scroe[1] <score[8]  rank[1]->6
//		scroe[1] <score[9]  rank[1]->6 60���� ������ �������� 7�� ����� �ȴ�  =>rank = {7,1,1,1,1,1,1,1,1,1}
		
		
		//���� : ���� (1,2,3,4,5) ����(5,4,3,2,1)
//		int[]arr = {2,4,1,5,3};
//		//�������� ��Ÿ����
//	    for(int i = 0;i<arr.length;i++) {
//	    	for(int j=i + 1;j<arr.length;j++) {
//	    		if(arr[i] > arr[j]) {//������������ �ٲٲܷ��� '>' �� '<' �� �ٲ��ָ�ȴ�
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
		
		//������ �޴� ���� �� ���� 
		//�迬�� �޴� 10�� 1��
		//ȫ�浿 �޴�   3�� 2��
		//����� �޴�   2�� 3��
		
//		String[] name = {"ȫ�浿","�����","�迬��"};
//		int[] medal = {3,2,10};  //10,3,2�� ������������
//		for(int i = 0;i<medal.length;i++) {
//	    	for(int j=i + 1;j<medal.length;j++) {
//	    		if(medal[i] < medal[j]) {//������������ �ٲٲܷ��� <�� >�� �ٲ��ָ�ȴ�
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
//	    	System.out.println(name[i] + " �޴�" + medal[i] +"�� "+ (i+1) + "��");
//	    }
	
//		�迭-1����
//		   -������(2����) ������,��������                  tip 3���������� ���� �̿���Ѵ�.
//		int[][] score = new int[5][3];      //2������ ����
//		score = new int[��][��];  //*�� -���� ,�� -����
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
		
		//������ �迭 �ٸ����
//		int[][] score= {
//				{1,2,3},
//				{4,5,6},
//				{7,8,9},
//				{10,11,12},
//				{13,14,15},
//		};
//		for(int i =0;i<5;i++) {//���� 5��
//			for(int j =0;j<3;j++) {//���� 3��
//				System.out.print(score[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		
//------------------------------------6���� ����
		
		//int[][]score=new int[5][3]
//		int[][] score= {
//				{1,2,3},
//				{4,5,6},
//				{7,8,9},
//				{10,11,12},
//				{13,14,15},
//		};
//		for(int i =0;i<score.length;i++) {//���� 5��
//			for(int j =0;j<score[i].length;j++) {//���� 3��
//				System.out.print(score[i][j] + " ");
//			}
//			System.out.println();
//		}
//		//�ٸ���� each for��
//		for(int[] i :score) {//������ �迭 ������ each(=����) for�� ����, []=> n��° �� �κ��� ��Ÿ��,
//			for(int j : i) {//2��° ����̶� ���°�  n��° ������� ��Ÿ��
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
		
		//1~10������ ��Ÿ����
//		int num = 1;
//    	int[][] arr = new int[2][5];   //2�� 5���̴�
//		for(int i=0;i<arr.length;i++) {//�� �� ��Ÿ���� 0,1
//			for(int j=0;j<arr[i].length;j++){//�� �� ��Ÿ���� 0,1,2,3,4
//				arr[i][j] = (i*5)+ j + 1; //=>1,2,3,4,5  //i�� 0,1�̴ϱ� 0�����ϰ� j�� 0~4���� �����ϸ�ȴ�
//				                         //=>6,7,8,9,10   i�� 0,1�̴ϱ� 1�����ϰ� j�� 0~4���� �����ϸ�ȴ� 
//			}
//		}
//		for(int[] i : arr) {
//			for(int j : i) {
//				System.out.print(j + " ");
//			}
//		}
//		System.out.println();
		
//		int[][]arr = new int[5][3];
//		for(int i=0;i<arr.length;i++) {  //��(����)�� ��Ÿ��
//			for(int j=0;j<arr[i].length;j++) {//[i]�� ��(����)�� ��Ÿ��
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
//		for(int i=0;i<star.length;i++) {  //i�� �� j�� ��
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
//					for(char j : i) {//2���� ����̶� �� �߰������� ���°Ŵ� 
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
//				if( i + j>=4) {// i�� 0�϶� j�� 4 ..i��4�϶� j��0,1,2,3,4�� �ȴ�
//					star[i][j] = '*';
//				}
//			}
//		}
//			for(char[]i : star){
//				for(char j : i) {//2���� ����̶� �� �߰������� ���°Ŵ� 
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
//		System.out.println("���� ũ�⸦ �Է��ϼ���");
//		int row = sc .nextInt(); 
//		int col = row * 2 -1;   //row�� ���̰� col�� ���� ���ԵǴ� *����
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
//					for(char j : i) {//2���� ����̶� �� �߰������� ���°Ŵ� 
//						System.out.print(j + " ");
//					}
//					System.out.println();
//			}
		
		
		// �� �κ��� �о�⸸ �ʹ� �������Ʈ(449��~494��)
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
		
		
//		������
//				��ȣ ����  ����   ����  ����     ���
//				1   10  10  30  30   10.0
//				2   20  20  20  60   20.0
//				3   30  30  30  90   30.0
//				4   40  40  40  120  40.0
//				5   50  50  50  150  50.0
//			     �հ�    150 150 150 450				
//		int[][]score = {
//			{10,10,10,},
//			{20,20,20,},
//			{30,30,30,},
//			{40,40,40,},
//			{50,50,50,}	
//		};
//		
//		System.out.println("��ȣ ����  ����  ����  ����  ���");
//		int sum;//����
//		int korTot = 0;
// 		int engTot = 0;
//		int mathTot= 0;
//		for(int i=0;i<score.length;i++) {
//			korTot += score[i][0];   //���� �հ�
//			engTot += score[i][1];   //���� �հ�
//			mathTot += score[i][2];  //���� �հ�
//			sum = 0;   //���� ��Ÿ������
//			System.out.print(" " +( i + 1) + " ");//�켱���� ������ ()�Ұ�ȣ �̿��Ѵ�   ,   " "�� ����� 
//			for(int j =0;j<score[i].length;j++) {
//				sum += score[i][j];//���� 
//				System.out.print(" " + score[i][j] + " ");
//			}
//			System.out.print(" " + sum);
//			double avg = sum / (double)score[i].length; //  ��հ� ��Ÿ���� ��� ,  double �� ������ ����� �Ǽ��� �Ἥ 
//		    System.out.print("  " + avg);
//			System.out.println();
//		}
//		int totScore = korTot + engTot + mathTot;// �հ�,������ ��Ÿ���°�
//		System.out.println("�հ�"+"  " + korTot+" " + engTot +" " + mathTot+ "  "+ totScore);

		
		// �������迭�� �Ѻ���
		//25���� ���� �����Ҽ��ִ� 2�����迭 ����
//		int[][]bingo = new int[5][5]; 
//		//�迭�� 1~50������ ������ �ʱ�ȭ�Ѵ�.
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
//================================================================================================ 7����
		
		
		//���� �Է��ϰ� �迭�� ���� ���� ������ 0���� �����Ѵ�.
//		Scanner sc = new Scanner(System.in);
//		boolean flage = true;
//		int num;
//		int sum =0;////while �ʱ⹮
//		while(flage) {
//			System.out.println("�����Է�:");
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
//		//�迭�� ��簪�� 0���� ����Ǹ� ��ü�ݺ��� ����
//		System.out.println("sum = " + sum);
//		if(sum ==0) {//sum�� 0�� �ƴ�
//		flage= false;   //false �� �� �ݺ��� �����Ų�ٰ� ����
//		}
//	}
//		System.out.println("Game Over");
		
	
		
		
		
		
		
	
		
	}
}

	