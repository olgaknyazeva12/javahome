package twopackage;

public class DiffrTypes {

	public static void main(String[] args) {

		// (�) ������� ���������� ��������� �����:
		int i = 0b10;
		short s = 44;
		long l = 122222;
		double d = 555555.35;
		float f = 90.35f;
		char c = 'b';
		boolean boo = true;

		// (�) ������� ���������� ����������� ����� � ��������� �� ��������� ���������
		// ��������
		int result1 = i + s; // ����� int � short
		double result2 = l - d; // �������� long � double
		double result3 = f * d; // ������������ float � double

		// ��������� ��������� long > double,
		if (l > d) {
			System.out.println("long > double");
		}

		else {
			System.out.println("long < double");
		}

		// ��������� ��������� float < int
		if (f < i) {
			System.out.println("float < int");
		} else {
			System.out.println("float > int");
		}

		// ��������� ��������� �� ���������/����������� ������1
		if (i == l) {
			System.out.println("int = long");
		} else {
			System.out.println("int != long");
		}

		//// ��������� ��������� �� ���������/����������� ������2
		if (i != d) {
			System.out.println("int ! = double");
		} else {
			System.out.println("int == long");
		}
		System.out.println(" ");
		System.out.println("�������� ����������");

		System.out.println("i = " + i + ", s = " + s + ", l = " + l + ", d = " + d + ", f = " + f + ", c = " + c
				+ ", boo = " + boo);

		// ����� � PRINTLN
		System.out.println(" ");
		System.out.println("����� ����������� � ������� println: ");
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		System.out.println("result3 = " + result3);
		System.out.println(" ");

		// ����� � PRINT
		System.out.print(" ");
		System.out.print("����� ����������� � ������� print: ");
		System.out.print(" result1 = " + result1);
		System.out.print(" result2 = " + result2);
		System.out.print(" result3 = " + result3);

		// ����� � PRINTF
		System.out.println(" ");
		System.out.printf("����� String ���������� � ������� printf: ");
		String str = "������";
		System.out.printf(str);

	}

}
