package ex;

import java.util.Scanner;

/*
 * Topic: 假設某個停車場的費率是停車2小時以內，每半小時30元，超過2小時，但未滿4小時的部份，
 * 	每半小時40元，超過4小時以上的部份，每半小時60元，未滿半小時部分不計費。
 * 	如果您從早上10點23分停到下午3點20分，請撰寫程式計算共需繳交的停車費。
 * Date: 2016/09/26
 * Author: 105791120 楊鈺瑩
 */

public class ex03_1050210XX {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		 
		int a=sca.nextInt();
		int x=(int) Math.floor(a/30);
		//System.out.print(x);
		
		if(x<4)
		{
			 int m=(x-1)*30;
			System.out.print("停車費為："+m);
		}
		else if(a>=4&&a<8)
			{
				int m=(x-3)*40+60;
				System.out.print("停車費為：" + m);
			}
			else if(a>=8)
				{
					int m=(x-6)*60+160;
					System.out.print("停車費為："+m);
					
				}
			
	}

}
