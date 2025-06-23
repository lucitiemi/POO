package fatec.poo.model;
/**
 *
 * @author ltshi
 */
public class GameShop {
    private int codigo;
    private String nome;
    private int idade;
    private String tipoGamer; // F-Frequente ou E-Esporádico
    private int saldo;

    public GameShop(int codigo, String nome, int saldo) {
        this.codigo = codigo;
        this.nome = nome;
        this.saldo = saldo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public String getTipoGamer() {
        return tipoGamer;
    }

    public void setTipoGamer(String tipoGamer) {
        this.tipoGamer = tipoGamer;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public void jogarHoras(int horasJogadas) {
        saldo -= horasJogadas;
    }
    
    public void comprarHoras(int horasCompradas) {
        saldo += horasCompradas;
        if (tipoGamer == "F" || tipoGamer == "f") {
            saldo += (horasCompradas / 3);
        }
    }
    
    public void brinde(){
        saldo = saldo*2;
    }
}
