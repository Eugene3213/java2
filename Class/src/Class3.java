
public class Class3 {

	public static void main(String[] args) {

		//�ڷ���(��������) ��ȯ
		//double -> int�� ��ȯ
		double a = 137.5;
		int b = (int)a;	
			System.out.println(b);
			
		//int -> double�� ��ȯ
		int c=35;
		double d=(double)c;
			System.out.println(d);
			
		//String -> int
		String x = "35";
		String x2 = "156";
		
		int z = Integer.parseInt(x);				//parseint : int���� ����ϴ� ������� ���
		//int z = Integer.valueOf(x);					//valueof �޼ҵ�(�޼ҵ��Լ�) -> parseint
		
		int total = Integer.parseInt(x) + Integer.parseInt(x2);		//�������� ���ڷ� ��ȯ�Ͽ� �������� ó����
			System.out.println(total);
		
		
		String j = "123456789";
		String j2 ="123456789";
		//int total2 = Integer.parseInt(j2) + Integer.parseInt(j);
		long total2 =Long.parseLong(j) + Long.parseLong(j2);				//Long ���� Long.parselong �����	
		double total3=(double)total2;	
			System.out.println(total2);
			System.out.println(total3);
		
		
		//����(char) -> ����(String) //�� �Ⱦ���. �˾Ƹ� ����.,0
		char p ='b';
		String f =String.valueOf(p);					//���� -> ����(Valueof�� ���)
			System.out.println(p);
		
		
		
	}

}
