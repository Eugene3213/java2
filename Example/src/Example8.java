
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Example8 {

	public static void main(String[] args) {
		/*���� ����� ���� ���� ���α׷��� ��û�Ͽ����ϴ�.
		 ����ڰ� �� 5���� ���ڸ� �Է��ϰ� �˴ϴ�.
		 "1~46 �� ������ ���ڸ� �Է��� �ּ���"
		 ����ڰ� �Է��� 5���� ���ڸ� �迭�� �����Ͻÿ�. ( main�� ó��)
		 
		 �ܺ� class�� �̿��Ͽ� pc�� ���� ��÷ ��ȣ 5���� �����ϰ� �̾Ƴ��ϴ�.
		 pc�� ���� �ټ����� ���ڸ� �迭�� �����Ͻÿ�.(�ܺ� class method�� ����)
		 
		 ������ ��� method�� �ϳ� �� �����Ͽ� ����ڰ� �Է��� 
		 �ټ����� �����Ϳ� PC�� ���� �迭 �����͸� �ش� method�� �����Ͽ� ���.
		 
		 ��, ��� ����ϴ� �ݺ����� ������ do while������ �ۼ�.		 */
		
		Scanner sc =new Scanner(System.in);
			
		int result[] = new int[5];
			int w=0;
			
			 do{
				System.out.println("1~45�� ������ ���ڸ� �Է��� �ּ���");
				int a=sc.nextInt();
				result[w]=a;
			
				w++;
			}while(w<5);
			 
			 System.out.println(Arrays.toString(result));
			 
			 sc.close();
			 
			 card c=new card();
			 c.acard(result);
//			 int aa=4;
//			 card c= new card();
//			 c.acard(aa);
		 

}
class card{
		public void acard(int result2[]) {

			Random r= new Random();
			System.out.println(r.nextInt());
		
}
		public static void bcard() {

		}
	}
}