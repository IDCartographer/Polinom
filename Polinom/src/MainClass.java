import java.util.Scanner;

public class MainClass 
{
	static Scanner in = new Scanner(System.in);
	public static void main(String args[]) 
	{
		 
		String triger;
		String t="y";
         do
         {
             Functional.Polinom();
             System.out.println("��� ����������� ������ ������� y, ��� ��������� ����� �������");
             triger=in.next();
          
         } while (t.equals(triger));

	}
}
