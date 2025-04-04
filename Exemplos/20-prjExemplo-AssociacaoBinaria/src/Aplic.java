
import fatec.poo.model.*; // o asterisco indica que todas as classes desse pacote são importadas

/**
 *
 * @author Dimas
 */
public class Aplic {
    public static void main(String[] args) {
        FuncionarioHorista funcHor = new FuncionarioHorista(1010,
                                                            "Pedro Silveira",
                                                            "14/05/1978",
                                                            15.80);
        FuncionarioMensalista funcMen = new FuncionarioMensalista(2020,
                                                            "Ana Beatriz", 
                                                            "22/10/1997",
                                                            600.0);
        
        FuncionarioComissionado funcCom = new FuncionarioComissionado(3030, 
                                                            "Joao Mendes",
                                                            "10/12/1975",
                                                            10);
        
        Departamento dep1 = new Departamento("CP", "Compras");
        Departamento dep2 = new Departamento ("VD", "Vendas");
        
        funcHor.setCargo("Programador");
        funcMen.setCargo("Aux. Administrativo");
        funcCom.setCargo("Vendedor");
     
        //Estabelece a associação entre um objeto da classse FuncionárioHorista
        //com um objeto da classe Departamento Compras
        funcHor.setDepartamento(dep1);
        System.out.println("O funcionario horista " + funcHor.getNome() + 
                           " trabalha no departamento de " + funcHor.getDepartamento().getNome());
    
        //Estabelece a associação entre um objeto da classse FuncionárioMensalista
        //com um objeto da classe Departamento Compras
        funcMen.setDepartamento(dep1);
        System.out.println("O funcionario mensalista " + funcMen.getNome() + 
                           " trabalha no departamento de " + funcMen.getDepartamento().getNome());
    
        //Estabelece a associação entre um objeto da classse FuncionárioComissionado
        //com um objeto da classe Departamento Vendas
        funcCom.setDepartamento(dep2);
        System.out.println("O funcionario comissionado " + funcCom.getNome() + 
                           " trabalha no departamento de " + funcCom.getDepartamento().getNome());
    
        //Estabelece a associação entre um objeto da classe Departamento Compras com
        //um objeto das classes FuncionarioHorista e FuncionarioMensalista
        dep1.addFuncionario(funcHor);
        dep1.addFuncionario(funcMen);
                
        //Estabelece a associação entre um objeto da classe Departamento Vendas com
        //um objeto da classe FuncionarioComissionado
        dep2.addFuncionario(funcCom);
        
        
        System.out.println("\n\n-- LISTA FUNCIONÁRIOS DEPARTAMENTO DE COMPRAS --\n");
        dep1.listarFuncionarios();
        
        System.out.println("\n\n-- LISTA FUNCIONÁRIOS DEPARTAMENTO DE VENDAS --\n");
        dep2.listarFuncionarios();
        
        
        
        // criando o projeto e colocando os funcionarios associados
        Projeto proj1 = new Projeto(8080, "Implementação novo sistema");
        
        proj1.setDtInicio("01/03/2025");
        proj1.setDtTermino("01/03/2026");
        
        proj1.addFuncionario(funcHor);
        proj1.addFuncionario(funcMen);
        proj1.addFuncionario(funcCom);
        
        System.out.println("\n\n-- LISTA FUNCIONÁRIOS DEPARTAMENTO DO PROJETO 1 --\n");
        proj1.listarFuncionarios();
     
    
    }    
}
