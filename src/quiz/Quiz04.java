package quiz;

public class Quiz04 {
public static void main(String[] args) {
	//String str = "�谳�� - 2017��\nȫ�浿���� -2015��\n���켱�� -2018��";
	//���� ���� ������ replace�� �̿��ؼ� �Ʒ��� ���� ������ ����Ͻÿ�.
	/*
	 ====���� �� str====
	 �谳�� -2017��
	 ȫ�浿���� -2015��
	 ���켱�� -2018��
	 ====���� �� str====
	 �谳�� : 1999��
	 ȫ�浿���� : 1999��
	 ���켱�� : 1999��
	 */
	String str = "�谳�� -2017��\nȫ�浿���� -2015��\n���켱�� -2018��";
	System.out.println("====���� �� str====\n"+str);
	str = str.replace("-", ":");
	String[] arrStr = str.split("\n");
	str="";//��������� �������� ���� ������ ��µ��� �ʵ��� ���� �����
	for(int i=0;i<arrStr.length;i++) {
		String[] reStr = arrStr[i].split(":");//reStr [] = [0]�̸� [1]�⵵
		reStr[1]=reStr[1].replace(reStr[1], "1999��"); //[1]�⵵�� replace�� �̿��� "1999��"���� ����(���� �����)
		//reStr[1]="1999��";
		str+=(reStr[0]+":"+reStr[1]+"\n");//str�� �̸� +":"+ �⵵("1999��") + \n(���ٶ�)���� �� ����� for������ �迭 ���̸�ŭ �ݺ�
	}
	System.out.println("====���� �� str====\n"+str);

}
}
