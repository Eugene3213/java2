import java.util.Arrays;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		/* �⺻(Ŭ����) �޼ҵ� ����
		 ����ڰ� ���� ������ ���� �Է��ϰ� �˴ϴ�.
		 "�б� �׻� �̸��� �Է��� �ּ���"
		 �� �迭 �����ʹ� 5���� ���� �Ǿ����ϴ�.
		 ������ �޼ҵ忡�� �ش� ����ڰ� �Է��� ���� ����Ʈ�� �����Ͽ� ����Ͻÿ�. 
		 
		 ����) ����ڰ� �Է��� ���� ; hong kim park lee jang
		 ���) hong,kim,park,lee,jang		 */
		 
 
		
		Scanner sc = new Scanner(System.in);
		
		String lists ="";
		int w;
		
		for(w=0;w<=4;w++) {
			System.out.println("�б� �л� �̸��� �Է��� �ּ���");
			String nm=sc.next();
			lists= lists+(nm+" ");
		}
		System.out.println(lists);
		arrays(lists);
	}
		
	public static void arrays(String lst) {
		System.out.println(lst);
		
		lst=lst.trim();
			System.out.println(lst);
		
		String userin[] =lst.split("\\s+");							//split : ���ڿ� �Ǵ� ���ڿ��� Ư�� ���� �������� �迭�� ���� �� �ִ� ��ɾ�.
			System.out.println(Arrays.toString(userin));
		
		
				
		
			

		
	}
}
