
public class FuncTest {

	public static void main(String[] args) {
		Func f = new Func();//��ü���� �ּ� ó�� ���ϰ� �����س���
		
//		f.add(); ////�Լ��� ȣ��  =>System.out.println(2+3);�� �����Ѵٴ� �� cf:DataTest �κ� ����
//		f.add2(10,20);
//		f.add2(100,200);//���� ��ü�� ���� ���ڸ� �޶� ������ �Ѵٰ� �Ѵ�.
//		System.out.println(f.add3(5,8));
//		int sum = f.add3(15, 20);//sum�� 35�� �ȴ�.
//		System.out.println(sum);
//		//sub()//����
//		int sub = f.sub(5, 3);
//		System.out.println(sub); 
//		//mul()//���ϱ�
//		int sum2 = f.mul(5, 3);
//		System.out.println(sum2);
//		 //div()//������
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
