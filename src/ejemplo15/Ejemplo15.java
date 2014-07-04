/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplo15;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class Ejemplo15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    int n=0;int posicion =0;int suma=0; int suma2=0; int mayor =0;
    n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la dimension del vector"));
    int[] arreglo1=new int[n];
        for (int i = 0; i < n; i++) {
            arreglo1 [i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valores al vector"));
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (i == j) {
                    suma= i;
                    mayor = suma;
                }
               suma2= i+j;
                if (suma2 > mayor) {
                    mayor = suma2;
                }
            }
        }
         JOptionPane.showMessageDialog(null,mayor); 
    }
}
