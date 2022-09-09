package Abstract;

import Entities.Gamer;
//Sadece kursta iþlenen konulara göre yazýlmýþtýr.
public interface GamerService {
	void add(Gamer gamer);
	void delete(Gamer gamer);
	void update(Gamer gamer);
}
