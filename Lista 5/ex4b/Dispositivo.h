#ifndef DISPOSITIVO_H
#define DISPOSITIVO_H

#include <string>
#include <iostream>
using namespace std;

class Dispositivo
{
    private:
        string fabricante;
    public:
        bool ligado = false;
        void defineFabricante(string fabricante);
        string pegaFabricante();
        virtual void ligaDesliga();
};

void Dispositivo::defineFabricante(string fabricante) {
    this->fabricante = fabricante;
}

string Dispositivo::pegaFabricante() {
    return fabricante;
}

void Dispositivo::ligaDesliga() {
    if (ligado) {
        cout << "Ligado" << endl;
    } else {
        cout << "Desligado" << endl;
    }
    ligado = !ligado;
}


#endif
