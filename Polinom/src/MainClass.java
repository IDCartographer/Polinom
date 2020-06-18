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
             System.out.println("Для продолжения работы введите y, для окончания любую клавишу");
             triger=in.next();
          
         } while (t.equals(triger));

	}
}
