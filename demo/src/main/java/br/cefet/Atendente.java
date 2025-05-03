package br.cefet;

public class Atendente extends Funcionario {

    // Construtor da classe Atendente
    public Atendente(String nome, String cpf, String turno, String cargo, String matricula, float salario) {
        super(nome, cpf, turno, cargo, matricula, salario); // Chama o construtor da classe Funcionario
    }
}