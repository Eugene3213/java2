
public class Class7 {

	public static void main(String[] args) {
		//Class�� �⺻ �޼ҵ� ��ü �ʵ尪 ���� 
		String mid = "hong";
		String mname = "ȫ�浿";
		Java1 jv1 = new Java1(mid,mname);
		jv1.Java2();
	}

}

class Java1{
	//Java1 class�� main���� ��ü���� �� �ν��Ͻ��� �����ϸ� �ٷ� �۵��ϴ� class �⺻ �޼ҵ� �Դϴ�.
	public Java1(String a, String b) {				//class�� �⺻���� ����ϴ� �޼ҵ� (class��� ����)
		System.out.println(a+b);
		Java2();					//void �޼ҵ� �� �ٷ� ȣ�� �� �� �ֽ��ϴ�.
	}
	public void Java2() {
		System.out.println("test");
	}
}