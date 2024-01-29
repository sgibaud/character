public class App {
    public static void main(String[] args) {
        int r = (int) (Math.random() * 51);
        Warrior conan = new Warrior("Conan", r, 10, 15, 6);
        Sorcer rasputine = new Sorcer("Rasputine", r, 10, 9, 6);
        // System.out.println(conan.getName());

        // conan.fiche();
        // conan.bigBlow(rasputine);
        // rasputine.foudre(conan);

        // // première version du combat
        // while (conan.getPv() > 0 && rasputine.getPv() > 0) {
        // if (conan.getPv() > 0) {
        // conan.bigBlow(rasputine);
        // rasputine.fiche();
        // }
        // if (rasputine.getPm() > 0 && rasputine.getPv() > 0) {
        // rasputine.foudre(conan);
        // // rasputine.soin();
        // conan.fiche();
        // } else if (rasputine.getPm() <= 0 && rasputine.getPv() > 0) {
        // rasputine.fight(conan);
        // rasputine.fiche();
        // System.out.println(rasputine.getName() + " en chie !");
        // };
        // };

        // méthode avec polymorphisme
        while (conan.getPv() > 0 && rasputine.getPv() > 0) {
            conan.superAttack(rasputine);
            rasputine.superAttack(conan);
        };

        if (conan.getPv() > 0) {
            System.out.println(rasputine.death(rasputine));
        } else {
            System.out.println(conan.death(conan));
        }
    }
}
