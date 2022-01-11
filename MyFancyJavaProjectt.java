import java.util.Scanner;


class Singleton {
    private static Singleton single_instance = null;
      public int counter;
      public int number[] = new int[100];
      
    private Singleton()
    {
      Scanner scanner = new Scanner(System.in);
	System.out.print("How many elements you want to enter: ");
	counter = scanner.nextInt();
	for(int i=0; i<counter; i++)
	{
	    System.out.print("Enter Array Element"+(i+1)+": ");
	    number[i] = scanner.nextInt();
	}
    }
 
    public static Singleton Singleton()
    {
        
        if (single_instance == null) {
            single_instance = new Singleton();
        }
        return single_instance;
    }
}





public class Example
{
   public static void main(String args[])
   {
	int i=0, j=0, temp;
	Singleton x = Singleton.Singleton();
	j = i - 1;     
	i = 0;         
	scanner.close();
	while(i<j)
	{
  	   temp = x.number[i];
	   x.number[i] = x.number[j];
	   x.number[j] = temp;
	   i++;
	   j--;
	}

	System.out.print("Reversed array: ");
	for(i=0; i<x.counter; i++)
	{
	   System.out.print(x.number[i]+ "  ");
	}       
   }
}