import java.util.Random;

public class Warrior extends Personnage {
	// Attributs
	private int bersek;

	public int getBersek() {
		return bersek;
	}

	// Constructeur
	public Warrior(String pName, int pPv, int pBersek, int pStrong, int pEndurance) {
		super(pName, pPv, pStrong, pEndurance);
		bersek = pBersek;
	}

	// méthodes
	public void superAttack(Personnage ennemi) {
		if(this.getEndurance() > 0) {
			System.out.println(name + " attaque avec bersek " + ennemi.name);
			int r = (int)(Math.random()* 6) + 1;
			ennemi.setPv(ennemi.getPv() - r);
			bersek -= 1;
			setEndurance(getEndurance() - 2);
		} else {
			this.fight(ennemi);
            System.out.println(name + " en chie !");
		}
		ennemi.fiche();
	}
}
