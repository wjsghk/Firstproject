
public class Car1 {
	//�Ӽ�
	String color;//�ν��Ͻ� ���� ����ƽ�� �Ƚ����ϱ�
	String gearType;//�ν��Ͻ� ���� ����ƽ�� �Ƚ����ϱ�
	int door;//�ν��Ͻ� ���� ����ƽ�� �Ƚ����ϱ�
	
	//������  - �������(�ν��Ͻ�)�� �ʱ�ȭ�Ѵ�.
	//     -Ŭ������ �̸��� �����ϰ� �ۼ��Ѵ�.
	//     -��ü�� �����ϴ� ������ �ѹ��� ȣ��Ǿ�� �Ѵ�.
	//     -�⺻�����ڴ� ���������ϴ�(�ٸ������ڰ� ������)
	//     -������ �����ε��� �����ϴ�
	//     -��� Ŭ������ �����ڸ� �����Ѵ�
	
	Car1(){//������(���๮�� �ִ°�)  vs �⺻������(���๮�� ���°�)
		color = "blue";//�Ű����� 3��
		gearType = "st";
		door = 3;
		//���๮
	}
	Car1(String c){
		color = c;//�Ű�����1��
	}
	Car1(String c, String g){
		color = c;//�Ű�����2��
		gearType = g;
	}
	Car1(String c,String g,int d){
		color = c;
		gearType = g;
		door = d;
		
		//this �κ� Car1 Ŭ������ ������� �̶�� �����ϱ�, �ַ� ���� �̿���
//Car1(String color){
//		this(color,"Auto");//�ٸ��������� ȣ��
//	}
//	Car1(String color, String gearType){
//		this(color,gearType,4);
//	}
//	Car1(String color, String gearType,int door){
//		this.color = color;
//		this.gearType = gearType;
//		this.door = door;
	}
}
