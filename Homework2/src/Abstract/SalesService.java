package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface SalesService {
	void CampaignWithSales(Gamer gamer,Game game,Campaign campaign);
	void CampaignWithOutSales(Gamer gamer,Game game);
}
