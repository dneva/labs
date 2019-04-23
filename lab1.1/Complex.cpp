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
	left.img += right.img;
	return left;
};
Complex operator- (Complex& left, Complex& right) {
	left.real -= right.real;
	left.img -= right.img;
	return left;
};
Complex operator*(Complex& left, Complex& right) {
	double r, i;
	r = left.real*right.real - left.img*right.img;
	i = left.img*right.real + left.img*right.real;
	left.real = r;
	left.img = i;
	return left;
};
Complex operator/(Complex& left, Complex& right) {
	Complex r, i;
	i = right;
	i.img = -i.img;
	r = left * i;
	i = right * i;
	if (r.real != 0)
	{
		left.real = r.real / i.real;
		left.img = 0;
	}
	else if (r.img != 0)
	{
		left.img = r.img / i.real;
		left.real = 0;
	}
	return left;
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



