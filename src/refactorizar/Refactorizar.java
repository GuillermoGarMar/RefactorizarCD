/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorizar;

import javax.swing.JOptionPane;

/**
 *
 * @author ggarciamartinez
 */
public class Refactorizar {

    /**
     * @param args the command line arguments
     */
    //Codificado por: sAfOrAs
    //LIstar los numeros según el numero de digitos indicado
    //Considero solo hasta numeros menores a 100000 (5 digitos), 
    //por el hecho de k buscar numeros primos a partir de 6 digitos, el proceso se hace muy lento.
    public static int pedirNumDigitos() {
        int n = 0;
        while (n <= 0) {
            n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el nº de digitos"));
            if (n <= 0) {
                JOptionPane.showMessageDialog(null, "Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
            }
        }
        return n;
    }
    
    public static int calculaDigitos(int numero){
        int cont=0;
        while (numero != 0) {
                numero = numero / 10;
                cont++;
            }
        return cont;
    }
    
    public static boolean Primo = false;
    
    public static void MostrarPrimos(int num1, int num2, int cont){
        if (num1 == num2) {
                if (cont < 4) {
                    Primo = true;
                } else {
                    if (cont % 2 == 0) {
                        Primo = false;
                    } else {
                        int contador1 = 0;
                        int i1 = 1;
                        int limite = (cont - 1) / 2;
                        if (limite % 2 == 0) {
                            limite--;
                        }

                        while (i1 <= limite) {
                            if (cont % i1 == 0) {
                                contador1++;
                            }
                            i1 += 2;
                            if (contador1 == 2) {
                                i1 = limite + 1;
                            }
                        }

                        if (contador1 == 1) {
                            Primo = true;
                        }
                    }
                }

                if (Primo == true) {
                    System.out.println(cont);
                }
            }

    }

   
    public static void main(String arg[]) {
        int numDigitos = 0;
        int ndigitos = 0;

        numDigitos = pedirNumDigitos();

        for (int i = 1; i <= 99999; i++) {

            ndigitos = calculaDigitos(i);
            MostrarPrimos(ndigitos,numDigitos,i);
            
        }
    }

}
