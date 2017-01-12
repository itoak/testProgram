package testProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem21{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		System.out.println("nanika nyuryoku shitekudasai");
		String s = new String( br.readLine());
		System.out.println("入力値は"+ s +"です。");
	}
}
class Problem22{
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Pls input integer whichever you like");
		int x = Integer.parseInt(br.readLine());
		System.out.println("入力された数字は"+ x +"です。");
	}
}
class Problem23{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		System.out.println("Pls input integer whichever you like");
		int x = Integer.parseInt(br.readLine());
		int y = x;
		System.out.println("入力された数字は"+ x +"です。");
		System.out.println("入力された数字の1乗は"+ x +"です。");
//		for(int i=2; i<=3; i++){
//			x *= y;
//			System.out.println("入力された数字の"+ i +"乗は"+ x +"です。");
//		}
		int i = 2;
		do{
			x *= y;
			System.out.println("入力された数字の"+ i +"乗は"+ x +"です。");
			i++;
		}while(i<7);
	}
}
class Problem24{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("xの値を入力してください。");
		int x = Integer.parseInt(br.readLine());
		System.out.println("yの値を入力してください。");
		int y = Integer.parseInt(br.readLine());

		int wa = x + y;
		int sa = x - y;
		int seki = x * y;
		int show = x / y;
		int amari = x % y;

		System.out.println("x と y の「和」："+ wa);
		System.out.println("x と y の「差」："+ sa);
		System.out.println("x と y の「積」："+ seki);
		System.out.println("x と y の「商」："+ show +"、「余り」："+ amari);
	}
}
class Problem25{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		System.out.println("xの値を入力してください。");
		int x = Integer.parseInt(br.readLine());
		System.out.println("yの値を入力してください。");
		int y = Integer.parseInt(br.readLine());

		int avg = (x + y) / 2 ;

		System.out.println("xとyの平均値は、"+ avg +"です。");
	}
}
class Problem26{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		System.out.println("年齢を入力してください。");
		int age = Integer.parseInt(br.readLine());
		int daysFromBd = age * 365;
		System.out.println("生まれてからの日数、およそ："+ daysFromBd);
	}
}

