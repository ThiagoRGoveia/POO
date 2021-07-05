package usp.poo.ex8;

public class SistemaDecorator {
    private Sistema sistema;
    SistemaDecorator() {
        sistema = new Sistema();
    }

    public void processaDados(String s) {
        if(s.contains("789")){
            sistema.processaDados("987");
        }else
            sistema.processaDados(s);
    }

    public void enviaDados(String s) {
        if(s.contains("789")){
            sistema.enviaDados("987");
        }else
           sistema.enviaDados(s);
    }
}
