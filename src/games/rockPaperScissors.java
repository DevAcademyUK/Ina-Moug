package games;

import java.util.Random; //import Random
import java.util.Scanner; //import Scanner

public class rockPaperScissors { //create public class rockPaperScissors
    String playerName; //create 3 string variables
    String playerMove;
    String computerMove;
    int score; //create an int for score
    Scanner myScanner = new Scanner(System.in); //create a Scanner object

    public static void main(String[] args){ //create main method
        rockPaperScissors rps = new rockPaperScissors(); //create an object for class rockPaperScissors
        rps.initialiseGame(); //we are calling the method
    }


    private void initialiseGame(){ //define the method and get the details to start the game
        System.out.println("Enter your name: ");
        playerName = myScanner.nextLine();
        playGame(); //call the method
    }

    private void playGame(){ //define the playGame method
        System.out.println("Enter your move: "); //ask user for name
        playerMove = myScanner.nextLine(); //user's move is stored in playerMove
        System.out.println(playerName + " has selected " + playerMove + " as their move");  //showing user the move they have selected
        computerMove = generateComputerMove(); //call method and store resaults from the method
        String result = getWinner(playerMove, computerMove); // Call method getWinner with playerMove and computer move and store result of game
        if(result.equalsIgnoreCase("Win")){ //if value returned is win,
            System.out.println("Congratulations, you won this round!");
            score++; //increment user's score
        }
        else if(result.equalsIgnoreCase("Lose")){ //if method returns lose, then decrement user score
            System.out.println("You lost this round!");
            score--;
        }
        else {
            System.out.println("This round was a draw!");
        }

        if(score < 3 && score > -3){  //checking score, if it is between 3 and -3 then keep playing by calling play() method
            playGame();
        }
        else if(score == 3){
            System.out.println("Winner Winner!!");  //if score becomes 3, dispplay winner
        }
        else if(score == -3){
            System.out.println("You Looooooosssseeeee!"); //if score equals -3, display loser
        }

    }

    private String generateComputerMove() { //define method generateComputerMove
        Random r = new Random(); //create instance of Random class
        String move = "";  // Declare empty string move
        int i = r.nextInt(3); //using method of random class called nextInt()
        switch(i){  //using switch loop which has 3 cases
            case 0: // if random number generator gives 0 then set move to rock
                move = "Rock";
                break; //break will take us out of the switch loop

            case 1:  // if random number generator gives 1 then set move to paper
                move = "Paper";
                break;

            case 2: // if random number generator gives 2 then set move to scissors
                move = "Scissors";
                break;
        }
        return move; //return whatever is in the move variable
    }

    private String getWinner(String playerMove, String computerMove){ //define method getWinner
        String outcome = ""; //declare empty String outcom
        if(playerMove.equalsIgnoreCase("rock")){ //if user selects rock then set outcome to draw
            if(computerMove.equalsIgnoreCase("rock")){
                outcome = "Draw";
            }
            else if(computerMove.equalsIgnoreCase("paper")){ //if user selects rock then set outcome to lose
                outcome = "Lose";
            }
            else{  //if user selects rock then set outcome to win
                outcome = "Win";
            }
        }
        if(playerMove.equalsIgnoreCase("paper")){ ///if user selects rock then set outcome to win
            if(computerMove.equalsIgnoreCase("rock")){
                outcome = "Win";
            }
            else if(computerMove.equalsIgnoreCase("paper")){ //if user selects paper then set outcome to draw
                outcome = "Draw";
            }
            else{
                outcome = "Lose"; //if user selects rock then set outcome to win
            }
        }
        if(playerMove.equalsIgnoreCase("scissors")){  //if user selects scissors then set outcome to lose
            if(computerMove.equalsIgnoreCase("rock")){
                outcome = "Lose";
            }
            else if(computerMove.equalsIgnoreCase("paper")){ //if user selects scissors then set outcome to win
                outcome = "Win";
            }
            else{
                outcome = "Draw";  //if user selects scissors then set outcome to draw
            }
        }
        return outcome; //return whatever is stored in outcome variable

    }
}
