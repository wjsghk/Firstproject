//Time Ŭ������ �����  =>Time Ŭ���� �ȿ� �����ִ� �����ϱ�
public class TimeTest {

	public static void main(String[] args) {
		
		//Time t1,t2,t3;//time ����
		Time[]time = new Time[3];//[3]= 3�迭�����϶�~     () ��ü ������ TvTest�� ��
		for(int i=0;i<time.length;i++) {//Time t1,t2,t3;//time ������ �ݺ��� ���·� �ٲ۰�
			time[i]=new Time();//for���� ���๮
		}
		//time[0] = new Time(); //time ����,  time[0]�� hour,minute ,second�� �迭�ȴ�
		time[0].hour = 10;
		time[0].minute= 29;
		time[0].second= 33;
		
		//time[1] = new Time();
		time[1].hour = 3;
		time[1].minute = 45;
		time[1].second = 11;
		
		//time[2] = new Time();
		time[2].hour = 5;
		time[2].minute = 15;
		time[2].second = 53;
		
		for(Time t : time) {//each for ��  =>for(���� : �迭���۷���){�ݺ��۾���} åp135  
			System.out.println(t.hour + "�� " + t.minute + "�� " + t.second + "�� ");
		}
		System.out.println(time[0].hour + "�� " + time[0].minute + "�� " + time[0].second + "�� ");
		System.out.println(time[1].hour + "�� " + time[1].minute + "�� " + time[1].second + "�� ");
		System.out.println(time[2].hour + "�� " + time[2].minute + "�� " + time[2].second + "�� ");
	}

}
