import java.util.Arrays;

public class Array6 {

	public static void main(String[] args) {

		/*q. ������ ��ٱ��Ͽ� �������� ��ǰ�� ����� �ֽ��ϴ�.
		 * �� �� �ù�� ������ �����Ǵ� �ݾ׸� �����Ͻÿ�.
		 * ����� 30000 �����̻�(����)
		 * 15000 48000 67000 8000 118200 49800 6000 18700
		 * 
		 * [48000,67000,118200,49800]		 */
		
		
		int a[] = {15000,48000,67000,8000,118200,49800,6000,18700};
		int a_ae= a.length;
		int w=0;
		
		int b[] = new int[4];
		
		int ct=0;
		while(a_ae>w) {
			//System.out.println(a[w]);
			
			if(a[w]>=30000) {
				b[ct]=a[w];
				ct++;
			}
			w++;
		}
		System.out.println(Arrays.toString(b));	
		
		
		
		
		
		

	}

}
