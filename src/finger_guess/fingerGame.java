package finger_guess;

import java.util.Scanner;

public class fingerGame
{
	public static void main(String[] arge)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("**************��ȭ��Ϸ************");
		System.out.println("���ȭ1.����  2.ʯͷ  3.��");
		int person=in.nextInt();
		int computer=(int)(Math.random()*3)+1;
		if(person>3)
		{
			System.out.println("������ʣ�������");
			System.out.println("���ȭ1.����  2.ʯͷ  3.��");
			int person1=in.nextInt();
			int computer1=(int)(Math.random()*3)+1;
			String Marks="ȭͷ";//����һ����־;
			String Marks2="ȭͷ";//��ͬʱҲ��һ����־
			switch(person1){
				case 1:
				Marks="����";
				break;
				case 2:
				Marks="ʯͷ";
				break;
				case 3:
				Marks="��";
				break;		
			}
			switch(computer1){
				case 1:
				Marks2="����";
				break;
				case 2:
				Marks2="ʯͷ";
				break;
				case 3:
				Marks2="��";
				break;
			}
			System.out.println("������ǣ�"+Marks);	
			System.out.println("���Գ����ǣ�"+Marks2);	
			if(person==computer){
				System.out.println("��͵��Դ��ƽ�֡�");
			}else if(person==1&&computer==3||person==2&&computer==1||person==3&&computer==2){
				System.out.println("��Ӯ�ˣ�������ơ�");	
			}else if(person==2&&computer==3||person==3&&computer==1||person==1&&computer==2){
				System.out.println("�����ˣ����ܳԷ���");
			}
		}else
			{
			String Marks="ȭͷ";//����һ����־;
			String Marks2="ȭͷ";//��ͬʱҲ��һ����־
			switch(person){
				case 1:
				Marks="����";
				break;
				case 2:
				Marks="ʯͷ";
				break;
				case 3:
				Marks="��";
				break;		
			}
			switch(computer){
				case 1:
				Marks2="����";
				break;
				case 2:
				Marks2="ʯͷ";
				break;
				case 3:
				Marks2="��";
				break;
			}
			System.out.println("������ǣ�"+Marks);	
			System.out.println("���Գ����ǣ�"+Marks2);	
			if(person==computer){
				System.out.println("��͵��Դ��ƽ�֡�");
			}else if(person==1&&computer==3||person==2&&computer==1||person==3&&computer==2){
				System.out.println("��Ӯ�ˣ�������ơ�");	
			}else if(person==2&&computer==3||person==3&&computer==1||person==1&&computer==2){
				System.out.println("�����ˣ����ܳԷ���");
			}
		}		
	}
}