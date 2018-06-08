/*
Driver for BookSearch class
Something like a search engine
Type in author, genre, topic, or age group
It will direct you to the book series based on your "tags"

Coded by Janeen Soria
Last modified June 7, 2018
*/

import java.util.Scanner;
public class BookSearchDriver
{
	public static void main (String [] args)
	{
		BookSearch aBookSearch = new BookSearch();
		Scanner keyboard = new Scanner (System.in);
		String confirm, answer;

		aBookSearch.getInfo();
		aBookSearch.findSeries();
		System.out.println("Do you want to view the other book series? If yes, type 'yes' if no, type 'no':");
		confirm = keyboard.nextLine();
		if (confirm.equals("yes"))
		{
			aBookSearch.seriesOptions();
			System.out.println("Do you want to view another series? Type 'yes' to view the rest or 'no' if you are satisfied with your search:");
			confirm = keyboard.nextLine();
			if (confirm.equals("yes"))
			{
				while (true) //to allow user the option to keep viewing the series until they want to stop
				{
					aBookSearch.seriesOptions();
					System.out.println("Type 'continue' to keep viewing the other series, or type 'done' if you do not want to view the rest:");
					answer = keyboard.nextLine();
					if (answer.equals("done")) //exit loop
					{
						System.out.println("Happy reading!");
						break;
					}
			}
		}
		else
			System.out.println("Happy reading!");
		}
		else
			System.out.println("k");
		}
}
