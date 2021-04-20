package usp.poo.lista1.ex2;

public class Drivers {
    private String status;

    Drivers (String status) {
        this.status = status;
    }

    public String verificaStatus () {
        return status;
    }

    public void ligaDispositivo () {
        setStatus("Ligado");
    }

    public void setStatus (String status) {
        this.status = status;
    }

    public String status () {
        return status;
    }

    public String executaTeste () {
        return status;
    }

}
