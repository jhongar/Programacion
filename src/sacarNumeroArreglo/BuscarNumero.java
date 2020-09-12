package sacarNumeroArreglo;

public class BuscarNumero {

	public static void main(String[] args) 
	{
		int arreglo[]= new int [] {3,2,1,0,1};
		int numero=0;
		boolean resultado = buscar(arreglo, numero, 0);
		System.out.println("el resultado es: " + resultado);
	}
	
	public static boolean buscar(int [] array, int numero, int i ) 
	{
		if (i==array.length-1)
		{
			if (array[i]==numero)
			{
				return true;
			}
			return false;
		}
		if(array[i]==numero)
		{
			return true;
		}
		return buscar(array, numero, i+1);
	}

}
