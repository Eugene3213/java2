
public class Array2 {

	public static void main(String[] args) {

		// hong kim park lee jang jung �迭�ۼ�

		String id[]= {"hong","kim","park","lee","jang","jung"};
		
		int word =id[4].length();
		//System.out.println(word);
		
		
		
		
		// q. �ش� ����� ����Ʈ �迭�� �ֽ��ϴ�. �ش� �迭�� �� ����� ���̵� ������ �̻� ��½�Ű�ÿ�. 
		
		int member = id.length;		//��ü ȸ������ �ľ��ϱ� ����
		int w=0;
		int word3;					//������ �迭 �������� ���� �����ľ�
		
		while(w<member) {
			word3=id[w].length();	//���� �����ľ�
			
			if(word3 > 3) {			//������ �̻��� �����͸� ���
				//System.out.println(id[w]);
			}
				
			w++;
		}
			
			
		/* q. �迭�����ʹ� ������ ����
		 * 15 60 11 14 27
		 * ���� ������ ���� ��� ���ؼ� ���� ������� ����Ͻÿ�		 */
	
		int data[]= {15,60,11,14,27};
		int data_ea = data.length;
			//System.out.println(data_ea);
		
		int total=0;					//�հ�
		int dw=0;
		
		while(dw<data_ea) {
			System.out.println(data[dw]);
			
			total=total+data[dw];
		
			dw++;
		}
	
		System.out.println("�� �հ�: " + total);
	
	}

}
