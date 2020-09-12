package numeroMayor;

public class SacarNumeroMayor {

	public static void main(String[] args) 
	{
		int array[] = new int [] {2,3,4,6,1};
		System.out.println("el numero mayor es: " + array);
	}
	
	public int getNumeroMayor(int []array,int i, int numMaxi) 
	{
		if (i>array.length)//aqui recorro el arreglo
		{
			if (array[i]>numMaxi)
			{
				numMaxi=getNumeroMayor(array, i+1, numMaxi);
			}
			else getNumeroMayor(array, i+1, numMaxi);
		}
		return numMaxi;
	}

}
