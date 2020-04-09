/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FReni
 */
public class Ismetlodesnelkul {
    public static void main(String[]args){
        int[] a=new int[5];
        boolean bennevan;
        int b;
        int c=0;
        while(c<5){
            b=(int)(Math.random()*90)+1;
            bennevan=false;
            for(int i=0; i<a.length; i++){
                if(b==a[i]){
                    bennevan=true;
                }
                           }
            if(bennevan==false){
                a[c]=b;
                c++;
            }
        }
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }       
    }   
}
