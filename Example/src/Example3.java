import java.util.Arrays;

public class Example3 {

	public static void main(String[] args) {
		/* �迭 + �⺻(Ŭ����)�޼ҵ� ����
		 product : ����,����,���,��,����,Ű��,�ٳ���,����
		 money : 35000 8000 4000 5500 3800 4400 11000 18900
		 ��ٱ��Ͽ� �ش� ��ǰ�� ��� ��ҽ��ϴ�.
		 ��, �� �� ����� �ٳ����� �����ϰ� �� ���� �ݾ��� ����Ͻÿ�.  ����: 75600	 */
		
		String product[]= {"����","����","���","��","����","Ű��","�ٳ���","����"};
		int money[]= {35000, 8000, 4000, 5500, 3800, 4400, 11000, 18900};

		totals(product,money);
	}
	
	public static void totals(String[] p,int[] m) {
		//System.out.println(Arrays.toString(pd,mn));
		
		int ea=p.length;				//���� �迭����
		int w =0;
		
		int total=0;					//�հ�
		
		
		while(w<ea) {
			//System.out.println(pd[w]);
			if(!p[w].equals("���") && !p[w].equals("�ٳ���")) {
				//System.out.println(p[w]);
				total=total+m[w];
			}				
			w++;
		}
		System.out.println("�� �հ�: "+total);
				
	}
}
	
	
	
	
	


