
public class Example5 {

	public static void main(String[] args) {
		/* 2���迭 + �⺻(Ŭ����)�޼ҵ� ����
		 
		 ��ϵ� ���� vip ���� ����Ʈ�� ����Ͻÿ�.
		 
		 user_list : ȫ�浿 �̼��� ������ ������ ������� ������ ����屺
		 user_level : gold vip guest gold vip vip guest
		 ��� : �̼���, �������, ������		 */

		String user[][]={
				{"ȫ�浿","�̼���","������","������","�������","������","����屺"},
				{"gold","vip","guest","gold","vip","vip","guest"}
		};		
		
		Example5 a=new Example5();
		a.vip(user);
		
	}

	public void vip(String lst[][] ) {
		
		int ea=lst[0].length;
			
		int w=0;
		
		while(w<ea) {
			
			if(lst[1][w].equals("vip")) {
				System.out.println(lst[0][w]);
				//=System.out.printf("%s ",lst[0][w]);
			}
			
			w++;
		}
		
		/*
		int gp=lst.length;
		
		while(w<gp) {
			int ww=0;
			while(ww<ea) {
				
				System.out.println(lst[w][ww]);
			
				ww++;
			}
			w++;
		}
			*/
	
	
	
	
	
	}
	
		
}