package Adapters;

import Abstract.GamerCheckService;
import Entities.Gamer;

//import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
public class MernisServiceAdapter implements GamerCheckService{

	@Override
	public boolean GamerCheck(Gamer gamer) {
		// TODO Auto-generated method stub
		return true;
	}
	//KPSPublicSoapProxy client = new KPSPublicSoapProxy();
}
