import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나를 입력하세요:");
		int num = sc.nextInt();
		System.out.println("입력하신 정수는" + num);
		
		System.out.print("실수 하나를 입력하세요 :");
		double d = sc.nextDouble();
		System.out.println("입력하신 실수는" + d);
		
		sc.nextLine();
		
		System.out.print("문자를 입력하세요 : ");
		String str = sc. nextLine();
		System.out.println("입력하신 문자는" + str);
	

	}

}
