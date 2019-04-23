#include"pch.h"
#include"Complex.h"
#include<iostream>
using namespace std;
Complex::Complex(double r, double i) : real(r), img(i) {};
Complex& Complex::operator=(const Complex& right) {
	if (this == &right) {
		return *this;
	}
	real = right.real;
	img = right.img;
	return *this;
};
Complex operator+ (Complex& left, Complex& right) {
	left.real += right.real;
	left.img += right.img;;
};

ostream& operator<<(ostream& out, const Complex& c)
{
	out << c.real << "+" << c.img << "i";
	return out;
};

istream& operator>>(istream& in, Complex& c)
{
	in >> c.real >> c.img;
	return in;
};


