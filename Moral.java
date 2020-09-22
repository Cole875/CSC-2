import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
public class Moral {
    public static void main(String[] args){
        System.out.println(testAlgorithm(20));


    }
    public static double testAlgorithm(int n){
        System.out.println(n+" Scenarios Run");
        List result = new ArrayList();
        int a = Generator.getScenario();
        String b = Generator.getGroup();
        String c = Generator.getGroup();


        for(int k = n; k ==0; k--) {
            System.out.println(decideSwerve(a, b, c));
            List totals = new ArrayList();
            List saved = new ArrayList();
            List compare = new ArrayList();
            int find = 0;

            if (decideSwerve(a, b, c) == false) {

                totals.add(c);
                saved.add(b);
                compare.add(c);
            }
            else {
                totals.add(b);
                saved.add(c);
                compare.add(b);
            }


            //Count found individuals
            for(int g = 0; g < b.length(); g++)
                for(int q = 0; q < totals.size(); q++){
                    if(compare.get(q) == totals.get(q)){
                        find++;

                    }
                    if(find == 1){
                        System.out.println(compare.get(g));
                    }


                }

        }

        return 0.0;
    }
    public static boolean decideSwerve(int a, String b, String c){

        System.out.println(b);
        System.out.println(c);
        //Create List the determines the value of each individual in the group
        //Determine that value, calculate the results.
        List citizen = new ArrayList();
        citizen.add("s");
        citizen.add("t");
        citizen.add("q");
        citizen.add("p");
        citizen.add("g");
        citizen.add("h");
        citizen.add("m");
        citizen.add("n");
        citizen.add("i");
        citizen.add("j");
        citizen.add("e");
        citizen.add("f");
        citizen.add("a");
        citizen.add("b");
        citizen.add("k");
        citizen.add("l");
        citizen.add("c");
        citizen.add("d");
        citizen.add("r");
        citizen.add("o");

        boolean choice = true;
        if(b.length()> c.length()){
            choice = true;
        }
        else if(b.length()<c.length()) {
            choice = false;

        }
        else{
            int totalb= 0;
            int totalc= 0;

            char[] groupb = b.toCharArray();
            char[] groupc = c.toCharArray();
            for(int i = 0; i <b.length(); i++){
                for( int j = 0; j < citizen.size(); j++){
                    Character bperson = groupb[i];
                    Character cperson = groupc[i];
                    if(bperson == (citizen.get(j))){
                        totalb +=  j+1;
                        //calculate the value of the group
                    }
                    if(cperson == citizen.get(j)){
                        totalc +=  j+1;
                    }


                }
                //Determine which group is better and save them
                if(totalb> totalc){
                    choice = true;

                }
                else{
                    choice = false;

                }
            }

        }
        System.out.println(choice);
        return choice;
    }



}
