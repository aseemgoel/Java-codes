import java.io.*;

public class CreateDirectory 
{
	public static void main(String[] args) 
	{
		//object of File class with file path and name
		File dir = new File("E:/IHelp");
		
		//method 'mkdir' to create directroy and result
		//is getting stored in 'isDirectoryCreated'
		//which will be either 'true' or 'false'
		boolean isDirectoryCreated = dir.mkdir();

		//displaying results
		if(isDirectoryCreated)
			System.out.println("Directory successfully created: " + dir);
		else
			System.out.println("Directory was not created successfully: " + dir);
	}
}