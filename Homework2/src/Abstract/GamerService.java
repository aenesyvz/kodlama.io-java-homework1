package Abstract;

import Entities.Gamer;
//Sadece kursta i�lenen konulara g�re yaz�lm��t�r.
public interface GamerService {
	void add(Gamer gamer);
	void delete(Gamer gamer);
	void update(Gamer gamer);
}
