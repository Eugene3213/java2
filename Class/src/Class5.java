import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Class5 {

	public static void main(String[] args) {
		
		Member2 mb2 =new Member2();		//static�� ���� �Լ� �̹Ƿ� ��ü �� �ν��Ͻ��� ����
		mb2.lists();					//�ν��Ͻ�(�޸�)�� �ִ� �޼ҵ带 �ε��ϰ� ��.
		
		Member2.lists2();				//�޸𸮿��� �ε�
		
		Member2.lists3("������",12345);
		
	/*q. for_in �Ϲ� �޼ҵ�(�޸�)�� �ֽ��ϴ�. ���α׷� ����� ������ ���� ������ �մϴ�. "����Ͻ� ������ ���ڸ� �ϳ� �Է��� �ּ���: "
	  [���] - �ش� �޼ҵ忡�� ����� ����ؾ���
	  ���� ����ڰ� 3���� �Է½� 3*1=3......3*9=27 ��� �Ǿ����.	for������ �ۼ� */
		
		
		Scanner sc=new Scanner(System.in);
			System.out.println("����Ͻ� �������� �Է����ּ���");
		int a=sc.nextInt();
		
		number.for_in(a);

		sc.close();
	}

}

class Member2{
	public void lists() {				//�޸𸮿� ������ �Ҵ���� �޼ҵ� �Լ��� ����
		String a= "ȫ�浿";
		System.out.println(a);
	}
	public static void lists2() {
		String a ="�̼���";
		System.out.println(a);
	}
	
	/*Member2�� �Ϲ� �Լ� (�޸�) list3. �޼ҵ� �ȿ� 3���� �ʵ带 �����մϴ�. ���� user_name ���� user_tel ���� user_point	 */
	public static void lists3(String nm, int pw){
		//nm�� �޼ҵ忡�� ���� �޴� ���� �ٷ� ����� ��� (nm.equals("������"))
		String user_name = nm;
		int user_pw = pw;			//�޼ҵ忡 ��ü���� ÷���Ͽ� �ε� �� �޼ҵ� �ȿ� ������ �ʵ���� �̿��Ͽ� ���� �޴� ����
		//int user_point;
			//System.out.println(user_name);
		if(nm.equals("������") && user_pw==12345) {
			System.out.println("ȸ�� Ȯ�� �Ǿ����ϴ�");
		}
		else {
			System.out.println("��ȸ�� �Դϴ�");
		}
		
	}
}

class number{
	
	public static void for_in(int z) {
		
		
		int b;
		int sum=1;
			for(b=1;b<=9;b++) {
				
				sum=sum*b;
				System.out.printf("%d*%d=%d " ,z, b,(z*b));
			}
	}
}
