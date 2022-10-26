
public class ArrayMaxTest {

	public static void main(String[] args) {
		//1.ArrageMax 객체를 생성한다.
		//2.생성된 객체의 배열에 1~100사이 값을 랜덤하게 저장한다.
		//3.메소드를 정리한다.(배열의 최대값을 구해서 반환하도록한다.)
		//4.반환된 최대값을 출력한다.
		ArrayMax am =new ArrayMax();
		for(int i=0;i<am.arr.length;i++) {
			am.arr[i] = (int)(Math.random() * 100) +1;
		}
		for(int i : am.arr) {
			System.out.println(i);
		}
		int max = arryMax(am.arr);
		System.out.println("max = " + max);
	}
	static int arryMax(int[]arr) {
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max < arr[i]){//'<'를 >바꾸면 최소값 
				max = arr[i];
			}
		}
		return max;
	}

}
