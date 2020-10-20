public class Savage extends Brute{
    public Savage(String[] fields) {
        super(fields);
    }

    public static boolean meetsConditions(String[] fields){
        return Integer.parseInt(fields[2])- Integer.parseInt(fields[1]) > 65;
    }

    public int attack(SuperHero oHero){
        int damage = super.attack(oHero);

        damage += this.getStrength() - oHero.getStrength();

        return damage;
    }



}
