package br.dell.modelos;
/**
 *Esta classe é responsável por criar o objeto Hóspede.
 *
 * @author Murilo Martins
 * @version 4.0
 * @Param recebe as informações(cpf,rg,nome,idade e endereço) de cada hóspede.
 * @return cada metodo tem um return especifico. Ex.: Cpf tem o return CPF
 */

public class Hospede {
    /* Criando classe modelo Hospede */
    private long CPF;
    private long RG;
    private String nome;
    private int idade;
    private String endereço;

    /* Criando os métodos getters e setters */
    public long getCPF() {
        return CPF;
    }
    public void setCPF(long cPF) {
        CPF = cPF;
    }
    public long getRG() {
        return RG;
    }
    public void setRG(long rG) {
        RG = rG;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getEndereço() {
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    /* Criando um método construtor sem parâmetros */
    public Hospede() {

    }

    /* Criando  um método construtor que receba todos os atributos como parâmetros */
    public Hospede(long cPF, long rG, String nome, int idade, String endereço) {
        super();
        CPF = cPF;
        RG = rG;
        this.nome = nome;
        this.idade = idade;
        this.endereço = endereço;
    }
}
