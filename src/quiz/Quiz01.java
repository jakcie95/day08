package quiz;

import java.util.ArrayList;

public class Quiz01 {

	public static void main(String[] args) {
		//"Have a nice day Have a nice day Have a nice day"
		//���ڿ����� a�� ��ġ�� �����Ͽ� ����Ͻÿ�
			String str = new String("Have a nice day Have a nice day Have a nice day");
			int i=0;
			ArrayList arr = new ArrayList();
			while(i < str.length()) {
				if(str.charAt(i) == 'a')
					arr.add(i);
				i++;
			}
			System.out.println(arr);
		}
}
