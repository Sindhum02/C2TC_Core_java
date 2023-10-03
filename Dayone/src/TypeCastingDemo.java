
public class TypeCastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//implict casting = widening casting
		byte b= 10;//1byte=8bits
		int i= b;
		
		float f = 22.14f;
		double d = f;
		
		char ch = 'A';//char=2bytes//int=4bytes
		int ione=ch;//implicit
		
		//explicit casting or narrowing casting =it works both with size and type 
		
		double done=10.52f;//implicit or widening casting
		long l = (long)done; //long=8byte,double=8byte
		System.out.println(done);
		System.out.println(l);
		
		long lone= 9233720;
		int itwo=(int)lone;//long=8bytes,int =4 bytes
		
		byte bone=90;//byte=1byte=8bits
		char chone= (char)bone;//char=2 bytes

	}

}
