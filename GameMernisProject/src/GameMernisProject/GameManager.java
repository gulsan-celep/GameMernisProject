package GameMernisProject;

public class GameManager implements GameService {

	LoggerService loggerService;
	
	public GameManager(LoggerService loggerService) {
		this.loggerService = loggerService;
	}
	
	@Override
	public void add(Game game) {
		loggerService.add(game);
		System.out.println(game.getName()+ " added");
	}

	@Override
	public void update(Game game) {
		loggerService.update(game);
		System.out.println(game.getName()+ " updated");
	}

	@Override
	public void delete(Game game) {
		loggerService.delete(game);
		System.out.println(game.getName()+ " deleted");
	}

}
