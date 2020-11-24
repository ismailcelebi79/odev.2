/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinamikdizi;

import java.util.Iterator;

/**
 *
 * @author ÇELEBİ
 */
public class DinamikDizi implements Iterable<Integer> {

     private int[] dizi=null;

   
    private int kapasite=5;
    private int uzunluk=0;

    
    public DinamikDizi(){
        
        dizi= new int [kapasite];
        
    } 
    
    public DinamikDizi(int kap){
    
    kapasite=kap;
    dizi= new int [kapasite];
    
}
    public void ekle(int veri){
        
  
        
                   
    }
 
    public void ekle (int veri, int n){
        
    }
    
    public void sil(){
    
    
}
    public void sil(int veri){
        
        
    }
    public void silindex(int index ){
    }
    
    public int kapasite(){
        return kapasite;
        
    }
    
    public int uzunluk (){
        
        return uzunluk;
}
     public int[] getDizi() {
        return dizi;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int index=0;
            @Override
            public boolean hasNext() {
              return index<uzunluk;
            }

            @Override
            public Integer next() {
                return dizi[index++];
    
            }
        
        
    };
       
    }
}