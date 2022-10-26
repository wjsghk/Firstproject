
public class OverlodingTest {

	public static void main(String[] args) {
		Overloding ol = new Overloding();
		
		ol.add();
		ol.add(3);
		ol.add(3L);
		ol.add(2,3);
		ol.add(2,3L);
		ol.add(2L,3);
		 
	}

}
