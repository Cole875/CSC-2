public class tuition{
    public static void main(String[] args) {
        double tuition = 10000;
        double gain = 1.05;
        for(int i =0; i < 15; i++){
            tuition = tuition * gain;
            double result = tuition;
            double total_now = tuition;
            int years = i+1;

            if(i < 4) {
                System.out.println("Year "+years+" "+result);

            }
            if(i == 4){
                System.out.println(result+=result);
            }
            if(i == 10){
                System.out.println("Year "+i+" "+result);
            }
            if(i == 14){
                System.out.println(result+= result);
            }
        }

    }

}