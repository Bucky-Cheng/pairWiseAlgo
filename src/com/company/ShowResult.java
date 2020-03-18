package com.company;

import java.util.ArrayList;

public class ShowResult {

    public  ShowResult(){

    }

    public void show(ArrayList resultList){
        for(int i=0;i<resultList.size();i++){
            System.out.println(resultList.get(i).toString());
        }
    }
}
