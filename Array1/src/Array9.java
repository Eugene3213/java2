import java.util.Arrays;

public class Array9 {

	public static void main(String[] args) {

		/*q. �ΰ��� ������ �迭�� �ֽ��ϴ�. �ش� ������ �迭�� ���� ���ó�� ���� ����Ͻÿ�
		 
		 1�� DATA : ���ѹα� �Ϻ� �߱� ��Ʈ�� �±�
		 2�� DATA ; 40 35 70 55 32
		 ��� DATA ; ["���ѹα�(40)","�Ϻ�(35)","�߱�(70)","��Ʈ��(55)","�±�(32)"]		 */

		
		String data[][]= {
				{"���ѹα�","�Ϻ�","�߱�","��Ʈ��","�±�"},
				{"40","35","70","55","32"}
		};
		int ar =data.length;
		int ar2 =data[0].length;
		
		String newdata[]=new String[data[0].length]; 	
		
		int w=0;
		do {

			int ww=0;
			do {
				System.out.println(data[w][ww]);
				newdata[ww] =data[0][ww] + "(" + data[1][ww] + ")";
					
				ww++;
			}while(ww<ar2);
			
				
			
			w++;
		}while(w==0);
		
		System.out.println(Arrays.toString(newdata));
		
		
//		int a=stress.length;
//		int b=stress.length;
//		
//		int c,cc;
//		
//		for(c=1;c<a;c++) {
//			
//			for(cc=1;cc<b;cc++) {
//				
//			}
//		}
//		System.out.println(c);
		
		
		/*q. �ش� �ΰ��� �迭 �����Ͱ� �ֽ��ϴ�. �� �迭���� �ε����� ���� ��ȣ�� ���ؼ� ¦��,Ȧ�������� �迭�� ��� �����ͷ� �缳�� �Ͻʽÿ�.
		 
		 Adata = 5 17 19 22 33
		 Bdata = 1 2 3 4 5
		 Result =["¦��","Ȧ��","Ȧ��","�ۼ�","¦��"]		 */
		
		
		int A1[][]= {
				{5,17,19,22,33},
				{1,2,3,4,5}
		};
				
		int data_ea=A1[0].length;
		int f=0;
		int total;
		String result;
		String result_data[]=new String[5];
		
		while(f<data_ea) {
			total =A1[0][f]+A1[1][f];
			
			if(total%2==0) {
				result="¦��";
			}
			else{
				result="Ȧ��";
			}
			result_data[f]=result;
			
			f++;
		}
		 
		System.out.println(Arrays.toString(result_data));
		
		
		
		
		
		
	}

}
