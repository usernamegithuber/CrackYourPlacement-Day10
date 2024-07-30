package CrackYourPlacementDay10;

import java.util.*;
public class PrintDuplicateCharinString {
    public static void findfrequency(String s){
        HashMap<Character ,Integer> hs=new HashMap<>();
        for(char c:s.toCharArray()){
            hs.put(c,hs.getOrDefault(c,0)+1);
        }
        for(char c:hs.keySet()){
            System.out.println("character :"+ c+ ", frequency:"+hs.get(c));
        }

    }
       public static void main(String[] args){
           PrintDuplicateCharinString sc=new PrintDuplicateCharinString();
           String s="Geekgeeksforgeeks";
           findfrequency(s);
    }
}
