package br.cefet;

public class Treinador extends Funcionario {
    
    public Treinador(String nome, String cpf, String turno, String cargo, String matricula, float salario){
        super(nome, cpf, turno, cargo, matricula, salario); // Chama o construtor da classe Funcionario
    }

}
