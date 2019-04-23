#ifndef Complex_H
#define Complex_H
#include<iostream>
using namespace std;
class Complex
{
		private:
			double real;
			double img;
		public:
			Complex(double r=0, double i=0);
			Complex& operator=(const Complex& right);
			friend Complex operator+ (Complex& left, Complex& right);
			friend ostream& operator<<(ostream& out, const Complex& c);
			friend istream& operator>>(istream& in, Complex& c);
};


#endif
