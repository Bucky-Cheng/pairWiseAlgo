package com.company;

import PWAlgo.AllArray;
import PWAlgo.pairwiseALGO;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
    pairwiseALGO pairwise=new pairwiseALGO();
    ArrayList tempResult=new ArrayList();
    //tempResult.add("B,D,U,O,S,D,V,D,P,S");
    //tempResult.add("F,N,U,O,S,D,V,D,N,N");
    pairwise.Generate("FDUOSDVDPN",tempResult);
        AllArray allArray=new AllArray();
       //allArray.getAll();
    }
}
