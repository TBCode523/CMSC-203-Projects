package _solution;

import java.util.Scanner;

public class MovieDriver
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String answer;
        String title;
        String rating;
        int num;
        Movie a;
        do {
             a = new Movie();
            System.out.println("enter the title of the movie: ");
            title = input.next();
            System.out.println(title);
            a.setTitle(title);

            System.out.println("enter the rating of of the movie: ");
           rating = input.next();
            System.out.println(rating);
            a.setRating(rating);

            System.out.println("enter the number of tickets sold in theathers for this movie: ");
             num = input.nextInt();
            a.setSoldTickets(num);

            System.out.println(a.toString());

            System.out.println("Do you want to continue? (Y/N)");
            answer=input.next();
        }while(answer.equalsIgnoreCase("y"));
        input.close();
    }

}