import java.util.Scanner;

public class Oper {

	public static void main(String[] args) {
		//��������� 
		//+,-,*,/(������),%(������)
		
//		int x = 5;
//		int y = 2;
//				
//				System.out.println(x/y);  //2
//				System.out.println(x%y);  //1
		
		//int x = 5;
		
		//���= ������ �ʴ� �� vs ���� = ���ϴ� �� 
		
		//final double PI = 3.14;  =>���
		//PI = 2.34;    //PI ���̴� 3.14 ������ ��� ���� ������ ���� 
		//System.out.println(PI);
		
		//����ȯ(�ڷ��� or ������Ÿ��)
		//int -> double
		//boolean�� ����ȯ�� �ȵȴ�     
		
		//byte(1����Ʈ) < short(2����Ʈ) < int(4����Ʈ) < long(8����Ʈ) < float(4����Ʈ)< double(8����Ʈ)
		//          char(2����Ʈ)      <                     <-����      �Ǽ�->
		//���� �ʿ��� ū ������ ��ȯ�� �ڵ�����ȯ----------------> 
		//ū�ʿ��� ���������� ��ȯ�� ��������ȯ<----------------------
		
		//�ڵ�����ȯ ����)byte b = 85;
		//            int i =b;

		//������ ��ȯ ���� int i = 85;
		//            byte b =(byte)i;
		
//		int i = 300;
//		byte b = (byte)i;
//		System.out.print(b); //��������ȯ�� ���� �ս��� �ִ� �׷��� 300�� 44�� ����� ���´�.
		
//		double d = 3.14;
//		int i = (int)d;
//		System.out.println(i); // ������ �Ѿ�� �׷��� 3�� ���´�
		
//		int i = 3;
//		double d = i;
//		System.out.println(d);
		
//		byte b = 65;
//		char c = (char)b;  char�� ���ڿ��̿���
//		System.out.println(c); //A�� ���� 65����  a�� 87�̿���??

//		int x = 10; 
//		int y = 20; 
//		int result = x + y;  //30 ���´�
//		
//		byte b1 = 10;
//		byte b2 = 20;
//		byte result = (byte)(b1 + b2);  // byte b = (byte)(int + int)  => ����������� ������ ���´�

		//����� int���� ���� ����Ÿ���� ��� int������ �ڵ�����ȯ�ȴ�
//		byte + byte => int + int 
//		byte + short => int + int 
//		char + byte  =>int + int 	
		
//		int + long => long + long   *������ ū�ɷ� �����Ѵ�
//		int + float => float + float
//	    float + double => double + double
		
		//int x = 5;
		//int y = 2;
		//double result = x /y;  //2.0�� ���´�
		//double result = x % y;    //1.0�� ���´�
		//System.out.println(result);
		
//		int x = 3;
//		int y = 5;
//		//double result =(double) x /y; //0.0�� ���´� ,//(double)���̸� 0.6
//		double result = x %y;
//		System.out.println(result);
		
		//String str = "java";
		//double ver = 1.8;
		//String result = str + ver; //"java" + "1.8" => java1.8 �� ���´�
		//String + anyType => String
		//String + double => string + string => string
		
		// + �����ڴ� ���, ����, ��ȣ ������ ����� �ִ�
		
		//���������� : ���� 1���� .1���� 
		//++.--
		//�������� ��밡�� 
		//��ġ,��ġ  
//		int x = 10;
//		++x;
//		System.out.println(x); //11�� ���´�
//		x++;
//		System.out.println(x); //12���´�
//		--x;
//		System.out.println(x); //11���´�
//		x--;
//		System.out.println(x); //10�� ���´�
		
		//int x = 10;
		//int y = 0;
//		y = ++x + 10;
//		System.out.println("x ="+ x + "," + "y =" + y); // x�� 11�� ,y�� 21�� ���´�
		
		//y = x++ + 10;     //x�� 11�̰� y�� 20�� ���´�  ��ġ�Ҷ���  ++�� ���߿� ����Ѵ�~~
		//System.out.println("x ="+ x + "," + "y =" + y);// x�� 11�� ,y�� 20�� ���´�
		
		//���Կ�����
		//������ ���Ǵ� ������
		// = , +- , -- , *= , /= , <,<= , |= .....
		
//		int x = 10;
//		x += 10; //x = x + 10�̶� ���� �����̴�
//		System.out.println(x); //20�� ���´�
//		
//		x -=10;   ������ 20�̴ϱ� �����ؼ� 10�� ����
//		System.out.println(x);//10�� ���´�
//		
//		x *= 2;
//		System.out.println(x);//20�� ���´�
		
		//�񱳿�����
		// 5 > 3
		// <, >,<=,>=,==,!=    *!�� not�ǹ��̴�
		//true, false
		
//		int x = 10;
//		int y = 20;
//		System.out.println(x < y); //true�� ���´�.
//		System.out.println(x > y); //false�� ���´�
		
//		System.out.println(x <= y);//f
//		System.out.println(x >= y);//t
//		System.out.println(x == y);//f
//		System.out.println(x != y);//t
		
		//��������
		//&&(=and) ,||(=or) ,!(=not)
		//�ΰ��� �̻��� ������ Ȯ���ҋ� ����Ѵ�.
		
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
		
		//ex) 3.45 <= 2 �� double <= int -> double <= double�� �ż� => double�� �ȴ�
	
		//���ǿ�����(���Կ�����)
		//���ǽ�                     ? ���1 : ���2 
		//(true or false) ? (true) (false)
//		int x = 10;
//		int y = 20;
//		
//		int result = (x > y ) ? x : y;
//		System.out.println(result);//y�� �ż� 20�� ���´�
		
//		int age = 20;
//		String rs = (age >= 20) ? "���� �Դϴ�" : "�̼����Դϴ�";
//		System.out.println(rs);
		
		
		//�������� 
		// 456 -> 400, 111-> 100 
//		Scanner sc = new Scanner(System.in);
//		System.out.println("���� �ڸ����ڸ� �Է��ϼ���: ");
//		int num = sc.nextInt();	
//		System.out.println("�Է¹��� �� : " + num);
//		System.out.println("����Ǿ��� ��� :" + num / 100 * 100); //456/100 =>4 * 100 => 400
		
		// 333 -> 331, 777 -> 771
//		Scanner sc = new Scanner(System.in);
//		System.out.println("���� �ڸ����ڸ� �Է��ϼ���: ");
//		int num = sc.nextInt();
//		System.out.println("�Է¹��� �� : " + num);
//		System.out.println("����Ǿ��� ��� :" + ( num / 10 * 10  + 1));
		
		//10�ǹ��
		//19->20 , 81->90
//		Scanner sc = new Scanner(System.in);
//		System.out.println("���ڸ� �Է��ϼ���: ");
//		int num = sc.nextInt();
//		System.out.println("�Է¹��� �� : " + num);
//		System.out.println("����Ǿ��� ��� :" + ( num / 10  * 10 + 10));
		
		//19 ->1, 81 ->9 , 24 ->6
//		Scanner sc = new Scanner(System.in);
//		System.out.println("���� �ڸ����ڸ� �Է��ϼ���: ");
//		int num = sc.nextInt();
//		System.out.println(10 - num % 10);

		//����� ������ �Է¹޴´�.
		//�� �ٱ��Ͽ� 10���� ����� ������ �ִ�.
		//�׷� ��� �ٱ��ϰ� �ʿ��ұ��
		//123�� -> 13�� , 456 ->46��
		//xx���� �ٱ��ϰ� �ʿ��մϴ�.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("����ǰ����� �Է��ϼ���: ");
//		int num = sc.nextInt();
//		System.out.println("�ٱ��ϰ� � �ʿ��ұ�� :" + ( num / 10  +1));
		
		//��������
//		int x = 5;
//		System.out.println(x >= 0 && x<= 10); //true
//		System.out.println(x <=0 || x>= 10); //false
		
	}

}
