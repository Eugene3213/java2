import java.util.Arrays;

public class Example1 {

	public static void main(String[] args) {

		/*�迭+�⺻(Ŭ����)�޼ҵ� ����.
		  1���迭�� ������ ���� ���� �ֽ��ϴ�.
		  �迭����Ʈ 22 33 44 55 66 77 88 99 �̸� �ش� ��ü ���� ��� ���� ���հ� ���� ������ �޼ҵ�� ó�� �ǵ��� �մϴ�.
		  ��, �ݺ����� ������ do while������ �ۼ� �մϴ�.		 */

		int a []= {22,33,44,55,66,77,88,99};
		//void = ��ü���� + �ν��Ͻ�(�޸�) ���
		Example1 ex =new Example1();
		ex.plus(a); 
		
		/* static void ������ ��ü���� �ν��Ͻ� ��� �ʿ� X
		 plus();		 */
		 
	}
		
	public void plus(int[] aa) {
		//System.out.println(Arrays.toString(aa));
		int ea=aa.length;				//�迭 �����ľ�
		
		int w=0;
		int total=0;
		
		do {
			System.out.println(aa[w]);
			total=total+aa[w];
			
			w++;
		}while(w<ea);
		System.out.println("�� �հ�: "+total);
	}
	
}

		
