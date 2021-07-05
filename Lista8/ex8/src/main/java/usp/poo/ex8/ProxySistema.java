package usp.poo.ex8;

public class ProxySistema {
    private Sistema sistema;
    ProxySistema() {
        sistema = new Sistema();
    }
    public void processaDados(String s) {
        if(s.contains("789")){
            System.out.println("ERRO: código malicioso detectado, abortando");
        }else
            sistema.processaDados(s);
    }

    public void enviaDados(String s) {
        if(s.contains("789")){
            System.out.println("ERRO: código malicioso detectado, abortando");
        }else
           sistema.enviaDados(s);
    }
}
