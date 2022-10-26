
public class Student1 {
	String name;//학생 이름 
	int ban;//반
	int no;//번호
	int kor;//국어점수
	int eng;//영어점수
	int math;//수학점수
	
	Student1(String name,int ban,int no,int kor,int eng,int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		return kor + eng + math;
	}
	double getAverage() {
		return(int)( getTotal()/ 3.0 * 10 + 0.5)/10.0;//78.7
	}
	//평균점수 구하는 방법
//	78.66664*10//786.6664
//	786.6666+0.5//787.16664
//   (int)787.16664//787
//   787/10.0//78.7



}
