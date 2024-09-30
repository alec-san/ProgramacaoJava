
package estudante.lojaonlinecn;

import estudante.lojaonlinecn.model.Camisa;

/**
 *
 * @author Alecksandre
 */
public class LojaOnlineCN {

    public static void main(String[] args) {
        
        Camisa cl = new Camisa("25879","Polo","Polo esportiva",50.90,"Azul","M");
        
        System.out.println("\n\n");
        System.out.println("Nome da Camisa: " + cl.getNomeCamisa());
        System.out.println("Descrição da Camisa: " + cl.getDescricaoCamisa());
                
             
    }
}
