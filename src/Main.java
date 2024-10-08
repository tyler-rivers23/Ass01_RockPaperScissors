import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        String playAgain;
        String player_A_Move;
        String player_B_Move;
        Scanner in = new Scanner(System.in);
        do
        {
            do
            {
                System.out.println("Player A enter your move: ");
                player_A_Move = in.nextLine();
            } while (!player_A_Move.equalsIgnoreCase("R") && !player_A_Move.equalsIgnoreCase("P") && !player_A_Move.equalsIgnoreCase("S"));

            do
            {
                System.out.println("Player B enter your move: ");
                player_B_Move = in.nextLine();
            } while (!player_B_Move.equalsIgnoreCase("R") && !player_B_Move.equalsIgnoreCase("P") && !player_B_Move.equalsIgnoreCase("S"));

            if (player_A_Move.equalsIgnoreCase("R"))
            {
                if (player_B_Move.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock vs Rock its a tie");
                }
                else if (player_B_Move.equalsIgnoreCase("S"))
                {
                    System.out.println("Rock vs Scissors player A won");
                }
                else if (player_B_Move.equalsIgnoreCase("P"))
                {
                    System.out.println("Rock vs Paper player B won");
                }
            }
            else if (player_A_Move.equalsIgnoreCase("S"))
            {
                if (player_B_Move.equalsIgnoreCase("S")) {
                    System.out.println("Scissors vs scissors its a tie");
                } else if (player_B_Move.equalsIgnoreCase("P")) {
                    System.out.println("Scissors vs Paper player A won");
                } else if (player_B_Move.equalsIgnoreCase("R")) {
                    System.out.println("Scissors vs rock player B won");
                }

            }
                else if (player_A_Move.equalsIgnoreCase("P"))
                {
                    if (player_B_Move.equalsIgnoreCase("P"))
                    {
                        System.out.println("Papers vs Papers player A won");
                    }
                    else if (player_B_Move.equalsIgnoreCase("R"))
                    {
                        System.out.println("Papers vs Rock player A won");
                    }
                    else if (player_B_Move.equalsIgnoreCase("S"))
                    {
                        System.out.println("Papers vs Scissors player B won");
                    }
                }

            System.out.println("Do you want to play again? (Y/N)");
            playAgain = in.nextLine();





        }while (playAgain.equalsIgnoreCase("Y"));
    }
}