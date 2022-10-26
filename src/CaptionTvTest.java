//상속관련 코드
public class CaptionTvTest {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();//객체 생성 
		ctv.channel = 10;
		System.out.println(ctv.channel);// 10이 나온다
		ctv.channelDown();
		System.out.println(ctv.channel);//Tv클래스에  코드가 있기 때문에 9가 나온다.
		
		ctv.caption = true;//caption 클래스 
		ctv.displayCaption("오늘의 날씨를 알려드립니다.");
		
		I3dTv idd = new I3dTv();//i3d 클래스
		idd.i3d = true;
		idd.i3dPower();
		
	}

}
