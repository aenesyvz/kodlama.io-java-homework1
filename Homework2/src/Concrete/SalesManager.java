package Concrete;

import Abstract.GamerCheckService;
import Abstract.SalesService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SalesManager implements SalesService{
	private GamerCheckService gamerService;

	public SalesManager(GamerCheckService gamerService) {
		super();
		this.gamerService = gamerService;
	}

	@Override
	public void CampaignWithSales(Gamer gamer, Game game, Campaign campaign) {
		// TODO Auto-generated method stub
		if(gamerService.GamerCheck(gamer)) {
			double price = game.getPrice() - campaign.getDiscount();
			System.out.println("Gamer Id: " + gamer.getId() + " " + "Game Name: " + game.getGameName() + " " + "Price: "  + price);
		}
	}

	@Override
	public void CampaignWithOutSales(Gamer gamer, Game game) {
		// TODO Auto-generated method stub
		System.out.println("Gamer Id: " + gamer.getId() + " " + "Game Name: " + game.getGameName() + " " + "Price: "  + game.getPrice());
	}

}
