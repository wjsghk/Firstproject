import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ��� �Է��ϼ���:");
		int num = sc.nextInt();
		System.out.println("�Է��Ͻ� ������" + num);
		
		System.out.print("�Ǽ� �ϳ��� �Է��ϼ��� :");
		double d = sc.nextDouble();
		System.out.println("�Է��Ͻ� �Ǽ���" + d);
		
		sc.nextLine();
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		String str = sc. nextLine();
		System.out.println("�Է��Ͻ� ���ڴ�" + str);
	

	}

}
