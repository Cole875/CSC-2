public class Champion extends SuperHero{

    public Champion(String[] fields) {
        super(fields);

    }

    public int attack(SuperHero oHero){
        int damage = super.attack(oHero);

        damage += this.getPower() * 2.0 - (oHero.getPower())/2;

        return damage;
    }
    public int SpecialAbility(Champion oHero){
        //Copying: When Amazo fights someone with better power than him he copies their abilities. Matching their power.
        if(Champion.getPower() > oHero.getPower() ) {
            //Champion.setPower(oHero.getPower());
            return Champion.getPower();
        }
        else{
            return Champion.getPower();

        }
    }




}
