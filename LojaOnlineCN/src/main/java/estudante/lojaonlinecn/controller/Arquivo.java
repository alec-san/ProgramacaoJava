

package estudante.lojaonlinecn.controller;

import estudante.lojaonlinecn.model.Camisa;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 *
 * @author Alecksandre
 */
public class Arquivo {
    
    public Arquivo(){
        
    }
    
    public void SalvarObjetoNoArquivo(Camisa camisa){
        try {
            OutputStream os = new FileOutputStream("camisa.txt", true);
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);    

            String linha = camisa.getNomeCamisa() + "," + camisa.getDescricaoCamisa() + "," +
                    camisa.getPrecoCamisa() + "," + camisa.getCorCamisa() + "," + camisa.getTamanhoCamisa();

            bw.write(linha);
            bw.newLine();
            
            bw.close();
            osw.close();
            os.close();
            
        }catch(Exception e){
            System.out.println("Não consegui salvar dados no Arquivo!");
        }      
    }
}
