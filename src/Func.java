//p146 �޼ҵ�κ� ,Ŭ������ ��ü�κ�(4�ܿ�)
public class Func {
	//�޼ҵ�=�Լ���� �Ҹ��� : ��ü�� ����� �����Ѵ�.
//	����Ÿ�� �޼ҵ��([�Ű�����1..]) { []���ȣ�� �ʿ䰡 ���� �� ���� �����ϴ�
//	         ���๮
//	     [return ��]
//	}
	//����Ÿ��  : void,�⺻�ڷ��� ,�������� �̿��Ѵ�
	//�޼ҵ��  : ��Ÿǥ���
	//�Ű�����  : ����) int x(�⺻��) , double d(�⺻��), TV t(������)
	//return : ����Ÿ���� void�� �ƴ� ��쿡 �ݵ�� ����Ѵ�. �⺻�ڷ���,�������� return�� ���� ���ش�.
	
	void add() {//�޼ҵ��� �����(=�ñ״���)
		System.out.println(2+3);//�޼ҵ��� ������(=���� �޼ҵ尡 �ϴ� ��)
	}
	void add2(int x, int y) {//Func Ŭ������ �ִ� f.add2(10,20); �̰ſ��� x=10,y=20�̵ȴ�
		System.out.println(x+y);
	
	}
	int add3(int x,int y) {
		int sum = x+y;
		return sum;//�޼ҵ� ��ü���� return�� �̿��Ѵ� ��������
	}
	
	//sub()//����
	//mul()//���ϱ�
	//div()//������
	int sub(int x,int y) {//int x ,int y��  ������
		int sub =x-y;
		return sub;
	}
	int mul(int x,int y) {
		int sum2 =x*y;
		return sum2;
	}
	double div(double x,double y) {//�Ǽ��� ��Ÿ���� ������double�� ���ٴ°� ���÷� ������
		double div =x/y;
		return div;
	}
	
	//testŬ������ f.test(10,20);
//	             f.test(20,10);  �������ֱ�
	void test(int x, int y) {
		if(x<y) {
			System.out.println("�Լ��� ����");
			return;//�Լ��� ��� ���Ḧ ��Ÿ����  cf:break�� �ݺ����� �������
		}
		int result = x +y;
		System.out.println(result);
	}
	
	
	
	int test2(int x, int y) {
		int result;
		if(x > y) {
			result =  x;			
		}else { //if , return �� ���� �� ���� 2������ �ľ��ؾ� �ż� else�� ���´�
			result =  y;//else ������ y�� 20
		}return result;
	}
		
		void call1() {
			System.out.println("Call1");
			call2();
		}
		void call2() {
			System.out.println("Call2");
			call3();
		}
		void call3() {
			System.out.println("Call3");
		
		
		}
		
		
		
	}

