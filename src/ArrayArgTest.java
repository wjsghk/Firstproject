
public class ArrayArgTest {

	public static void main(String[] args) {
		ArrayArg ay = new ArrayArg();
		ay.x = 10;
		ay.arr[0] = 1;
		ay.arr[1] = 2;
		ay.arr[2] = 3;
		ay.arr[3] = 4;
		ay.arr[4] = 5;//복습할때 주석하지말고 고정해두기
		
		//첫번째 코딩
		for(int i :ay.arr) {//for each 문
			System.out.println(i);
			}
		int[]arr2 = change(ay.arr);
		for(int i : arr2) {
			System.out.println(i);
		}
		
	}
	
	static int[]change(int[]arr){
		for(int i=0;i<arr.length;i++) {
			arr[i] = (i+1) *10;
		}
	int[] arr2;
	arr2 = arr;
	return arr2;
		
	}
}


//       두번째 코딩
//		}
//		change(ay.arr);
//		for(int i :ay.arr) {
//			System.out.println(i);
//		}
//	}
//		static void change(int[] arr) {
//			arr[0] = 100;
//			System.out.println("change() = " + arr[0]);
//		}
//}
		

