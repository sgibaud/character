import java.util.Random;

public class Sorcer extends Personnage {
	// Attributs
	private int pm;
	protected int pmMax;

	public Sorcer(String pName, int pPv, int pPm, int pStrong, int pEndurance) {
		super(pName, pPv, pStrong, pEndurance);
		pmMax = pPm;
		pm = pPm;
	}

	// Get
	public int getPm() {
		return pm;
	}

	// Set
	public void setPm(int pPm) {
		pm = pPm;
	}

	// Méthode
	public void superAttack(Personnage ennemi) {
		if (getEndurance() > 0) {
			System.out.println(name + " lance un éclair sur " + ennemi.name);
			int r = (int) (Math.random() * 6) + 1;
			ennemi.setPv(ennemi.getPv() - r);
			pm -= 1;
			setEndurance(getEndurance() - 2);
		} else {
			// on peut utiliser le "this" -> this.fight(ennemi)
			// qui stipule qu'on est dans le personnage sorcier en cours
			fight(ennemi);
			System.out.println(name + " en chie !");
		}
		ennemi.fiche();
	}

	public void soin() {
		setPv(getPv() + 10);
		System.out.println(name + " se soigne ");
	}
}
