package br.cefet;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        
        Atendente at1 = new Atendente("Maria", "12345678900", "Manhã", 
        "Recepcionista", "A001", 2500.0f);
        Treinador t1 = new Treinador("Carlos", "98765432100", "Tarde", 
        "Treinador", "T001", 3000.0f);
        
        Plano p1 = new Plano(EPlano.BLACK, "Plano Black", "2025-12-31", 
        "Cartão", 100.0f);
        Plano p2 = new Plano(EPlano.STANDART, "Plano Standart", "2025-12-31", 
        "Boleto", 50.0f);
        Plano p3 = new Plano(EPlano.BASIC, "Plano Basic", "2025-12-31", 
        "Dinheiro", 30.0f);
        
        Aluno a1 = new Aluno("João", "12345678900", "Rua A", "123", 
        "Bairro B", "Estado C", "12345-678", "123456789", "joao@example.com", 
        "2000-01-01", "2025-01-01", 70.0f, 1.70f, 1, p1);
        Aluno a2 = new Aluno("Jeovanna", "98765432100", "Rua B", "456", 
        "Bairro C", "Estado D", "87654-321", "987654321", "jeovanna@example.com", 
        "2001-02-02", "2025-02-02", 60.0f, 1.57f, 2, p2);
        Aluno a3 = new Aluno("Felipe", "11223344556", "Rua C", "789", 
        "Bairro D", "Estado E", "11223-445", "112233445", "felipe@example.com", 
        "2002-03-03", "2025-03-03", 65.0f, 1.69f, 3, p3);

        Assinatura as1 = new Assinatura(a1, p1, "2025-05-01", "2025-12-31", 
        "Cartão", 100.0f);
        Assinatura as2 = new Assinatura(a2, p2, "2025-06-01", "2025-12-31",
        "Boleto", 50.0f);
        Assinatura as3 = new Assinatura(a3, p3, "2025-07-01", "2025-12-31",
        "Dinheiro", 30.0f);
        
        List<Plano> listaPlanos = new ArrayList<>();
        List<Aluno> listaAlunos = new ArrayList<>();
        
        listaPlanos.add(p1);
        listaPlanos.add(p2);
        listaPlanos.add(p3);
        
        listaAlunos.add(a1);
        listaAlunos.add(a2);
        listaAlunos.add(a3);
        
        Plano.setPlanos(listaPlanos);
        
        System.out.println("Lista de Alunos e seus respectivos Planos:");
        for (Aluno aluno : listaAlunos) {
            System.out.println("Aluno: " + aluno.getNome() + ", Plano: " + aluno.getPlano().getTipo());
        }
        
        System.out.println("\nTotal de planos (via getter): " + Plano.getPlanos().size() + "\n");
        for (Plano plano : Plano.getPlanos()) {
            System.out.println("Plano: " + plano.getNome() + ", Tipo: " + plano.getTipo());
        }

        System.out.println("\nLista de Assinaturas:");
        for (Assinatura assinatura : List.of(as1, as2, as3)) {
            System.out.println("Assinatura: " + assinatura.getAluno().getNome() + 
            ", Plano: " + assinatura.getPlano().getTipo() +", Valor: R$" +assinatura.getValorMensalidade());
        }
        System.out.println("\nLista de Atendentes:");
        for (Atendente atendente : List.of(at1)) {
            System.out.println("Atendente: " + atendente.getNome() + ", Cargo: " + atendente.getCargo());
        }
        System.out.println("\nLista de Treinadores:");
        for (Treinador treinador : List.of(t1)) {
            System.out.println("Treinador: " + treinador.getNome() + ", Cargo: " + treinador.getCargo());
        }
        System.out.println("\nLista de Funcionários:");
        for (Funcionario funcionario : List.of(at1, t1)) {
            System.out.println("Funcionário: " + funcionario.getNome() + ", Cargo: " + funcionario.getCargo());
        }
    }
}
