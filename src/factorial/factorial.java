package factorial;

public class factorial 
{
	public int  getFactorial (int num) 
	{
		if (num==0)
		{
			return 1;
		}
		else 
		{
			return  num*getFactorial(num-1);
		}
	}
	public void mostrar() 
	{
		System.out.println("el factotial del numero 5 es: " + getFactorial(5));
		
	}

}
