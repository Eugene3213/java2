
public class Switch3 {

	public static void main(String[] args) {

		//case�ȿ� ������ �ݺ����� ����� �� �ֽ��ϴ�. ���� ������ �������� ����ص� �ǰ�, case���� �ٸ��� �۵��ϱ� ������ ������ �Ǵ� ������ �����ϴ�.
		//��, case�� �ϳ��� ������ ���� ��� ������ case�� ���� �۵����� ����.

		String sign="*";
		int total;
		switch(sign) {
		
		case "+" ->{
			int f;
			total=0;
			for(f=1;f<=5;f++) {
				total += f;
			}
			System.out.println("�� 1~5���� ���� ���� "+total);
		}
		case "-" -> {
			total=0;
			System.out.println("�������� ��� ���� �ʽ��ϴ�");
		}
		case "*" -> {
			total=1;
			int f=1;
			
			do {
				total=total*f;
				
				f++;
			}while(f<=5);
			System.out.println("�� 1~5���� ���� ���� "+total);
		}
		case "/" -> {
			total=0;
		}
		
		}
	}

}
