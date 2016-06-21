import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class JavaCollection {
	
	public static void main(String[] args)
	{
		ArrayList<String>books=new ArrayList<String>();
		
		Scanner sc=new Scanner(System.in);
		
		String mybook;
		
		while(1>0)
		{
			System.out.println("Please enter your books: (Press -1 to quit)");
			mybook=sc.next();
				
			if(mybook.equals("-1"))
			{
				break;
			}
			books.add(mybook);
		}
		
		Collections.sort(books);
		
		for( String bookvalue:books)
		{
			System.out.println(bookvalue);
		}
	}

}
