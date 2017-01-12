package testProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SayInput {
	private int x;
	private int y;

	public void sayInput()throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("xの値を入力してください。");
		x = Integer.parseInt(br.readLine());
		System.out.println("yの値を入力してください。");
		y = Integer.parseInt(br.readLine());
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void sayInputX()throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		System.out.println("数値を入力してください。");
		x = Integer.parseInt(br.readLine());
	}

	public boolean numCheck(int xx)throws IOException{
		xx = this.getX();
		if(xx >= 0 && xx <= 100){
			return true;
		}else{
			return false;
		}
	}
}
