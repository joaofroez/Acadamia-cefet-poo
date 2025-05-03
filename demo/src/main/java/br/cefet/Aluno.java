package br.cefet;

public class Aluno {
    private String nome, cpf, logradouro, numerocasa, bairro, estado, cep, telefone, email,
    datanascimento, datamatricula;
    private float peso, altura;
    private int matriculaAluno;
    private Plano plano;

    // Construtor Padrão
    public Aluno() {
        // Inicialização padrão
    }

    // Construtor Parametrizado
    public Aluno(String nome, String cpf, String logradouro, String numerocasa, String bairro, String estado, String cep, String telefone, String email, String datanascimento, String datamatricula, float peso, float altura, int matriculaAluno, Plano plano) {
        this.nome = nome;
        this.cpf = cpf;
        this.logradouro = logradouro;
        this.numerocasa = numerocasa;
        this.bairro = bairro;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
        this.email = email;
        this.datanascimento = datanascimento;
        this.datamatricula = datamatricula;
        this.peso = peso;
        this.altura = altura;
        this.matriculaAluno = matriculaAluno;
        this.plano = plano;
    }

    // Getters
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public String getNumerocasa() {
        return numerocasa;
    }
    public String getBairro() {
        return bairro;
    }
    public String getEstado() {
        return estado;
    }
    public String getCep() {
        return cep;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getEmail() {
        return email;
    }
    public String getDatanascimento() {
        return datanascimento;
    }
    public String getDatamatricula() {
        return datamatricula;
    }
    public int getMatriculaAluno() {
        return matriculaAluno;
    }
    public float getPeso() {
        return peso;
    }
    public float getAltura() {
        return altura;
    }
    public Plano getPlano() {
        return plano;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public void setNumerocasa(String numerocasa) {
        this.numerocasa = numerocasa;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }
    public void setDatamatricula(String datamatricula) {
        this.datamatricula = datamatricula;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public void setMatriculaAluno(int matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }
    public void setPlano(Plano plano) {
        this.plano = plano;
    }
}
