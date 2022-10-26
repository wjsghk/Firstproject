
public class Product {
	static int count = 0;
	int serial;
	
	{
		++count;
		serial = count;
	}
}
