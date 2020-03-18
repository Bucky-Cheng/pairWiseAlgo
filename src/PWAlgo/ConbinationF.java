package PWAlgo;

import java.util.ArrayList;

public class ConbinationF {

    pairwiseALGO pairwise=new pairwiseALGO();
    ArrayList CorrectCase=new ArrayList();
    ArrayList DeCorrectCase=new ArrayList();

    public ConbinationF(){

    }

    public Boolean TestPairWise(String newCase){
        String testCase1=newCase.replaceAll(" ","").replaceAll("\\[", "").replaceAll("\\]", "");
        String testCase=testCase1.replaceAll(",","");
        //System.out.println(testCase1);
        if(pairwise.Generate(testCase,CorrectCase)){

            return false;

        }else{
            CorrectCase.add(testCase1);
            return true;
        }

    }

    public ArrayList getResult(){
        return CorrectCase;
    }
}
