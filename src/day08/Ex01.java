package day08;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = new String("abcdefg");
		//String str = "abcdefg";
		/*
		System.out.println("���ڿ� �Է�");
		str = sc.next();
		System.out.println(str);
		System.out.println(str.toUpperCase());
		*/
		//abcdefg 0�������� �Էµ� ���ڿ� �ִ� ���� ������
		//charAt(x) : x��°�� �Էµ� ���� ������
		System.out.println(str.charAt(0)); //a
		System.out.println(str.charAt(0) == 'a'); //true
		System.out.println(str.charAt(1) == 'a'); //false
		System.out.println(str.charAt(0)-32); //65 �ƽ�Ű�ڵ� ����
		System.out.println((char)(str.charAt(0)-32)); //A
		
		str+= " "; //abcdefg  + z
		str+= "z"; //abcdefg + z
		System.out.println(str);
		str = " aaaa aaa aaa ";
		System.out.println(str);
		String re = str.trim();
		System.out.println(re);
		
		//trim : // �յ��� ������ ������
		String name="ȫ�浿	";
		System.out.println("name :" +name);
		if(name.trim().equals("ȫ�浿")){
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		//split : ���ڿ� ���� ���� /," ",","��� �̿�
		String addr;
		addr = "047869/ ����� ���α� ���� 3�� /3��";
		String[] ad = addr.split("/");
		System.out.println(ad[0]); //047869
		System.out.println(ad[1]); //�����
		//replace : Ư�����ڸ� �ٲ��ִ� ���
		String replace = addr.replace("/", ","); //  / -> ,
		System.out.println(replace);
		
}
}








