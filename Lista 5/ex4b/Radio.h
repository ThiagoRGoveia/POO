#ifndef RELOGIO_H
#define RELOGIO_H

#include <string>
#include "Dispositivo.h"
#include <iostream>
using namespace std;

class Radio: public Dispositivo
{
    private:
        float estacao;
        string tipoSinal;
    public:
        float getEstacao();
        void setEstacao(float estacao);
        string getTipoSinal();
        void setTipoSinal(string tipoSinal);
        void ligaDesliga();
};

float Radio::getEstacao() {
    return estacao;
}
void Radio::setEstacao(float estacao) {
    this->estacao = estacao;
}
string Radio::getTipoSinal() {
    return tipoSinal;
}
void Radio::setTipoSinal(string tipoSinal) {
    this->tipoSinal = tipoSinal;
}

void Radio::ligaDesliga() {
    if (ligado) {
        cout << "Rádio Ligado" << endl;
    } else {
        cout << "Rádio Desligado" << endl;
    }
    ligado = !ligado;
}

#endif
