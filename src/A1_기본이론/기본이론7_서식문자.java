package A1_�⺻�̷�;

/*
 * # ��¹��� ���� -> ���� : ���Ĺ��ڰ� ���� ���. ������ ln ��µ���
 * 1. System.out.println();
 * 1) ln = new line
 * 2) �ٹٲ� ����
 * -----------------------------------
 * 2. System.out.print();
 * 1) �ٹٲ� �Ұ�
 * -----------------------------------
 * 3. System.out.printf("", ); (f:format)
 * 1) ���Ĺ��� ���
 * 2) ����
 * . %d : ����
 * . %f : �Ǽ�
 * . %c : ���� 1��
 * . %s : ���� ������
 */
public class �⺻�̷�7_���Ĺ��� {
	public static void main(String[] args) {
		
		System.out.println("-------------------------------");
		System.out.printf("%d", 10);
		System.out.println();	
		System.out.println("-------------------------------");
		System.out.printf("%f", 3.14);// �Ҽ��� ������ �⺻6�ڸ� 	
		System.out.println();
		System.out.printf("%.2f", 3.14); // �Ҽ��� ������ �����Ҽ��ִ�. 
		System.out.println();
		System.out.printf("%.20f", 3.14); // �Ҽ��� ������ �����Ҽ��ִ�. 
		System.out.println();
		System.out.println("-------------------------------");
		System.out.printf("%c", 'b');
		System.out.println();
		System.out.println("-------------------------------");
		System.out.printf("%s", "��¹�������");
		System.out.println();
		System.out.println("-------------------------------");		
		String fruit = "���";
		int cnt = 5;
		System.out.printf("%s�� %d�� �ֽ��ϴ�.", fruit, cnt);
		System.out.println();
		System.out.println("-------------------------------");

	}
}