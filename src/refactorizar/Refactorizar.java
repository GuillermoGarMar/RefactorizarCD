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

    public static boolean p = false;

    public static void main(String arg[]) {
        int numDigitos = 0;
        int ndigitos = 0;

        numDigitos = pedirNumDigitos();

        for (int i = 1; i <= 99999; i++) {
            int divisionEntera = i;

            int contador = 0;

            while (divisionEntera != 0) {
                divisionEntera = divisionEntera / 10;
                contador++;
            }
            ndigitos = contador;

            if (ndigitos == numDigitos) {
                if (i < 4) {
                    p = true;
                } else {
                    if (i % 2 == 0) {
                        p = false;
                    } else {
                        int contador1 = 0;
                        int i1 = 1;
                        int limite = (i - 1) / 2;
                        if (limite % 2 == 0) {
                            limite--;
                        }

                        while (i1 <= limite) {
                            if (i % i1 == 0) {
                                contador1++;
                            }
                            i1 += 2;
                            if (contador1 == 2) {
                                i1 = limite + 1;
                            }
                        }

                        if (contador1 == 1) {
                            p = true;
                        }
                    }
                }

                if (p == true) {
                    System.out.println(i);
                }
            }
        }
    }

}
