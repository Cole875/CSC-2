import java.io.PrintWriter;
import java.util.ArrayList;

public class BattleRoyale {
    public static void main(String[] args){
        SuperHero heroA = new SuperHero(new String[16]), heroB = new SuperHero(new String[16]);

        int damageA = heroA.attack(heroA);
        int damageB = heroA.attack(heroB);


        if(heroA instanceof Champion)
            damageA += Champion.SpecialAbility();
        ArrayList<SuperHero> heroes;

        for(int i = 0; i < heroes.size(); i++){
            for(int j = i + 1; j < heroes.size(); j++){


            }
        }
        if(damageA > damageB){
            System.out.println("a wins");
            heroA.getWin();
            //heroA win++
        }
        else if(damageB > damageA){
            System.out.println("b wins");
            heroA.getLoss();
            //heroA loss ++
        }
        else{
            System.out.println("It is a tie");
            heroA.getTie();
            //heroA.setTie() += hero.get(tie)+ 1;
        }


        PrintWriter writer;
        try{
            writer = new PrintWriter("results.txt");
            for(int i = 0; i < 100; i++)
                writer.println("line " + i);
            writer.close();
        }
        catch (Exception ex){
            System.out.println("File write error");
        }

    }
}
