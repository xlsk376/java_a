package A4_���������_�˰���;

public class ���������_�˰���_�ð�����_���� {
	public static void main(String[] args) {	
		/*
		 *  [����] 
		 *  	123123�� �� ��ð� ��� �����ΰ� ?	
		 *  1�ð� = 60�� = 60*60�� = 3600��	, 1�� = 60��
		 *  1�� : 60�� = x�� : 123123��	
		 *  123123/60 = x��
		 *  123123%60 = 3��
		 *  1�ð� : 60�� = x�ð� : 2052�� 
		 *  2052/60 = 34 �ð�
		 *  2052/60 �� �������� ��
		 *  �ð� = 3600�� 
		 *  ��
		 *  123123/3600*3600 => ���� ���
		 *  ���ϱ� ������ �� ������ �պ��� ������� ���
		 */
		 System.out.println(123123/3600);
		 System.out.println((123123%3600)/60);
		 System.out.println((123123%3600)%60);
		 System.out.println();
		 System.out.println(123123/60);
		 System.out.println(123123%60);
		 System.out.println((123123/60)/60);
		 System.out.println((123123/60)%60);
		 System.out.println();
		 System.out.println(123123/3600 + "�ð�");
		 System.out.println((123123 - (123123/3600*3600)) / 60 + "��"); 
		 System.out.println((123123 % 3600) / 60 + "��");
		 System.out.println(123123 % 60 + "��");
		 System.out.println((123 - (123/360*360)) / 60);
		 System.out.println();
		 System.out.println((123123 - (123123/3600*3600)));
		 System.out.println((123123/3600*3600));
			
			
		
     }
}