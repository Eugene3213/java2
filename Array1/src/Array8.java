import java.util.Arrays;

public class Array8 {

	public static void main(String[] args) {

		/* �����迭
		 int a[]=new int[2];
		 a[0] =22;
		 b[1] =32;		 */
		
		/* �����迭
		 int b[] ={1,2,3,4};
		 int[] c ={1,2,3,4};
		 int[] d = new int[]{1,2,3,4};		 */
		
		// 2���迭 [][]
		
		/* 2�� �����迭
		 String member2[][]=new String[3][3];		 */
			String member[][] = {
					{"ȫ�浿","������","������"},
					{"25","31","22"}
			};
			int ea =member.length;					//�迭 ������ � �ִ����� Ȯ��
			int data_ea=member[0].length;			//�ش� �迭���� �����Ͱ�ü�� ��ִ��� Ȯ��
			//System.out.println(data_ea);
			
			//System.out.println(member[1][1]);
			int f,ff;
			
			for(f=0;f<ea;f++) {							//ū �ݺ����� �迭 ������ŭ loop
				//System.out.println(Arrays.toString(member[f]));
				
				for(ff=0;ff<data_ea;ff++) {				//���� �ݺ����� �迭�� �ִ� ������ ������ŭ loop
					//System.out.println(member[f][ff]);
				}
			}
			
			
			
			int[][] datas= {
					{1,3,5},
					{2,4,6}
			};
			int fea = datas.length;
			int dea = datas[0].length;
			//System.out.println(fea);
			
			int total=0;
			int w,ww;
			for(w=0;w<fea;w++) {
				//System.out.println(Arrays.toString(datas[w]));
				
				for(ww=0;ww<dea;ww++) {
					//System.out.print(datas[w][ww]);
					total += datas[w][ww];
				}
			}
			//System.out.println("���հ��: " + total);
			
			
			/*q. �ش� ������ �迭�� �ִ� ��� �� �� ¦������ ��� ���Ͻÿ�.
			 1�� ������ : 11 42 22 16
			 2�� ������ : 7 33 10 29			 */
			
			
//����		int[][] dat= {
//					{11,42,22,16},
//					{7,33,10,29}
//			};
//			int gee =dat.length;
//			int hee =dat[1].length;
//			
//			
//			int sum=0;
//			int e,ee;
//			for(e=0;e<gee;e++) {
//				
//				for(ee=0;ee<hee;ee++) {
//					
//				//	System.out.println(dat[e][ee]);
//					if(dat[e][ee]%2==0) {
//						sum=sum+dat[e][ee];
//					}
//				}
//			}
//			System.out.println("�� �հ�: "+sum);
//			
			
			//��
			
			int numbers[][]= {
					{11,42,22,16},
					{7,33,10,29}
			};
			int ws=0;
			int totals =0;
			
			while(ws<numbers.length) {
				
				int wz =0;
				
				while(wz <numbers[ws].length) {
					
					if(numbers[ws][wz]%2==0) {
						totals += numbers[ws][wz];
					}
					wz++;
				}
				
				ws++;
			}
			System.out.println(totals);
			
			
			
			
			
			
			
			
	}

}
