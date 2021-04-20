public class Processador {
    private int iClock;
    private String sFabricante;
    private int iCores;
    private int iCoresEmExecução;

    public Processador (int iClock, String sFabricante, int iCores){
        this.iClock = iClock;
        this.sFabricante = sFabricante;
        this.iCores = iCores;
        iCoresEmExecução = 0;
    }
}
