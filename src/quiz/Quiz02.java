package quiz;

public class Quiz02 {

	public static void main(String[] args) {
		// it is a fun java programming ���ڿ�����
		// 'a'�� ������ 'g'�� ������ �� ������ ����Ͻÿ�.
			String str = new String("It is a fun java programming");
			int i=0;
			int cnt_a=0,cnt_g=0,cnt=0;
			while(i < str.length()) {
				if(str.charAt(i) == 'a')
					cnt_a++;
				else if(str.charAt(i) == 'g')
					cnt_g++;
				i++;
			}
			System.out.println("�� ���� : "+str.length());
			System.out.println("a ���� : "+cnt_a);
			System.out.println("g ���� : "+cnt_g);
		}
}
