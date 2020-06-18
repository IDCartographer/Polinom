import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;


public class Functional 
{
	static Scanner in = new Scanner(System.in);
	public static void Polinom()//основной метод для подсчёта результата
    {
		
		ArrayList<Double> main_list = EnterFunction();
		Double[] myArray = main_list.toArray(new Double[0]);

        double result = myArray[0];
        int count = myArray.length;//Найти аналог
        
        for (int i=0;i<count;i++)
        {
            result = result + (1 / myArray[i] * 3);
        }

        System.out.println();
        System.out.println("Результат="+result);
        

    }

    private static ArrayList<Double> EnterFunction()//Метод формирования списка
    {
    	ArrayList<Double> work_name = new ArrayList<Double>();
        

        String triger;
		String t="y";
        do
        {
            work_name.add(EnterNumber());
            System.out.println("Для продолжения ввода введите y, для окончания любую клавишу");
            triger=in.next();
            
        } while (t.equals(triger));

        return work_name;
    }

    private static double EnterNumber()//Ввод числа для добавления в список
    {
        double i;
        while (true)
        {

            try
            {
            	System.out.println("Введите число");
            	
                i = (double)in.nextDouble();
                break;
            }
            catch (Exception у)
            {
            	System.out.println("Введены не корректные данные");
            }
        }

        return i;
    }
}
