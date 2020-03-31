/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueb;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author julian
 */
public class Prueb {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
   int n=11;
   int matriz[][]=new int [n][n];
   String matriz2[][]= new String [n][n];
   
      for (int i = 0; i < n; i++) {
          for (int j = 0; j < n; j++) {
             matriz[i][j] = i+j; 
          }
          
      }
      
       for (int i = 0; i < n; i++) {
          for (int j = 0; j < n; j++) {
             
              System.out.print(matriz[i][j]+"\t");
          }
           System.out.println("");
      }
      
       for (int i = 0; i < n; i++) {
          for (int j = 0; j < n; j++) {
             matriz2[i][j] =""; 
          }
          
      }
      int medio=n/2;
      
    for (int i = 0; i < medio; i++) {
          for (int j = i; j < n-i; j++) {
             
             matriz2[i][j]=""+matriz[i][j];
             matriz2[n-i-1][j]=""+matriz[n-i-1][j];
          }
          
      }
    
       for (int i = 0; i < n; i++) {
          for (int j = 0; j < n; j++) {
             
              System.out.print(matriz2[i][j]+"\t");
          }
           System.out.println("");
      }
      
    }
}