import java.util.*;
public class OneDArray{
	
	
	public static void main(String args[])
	{
		int arrayone[]=new int[5];//array declaration
		int arraytwo[]= {1,2,3,4,5};//array declaration and initialization
		try(Scanner in=new Scanner(System.in)){
			
			//Inserting elements
			for(int i=0;i<arrayone.length;i++)
			{
				arrayone[i]=in.nextInt();
			}
			//Printing one
			System.out.println("Printing User Entered elements using enhanced loop:");
			for(int i:arrayone)//enhanced for loop
			{
				System.out.println(i);
			}
			//Printing two
			System.out.println("Printing array as String :"+Arrays.toString(arrayone));//Printing array values as strings
		}
		
		
	}
	
	
	
	
	
	
	
    
}