
public class ArrayMaxTest {

	public static void main(String[] args) {
		//1.ArrageMax ��ü�� �����Ѵ�.
		//2.������ ��ü�� �迭�� 1~100���� ���� �����ϰ� �����Ѵ�.
		//3.�޼ҵ带 �����Ѵ�.(�迭�� �ִ밪�� ���ؼ� ��ȯ�ϵ����Ѵ�.)
		//4.��ȯ�� �ִ밪�� ����Ѵ�.
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
			if(max < arr[i]){//'<'�� >�ٲٸ� �ּҰ� 
				max = arr[i];
			}
		}
		return max;
	}

}
