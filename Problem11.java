package testProgram;

public class Problem11 {
	public static void main(String[] args){
		System.out.println("Hello World :)");
	}
}

class Problem12{
	public static void main(String[] args){
		int x = 11;
		System.out.println("x=" + x);
	}
}

class Problem13{
	public static void main(String[] args){
		int x = 13;
		int y = 17;

		System.out.println("x=" + x + ",y=" + y );
	}
}
class Problem14{
	public static void main(String[] args){
		int x = 13 + 17;
		System.out.println("x=" + x);
	}
}
class Problem15{
	public static void main(String[] args){
		System.out.println(13*17);
	}
}
class Problem16{
	public static void main(String[] args){
		int x = 7;
		int y = x*3;
		System.out.println(y);
		int z = x/2;
		System.out.println(z);
	}
}
class Problem17{
	public static void main(String[] args){
		int x = 6;
		int y = 9;
		int z = x;

		x = y;
		y = z;

		System.out.println("x=" + x + ", y=" + y);
	}
}
class Problem18{
	public static void main(String[] args){
		int x = 19;
		int y = 23;
		int z = x*y;
		System.out.println("z=" + z);
	}
}
class Problem19{
	public static void main(String[] args){
		int x = 6;
		System.out.println(x*2);
		System.out.println(x*3);
		System.out.println(x*4);
	}
}
class Problem110{
	public static void main(String[] args){
		//Math.powも使用可
		int x = 6;
		int y = x;

		for (int i=0; i<2; i++){
			x *= y;
		}

		System.out.println("x=" + x);
	}
}
class Problem111{
	public static void main(String[] args){
		int x = 6;
		System.out.println(x/4);
		System.out.println(x%4);
	}
}
class Problem112{
	public static void main(String[] args){
		int x = 6;
		x++;
		System.out.println(x);
		x--;
		x--;
		System.out.println(x);
	}
}

