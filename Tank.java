public class Tank extends SuperHero {
    public Tank(String[] fields) {
        super(fields);
    }

    public static boolean meetsConditions(String[] fields){
        return Integer.parseInt(fields[4]) > 20;
    }

    public int attack(SuperHero oHero){
        int damage = super.attack(oHero);

        damage += this.getDurability() * 1.5;

        return damage;
    }
}
