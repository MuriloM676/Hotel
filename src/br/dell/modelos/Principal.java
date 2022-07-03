package br.dell.modelos;
/**
 *Esta classe é responsável por criar o cadastro de cada hóspede
 *e gerenciar em cada quarto o hospede irá ficar.
 *
 * @author Murilo Martins
 * @version 4.0
 * @param Principal recebe os dados do hóspede e cria um cadastro e depois aloca o hóspede em um quarto vazio.
 * @exception InputMismatchException valida de a idade contem apenas numeros do tipo int.
 */
import java.util.ArrayList;
import java.util.InputMismatchException;
import  javax.swing.JOptionPane;

@SuppressWarnings("SpellCheckingInspection") // Silenciar erros de português

public class Principal {

    public static void main(String[] args) {
        //INSTANCIA A CLASSE HOSPEDE
        Hospede hospede = new Hospede();

        String nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
        hospede.setNome(nome);

        boolean valueNome = nome.matches("\\d"); // Tratamento da variável nome para ver se há somente letras.
        if (valueNome) {
            System.err.println("Erro. Insira um valor válido!");
        }

        String endereco = JOptionPane.showInputDialog(null, "Digite seu endereço: ");
        hospede.setEndereço(endereco);

        try {
            String idadeStr = JOptionPane.showInputDialog(null, "Digite sua idade: ");
            int idade = Integer.parseInt(idadeStr);
            hospede.setIdade(idade);
        } catch(InputMismatchException e) {
            System.err.println("Erro. Insira um valor válido!");
        }

        try {
            String cpfStr = JOptionPane.showInputDialog(null, "Digite seu CPF: ");
            long cpf = Integer.parseInt(cpfStr);
            hospede.setCPF(cpf);
        } catch(NumberFormatException e) {
            System.err.println("Erro. Insira um valor válido!");
        }

        String rgStr = JOptionPane.showInputDialog(null, "Digite seu RG: ");
        long rg = Integer.parseInt(rgStr);
        hospede.setRG(rg);

        JOptionPane.showMessageDialog(null, "Hóspede cadastrado com sucesso! ");

        //INSTANCIA A CLASSE QUARTO
        //String numeroStr = JOptionPane.showInputDialog(null, "Numero do quarto: ");
        //int numeroQuarto = Integer.parseInt(numeroStr);

        //new Quarto(numeroQuarto, hospede1);

        //EXIBINDO OS DADOS DO HOSPEDE E O NUMERO DO SEU QUARTO
        JOptionPane.showMessageDialog(null, hospede);
        //JOptionPane.showMessageDialog(null,"Número do Quarto: " + numeroQuarto);


        /* Instanciando o objeto 'quartos' do tipo Lista.
         * Foi escolhido esse tipo lista, pois esse tipo de estrutura permiti apenas um tipo de dado.
         */
        ArrayList<Hospede> quartos = new ArrayList<Hospede>();
        quartos.add(hospede);
        JOptionPane.showMessageDialog(null, "Hospede está no Quarto: " + quartos.indexOf(hospede));

    }
}
