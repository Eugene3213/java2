import java.util.Arrays;
import java.util.Scanner;

public class Class_array1 {

	public static void main(String[] args) {
		//Ŭ���� + �޼ҵ� + �迭
		
		
		/*q.����ڰ� �̸��� �Է��մϴ�.
		  ����� �̸��� �ش� Ŭ������ ������ ��ϵ� ��������� �̰����� ����������� Ȯ���ϴ� �ڵ带 �ۼ��Ͻÿ�.
		  ��ϵ� ������� ��� "������ �Ǿ��ֽ��ϴ�"��� ����ϰ�
		  �̵�� ������� ��� "�̰����� �Դϴ�"��� ���		 */
		
		Scanner sc = new Scanner(System.in);
			System.out.println("�̸��� �Է��ϼ���");
		String user_name =sc.next();
			
		String users[] = {"ȫ�浿","�̼���","������"};
		arrays.lists(users,user_name);
		
		
		
		sc.close();
			
		
	}

}

class arrays{
	public static void lists(String a[], String data) {
		//System.out.println(Arrays.toString(a));
	
		int w= 0;
		int ea=a.length;
		String msg="";				//�޼ҵ�� �ش� ���� ���� �Ҷ��� ����ִ� ���� ��Ȯ�ϰ� �����ؾ� ��.
		//String: "" or null   	int: 0 ���� ǥ��
		boolean ck =false;
		while(w<ea) {
			if(data.equals(a[w])) {
				msg="������ �Ǿ����ϴ�";
				ck=true;
			}
			else
			
			w++;
		}
		if(ck==false) {
			msg="�̵�� ������ �Դϴ�";
		}
		arrays ar = new arrays();
		ar.message(msg);
	}
	public void message(String m) {
		System.out.println(m);
	}
	
	
	
}
	
	
	
	
	


			