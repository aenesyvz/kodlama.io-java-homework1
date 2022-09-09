package Concrete;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService{
	private GamerCheckService gamerCheckService;

	public GamerManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		// TODO Auto-generated method stub
		if(gamerCheckService.GamerCheck(gamer)) {
			System.out.println(gamer.getFirstName()  + " " + gamer.getLastName() + " sisteme eklendi.");
		}else{
			System.out.println("Bilgilerinizi kontrol edip tekrar giriþ yapmaya çalýþýnýz.");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		// TODO Auto-generated method stub
		if(gamerCheckService.GamerCheck(gamer)) {
			System.out.println(gamer.getFirstName()  + " " + gamer.getLastName() + " sistemden silindi.");
		}else{
			System.out.println("Bilgilerinizi kontrol edip tekrar giriþ yapmaya çalýþýnýz.");
		}

	}

	@Override
	public void update(Gamer gamer) {
		// TODO Auto-generated method stub
		if(gamerCheckService.GamerCheck(gamer)) {
			System.out.println(gamer.getFirstName()  + " " + gamer.getLastName() + " sistemde güncellendi.");
		}else {
			System.out.println("Bilgilerinizi kontrol edip tekrar giriþ yapmaya çalýþýnýz.");
		}
	}
}
