package PWAlgo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import com.company.ShowResult;

public class AllArray {

      ConbinationF conbinationF=new ConbinationF();
      ShowResult showResult=new ShowResult();
      String[] temp;
      int total=0;
      public AllArray(){

     }


     public void getAll() {


          int dimension = 12;
          String[][] initial = new String[][]{
                  {"F", "B", "E"},
                  {"D", "N"},
                  {"U", "N","_"},
                  {"O", "R"},
                  {"S", "L","_"},
                  {"D", "I","_"},
                  {"V", "N"},
                  {"D", "G","_"},
                  {"P", "N", "L"},
                  {"N", "D", "J", "S"}
          };
          temp=new String[initial.length];
          combination(initial,0,0);


     }
     public void combination(String[][] initial, int i,int j){
          for (; i<initial.length;i++) {
               for (; j < initial[i].length; j++) {
                    temp[i] = initial[i][j];
                    //System.out.println(temp[i]);
                    combination(initial, i + 1, 0);
                    if (j + 1 < initial[i].length) {

                         if(conbinationF.TestPairWise(Arrays.toString(temp))){
                              total++;
                         }
                         if(total==170){
                              System.out.println("TOTAL IS:"+total);
                              showResult.show(conbinationF.getResult());
                              System.exit(0);
                         }
                    }

               }
          }


}
}
