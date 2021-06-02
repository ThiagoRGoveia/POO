#include "Complex.h"
#include <iostream>
using namespace std;


int main()
{
    Complex a(1, 2);
    Complex b(3, 4);
    cout << (a + b).toString() << endl;
    cout << (a - b).toString() << endl;
    cout << (a * b).toString() << endl;
    cout << (Complex::modulus(a)) << endl;
    return 0;
}
