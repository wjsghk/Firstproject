
public class StudentTest1 {

	public static void main(String[] args) {
		//국어 : 100
		//영어 : 60
		//수학 : 76
		
		//실행결과 
		//이름 : 홍길동
		//총점 : 236
		//평균 : 78.7(소수점 2째자리에서 반올림한다.)
		
		Student1 st = new Student1("홍길동",1,1,100,60,76);
		System.out.println("이름 : " + st.name);
		System.out.println("총점 : " + st.getTotal());
		System.out.println("평균 : " + st.getAverage());
	}
	

}
