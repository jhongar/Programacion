package buscarNumeroArray;

import java.sql.Blob;

public class BuscarNumero {

	public static void main(String[] args) 
	{
		int [] arreglo = new int[] {2,3,4,5,6,7,8,9,};
		int numeroBuscar = 7;
		boolean busqueda = buscarNumero(arreglo, numeroBuscar, 0);
		System.out.println(" el numero se encontro: " + busqueda + " el numero era " + numeroBuscar);
		 

	}
	public static boolean buscarNumero(int []array, int numero, int posicion) 
	{
		if (posicion == array.length)
		{
			if (array[posicion] == numero)
			{
				return true;
			}
			return false;
		}
		
		if (array [posicion] == numero)
		{
			return true;
		}
		return false;
	}
		
	



	
	

}
