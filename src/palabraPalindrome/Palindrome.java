package palabraPalindrome;

public class Palindrome {

	public static void main(String[] args) 
	{
		String palabra = "recnocer";
		
		System.out.println("la palabra "+ palabra +" es palindrome");
		

	}
	
	public boolean getPalindromo(String palabra, String i, String j, String pala) 
	{
		if(palabra.length()==pala) 
		{
			if(palabra.charAt(i)==palabra.charAt(j)) 
			{
				pala=palabra;
				getPalindromo(palabra, i+1, j, pala);
				return true;
			}
			
		}
		return false;
	}

}
