public class Cosmic extends SuperHero {
    public Cosmic(String[] fields) {
        super(fields);
    }

    public static boolean meetsConditions(String[] fields){
        return Integer.parseInt(fields[5]) == 100;
    }

    public int attack(SuperHero oHero){
        int damage = super.attack(oHero);

        damage += this.getPower() * 2.0 - (oHero.getPower())/2;

        return damage;
    }


}
