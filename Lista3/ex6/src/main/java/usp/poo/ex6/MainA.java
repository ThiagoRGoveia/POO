package usp.poo.ex6;

public class MainA {
    public static void main (String[] args) {
        Dispositivo video = new Video();
        Dispositivo mouse = new Mouse();
        Dispositivo teclado = new Teclado();

        System.out.println(video.checarStatus());
        video.ligar();
        System.out.println(video.checarStatus());
        video.calibrar();
        System.out.println(video.checarStatus());
        video.atualizarDriver();
        video.desligar();
        System.out.println(video.checarStatus());

        System.out.println();

        System.out.println(mouse.checarStatus());
        mouse.ligar();
        System.out.println(mouse.checarStatus());
        mouse.calibrar();
        System.out.println(mouse.checarStatus());
        mouse.atualizarDriver();
        mouse.desligar();
        System.out.println(mouse.checarStatus());

        System.out.println();

        System.out.println(teclado.checarStatus());
        teclado.ligar();
        System.out.println(teclado.checarStatus());
        teclado.calibrar();
        System.out.println(teclado.checarStatus());
        teclado.atualizarDriver();
        teclado.desligar();
        System.out.println(teclado.checarStatus());
    }
}
