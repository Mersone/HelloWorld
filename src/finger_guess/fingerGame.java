package finger_guess;

import java.util.Scanner;

public class fingerGame
{
	public static void main(String[] arge)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("**************猜拳游戏************");
		System.out.println("请出拳1.剪刀  2.石头  3.布");
		int person=in.nextInt();
		int computer=(int)(Math.random()*3)+1;
		if(person>3)
		{
			System.out.println("你个斗笔，真幼稚");
			System.out.println("请出拳1.剪刀  2.石头  3.布");
			int person1=in.nextInt();
			int computer1=(int)(Math.random()*3)+1;
			String Marks="拳头";//这是一个标志;
			String Marks2="拳头";//这同时也是一个标志
			switch(person1){
				case 1:
				Marks="剪刀";
				break;
				case 2:
				Marks="石头";
				break;
				case 3:
				Marks="布";
				break;		
			}
			switch(computer1){
				case 1:
				Marks2="剪刀";
				break;
				case 2:
				Marks2="石头";
				break;
				case 3:
				Marks2="布";
				break;
			}
			System.out.println("你出的是："+Marks);	
			System.out.println("电脑出的是："+Marks2);	
			if(person==computer){
				System.out.println("你和电脑打成平局。");
			}else if(person==1&&computer==3||person==2&&computer==1||person==3&&computer==2){
				System.out.println("你赢了！你个逗逼。");	
			}else if(person==2&&computer==3||person==3&&computer==1||person==1&&computer==2){
				System.out.println("你输了！不能吃饭。");
			}
		}else
			{
			String Marks="拳头";//这是一个标志;
			String Marks2="拳头";//这同时也是一个标志
			switch(person){
				case 1:
				Marks="剪刀";
				break;
				case 2:
				Marks="石头";
				break;
				case 3:
				Marks="布";
				break;		
			}
			switch(computer){
				case 1:
				Marks2="剪刀";
				break;
				case 2:
				Marks2="石头";
				break;
				case 3:
				Marks2="布";
				break;
			}
			System.out.println("你出的是："+Marks);	
			System.out.println("电脑出的是："+Marks2);	
			if(person==computer){
				System.out.println("你和电脑打成平局。");
			}else if(person==1&&computer==3||person==2&&computer==1||person==3&&computer==2){
				System.out.println("你赢了！你个逗逼。");	
			}else if(person==2&&computer==3||person==3&&computer==1||person==1&&computer==2){
				System.out.println("你输了！不能吃饭。");
			}
		}		
	}
}