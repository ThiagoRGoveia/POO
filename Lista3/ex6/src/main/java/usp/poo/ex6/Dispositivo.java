package usp.poo.ex6;
// Reune demais interfaces em uma unica que sera utilziada para chamada
// polimórfica dos métodos. Esses métodos foram divididos em várias interfaces
// para manter o código modular.
interface Dispositivo extends Ligavel, PossuiStatus, Calibravel {
    abstract void atualizarDriver();
}
