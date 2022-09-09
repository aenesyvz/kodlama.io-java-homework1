package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		// TODO Auto-generated method stub
		System.out.println(game.getGameName() + " sisteme eklendi.");
	}

	@Override
	public void delete(Game game) {
		// TODO Auto-generated method stub
		System.out.println(game.getGameName() + " sistemden silindi.");

	}

	@Override
	public void update(Game game) {
		// TODO Auto-generated method stub
		System.out.println(game.getGameName() + " sistemden güncellendi.");

	}

}
