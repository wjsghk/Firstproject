
public class FuncStaticTset {

	public static void main(String[] args) {
		FuncStatic fs = new FuncStatic();
//		fs.iv = 10;
//		//fs.cv = 20;
//		FuncStatic.cv=20;//fs.cv = 20;�� ���� �ǹ� ����ƽ�̶� ��ü �������� ����Ҽ��ִٴ°� ������
//		
//		fs.instanceMethod();  =iv
//		//fs.staticMethod();   =cv
//		FuncStatic.staticMethod();//fs.staticMethod();�� ���� �ǹ� ����ƽ�̶� ��ü �������� ����Ҽ��ִٴ°� ������
		
		fs.instanceMethod();//�ν��ͽ� �޼ҵ�
		FuncStatic.staticMethod();// ����ƽ�޼ҵ�� ��ü���� �ʿ����
	}


}
