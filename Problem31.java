package testProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem31 {
	public static void main(String[] args)throws IOException{

		SayInput si = new SayInput();

		si.sayInput();

		int x = si.getX();
		int y = si.getY();

		if ( x > y){
			System.out.println("xはyより大きい");
		}else{
			System.out.println("xはy以下");
		}

	}
}
class Problem32 {
	public static void main(String[] args)throws IOException{

		SayInput si = new SayInput();

		si.sayInput();

		int x = si.getX();
		int y = si.getY();

		if ( x > y){
			System.out.println(x);
		}else if (y > x){
			System.out.println(y);
		}else if (x == y){
			System.out.println("xとyは等しい。");
		}

	}
}
class Problem33 {
	public static void main(String[] args)throws IOException{

		SayInput si = new SayInput();

		si.sayInput();

		int x = si.getX();
		int y = si.getY();

		if ( x > y){
			System.out.println("xはyより大きい");
		}else if (y > x){
			System.out.println("xはyより小さい");
		}else if (x == y){
			System.out.println("xとyは等しい。");
		}
	}
}
class Problem34 {
	public static void main(String[] args)throws IOException{

		SayInput si = new SayInput();

		si.sayInput();

		int x = si.getX();
		int y = si.getY();

		if ( x > y){
			System.out.println("xはyより大きい");
		}else if (y > x){
			System.out.println("xはyより小さい");
		}else if (x == y){
			System.out.println("xとyは等しい。");
		}
	}
}
class Problem35 {
	public static void main(String[] args)throws IOException{
		SayInput six = new SayInput();
		six.sayInputX();
		int x = six.getX();
		int r = x % 2;

		if (r == 0){
			System.out.println("入力された値は「偶数」です。");
		}else{
			System.out.println("入力された値は「奇数」です。");
		}
	}
}
class Problem36 {
	public static void main(String[] args)throws IOException{
		SayInput six = new SayInput();
		six.sayInputX();
		int x = six.getX();
		int r = x % 2;

		if (r == 0){
			if(x >=0){
				System.out.println("入力された値は「正の偶数」です。");
			}else{
				System.out.println("入力された値は「負の偶数」です。");
			}
		}else{
			if(x >=0){
				System.out.println("入力された値は「正の奇数」です。");
			}else{
				System.out.println("入力された値は「正の奇数」です。");
			}
		}
	}
}
class Problem37 {
	public static void main(String[] args)throws IOException{
		SayInput six = new SayInput();
		six.sayInputX();
		int x = six.getX();
		boolean numCheck = six.numCheck(x);

		//case1
		if(numCheck){
			if(x >= 60){
				System.out.println("合格");
			}else{
				System.out.println("不合格");
			}
		}else{
			System.out.println("0～100点の間で入力");
		}

		//case2
		if(numCheck){
			if(x >= 80){
				System.out.println("たいへんよくできました。");
			}else if(x < 80 && x >= 60){
				System.out.println("よくできました。");
			}else{
				System.out.println("ざんねんでした。");
			}
		}else{
			System.out.println("0～100点の間で入力");
		}

		//case3
		if(numCheck){
			if(x >= 80){
				System.out.println("優");
			}else if(x >= 70){
				System.out.println("良");
			}else if (x >= 60){
				System.out.println("可");
			}else{
				System.out.println("不可");
			}
		}else{
			System.out.println("0～100点の間で入力");
		}
	}
}
class Problem38 {
	public static void main(String[] args)throws IOException{
		 SayInput si = new SayInput();

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("中間試験の点数？");
		 int x = Integer.parseInt(br.readLine());
		 System.out.println("期末試験の点数？");
		 int y = Integer.parseInt(br.readLine());

		 boolean numCheckX = si.numCheck(x);
		 boolean numCheckY = si.numCheck(y);

		 int scoreTtl = x + y;

		 if(numCheckX && numCheckY){
			 if(scoreTtl >= 130){
				 System.out.println("合格");
			 }else if(scoreTtl >= 100){
				 if(x >= 90 || y >= 90){
					 System.out.println("合格");
				 }else if(x >= 60 && y >= 60){
					 System.out.println("合格");
				 }else{
					 System.out.println("不合格");
				 }
			 }else{
				 System.out.println("不合格");
			 }
		 }else{
			 System.out.println("0～100点の間で入力");
		 }
	}
}
class Problem39 {
	public static void main(String[] args)throws IOException{
		 SayInput si = new SayInput();

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("中間試験の点数？");
		 int x = Integer.parseInt(br.readLine());
		 System.out.println("期末試験の点数？");
		 int y = Integer.parseInt(br.readLine());

		 boolean numCheckX = si.numCheck(x);
		 boolean numCheckY = si.numCheck(y);

		 int scoreTtl = x + y;

		 if(numCheckX && numCheckY){
			 if(scoreTtl >= 130){
				 System.out.println("合格");
			 }else if(scoreTtl >= 100){
				 if(x >= 90 || y >= 90){
					 System.out.println("合格");
				 }else if(x >= 60 && y >= 60){
					 System.out.println("合格");
				 }else{
					 System.out.println("不合格");
				 }
			 }else{
				 System.out.println("不合格");
			 }
		 }else{
			 System.out.println("0～100点の間で入力");
		 }
	}
}