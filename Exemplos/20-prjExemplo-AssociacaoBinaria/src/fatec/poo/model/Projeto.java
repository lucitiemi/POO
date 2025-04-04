package fatec.poo.model;

/**
 *
 * @author ltshi
 */
public class Projeto {
    private int codigo;
    private String descricao;
    private String dtInicio;
    private String dtTermino;
    private Funcionario[] funcionarios;
    private int numFunc;

    // construtor
    public Projeto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        funcionarios = new Funcionario[5];
        numFunc = 0;
    }

    // getters e setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(String dtInicio) {
        this.dtInicio = dtInicio;
    }

    public String getDtTermino() {
        return dtTermino;
    }

    public void setDtTermino(String dtTermino) {
        this.dtTermino = dtTermino;
    }
    
    // outros metodos
    public void addFuncionario(Funcionario f) {
        funcionarios[numFunc] = f;
        numFunc++;
    }
    
    public void listarFuncionarios(){
        System.out.println("Código: " + codigo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Data Início: " + dtInicio);
        System.out.println("Data Término: " + dtTermino);
        
        System.out.println("\nREGISTRO     NOME                      CARGO                     DEPARTAMENTO");
        System.out.println("---------------------------------------------------------------------------------");
        
        for(int cont=0; cont<numFunc; cont++){
            System.out.printf("%-12s %-25s %-25s %-20s\n",
                funcionarios[cont].getRegistro(),
                funcionarios[cont].getNome(),
                funcionarios[cont].getCargo(),
                funcionarios[cont].getDepartamento().getNome()
            );
        }
        
        
    }
}
