package usp.poo.ex8;

public class Sistema {
    public void processaDados(String s) {
        if(s.contains("789")){
            System.out.println("Falha de integridade: Apagando a disco");
        }else
            System.out.println("Dados processados");
    }

    public void enviaDados(String s) {
        if(s.contains("789")){
            System.out.println("Falha de segurança: abortando procedimento");
        }else
            System.out.println("Dados enviados");
    }
}
