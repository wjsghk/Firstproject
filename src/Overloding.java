
public class Overloding {
//�����ε� : �޼ҵ�� ���ǽ� ����ϴ� ���
	//1. �޼ҵ��� �̸��� �����ϰ� �����Ѵ�.
	//2. �� �ް������� Ÿ�� �Ǵ� ������ �޶���Ѵ�. void add(�Ű�����){}
	//3. ����Ÿ�԰��� �����ϴ�
	//4. ��ü�� �������� ������ ���� ex)ol.add();(ol=���ĺ� O,L�̴�)
//	                          ol.add(3);
//	                          ol.add(3L);
//	                          ol.add(2,3);
//	                          ol.add(2,3L);
//	                          ol.add(2L,3);
	
	//���� �̸����� ��� �� �� ���� 
	int x;//����
	//int x;//�ߺ����� ���Ұ��� 
	void add() {} //�޼ҵ�   =>ol.add();
	//void add() {} //�ߺ��� ��� �Ұ���
	void add(int x) {} // �ȿ� ������ �ٸ� �� void add ���� �̸��� �����ϰ� ������ =>ol.add(3);
	void add(long x) {} //Ÿ���� �ٸ� �� ��밡�� long,int...	=>ol.add(3L);
	void add(int x ,int y) {}//���� �ٸ� �� ��밡��   =>ol.add(2,3);
	void add(int x ,long y) {}//������ Ÿ���� �ٸ� �� ��밡��
	void add(long x ,int y) {}
}
