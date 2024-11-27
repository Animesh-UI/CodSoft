import java.util.Scanner;
import java.util.Random;

class Game
{
    int comp;
    public Game()
    {
        Random rnd=new Random();
        comp=rnd.nextInt(100);
        System.out.println("Guess the Number from 1-100 : ");

    }
    public int compNo()
    {
        return comp;
    }
}

public class NumberGame
{
    static int userInput()
    {
        int user;
        System.out.println("Enter Random Number: ");
        Scanner sc = new Scanner(System.in);
        user=sc.nextInt();
        return user;
    }
    static void correctNumber(int i,int j)
    {
        if(i==j)
        {
            System.out.println("Correct Number guessed !!!!!");

        }
        else if(i>j)
        {
            System.out.println("Entered Number is Bigger than computer number !!!!!!");
        }
        else
        {
            System.out.println("Entered Number is Smaller than computer number !!!!!!");
        }
    }    
    public static void main(String[] args)
    {
        int user=0;
        int comp=0;
        int itteration=0;
        Game g=new Game();
        do{
            user=userInput();
            comp=g.compNo();
            correctNumber(user, comp);
            itteration++;

        }
        while(user!=comp);
        {
            System.out.println("YOU GUESS NUMBER IN "+ itteration + "ITTERATION");

        }
    }
}
