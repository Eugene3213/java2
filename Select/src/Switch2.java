import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {

		
		/* q. ����ڰ� ������ ���� ������ �޽��ϴ�.
		 * "1~5���� ���ڸ� �ϳ� �Է��� �ֽñ� �ٶ��ϴ�"
		 * 
		 * ���:
		 * 1: 5%��������
		 * 2: 10%��������
		 * 3,4: �ù�񹫷�
		 * 5: ������ȸ��				*/
		
		
		Scanner sc =new Scanner(System.in);
		
		int user;					//�����Է�
			System.out.println("1~5���� ���ڸ� �ϳ� �Է��� �ֽñ� �ٶ��ϴ�");
			user=sc.nextInt();
			
			
			switch(user) {
			
			case 1:
				System.out.println("5%��������");
				break;
			case 2:
				System.out.println("10%��������");
				break;
			case 3,4:
				System.out.println("�ù�񹫷�");
				break;
			case 5:
				System.out.println("������ȸ��");
				break;
				default:
			}
			
		sc.close();

		/* �ǹ�����
		Scanner sc =new Scanner(System.in);
		
		int user;					//�����Է�
			System.out.println("1~5���� ���ڸ� �ϳ� �Է��� �ֽñ� �ٶ��ϴ�");
			user=sc.nextInt();
			
			String msg;
			switch(user){
			
			case 1:
				msg = "5%��������";
				break;
			case 2:
				msg = "10%��������";
				break;
			case 3:
			case 4:
				msh = "�ù�񹫷�";
				break;
			default:
				msg = "������ȸ��";
				break;
			}
			sysout(msg); */
		
		
		// switch version����
		
		
		String msg;
		switch(user) {
		case 1 ->{
			msg = "5%��������";
		}
		case 2 ->{
			msg = "10%��������";
		}
		case 3,4 ->{
			msg = "������ȸ��";
		}
		
		}
		System.out.println(msg);
		sc.close();
		
		
	}

}
