
public class StudentTest1 {

	public static void main(String[] args) {
		//���� : 100
		//���� : 60
		//���� : 76
		
		//������ 
		//�̸� : ȫ�浿
		//���� : 236
		//��� : 78.7(�Ҽ��� 2°�ڸ����� �ݿø��Ѵ�.)
		
		Student1 st = new Student1("ȫ�浿",1,1,100,60,76);
		System.out.println("�̸� : " + st.name);
		System.out.println("���� : " + st.getTotal());
		System.out.println("��� : " + st.getAverage());
	}
	

}
