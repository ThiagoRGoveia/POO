#ifndef RADIO_H
#define RADIO_H

#include "Dispositivo.h"
#include <iostream>

class Relogio: public Dispositivo
{
private:
    int hora;
    int minuto;
    bool alarmeLigado;
public:
    int getHora();
    void setHora(int hora);
    int getMinuto();
    void setMinuto(int minuto);
    bool getAlarme();
    void setAlarme(bool alarmeLigado);
    void ligaDesliga();
};

int Relogio::getHora() {
    return hora;
}
void Relogio::setHora(int hora) {
    this->hora = hora;
}
int Relogio::getMinuto() {
    return minuto;
}
void Relogio::setMinuto(int minuto) {
    this->minuto = minuto;
}
bool Relogio::getAlarme() {
    return alarmeLigado;
}
void Relogio::setAlarme(bool alarmeLigado) {
    this->alarmeLigado = alarmeLigado;
}

void Relogio::ligaDesliga() {
    if (ligado) {
        cout << "Relógio Ligado" << endl;
    } else {
        cout << "Relógio Desligado" << endl;
    }
    ligado = !ligado;
}

#endif
