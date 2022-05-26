package quiz;

public class Quiz03 {

	public static void main(String[] args) {
		// String str = new String("tESt sTring	    change     first");
		// String changeStr = new String();
		// 현재의 공백은 몇 개가 있는지 알 수 없는 상황에서 첫번째 알파벳만 대문자로 변경 하시오
		    String str = new String("tESt sTring     change     first");
			String changeStr = new String();
			int i=0;

			str = str.toLowerCase(); //문장내의 알파뱃 소문자로 변환
			if(str.charAt(0) >='a' && str.charAt(0) <='z') {
				changeStr+=(char)(str.charAt(i)-32);
				i++;
			}
			while(i<str.length()) {
				if(str.charAt(i) != ' ') {
					changeStr+=str.charAt(i);
					i++;
					continue;
				}
				while(str.charAt(i) == ' ') {
					changeStr+=str.charAt(i);
					i++;
				}
				if(str.charAt(i) >= 'a' && str.charAt(i) <='z')
					changeStr+=(char)(str.charAt(i)-32);
				i++;
			}
			System.out.println(str);
			System.out.println(changeStr);
			System.out.println("종료");
		}
}
