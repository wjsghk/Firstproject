
public class MemberInit {

	//�������
	//�ڵ��ʱ�ȭ ->����ʱ�ȭ->�ʱ�Ȱ���->�����ڿ� ���� �ʱ�ȭ
	int x;
	int y;
	static int cv = 100;
	static int count;
	{//�ν��Ͻ� �ʱ�ȭ ��(��ü�� �����ɶ����� ȣ��)
		System.out.println("�ν��Ͻ� �ʱ�ȭ ��");
		x=10;
		y=20;
	}
	static {//static(=Ŭ����) �ʱ�ȭ��(��ü������ �� �ѹ��� ȣ��)
		System.out.println("static �ʱ�ȭ ��");
		count = 1000;
	}
	
	MemberInit(int x,int y){
		System.out.println("�������� ȣ��");
		this.x = x;
		this.y = y;
		
	}
}
