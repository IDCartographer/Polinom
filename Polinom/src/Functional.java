import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;


public class Functional 
{
	static Scanner in = new Scanner(System.in);
	public static void Polinom()//�������� ����� ��� �������� ����������
    {
		
		ArrayList<Double> main_list = EnterFunction();
		Double[] myArray = main_list.toArray(new Double[0]);

        double result = myArray[0];
        int count = myArray.length;//����� ������
        
        for (int i=0;i<count;i++)
        {
            result = result + (1 / myArray[i] * 3);
        }

        System.out.println();
        System.out.println("���������="+result);
        

    }

    private static ArrayList<Double> EnterFunction()//����� ������������ ������
    {
    	ArrayList<Double> work_name = new ArrayList<Double>();
        

        String triger;
		String t="y";
        do
        {
            work_name.add(EnterNumber());
            System.out.println("��� ����������� ����� ������� y, ��� ��������� ����� �������");
            triger=in.next();
            
        } while (t.equals(triger));

        return work_name;
    }

    private static double EnterNumber()//���� ����� ��� ���������� � ������
    {
        double i;
        while (true)
        {

            try
            {
            	System.out.println("������� �����");
            	
                i = (double)in.nextDouble();
                break;
            }
            catch (Exception �)
            {
            	System.out.println("������� �� ���������� ������");
            }
        }

        return i;
    }
}
