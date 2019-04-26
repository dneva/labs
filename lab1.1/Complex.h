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
			Complex(double r=0, double i=0);//конструктор	
			Complex& operator=(const Complex& right);//перегрузка оператора =
			friend Complex operator+ (Complex& left, Complex& right);//перегрузка оператора +
			friend Complex operator- (Complex& left, Complex& right);//перегрузка оператора -
			friend Complex operator*(Complex& left, Complex& right);//перегрузка оператора *
			friend Complex operator/(Complex& left, Complex& right);//перегрузка оператора /
			friend ostream& operator<<(ostream& out, const Complex& c);//перегрузка оператора <<
			friend istream& operator>>(istream& in, Complex& c);//перегрузка оператора >>
};
#endif
