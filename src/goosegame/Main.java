package goosegame;

public class Main {
	
	public static void main(String[] args) 
	{
		
		/* Create the board we are going to play in */
		Board origiBoard = new OriginalBoard();
		
		/* Initiate a game with the board */
		Game aGame = new Game (origiBoard);
		aGame.getBoard().initBoard();
		
		/* Define the player */
		Player firstPlayer = new Player("Zidane");
		Player secondPlayer = new Player("Ronaldo");
		Player thirdPlayer = new Player("Beckam");
		
		/* Add the players to the game*/
		aGame.addPlayer(firstPlayer);
		aGame.addPlayer(secondPlayer);
		aGame.addPlayer(thirdPlayer);
		
		/* Play 20 rounds */
		aGame.playManyTimes(20);

	}

}
