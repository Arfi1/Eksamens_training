package Demo1;

import java.util.ArrayList;

public class Tekst {
    private ArrayList<String> teskstLinjer;

    public void add(String teskstStreng) {
        teskstLinjer.add(teskstStreng);
    }

   public int findAntalUnikke() {

        int antalUnikke = 0;

        for (int i = 0; i< teskstLinjer.size(); i++) {
            boolean erUnik = true;

            for (int j=0;j<i; j++) {
                if (teskstLinjer.get(i).equals(teskstLinjer.get(j))) {
                    erUnik = false;
                    break;
                }
            }

            if(erUnik){
                antalUnikke++;
            }

       }

        return  antalUnikke;
   }



}
