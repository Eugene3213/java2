import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		/*
		 2�� �迭�̸�, 2�� �迭 �����ʹ� ������ �����ϴ�.
		 user_list : ȫ�浿 �̼��� ������ ������ ������� ������ ����屺
		 user_point : 3000 1000 25000 19800 5750 3630 0
		 
		 ���α׷� ���۰� ���ÿ� 
		 "����Ʈ�� �˻��� ������ �Է��ϼ���"
		 �Է��� ���� ������ Class�� �����Ͽ� �ش� �޼ҵ� ������ �Ű������� �̿��Ͽ� ���� �� �ش� ������� ���	 */
		
		Scanner sc=new Scanner(System.in);
			System.out.println("����Ʈ�� �˻��� ������ �Է��ϼ���");
			String a=sc.next();
		
		point.name(a);
		
		sc.close();
		
	}

}
class point{
	
	public static void name(String nm) {
		String data[][]= {
				{"ȫ�浿","�̼���","������","������","�������","������","����屺"},
				{"3000","1000","25000","19800","5750","3630","0"}
		};
		
		int ea=data[0].length;
		int w=0;
			
		
		while(w<ea) {
			
			if(nm.equals(data[0][w])) {
				System.out.printf("%s ���� ����Ʈ�� %s �Դϴ�",data[0][w],data[1][w]);
			}
			w++;
		}
	}
}