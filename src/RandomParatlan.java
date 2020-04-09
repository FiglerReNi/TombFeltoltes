/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FReni
 */
public class RandomParatlan {
    public static void main(String[]args){
        int[] a=new int[20];
        int index=0;
        int b;
        while(index<a.length){
            b=(int)(Math.random()*100)+1;
            if(b%2==1){
                a[index]=b;
                index++;
            }
            }
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        
        
    }
    
}
