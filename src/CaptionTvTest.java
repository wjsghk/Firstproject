//��Ӱ��� �ڵ�
public class CaptionTvTest {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();//��ü ���� 
		ctv.channel = 10;
		System.out.println(ctv.channel);// 10�� ���´�
		ctv.channelDown();
		System.out.println(ctv.channel);//TvŬ������  �ڵ尡 �ֱ� ������ 9�� ���´�.
		
		ctv.caption = true;//caption Ŭ���� 
		ctv.displayCaption("������ ������ �˷��帳�ϴ�.");
		
		I3dTv idd = new I3dTv();//i3d Ŭ����
		idd.i3d = true;
		idd.i3dPower();
		
	}

}
