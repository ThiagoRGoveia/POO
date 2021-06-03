#include "Dispositivo.h"
#include "Radio.h"
#include "Relogio.h"

int main() {
    Dispositivo *dispositivo;
    Radio radio;
    Relogio relogio;

    radio.setEstacao(99.2);
    radio.setTipoSinal("FM");

    relogio.setHora(23);
    relogio.setMinuto(40);
    relogio.setAlarme(true);

    dispositivo = &radio;

    dispositivo->ligaDesliga();
    dispositivo->ligaDesliga();

    dispositivo = &relogio;
    dispositivo->ligaDesliga();
    dispositivo->ligaDesliga();
}