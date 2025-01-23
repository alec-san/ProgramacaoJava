/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudante.conversorbinariodecimal;

import static java.lang.Math.pow;

/**
 *
 * @author Alecksandre
 */
public class Decimal {
    
    public int converteDecimal(int entrada){
        
        int valor, sobra, novoValor=0;
        valor = entrada;
        
        //calcula os dígitos da direita para a esquerda
        for(int i = 0; i < 6; i++){
            sobra = valor -((valor/10)*10);
            valor = valor / 10;
            novoValor = (int) (novoValor + sobra*pow(2,i));
        }
        return novoValor;
    }
    
}
