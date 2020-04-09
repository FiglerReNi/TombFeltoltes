/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FReni
 */
public class Prim {
    public static void main(String[]args){
        int[] a=new int[20];
        int b;
        int c=0;
        while(c<20){
            for(int i=2; i<72; i++){
                b=0;
                for(int j=1; j<=i; j++){
                    if(i%j==0){
                        b++;
                    }
                }
                if(b==2){
                    a[c]=i;
                    System.out.print(i+" ");
                    c++;
                }
            }           
        }               
    }    
}
