package com.company;

public class PerfectSquare {
    public static void main(String[] args) {
        int num=1000;
        for(int i=0;i<num;i++){
            double sqrt=Math.sqrt(i);
            if(sqrt-Math.floor(sqrt)==0){
                System.out.println(i);
            }
        }
    }
}
