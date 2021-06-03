#include "Radio.h"
#include "Relogio.h"
#include "RadioRelogio.h"
#include <iostream>

int main() {
    Radio radio;
    Relogio relogio;
    RadioRelogio radioRelogio;

    radio.setEstacao(99.2);
    radio.setTipoSinal("FM");
    cout << "Propriedades de Radio:" << endl;
    cout << "Estação: " << radio.getEstacao() << endl;
    cout << "Sinal: " << radio.getTipoSinal() << endl;

    relogio.setHora(23);
    relogio.setMinuto(40);
    relogio.setAlarme(true);
    string alarme = relogio.getAlarme() ? "Ligado" : "Desligado";
    cout << "Propriedades de Relogio:" << endl;
    cout << "Hora: " << relogio.getHora() << endl;
    cout << "Minuto: " << relogio.getMinuto() << endl;
    cout << "Alarme: " << alarme << endl;

    radioRelogio.setAlarme(12, 12, 99.7, "FM");
    cout << "Propriedades de RadioRelogio:" << endl;
    cout << "Estação: " << radio.getEstacao() << endl;
    cout << "Sinal: " << radio.getTipoSinal() << endl;
    cout << "Hora: " << relogio.getHora() << endl;
    cout << "Minuto: " << relogio.getMinuto() << endl;
    cout << "Alarme: " << alarme << endl;
}