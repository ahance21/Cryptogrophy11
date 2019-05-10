import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Cryptogrophy2
{

	public static void main(String[] args) 
	{
	
		Scanner keyboard = new Scanner(System.in);
		
		char[]alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p','q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		   char[]alphaup = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		System.out.print("Would you like to encrypt or decrypt?");
        
		
		

	}
	
	
	
	public static String caesar_cipher(String fileName, boolean encrypt, int shiftAmount) throws IOException
	{
		if (encrypt == true)
			
		{

			   String newName = "";
			   Scanner file = new Scanner(new File(fileName));
			   
			   //read the file
			   
			 for (int k=0; k < file.length(); k++)
			   {
				   if(!isLower(file.charAt(k)) && !isUpper(filename.charAt(k)))
					   newName = filename.substring(0,  k);
			   }
			   PrintWriter outputfile = new PrintWriter(filename + "_ENC.txt");
			   while(file.hasNext())
		}
		return fileName;
	}
	private static boolean isUpper(char charAt) {
		// TODO Auto-generated method stub
		return false;
	}
	private static boolean isLower(char charAt) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
