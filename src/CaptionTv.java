//상속관련 코드  Tv 클래스를 부모 클래스여서 공부할 때 참조한다 
//오버로딩  한개의  클래스에서 나타나는 거
//vs 오버라이딩은 상속에서 부모와 자식클래스에서 나타낸다
public class CaptionTv extends Tv{//'extend' 상속중의 자식(=서브 클래스)을 나타낸다 vs Tv클래스는 상속 중 부모의 클래스이다 
//부모클래스 : 여러가지 자식클래스를 갖는다. 단일 상속만 가능하다(부모(=슈퍼)클래스는 1개만 가능하다!!!)	
//Tv 클래스로 부터  변수 7개와 메소드 6개를 상속 받는다.
	boolean caption;
	void displayCaption(String text) {
		if(caption) {
		System.out.println(text);
		}
	}
}

