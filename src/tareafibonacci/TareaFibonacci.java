/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareafibonacci;

import java.util.Scanner;

/**
 *
 * @author NORMAN
 */
public class TareaFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeroF, fibonacci = 0;
        int inicio1 = 1;
        int almacenar;
        boolean one = false;
        System.out.print("Numero para calcular fibonacci: ");
        Scanner intro = new Scanner(System.in);
        numeroF = intro.nextInt();
        if (numeroF == 1 || numeroF == 0) {
            System.out.println("1");
            one = true;
        }
        if (one == false) {
            for (int i = 1; i <= numeroF; i++) {
                almacenar = fibonacci;
                fibonacci = fibonacci + inicio1;
                inicio1 = almacenar;
            }
        }

        System.out.println(inicio1);
    }

}
