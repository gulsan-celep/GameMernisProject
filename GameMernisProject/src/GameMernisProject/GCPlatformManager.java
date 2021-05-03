package GameMernisProject;

public class GCPlatformManager implements PlatformService {

	private SalesService salesService;
	
	public GCPlatformManager(SalesService salesService) {
		this.salesService = salesService;
	}

	@Override
	public void buyGame(Gamer gamer, Game[] game) {
		for(Game g : game) {
			salesService.discount(g, 25);
			System.out.println(gamer.getFirstName() +" oyuncu "+ g.getName() +" satýn aldý");
		}
	}

	@Override
	public void toRefund(Gamer gamer, Game[] game) {

		System.out.println(gamer.getFirstName() + " oyunu iade etti.");
	}
	
	

}
