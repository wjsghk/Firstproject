import java.util.Scanner;

public class LoopTest {

	public static void main(String[] args) {
		//�ݺ��� : ���๮�� ������ �����ϰ� �Ѵ�.
		//for�� , while��, do-while��
//		for(�ʱⰪ;���ǽ�;������) {
//			���๮
//		}
//		for(int i=0;i<10;i++) {//0~9���� �۵��Ѵ�
//			System.out.println(i + ": hellow");
//		}
		
//		for(int i=0;i<10;i+=2) {//0,2,4,8
//			System.out.println(i + "Hellow");
//		}
		
//		for(int i=10;i>0;i--) {//10~1
//			System.out.println(i + ": hellow");
//		}
		
//		for(;true;) {//���ѹݺ���
//			System.out.println("hellow");
//		}
		
//		int k = 1;
//		for(int i=1;1<=10;i++) {
//			System.out.println(k++);
//		}
		
	//1~10������ �������߿� ¦�� ���
//		for(int i=1;i<=10;i++) {
//			if(i % 2 == 0 ) {//i�� 2�� ������ �������� 0�̴�
//				System.out.println(i);
//			}
//		}
		
		//1 + 2 + 3 +  + 10 =>55
//		int sum = 0;
//		for(int i=1;i<=10;i++) {
//		sum += i;  //sum = sum + i; �̷��Ե� ��� �� �� �ִ�.
//	               //	0     0     1
//	               //	3     1     2
//	               //	6     3     3
//                 //.....
//			System.out.println(sum);
//		}
		
//		//1~10������ ���� �߿� Ȧ���� �հ� ¦���� ���� ���� ���ؼ� ���
//		int odd =  0;
//		int even = 0;
//		for(int i=1;i<=10;i++) {
//			if(i % 2 == 1) {
//				odd += i;//Ȧ���� ��
//			}else {
//				even += i;//¦���� ��
//			}
//		}
//		System.out.println("Ȧ�� : " + odd);
//		System.out.println("¦�� : " + even);
		
		//for�� �� while�� ���ؼ� ������
//		�ʱⰪ while(���ǽ�) {
//		���๮
//		������
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
//			���๮
//		}
//	}
	
		//for�� ��ø  //��������� �ʱⰪ,���ǰ�,���ప,���� �������
//		int k = 1;                 
//		for(int i = 0;i<5;i++) {//�ٱ��� for�� �ѹ� ���� �ڿ� for�� 5�� �ݺ��ȴ�.
//			for(int j = 0;j<5;j++)//(=���ప)ó�� �������� {
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
		
		//������ for������ �ۼ���1
//		for(int i =2; i<=9;i++) {
//			for(int j = 1;j<=9;j++) {
//				System.out.println(i + "x" + j + "=" + i*j);
//			}
//			System.out.println("===");
//		}
		//������ �ۼ���2
//		for(int i =1; i<=9;i++) {
//			for(int j = 2;j<=9;j++) {
//				System.out.print(j + "x" + i + "=" + j*i + " ");
//			}
//			System.out.println();
//		}
		
		//while���� ��ø���� 
//		�ʱⰪ
//		while(���ǽ�) {
//			while(���ǽ�) (=���๮,������2�̶� �Ȱ����� ) {
//		}   
//			������1
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
		
//		//������ while������ �ۼ���
//		int i = 2;
//		while(i<=9) {
//			int j=1;
//			while(j<=9) {
//			System.out.println(i + "x" + j + "=" + i*j);
//			j++;
//		}
//			i++;
//		}

//		//for�� �ٸ������ ��ø���
//		for(int i = 0,j =10; i <10; i++,j--) {
//			System.out.println("i :" + i + "," + "j :" + j);
//		}
		
//		int s = 0;
//		int i;
//		for(i=0;i<10;i++,s++) {
//			System.out.println("i :" + i + "," + "s :" + s);
//		}
//		System.out.println(i);
		
		//do while��
//		�ʱⰪ
//		do {
//			���๮
//			������
//		}while(���ǽ�);
		
//		int i =1;
//		do {
//			System.out.println(i);
//			i++;
//		}while( i<=10);
		
//		//1+(1+2)+(1+2+3)+(1+2+3+4)...+(1+2+3+...10)�� ����� ���
//		int sum =0;
//		int tot =0;
//		for(int i=1;i<=10;i++) {
//			sum += i;
//			tot += sum;
//		}
//		System.out.println(sum);
//		System.out.println(tot);
		
		//�ݺ��������� 
		//break, continue
		//���ǹ��ȿ��� ����Ѵ�.
//		for(int i=1;i<=10;i++) {
//			if(i >5) {break;//�ݺ����� ���ᰡ �ȴ�.
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
//			continue;    // Ȧ�� �϶� continue ����Ǹ鼭 Ȧ���� �ȳ����� �ٽ� �ݺ��� ����Ǹ鼭 ¦���� ���ö� ¦������ ��µȴ�
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
//		System.out.println("������ �Է��ϼ���");
//		int num = sc.nextInt();
//		int sum = 0;   //while�� �ʱⰪ
//		while(num>0) {
//			sum += num % 10;      ////sum = sum +(num%10)   cf:sum+=i; => sum=sum+i
//			num = num / 10;
//		}
//		System.out.println(sum);
		
		//������ 2x + 4y =10�� ��� �ظ� ���Ͻÿ�.��,x��y�� �����̰� ������ ������
		//0<=x<=10, 0<=y<=10�̴�.
		//[������]
		//x= 1,y= 2
		//x= 3,y= 1
		//x= 5,y= 0  for�� ��ø����ϸ鼭 �ذ��ϱ�
//		for(int x =0;x <=10;x++) {
//			for(int y =0;y <=10;y++) {
//				if(2*x + 4*y ==10) {
//				System.out.println(x + "," + y);
//			}
//			
//		}
//		}
		
		//1+(-2)+3+(-4)+...�� ���� ������ ��� �� �� ��������, ����� ���ؾ� ������
		//100�̻��� �Ǵ��� ����ϼ���
//		int sum = 0;
//		int s = 1;
//		int num = 0;
//		int i;
//		for( i =1;true;i++,s=-s) {//true ������ �ݺ����� ���� s�� -s��� ������ ��Ÿ��
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
//			System.out.println("��ȣ�� �����ϼ���");
//			System.out.println("1.������ 2.��� 3.�Ķ��� 4.����");
//			sel =sc.nextInt();
//			if(sel == 1) {
//				System.out.println("������ ����");
//			}else if(sel ==2) {
//				System.out.println("��� ����");
//			}else if(sel ==3) {
//				System.out.println("�Ķ��� ����");
//			}else if(sel ==4) {
//				break;
//			}
//		}
		
//		//����(����)  =������ ���� ���ڶ�� ��������
//		//Math.random()  //0.0 <= r <1.0 -> 0.0 ~ 0.999999
		//System.out.println(Math.random());
		////Math.random() * 10 // 0.0 ~ 9.99999...
		////(int)(Math.random() * 10) //0~9
		////(int)(Math.random() * 10) +1 //1~10
//		System.out.println((int)(Math.random() * 10)+1 );
		
		//(int)(Math.random() //* �����ǰ���(������ �ִ밪~������ �ּҰ� +1)) +������ �ּҰ�
//		System.out.println((int)(Math.random() * 3)+1);

		//���������� ����1 
//		int com;
//		int me;
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			com = (int)(Math.random() * 3)+1;
//			System.out.println("1.���� 2.���� 3.�� :");
//			me = sc.nextInt();
//			System.out.println("com = " + com +", me = " + me);
//		}
		
		//�������������� 2   1���̱�� ������                
		//���� win                            
		//���� lose                           
 		//���� same   
		//           com  me           
	    // 1 ����          1    1  ->0
		// 2 ����          1    2  ->-1   me win
 	 	// 3 ��            1    3  ->-2   com win
//		int com;
//		int me;
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			com = (int)(Math.random() * 3)+1;
//			System.out.println("1.���� 2.���� 3.�� :");
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
		
//		//���������� 3 3���̱涧 ������
//		Scanner sc = new Scanner(System.in);
//		int com;
//		int me;
//		int correctCnt = 0;
//		while(true) {
//			com = (int)(Math.random() * 3)+1;
//			System.out.println("1.���� 2.���� 3.�� :");
//			me = sc.nextInt();	
//			int result = com -me;
//					if( result == -1 || result ==2) {
//						System.out.println("you win");
//						correctCnt++;
//						System.out.println("�̱�Ƚ�� : " + correctCnt +"ȸ"); //�̱�Ƚ�� ���� ī��Ʈ 
//						if(correctCnt ==3) {                                //�̱�Ƚ�� 3���̱�� �����
//							break;
//						}
//					}else if(result == 0) {
//						System.out.println("tie");
//					}else {
//						System.out.println("you lose");
//						}
//	}
		
		//����������4 3���ȿ� �¸� ������ ����
//		int com;
//		int me;
//		int correctCnt = 0; //1�� �¸��ϸ� ����ȴٴ� ���� ǥ���� ��
//		Scanner sc = new Scanner(System.in);
//		int end = 0;  //3���ȿ� �¸� ������ ����ȴٴ� ���� ǥ���� ��
//		while(true) {
//			end++;
//			if(end == 4) {                //3���ȿ� �¸� ������ ����
//				System.out.println("3���� ������ȸ�� �� ����ϼ̽��ϴ�.");
//				break;
//				}
//				com = (int)(Math.random() * 3)+1;
//			System.out.println("1.���� 2.���� 3.�� :");
//			me = sc.nextInt();
//			int result = com -me;
//					if( result == -1 || result ==2) {
//						System.out.println("you win");
//						correctCnt++;
//						System.out.println("�̱�Ƚ�� : " + correctCnt +"ȸ"); //�̱�Ƚ�� ���� ī��Ʈ 
//						if(correctCnt ==1) {                               //�̱�Ƚ���� 1�� �ϸ� �����
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
