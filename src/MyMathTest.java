
public class MyMathTest {

	public static void main(String[] args) {
		MyMath ma = new MyMath();
		int sum1= ma.add(2,3);
		System.out.println(sum1);
		
		long sum2 = ma.add(2L,6L);//按眉积己
		System.out.println(sum2);
		
		int[] arr = {1,2,3,4,5};//硅凯积己
		int sum3 = ma.add(arr);
		System.out.println(sum3);
		

	}

}
