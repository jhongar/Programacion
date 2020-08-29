package impremirSecuenciDeNumeros;

public class imprimirNumero 
{
	public void imprimirNumero(int comiezo, int Sfinal) 
	{
		if (comiezo<Sfinal)
		{
			System.out.println("le numero es es: " + comiezo);
			comiezo=comiezo+1;
			imprimirNumero(comiezo, Sfinal);
			
		}
			
	}

}
