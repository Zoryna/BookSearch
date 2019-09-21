/*
Something like a search engine
Type in author, genre, topic, or age group
It will direct you to the book series based on your "tags"

Coded by Janeen Soria
Last modified May 23, 2018
*/

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class BookSearch
{
  ArrayList<String> bookInfo = new ArrayList<String>();

  //book series: {author, genre, topic, age group}
  ArrayList<String> harryPotter = new ArrayList<String> (Arrays.asList("Rowling", "fantasy", "wizards", "all ages"));
  ArrayList<String> percyJackson = new ArrayList<String> (Arrays.asList("Riordan", "fantasy", "myth", "children"));
  ArrayList<String> forgottenBooks = new ArrayList<String> (Arrays.asList("Zafon", "mystery", "gothic", "adult"));

  public void getInfo()
  {
    Scanner keyboard = new Scanner (System.in);
    String response;
		System.out.println("Describe what type of book series you want. Type 'done' when you are finished.");
		while (true)
		{
			response = keyboard.nextLine();
			bookInfo.add(response); //adds user input into ArrayList
			if (response.equals("done"))
				break;
		}
		bookInfo.remove("done"); //removes the exit command from bookInfo
		System.out.println("Here are your tags:");
		System.out.println(bookInfo);
	}

	public void findSeries()
	{
    int counterH = 0;
    int counterP = 0;
    int counterF = 0;

		System.out.println("Now we will find the right book series for you");

    for (int i = 0; i <= bookInfo.size()-1; i++)
      for (int h = 0; h <= harryPotter.size()-1; h++)
        {
          //System.out.println( i + " " + bookInfo.get(i) + " " + h + " " + harryPotter.get(h));
          if (bookInfo.get(i).equals(harryPotter.get(h)))
          {
            counterH++;
            //System.out.println(counterH);
          }
        }

    for (int i = 0; i <= bookInfo.size()-1; i++)
      for (int p = 0; p <= percyJackson.size()-1; p++)
        {
          //System.out.println( i + " " + bookInfo.get(i) + " " + p + " " + percyJackson.get(p));
          if (bookInfo.get(i).equals(percyJackson.get(p)))
          {
            counterP++;
            //System.out.println(counterP);
          }
        }

    for (int i = 0; i <= bookInfo.size()-1; i++)
      for (int f = 0; f <= forgottenBooks.size()-1; f++)
        {
          //System.out.println( i + " " + bookInfo.get(i) + " " + f + " " + forgottenBooks.get(f));
          if (bookInfo.get(i).equals(forgottenBooks.get(f)))
          {
            counterF++;
            //System.out.println(counterF);
          }
        }

    //compares the counters and recommends highest value
    //improvement idea: have all possibilties
    if ((counterH > counterP) && (counterH > counterF))
      System.out.println("We recommend " + "Harry Potter: " + harryPotter);
    else if ((counterP > counterH) && (counterP > counterF))
      System.out.println("We recommend " + "Percy Jackson and the Olympians: " + percyJackson);
    else if ((counterF > counterH) && (counterF > counterP))
      System.out.println("We recommend " + "The Cemetery of Forgotten Books: " + forgottenBooks);
	}

		public void seriesOptions ()
		{
			Scanner keyboard = new Scanner (System.in);

			System.out.println("You have 3 options:\n" + "Option 1: Harry Potter\n" + "Option 2: Percy Jackson\n" + "Option 3: Cemetary of Forgotten Books");
			System.out.println("Type '1', '2', or '3' to learn more about all the series:");
			int selection = keyboard.nextInt();
			if (selection == 1)
			{
				System.out.println(Arrays.toString(harryPotter.toArray()));
				System.out.println("Here are the books in the Harry Potter series:");
				System.out.println("Book 1: Harry Potter and The Philosopher's Stone");
				System.out.println("Book 2: Harry Potter and The Chamber of Secrets");
				System.out.println("Book 3: Harry Potter and The Prisoner of Azkaban");
				System.out.println("Book 4: Harry Potter and The Goblet of Fire");
				System.out.println("Book 5: Harry Potter and The Order of the Phoenix");
				System.out.println("Book 6: Harry Potter and The Half-Blood Prince");
				System.out.println("Book 7: Harry Potter and The Deathly Hallows");
			}
			else if (selection == 2)
			{
				System.out.println(Arrays.toString(percyJackson.toArray()));
				System.out.println("Here are the books in the Percy Jackson and the Olympians series:");
				System.out.println("Book 1: The Lightning Thief");
				System.out.println("Book 2: The Sea of Monsters");
				System.out.println("Book 3: The Titan's Curse");
				System.out.println("Book 4: The Battle of the Labyrinth");
				System.out.println("Book 5: The Last Olympian");
			}
			else if (selection == 3)
			{
        System.out.println(Arrays.toString(forgottenBooks.toArray()));
        System.out.println("Here are the books in The Cemetary of Forgotten Books:");
        System.out.println("Book 1: The Shadow of the Wind");
        System.out.println("Book 2: Angel's Game");
        System.out.println("Book 3: The Prisoner of Heaven");
        System.out.println("Book 4: The Labyrinth of Spirits");
			}
	}
}
