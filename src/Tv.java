
//public class Person {Ŭ���� �Լ��θ��� ����� �ȵŰ� Ŭ���� �����Լ��� ���Ե� ������ ����� �����ϴ�.
	
	
	//�Ӽ� : ��,��,��,��,�ٸ�....�̸�,����,Ű,������,����
	//����(=�迭)
	
	//���(����)�ȱ�,�޸���,��,...�ڱ�Ұ�
	//�޼ҵ�(=�Լ�)

public class Tv {//Ŭ���� �ȿ� �ִ°� �������  vs ���� �޼ҵ忡 �ִ°� ��������
	//��ü(�������� ������������ ����̶�� �Ѵ�) : ���,���⼺,ĸ��ȭ(=��������),
	
	//�Ӽ�=����(�迭) - ũ��,������ư,ä��,����,����,���ͳ�....
	
	//���(����)=�żҵ�(�Լ�) - ���� On/Off, ä��Up/Down ,����Up/Down
	
	//�Ӽ�,����(=�迭)
	boolean power;//������ư  (�� ����)         false
	int channel;//ä�δ� �������� int ����              0
	int volumn;//����  (����)                  0
	String color;//������ ���ڿ��̿��� ��Ʈ�� ����   null
	String model;//��                                    null
	int year;//��������                                         0
	String company;//������                              null
	
	void Power() {//���� On/Off  void=�޼ҵ�
		power = !power; //!=not
	}
	void channelUp() {//ä��Up/Down
		channel++;
	}
    void channelDown() {//ä��Up/Down
        channel--;
	}
    void volumnUp() {//����Up/Down
		volumn++;
	}
    void volumnDown() {//����Up/Down
		volumn--;
	}
    void showlnfo() {
    	System.out.println(power);
    	System.out.println(color);
    }
}

