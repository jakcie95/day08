package quiz;

public class Quiz04 {
public static void main(String[] args) {
	//String str = "김개똥 - 2017년\n홍길동구리 -2015년\n선우선녀 -2018년";
	//위와 같은 내용을 replace를 이용해서 아래와 같이 저장후 출력하시오.
	/*
	 ====변경 전 str====
	 김개똥 -2017년
	 홍길동구리 -2015년
	 선우선녀 -2018년
	 ====변경 후 str====
	 김개똥 : 1999년
	 홍길동구리 : 1999년
	 선우선녀 : 1999년
	 */
	String str = "김개똥 -2017년\n홍길동구리 -2015년\n선우선녀 -2018년";
	System.out.println("====변경 전 str====\n"+str);
	str = str.replace("-", ":");
	String[] arrStr = str.split("\n");
	str="";//변경사항이 있음으로 이전 내용이 출력되지 않도록 값을 비워줌
	for(int i=0;i<arrStr.length;i++) {
		String[] reStr = arrStr[i].split(":");//reStr [] = [0]이름 [1]년도
		reStr[1]=reStr[1].replace(reStr[1], "1999년"); //[1]년도를 replace를 이용해 "1999년"으로 수정(전부 적용됨)
		//reStr[1]="1999년";
		str+=(reStr[0]+":"+reStr[1]+"\n");//str에 이름 +":"+ 년도("1999년") + \n(한줄띔)으로 값 저장됨 for문으로 배열 길이만큼 반복
	}
	System.out.println("====변경 후 str====\n"+str);

}
}
