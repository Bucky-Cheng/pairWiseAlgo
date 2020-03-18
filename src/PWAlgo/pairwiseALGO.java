package PWAlgo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class pairwiseALGO {

    public pairwiseALGO() {

    }
    //boolean flafD=true;
    public boolean Generate(String tpm, ArrayList copyresult) {

        String str = "";
        str = tpm;

        str = str.substring(0, str.length() - 1);

        copyresult.remove(str);

        ArrayList r = new ArrayList();

        int len = tpm.length();

        for (int i = 0; i < len; i++) {

            for (int j = i + 1; j < len; j++) {

                String[] st = new String[len];

                for (int k = 0; k < len; k++) {

                    st[k] = "*";
                }
                st[i] = String.valueOf(tpm.charAt(i));

                st[j] = String.valueOf(tpm.charAt(j));

                String ss = java.util.Arrays.asList(st).toString();

                ss = ss.replaceAll("\\[", "").replaceAll("\\]", "");

                //System.out.println(ss);
                r.add(ss);
            }

        }
        //System.out.println(r.get(1));

        int N=0;
        boolean bol = true;
        for (int i = 0; i < r.size(); i++) {

            boolean flag=false;
            String k = (String) r.get(i);

            //System.out.println("MAP is:" + copyresult);
            //System.out.println("---------------------------------------");
            for (int j = 0; j < copyresult.size(); j++) {

                String t = copyresult.get(j).toString();

                //System.out.println("T is:" + t);
                //System.out.println("K is:" + k);
                //System.out.println("---------------------------------------");
                if (PairCompare(t, k)){
                    //System.out.println("N is:"+N);
                    bol=bol&&true;
                    flag=true;
                    //System.out.println("REPEATED");//repeated
                    break;
                }else{


                }


            }
            //System.out.println("FLAG:"+flag);
            if(flag==false){
                bol=false;

            }
        }

        if(copyresult.isEmpty()){

            return false;
        }else {
            //System.out.println("bol:"+bol);
            //System.out.println("-----------------------------------------");
            return bol;
        }
    }

    public boolean PairCompare(String test,String beTested){
        test=test.replaceAll(",","");

        beTested=beTested.replaceAll(",","").replaceAll(" ","");
        //System.out.println("TEST:"+test);
        //System.out.println("BETEST:"+beTested);
        char[] testArray=test.toCharArray();
        char[] beTestedArray=beTested.toCharArray();
        int flag=0;
        for(int i=0;i<testArray.length;i++){
            //System.out.println("TTT:"+testArray[i]+"  BE:"+beTestedArray[i]);
            if(testArray[i]==beTestedArray[i]){
                flag++;

            }
        }
        if(flag==2){

            return true;  //repeated
        }else {
           //System.out.println("Different");
            return false;    //no repeated
        }
    }



}
