package fatec.poo.model;

/**
 *
 * @author ltshi
 */
public class Departamento {
    private String sigla;
    private String nome;
    private Funcionario[] funcionarios; // matriz de objetos, represetando a multipliidade 1..*
    private int numFunc;

    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        funcionarios = new Funcionario[5];
        numFunc = 0; // indica o primeiro elemento da matriz - nao precisaria disso, pq quando se cria o objeto, esse atributo ja eh inicializado com zero
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void addFuncionario(Funcionario f) {
        funcionarios[numFunc] = f;
        numFunc++;
    }
    
    public void listarFuncionarios() {
        int cont=0;
        System.out.println("Sigla: " + sigla);
        System.out.println("Nome: " + nome);
        System.out.println("Qtde de Funcionários: " + numFunc);
        
        System.out.println("\nREGISTRO       NOME                      CARGO");
        System.out.println("----------------------------------------------------------");

        for (cont = 0; cont < numFunc; cont++) {
            System.out.printf("%-12s %-25s %-20s\n",
                funcionarios[cont].getRegistro(),
                funcionarios[cont].getNome(),
                funcionarios[cont].getCargo());
        }
        
    }
}
