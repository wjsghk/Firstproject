
public class I3dTv extends Tv {// 클래스 만들때 supclass 부분에 들어가서 브라우저 클릭하고 tv 부모 객체선택하면 자동으로 extends Tv가 생긴다
	boolean i3d;
	void i3dPower() {
		if(i3d) {
			System.out.println("3D기능 동작중...");
		}
	}

}
