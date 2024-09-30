
package estudante.lojaonlinecn.model;

/**
 *
 * @author Alecksandre
 */
public class Camisa {
    
    private String codigoCamisa;
    private String nomeCamisa;
    private String descricaoCamisa;
    private double precoCamisa;
    private String corCamisa;
    private String tamanhoCamisa;

    public Camisa(String codigoCamisa, String nomeCamisa, String descricaoCamisa, double precoCamisa, String corCamisa, String tamanhoCamisa) {
        this.codigoCamisa = codigoCamisa;
        this.nomeCamisa = nomeCamisa;
        this.descricaoCamisa = descricaoCamisa;
        this.precoCamisa = precoCamisa;
        this.corCamisa = corCamisa;
        this.tamanhoCamisa = tamanhoCamisa;
    }



    /**
     * @return the codigoCamisa
     */
    public String getCodigoCamisa() {
        return codigoCamisa;
    }

    /**
     * @param codigoCamisa the codigoCamisa to set
     */
    public void setCodigoCamisa(String codigoCamisa) {
        this.codigoCamisa = codigoCamisa;
    }

    /**
     * @return the nomeCamisa
     */
    public String getNomeCamisa() {
        return nomeCamisa;
    }

    /**
     * @param nomeCamisa the nomeCamisa to set
     */
    public void setNomeCamisa(String nomeCamisa) {
        this.nomeCamisa = nomeCamisa;
    }

    /**
     * @return the descricaoCamisa
     */
    public String getDescricaoCamisa() {
        return descricaoCamisa;
    }

    /**
     * @param descricaoCamisa the descricaoCamisa to set
     */
    public void setDescricaoCamisa(String descricaoCamisa) {
        this.descricaoCamisa = descricaoCamisa;
    }

    /**
     * @return the precoCamisa
     */
    public double getPrecoCamisa() {
        return precoCamisa;
    }

    /**
     * @param precoCamisa the precoCamisa to set
     */
    public void setPrecoCamisa(double precoCamisa) {
        this.precoCamisa = precoCamisa;
    }

    /**
     * @return the corCamisa
     */
    public String getCorCamisa() {
        return corCamisa;
    }

    /**
     * @param corCamisa the corCamisa to set
     */
    public void setCorCamisa(String corCamisa) {
        this.corCamisa = corCamisa;
    }

    /**
     * @return the tamanhoCamisa
     */
    public String getTamanhoCamisa() {
        return tamanhoCamisa;
    }

    /**
     * @param tamanhoCamisa the tamanhoCamisa to set
     */
    public void setTamanhoCamisa(String tamanhoCamisa) {
        this.tamanhoCamisa = tamanhoCamisa;
    }
    
    
    
}
