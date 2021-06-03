#include <iostream>
#include <vector>
#include "Complex.h"
using namespace std;

// Gera números aleatórios com partes imaginárias entre 1 e 20
Complex generateRandomComplex() {
    Complex randomComplex(rand() % 20, rand() % 20);
    return randomComplex;
}

int main() {
    srand(time(nullptr));
    int n;
    cin >> n;
    vector<Complex> v;
    // Populando o vetor com numeros complexos aleatórios
    for (int i = 0; i < n; i++) {
        v.push_back(generateRandomComplex());
    }

    // Exibindo os numeros gerados e os somando à um numeor complexo "soma"
    cout << "Numeros gerados:" << endl;
    Complex soma;
    for (int i = 0; i < n; i++) {
        cout << v[i].toString() << endl;
        soma = soma + v[i];
    }

    //Exibindo a soma
    cout << "Soma:" << endl;

    cout << soma.toString() << endl;

    v.clear();

    return 0;
}
