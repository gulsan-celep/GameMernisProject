package GameMernisProject;

public interface PlatformService {

	void buyGame(Gamer gamer, Game[] game);
	void toRefund(Gamer gamer, Game[] game);
}