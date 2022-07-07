package br.dell.modelos;
/**
 *Esta classe é responsável por criar o quarto onde cada hóspede ficará.
 *
 * @author Murilo Martins
 * @version 4.0
 * @Param recebe o numero do Quarto e o cadastro do Hóspede.
 * @return numero do quarto.
 */
public class Quarto {
    /* Criando classe modelo Quarto */
    private int numero;
    private Hospede hospede;

    /* Getter and Setter */
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public Hospede getHospede() {
        return hospede;
    }
    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    /* Metodo construtor recebendo todos os parâmetros */
    public Quarto(int numero, Hospede hospede) {
        super();
        this.numero = numero;
        this.hospede = hospede;
    }

}
