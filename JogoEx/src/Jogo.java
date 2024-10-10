public class Jogo {

    public static int playGame(int numberOfRounds) {

        int gameNumber = NumberGenerator.chooseNumber(numberOfRounds);
        int player1Number = Player1.Move(numberOfRounds);
        int player2Number = Player2.Move(numberOfRounds);
        while (gameNumber != player1Number && gameNumber != player2Number) {

            System.out.println("Player 1 chose the number : "+ player1Number+ " Player 2 chose the number: " + player2Number + " Try again!");
            player1Number= Player1.Move(numberOfRounds);
            player2Number= Player2.Move(numberOfRounds);
        }
        if(player2Number == player1Number) {
            System.out.println("Player 1 chose the number : " + player1Number + " Player 2 chose the number: " + player2Number + " You both WON!");
            }

        if(gameNumber == player1Number && gameNumber != player2Number){
            System.out.println("Player 1 chose the number: "+ player1Number+" Player 1 wins!!");
        }
        if(gameNumber == player2Number && gameNumber != player1Number){
            System.out.println("Player 2 chose the number: "+ player2Number+" Player 2 wins!!");
        }

        //
        return player1Number ;




}}
