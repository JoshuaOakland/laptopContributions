//If  either knight is hit restart the round
//If either knight is killed exit match
//If player wins, allow access Life Management
//If player loses replay life, and give eulogy.
//Give option to continue or exit. On exit, save game state.
//On continue move player to world map selection.
//>> Start with basic round. match win or lose
//>> Move onto 
//Need round counter

//to use in a game say, gameLogic gameTracker = new gameLogic();
//gameTracker.incrementPlayerWin();
//gameTracker.checkGameStatus();
//enter game loop again.
//gameTracker.incrementEnemyWin();
//gameTracker.checkGameStatus();
//enter game loop again.
//gameTracker.incrementPlayerWin();
//gameTracker.checkGameStatus();
//gameTracker sets exit game flag, OR, gameTracker calls exit() on super with Player win. Depends on which class I want to handle exiting...gameScreen sounds like better OO code practice, however handling the exit within the gameLogic class/object sounds EASIER.

public class gameLogic.java
{
	//instance variables, counters
	private int playerWin,enemyWin,gameOver;
	//constructor
	private gameLogic()
	{
		//Contestants start at 0.
		playerWin = 0;
		enemyWin = 0;
		//Victory condition parameter.
		gameOver = 3;
	}
	private void checkGameStatus()
	{
		if (playerWin>=gameOver)
		{
			//exit game
			System.out.println("Game over, player wins.");
		}
		else if (enemyWin>=gameOver)
		{
			//exit game
			System.out.println("Game over, player loses.");
		}
	}
	private void setPlayerWin(int winInput)
	{
		playerWin = winInput;
	}
	private void setEnemyWin(int winInput)
	{
		enemyWin = winInput;
	}
	private void incrementPlayerWin()
	{
		++playerWin;
	}
	private void incrementEnemyWin()
	{
		++enemyWin;
	}
	private int getPlayerWin()
	{
		return playerWin;
	}
	private int getEnemyWin()
	{
		return enemyWin;
	}
}
