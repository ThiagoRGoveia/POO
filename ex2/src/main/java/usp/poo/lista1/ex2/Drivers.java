package usp.poo.lista1.ex2;

/*
 * Classe que reune propriedades e métodos comuns
 * e será extendida pelas demais
 */
public class Drivers {
    private String status;
    // Contrutor  recebe um status e o armazena
    Drivers (String status) {
        this.status = status;
    }
    // Recupera o status
    public String verificaStatus () {
        return status;
    }
    // Altera status para "ligado"
    public void ligaDispositivo () {
        setStatus("Ligado");
    }
    // Altera status para para valor fornecido em argumento
    public void setStatus (String status) {
        this.status = status;
    }
    // Executa teste e retorna string contendo o status
    public String executaTeste () {
        return "Status: " + this.verificaStatus();
    }

}
