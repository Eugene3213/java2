import java.util.Random;
import java.util.Scanner;

public class Class_array2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
			System.out.println("0~10���� ���ڸ� �ϳ� �����ϼ���");
		int no =sc.nextInt();
		
		
		
		memories m =null;
		m= new memories();
		m.ms(no);
		m= null; 			//�ش� �ν��Ͻ��� ���.

	
	
		//2.
		m =new memories();
		m.rd();
	
	
	
	}
}

class memories{
	public void ms(int user) {
		//Math.random() �����޼ҵ� ���� �⺻�� �ڷ��� double�Դϴ�.
		// random -> �����ڵ�, �����ڵ�, ��÷, �귿
		double a= Math.random();				//0.0 ~ 1.0
		int b = (int)(Math.random()*10);		//0~10 (��ȣ �� ����) double -> int ����
		System.out.println(b);
		
		if(user==b) {
			System.out.println("��÷");
		}
		else {
			System.out.println("������ȸ��");
		}
	}
	
	public void rd() { 				//random util ����
		Random r= new Random();		//ramdom ��ü ���� �� �ν��Ͻ� ����
		System.out.println(r.nextInt(10)+1);			//0~9���� r.nextint�� ���
		
		r=null;
	
	}
}