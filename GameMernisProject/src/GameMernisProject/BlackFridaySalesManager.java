package GameMernisProject;

public class BlackFridaySalesManager implements SalesService {

	@Override
	public void discount(Entity entity, int discount) {
		System.out.printf("%d indirim yapýldý", discount);
	}

}
