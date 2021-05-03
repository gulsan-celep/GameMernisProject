package GameMernisProject;

public class DatabaseLoggerManager implements LoggerService{

	@Override
	public void add(Entity entity) {
		System.out.println("Database added.");
	}

	@Override
	public void update(Entity entity) {
		System.out.println("Database updated");
	}

	@Override
	public void delete(Entity entity) {
		System.out.println("Database deleted");
	}

}
