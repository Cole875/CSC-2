public class Speedster extends SuperHero {
    public Speedster(String[] fields) {
        super(fields);
    }

    public static boolean meetsConditions(String[] fields){
        return Integer.parseInt(fields[3]) > 90;
    }

    public int attack(SuperHero oHero){
        int damage = super.attack(oHero);

        damage += this.getSpeed() * 1.25 - oHero.getSpeed();

        return damage;
    }

}
