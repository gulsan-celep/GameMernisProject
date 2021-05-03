package GameMernisProject;

import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {

		Gamer gamer = new Gamer(1, "14785161","Gülþan","Celep", new GregorianCalendar(1997, 12 , 12).getTime());
		
		Game game = new Game("Pes2014","GC",1400);
		Game game2 = new Game("Pes2016","GC",1800);

		GamerManager gamerManager = new GamerManager(new DatabaseLoggerManager(), new MernisValidateManager()); 
		gamerManager.add(gamer);
		
		GameManager gameManager = new GameManager(new DatabaseLoggerManager());
		gameManager.add(game);
		gameManager.update(game);
		
		GCPlatformManager gcPlatformManager = new GCPlatformManager(new BlackFridaySalesManager());
		
		Game[] games = {game, game2};
		
		gcPlatformManager.buyGame(gamer, games);
		gcPlatformManager.toRefund(gamer, games);
		
	}

}
