
public class Example7 {

	public static void main(String[] args) {
		/* ������ �迭�� ���� + �ܺ� class �� �޼ҵ� ���
		 [data]
		 {"ȫ�浿","�հ�"},
		 {"�̼���","�հ�"},
		 {"������","���հ�"},
		 {"������","�հ�"},
		 {"������","���հ�"},
		 {"�庸��","���հ�"}
		 
		 ������ �迭 �����̸�, �ش� ���� �հ��ڸ� ��µǵ��� �մϴ�.
		 ��, �迭���� �ܺ� Ŭ���� �ȿ� �޼ҵ忡�� ó���� �ǵ��� �մϴ�.
		 ��� ; ȫ�浿 �̼��� ������		 */
		
		id nm=new id();
		id.name();
		
	/*	id i =new id();  				void ����
		i.name();
		i=null;	*/
	}

}
class id{
	public static void name() {
		String data[][]= {
				{"ȫ�浿","�հ�"},
				{"�̼���","�հ�"},
				{"������","���հ�"},
				{"������","�հ�"},
				{"������","���հ�"},
				{"�庸��","���հ�"}
		};
		
		int ea=data.length;
		
		int w=0;
		
		while(w<ea) {
			
			if(data[w][1].equals("�հ�")) {
				System.out.println(data[w][0]);
				//System.out.printf("%s�� %s �Դϴ�",data[w][0],data[w][1]);
			}
			
			w++;
		}
		
		
		
		
	}
}