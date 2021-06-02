#ifndef COMPLEX_H
#define COMPLEX_H

#include "math.h"
#include <string>
#include <sstream>
using namespace std;

class Complex
{
    private:
        int real;
        int imaginary;
    public:
        Complex(int a, int b);
        static Complex add(Complex a, Complex b);
        static Complex subtract(Complex a, Complex b);
        static Complex multiply(Complex a, Complex b);
        static double modulus(Complex a);
        int getReal();
        int getImaginary();
        string toString();
};

Complex::Complex(int a, int b) {
    real = a;
    imaginary = b;
}

Complex Complex::add(Complex a, Complex b) {
    int realSum = a.getReal() + b.getReal();
    int imaginarySum = a.getImaginary() + b.getImaginary();
    return Complex(realSum, imaginarySum);
}

Complex Complex::subtract(Complex a, Complex b) {
    int realSub = a.getReal() - b.getReal();
    int imaginarySub = a.getImaginary() - b.getImaginary();
    return Complex(realSub, imaginarySub);
}

Complex Complex::multiply(Complex a, Complex b) {
    int realMult = (a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary());
    int imaginaryMult = (a.getImaginary() * b.getImaginary() + b.getReal() * a.getImaginary());
    return Complex(realMult, imaginaryMult);
}

double Complex::modulus(Complex a) {
    return sqrt(pow(a.getReal(), 2) + pow(a.getImaginary(), 2));
}

int Complex::getReal() {
    return real;
}

int Complex::getImaginary() {
    return imaginary;
}

string Complex::toString() {
    std::stringstream ss;
    ss << getReal() << " + " << getImaginary() << "i";
    return ss.str();
}

#endif