package day08;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = new String("abcdefg");
		//String str = "abcdefg";
		/*
		System.out.println("문자열 입력");
		str = sc.next();
		System.out.println(str);
		System.out.println(str.toUpperCase());
		*/
		//abcdefg 0번쨰부터 입력된 숫자에 있는 값을 가져옴
		//charAt(x) : x번째에 입력된 값을 가져옴
		System.out.println(str.charAt(0)); //a
		System.out.println(str.charAt(0) == 'a'); //true
		System.out.println(str.charAt(1) == 'a'); //false
		System.out.println(str.charAt(0)-32); //65 아스키코드 참조
		System.out.println((char)(str.charAt(0)-32)); //A
		
		str+= " "; //abcdefg  + z
		str+= "z"; //abcdefg + z
		System.out.println(str);
		str = " aaaa aaa aaa ";
		System.out.println(str);
		String re = str.trim();
		System.out.println(re);
		
		//trim : // 앞뒤의 공백을 없애줌
		String name="홍길동	";
		System.out.println("name :" +name);
		if(name.trim().equals("홍길동")){
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		//split : 문자열 분할 공백 /," ",","등등 이용
		String addr;
		addr = "047869/ 서울시 종로구 종로 3가 /3층";
		String[] ad = addr.split("/");
		System.out.println(ad[0]); //047869
		System.out.println(ad[1]); //서울시
		//replace : 특정문자를 바꿔주는 기능
		String replace = addr.replace("/", ","); //  / -> ,
		System.out.println(replace);
		
}
}








