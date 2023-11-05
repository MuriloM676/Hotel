package br.dell.modelos;

/**
 * Esta classe é responsável por criar o objeto Hóspede.
 *
 * @author Murilo Martins
 * @version 1.0
 */
public class Hospede {
    /* Criando classe modelo Hospede */
    private long CPF;
    private long RG;
    private String nome;
    private int idade;
    private String endereco; // Corrigido para "endereco" em vez de "endereço"

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
    public String getEndereco() { // Corrigido para "getEndereco"
        return endereco;
    }
    public void setEndereco(String endereco) { // Corrigido para "setEndereco"
        this.endereco = endereco;
    }

    /* Criando um método construtor sem parâmetros */
    public Hospede() {

    }

    /* Criando um método construtor que receba todos os atributos como parâmetros */
    public Hospede(long cPF, long rG, String nome, int idade, String endereco) { // Corrigido para "endereco" em vez de "endereço"
        super();
        CPF = cPF;
        RG = rG;
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }
}