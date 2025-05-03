package br.cefet;

public class Funcionario {
    private String nome;
    private String cpf;
    private String turno;
    private String cargo;
    private String matricula;
    private float salario;

    // Construtor Padrão
    public Funcionario() {
        // Inicialização padrão
    }

    // Construtor Parametrizado
    public Funcionario(String nome, String cpf, String turno, String cargo, String matricula, float salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.turno = turno;
        this.cargo = cargo;
        this.matricula = matricula;
        this.salario = salario;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    // Getters e Setters para cargo, matricula e salario
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome + "\nCPF: " + cpf + "\nTurno: " + turno + "\nCargo: " + cargo + "\nSalário: " + salario + "\nMatrícula: " + matricula;
    }
}
