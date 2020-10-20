public class Dauntless extends Tank{
    public Dauntless(String[] fields) {
        super(fields);
    }

    public static boolean meetsConditions(String[] fields){
        return Integer.parseInt(fields[4]) == 100;
    }

    public int attack(SuperHero oHero){
        int damage = super.attack(oHero);

        damage += this.getDurability() * 2.0 - oHero.getStrength();

        return damage;
    }



}
