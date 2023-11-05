package br.dell.modelos;

/**
 * Esta classe é responsável por criar o quarto onde cada hóspede ficará.
 *
 * @author Murilo Martins
 * @version 1.0
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

    /**
     * Cria um objeto Quarto com o número do quarto e o cadastro do hóspede.
     *
     * @param numero O número do quarto.
     * @param hospede O objeto Hospede associado a este quarto.
     */
    public Quarto(int numero, Hospede hospede) {
        super();
        this.numero = numero;
        this.hospede = hospede;
    }
}
