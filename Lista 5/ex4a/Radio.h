#ifndef RELOGIO_H
#define RELOGIO_H

#include <string>
using namespace std;

class Radio
{
    private:
        float estacao;
        string tipoSinal;
    public:
        float getEstacao();
        void setEstacao(float estacao);
        string getTipoSinal();
        void setTipoSinal(string tipoSinal);
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

#endif
