
import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int computerMove;
        String playerMove;
        String computerStringMove;


        System.out.println("Welcome to Rock,Paper,Scissors.");
        System.out.println("Which one would you like to pick? Rock, Paper or Scissors");
        playerMove = scanner.nextLine().toLowerCase();
        System.out.println("The player has chosen " + playerMove);

        computerMove = random.nextInt(3);

        if (computerMove == 0) {
            computerStringMove = "Rock".toLowerCase();
        }
        else if (computerMove == 1) {
            computerStringMove = "Paper".toLowerCase();
        }
       else {
            computerStringMove = "Scissors".toLowerCase();
        }





        System.out.println();
        System.out.println("The computer has chosen " + computerStringMove);
        System.out.println();

        if(playerMove.equals(computerStringMove))
        {System.out.println("Its a draw");}
        else if(playerMove.equals("rock")){
             if(computerStringMove.equals("paper")){
                 System.out.println("You lose");
             }
            else if(computerStringMove.equals("scissors")){
                System.out.println("You win");
             }
        }
        else if(playerMove.equals("paper")){
            if(computerStringMove.equals("scissors")){
                System.out.println("You lose");
            }
            else if(computerStringMove.equals("rock")){
                System.out.println("You win");
            }
        }
        else if(playerMove.equals("scissors")){
            if(computerStringMove.equals("rock")){
                System.out.println("You lose");
            }
            else if(computerStringMove.equals("paper")){
                System.out.println("You win");
            }
        }



                }


            }


