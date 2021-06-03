#ifndef RADIORELOGIO_H
#define RADIORELOGIO_H

#include "Relogio.h"
#include "Radio.h"

class RadioRelogio: public Relogio, public Radio {
    public:
        void setAlarme(int hora, int minuto, int estacao, string tipoSinal);
};

void RadioRelogio::setAlarme(int hora, int minuto, int estacao, string tipoSinal) {
        setHora(hora);
        setMinuto(minuto);
        setEstacao(estacao);
        setTipoSinal(tipoSinal);
        Relogio::setAlarme(true);
    }

#endif
