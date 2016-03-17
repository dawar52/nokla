package com.work;

public class Invert {
    public void invert(int mas[]){
        int buffer=0;
        int n=mas.length;
        for(int i=0;i<n/2;i++){
            buffer=mas[i];
            mas[i]=mas[n-i-1];
            mas[n-i-1]=buffer;
        }
      }
}
