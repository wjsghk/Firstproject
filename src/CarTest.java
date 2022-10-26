
public class CarTest {

	public static void main(String[] args) {

		Car c1 = new Car();//객체생성 
		c1.model = "볼보";
		c1.color = "white";
		c1.ride = 4;
		c1.tire =4;
		c1.maxSpeed = 200;
		c1.trunk = 5000;
		c1.weight = 2000;
		c1.high = 500;
		c1.displace = 3000;
		c1.cc= 50;

		System.out.println(c1.model);
		System.out.println(c1.color);
		System.out.println(c1.ride);
		System.out.println(c1.tire);
		System.out.println(c1.maxSpeed);
		System.out.println(c1.trunk);
		System.out.println(c1.weight);
		System.out.println(c1.high);
		System.out.println(c1.displace);
		System.out.println(c1.cc);
		
	}

}
