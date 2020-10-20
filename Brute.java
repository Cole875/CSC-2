public class Brute extends SuperHero {

        public Brute(String[] fields) {
            super(fields);
        }

        public static boolean meetsConditions(String[] fields){
            return Integer.parseInt(fields[1]) < 20 && Integer.parseInt(fields[2]) > 70;
        }

        public int attack(SuperHero oHero){
            int damage = super.attack(oHero);

            damage -= (this.getStrength() - this.getIntelligence())/2.0;

            return damage;
        }


}



