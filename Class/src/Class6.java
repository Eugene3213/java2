import java.util.Scanner;

public class Class6 {

	public static void main(String[] args) {
		//1.
		int num =3;
		datalist da= new datalist();
		da.array_data(num);
		
		//2.
		String pay="�ſ�ī��";
			if(pay.equals("�ſ�ī��")){
				da.pay1();					//�ش� ���ǿ� �´� �޼ҵ带 ȣ��
			}
			else {
				da.pay2();					//�޼ҵ忡 ��ü���� �¿��� ���� (��ü���� ���Ѵ�)
			}
		/* q. �ش� �ε��� class���� agrees ��� �̸��� ������ �ֽ��ϴ�. main �޼ҵ忡�� ����ڰ� "������","���Ǿ���"�� �Է��ϰ� �˴ϴ�. ���������� �Է� �Ǿ��� ��� "ȸ�������� ���� �˴ϴ�" ���
		 * �޼����� ����ϰ� , ���Ǿ����� �Է½� "���Ǹ� �ϼž� ���� �˴ϴ�" ��� ���.
		 * ��, agrees Ŭ���� �ȿ� void �޼ҵ� �Ѱ� �Ǵ� �ΰ��� �����Ͽ� �ڵ带 �����Ͻÿ�.	 */
			
		/*	String ag ="������";

			agrees agr= new agrees();
				
				if(ag.equals("������")) {
					agr.ag1();
				}
				else {
					agr.da1();
				}	*/
				
		Scanner sc = new Scanner(System.in);
				System.out.println("���� �Ͻðڽ��ϱ�");
				
				String atext =sc.next();
				agrees agr =new agrees();
				agr.ag(atext);
				
				sc.close();			
			
	}
	//�ʱ⹮�� 6/10����
	/*  1. Editor�� ����
	  	2. Database�� ����
	  	3. Java���� ����ϴ� �ڷ����� �ƴ� ����?
	  	4. Java���� ����ϴ� ���� �� �߸� �� ����?
	  	   Project��?
	  	   package��?
	  	   import��?
	  	   class��?
	    5. Java�� ���� ���� �� �߸� �Ȱ���? (Java����X. JavaƯ¡O)
	    6. ���� ���� �ڵ� �� �߸��� �κ���?
	 */

}

class datalist{
	//static �޼ҵ带 Ȱ���ϴ� ���� : ���� package���� �ش� �޼ҵ带 ���� ����ؾ��ϴ� �κп����� static�� �̿��Ͽ� ����մϴ�.
	
	/*static(�����޼ҵ�) : �������̵��� ����� �� ����
	void�� ���(�����޼ҵ�) : �������̵��� ����� �� ����
	
	�������̵� ��:
	class a{
	void �޼ҵ�
	}
	class b extend a {
	void �޼ҵ�
	}						*/
	
	
	//1.
	public void array_data(int a) {			//static ���� �޼ҵ�
		//System.out.println(a);
	
		int w=1;
		while(w<=9) {
			System.out.println(a*w);
			
			w++;
		}
	
	}
	
	//2.
	public void pay1() {
		System.out.println("�ſ�ī��� ���� �����մϴ�");
	}
	public void pay2() {
		System.out.println("���������� ���� �����մϴ�");
	}	
}


class agrees{
	
	
	/*public void ag1() {
		System.out.println("ȸ�������� ����˴ϴ�");
	}
	public void da1() {
		System.out.println("�����ϼž� ���� �����մϴ�");
	}
	
	*/
	
	
	public void ag(String k) {
		String msg;
		if(!k.equals("������")) {
			msg ="���Ǹ� �ϼž� ���� �մϴ�";
		}
		else {
			msg ="ȸ�������� ���� �˴ϴ�";
		}
		System.out.println(msg);
	}  
}