import java.text.SimpleDateFormat;
import java.util.Date;

public class Double_loop {

	public static void main(String[] args) {
	
		Date today =new Date();
			System.out.println(today);
			
		SimpleDateFormat date =new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat time =new SimpleDateFormat("h:m:s");
			System.out.println(date.format(today));
			System.out.println(time.format(today));
			//format : �԰�ȭ�� ���·� ���� ǥ���Ҷ� ����ϰ� �˴ϴ�.
			
		
			int f,ff;
			int total;
			for(f=1;f<=3;f++) {
				//System.out.println(f);
		
					for(ff=1;ff<=4;ff++) {
						total=f+ff;
						System.out.println(f+" "+ff);
					}
			}
	}
}
