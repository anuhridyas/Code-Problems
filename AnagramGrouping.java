package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by jiteshnambiar on 4/19/16.
 */


class MyComparator implements Comparator<String >{
    public static  String sortChar(String s){
      char[] content= s.toCharArray();
        Arrays.sort(content);
        return new String(content);

       }


    @Override
    public int compare(String s1,String s2){
    return sortChar(s1).compareTo(sortChar(s2)) ;}

}
public class AnagramGrouping {
    public static  void main(String[] args){
        ArrayList<String> stringArrayList=new ArrayList<>();
        stringArrayList.add("cat");
        stringArrayList.add("god");
        stringArrayList.add("act");
        stringArrayList.add("tac");
        stringArrayList.add("dog");
        stringArrayList.sort(new MyComparator() );
        for(String s:stringArrayList){
            System.out.println(s);
        }



}}
