import java.util.Random;

public class Personnage {
	// Attributs
	protected String name;
	private int pv;
	private int pvMax;
	private int strong;
	private int endurance;
	private String[] msg = {"est mort", "exploser", "aplati"};

	// constructeur
	public Personnage(String pName, int pPv, int pStrong, int pEndurance) {
		name = pName;
		pvMax = pPv;
		pv = pPv;
		strong = pStrong;
		endurance = pEndurance;
		System.out.println("personnage " + name + " crée avec " + pv + " PV");
	}

	// Méthodes
	public Personnage() {
		pv = 100;
		System.out.println("Personnage crée !");
	}

	// Get
	public String getName() {
		return name;
	}

	public int getPv() {
		return pv;
	}

	public int getStrong() {
		return strong;
	}

	public int getEndurance() {
		return endurance;
	}

	// Set
	public void setName(String pName) {
		name = pName;
	}

	public void setStrong (int pStrong) {
		strong = pStrong;
	}

	public void setEndurance (int pEndurance) {
		endurance = pEndurance;
	}

	public void setPv(int pPv) {
		if (pPv < 0) pv = 0;
		else pv = pPv;
	}

	public void fiche() {
		if(getEndurance() < 0) {
			endurance = 0;
		}
		System.out.println("nom : " + name + " a " + pv + " point de vies / " + pvMax  + " et possède " + endurance + " d'endurance ");
	}

	public void fight (Personnage ennemi) {
		int r = (int)(Math.random()* 21) + 1;
		if(r < ennemi.getStrong()) {
			ennemi.setPv(ennemi.getPv() - r);
			System.out.println(name + " attaque " + ennemi.name);
		} else {
			System.out.println(name + " a raté son attaque sur " + ennemi.name);
		}
		ennemi.setEndurance(ennemi.getEndurance() - 2);
	}

	// méthode pour message aléatoire quand un personnage perd
	public String death (Personnage ennemi) {
		Random rand = new Random();
		int indexMsg = rand.nextInt(msg.length);
		String msgDeath = name + " " + msg[indexMsg];
		return msgDeath;
	}
}