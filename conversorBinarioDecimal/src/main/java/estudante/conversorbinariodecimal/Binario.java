/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudante.conversorbinariodecimal;

/**
 *
 * @author Alecksandre
 */
public class Binario {

    public String ConverteBinario(int entrada) {
        
        String resultado = "";
        while (entrada > 0) {
            resultado = Integer.toString(entrada % 2) + resultado;
            entrada = entrada / 2;
        }
        return resultado;
    }

}
