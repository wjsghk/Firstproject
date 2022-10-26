
public class FuncStatic {
    int iv;
    static int cv;
    //멤버메소드 1)인스턴스 메소드에서는
    //         -인스턴스 변수,클래스 변수 모두 사용가능
   //          -인스턴스 메소드,클래스 메소드 모두 사용가능 
               
    //       2)스태틱(=클래스) 메소드에서는  
    //         -객체생성없이 사용가능하다.
    //         -클래스변수, 클래스 메소드만 사용가능 
    void instanceMethod() {//인스턴스 메소드
    	System.out.println("instanceMethod()");
    	iv =10;
    	cv =20;
    	System.out.println("iv = " + iv);
    	System.out.println("cv = " + cv);
    	
    	staticMethod();//객체생성 
    }
    static void staticMethod(){//스태틱(=클래스) 메소드  
    	System.out.println("staticMethod()");
    	//iv =30; ////스태틱 메소드에서는 인스턴스 변수를 생성시점이 달라서 사용 불가
    	cv =40;
    	System.out.println("cv = " + cv);
    //	instanceMethod(); //스태틱 메소드에서는 인스턴스 변수를 생성시점이 달라서 인스턴스 메소드 사용불가
    }

}
