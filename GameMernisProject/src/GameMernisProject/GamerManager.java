package GameMernisProject;

public class GamerManager implements GamerService {

	private LoggerService loggerService;
	private UserValidateService userValidateService;
	
	public GamerManager(LoggerService loggerService, UserValidateService userValidateService) {
		this.loggerService = loggerService;
		this.userValidateService = userValidateService;
	}
	
	@Override
	public void add(Gamer gamer) {
		if(!userValidateService.validate(gamer)) {
			System.out.println("Kullanýcý bulunamadý");
			return;
		}
		loggerService.add(gamer);
		System.out.println("Gamer added");
	}

	@Override
	public void update(Gamer gamer) {
		loggerService.update(gamer);
		System.out.println(gamer.getFirstName()+ " updated");
	}

	@Override
	public void delete(Gamer gamer) {
		loggerService.delete(gamer);
		System.out.println(gamer.getFirstName()+ " deleted");

	}

}
