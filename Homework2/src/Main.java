import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SalesManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gamer gamer1 = new Gamer(1,"Alper Enes","Yavuz","12345");
		Campaign campaign1 = new Campaign(1,"Yaz Kampanyasý",30);
		Game game1 = new Game(1, "FIFA 2021", "Futbol",250 );
		
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.add(gamer1);
		
		System.out.println("******************************************");
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		
		System.out.println("******************************************");

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		
		System.out.println("******************************************");

		SalesManager salesManager = new SalesManager(new MernisServiceAdapter());
		salesManager.CampaignWithSales(gamer1, game1, campaign1);
		salesManager.CampaignWithOutSales(gamer1, game1);
		System.out.println("******************************************");

	}

}
