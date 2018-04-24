/*
Something like a search engine
Type in author, genre, topic, or age group
It will direct you the book series based on your "tags"

Coded by Janeen Soria
Last modified February 14, 2018
*/

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class BookSearch
{
  //store description user input, 3 because one to compare to each book series list
  //improvement idea: compile and run with just one bookInfo
 	ArrayList<String> bookInfo1 = new ArrayList<String>();
  ArrayList<String> bookInfo2 = new ArrayList<String>();
  ArrayList<String> bookInfo3 = new ArrayList<String>();
	//book series: {author, genre, topic, age group}
  ArrayList<String> harryPotter = new ArrayList<String> (Arrays.asList("Rowling", "fantasy", "wizards", "all ages"));
  ArrayList<String> percyJackson = new ArrayList<String> (Arrays.asList("Riordan", "fantasy", "myth", "children"));
  ArrayList<String> forgottenBooks = new ArrayList<String> (Arrays.asList("Zafon", "mystery", "gothic", "adult"));
	/*String [] harryPotter = new String [] {"Rowling", "fantasy", "wizards", "all ages"}; //series 1 (Harry Potter) keywords
	String [] percyJackson = new String [] {"Riordan", "fantasy", "myth", "children"}; //series 2 (Percy Jackson) keywords
	String [] forgottenBooks = new String [] {"Zafon", "mystery", "gothic", "adult" }; //series 3 (Cemetary of Forgotten Books) keywords */

	public void getInfo()
	{
		Scanner keyboard = new Scanner (System.in);
		String response;
		System.out.println("Describe what type of book series you want. Type 'done' when you are finished.");
		while (true)
		{
			response = keyboard.nextLine();
			bookInfo1.add(response); //adds user input into ArrayList
      bookInfo2.add(response);
      bookInfo3.add(response);
			if (response.equals("done")) //exit loop
				break;
		}
		bookInfo1.remove("done"); //removes the exit command from bookInfo
    bookInfo2.remove("done");
    bookInfo3.remove("done");
		System.out.println("Here are your tags:");
		System.out.println(bookInfo1); //shows each response is in its own index
    //don't need to show bookInfo2 and bookInfo3 because they're the same
	}

	public void findSeries() //improvement idea: have parameter be list
	{
		/*int counterH, counterP, counterF;
    counterH = 0;
    counterP = 0;
    counterF = 0; */

		System.out.println("Now we will find the right book series for you");
    //compares the user input with the tags
    bookInfo1.retainAll(harryPotter);
    //System.out.println(bookInfo1); //print just for reference
    //System.out.println(bookInfo1.size()); //so can compare and then recommend with highest value
    bookInfo2.retainAll(percyJackson);
    //System.out.println(bookInfo2);
    //System.out.println(bookInfo2.size());
    bookInfo3.retainAll(forgottenBooks);
    //System.out.println(bookInfo3);
    //System.out.println(bookInfo3.size());

		/*for (int i = 0; i < bookInfo.size(); i++) //for harryPotter
		{
      for (int h = 0; h < harryPotter.length; h++)
      {
        if (bookInfo.get(i).contains(harryPotter[h]))
          System.out.println(bookInfo.get(i).contains(harryPotter[h]));
          //counterH++;
      }
		}
    System.out.println(counterH); //test

    for (int j = 0; j < bookInfo.size(); j++) //for percyJackson
		{
      for (int p = 0; p < percyJackson.length; p++)
      {
        if (bookInfo.get(j).contains(harryPotter[p]))
        System.out.println(bookInfo.get(j).contains(percyJackson[p]));
          counterP++;
      }
		}
    System.out.println(counterP); //test

    for (int k = 0; k < bookInfo.size(); k++) //for forgottenBooks
		{
      for (int f = 0; f < forgottenBooks.length; f++)
      {
        if (bookInfo.get(k).contains(harryPotter[f]))
        System.out.println(bookInfo.get(k).contains(forgottenBooks[f]));
          counterF++;
      }
		}
    System.out.println(counterF); //test */

    //compares the counters and recommends highest value
    //improvement idea: have all possibilties
     if ((bookInfo1.size() > bookInfo2.size()) && (bookInfo1.size() > bookInfo3.size()))
      System.out.println("We recommend " + "Harry Potter: " + harryPotter);
    if ((bookInfo2.size() > bookInfo1.size()) && (bookInfo2.size() > bookInfo3.size()))
      System.out.println("We recommend " + "Percy Jackson and the Olympians: " + percyJackson);
    if ((bookInfo3.size() > bookInfo1.size()) && (bookInfo3.size() > bookInfo1.size()))
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
