/**
 * @author José Henrique
 * @since 04/05/2021
 */
public class estatisticaUmidade {

    double nSensores [];

    /**
     * @param sensores
     */
    public estatisticaUmidade (double sensores[]){
        this.nSensores = sensores;
    }

    /**
     * @return double
     */
    public double media() {
        double soma = 0;
        for(int i=0; i< this.nSensores.length;i++) {
            soma += this.nSensores[i];
        }
        return soma/this.nSensores.length;
    }

    /**
     * @return double
     */
    public double DP (){
        double media = this.media();
        double soma = 0;
        for(int i=0; i< this.nSensores.length;i++) {
            soma += Math.pow((this.nSensores[i]-media),2);
        }
        return Math.sqrt((soma/this.nSensores.length));
    }
}
