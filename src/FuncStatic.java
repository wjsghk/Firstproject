
public class FuncStatic {
    int iv;
    static int cv;
    //����޼ҵ� 1)�ν��Ͻ� �޼ҵ忡����
    //         -�ν��Ͻ� ����,Ŭ���� ���� ��� ��밡��
   //          -�ν��Ͻ� �޼ҵ�,Ŭ���� �޼ҵ� ��� ��밡�� 
               
    //       2)����ƽ(=Ŭ����) �޼ҵ忡����  
    //         -��ü�������� ��밡���ϴ�.
    //         -Ŭ��������, Ŭ���� �޼ҵ常 ��밡�� 
    void instanceMethod() {//�ν��Ͻ� �޼ҵ�
    	System.out.println("instanceMethod()");
    	iv =10;
    	cv =20;
    	System.out.println("iv = " + iv);
    	System.out.println("cv = " + cv);
    	
    	staticMethod();//��ü���� 
    }
    static void staticMethod(){//����ƽ(=Ŭ����) �޼ҵ�  
    	System.out.println("staticMethod()");
    	//iv =30; ////����ƽ �޼ҵ忡���� �ν��Ͻ� ������ ���������� �޶� ��� �Ұ�
    	cv =40;
    	System.out.println("cv = " + cv);
    //	instanceMethod(); //����ƽ �޼ҵ忡���� �ν��Ͻ� ������ ���������� �޶� �ν��Ͻ� �޼ҵ� ���Ұ�
    }

}
