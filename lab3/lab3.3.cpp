#define _USE_MATH_DEFINES
#include<iostream>
#include<cmath>

using namespace std;
class Complex
{
	private:
		double re;
		double im;
	public:
		void define(double r, double i)//метод ввода
		{
			re = r;
			im = i;
		}
		void display()//метод вывода
		{
			cout << re << "+" << im << "i" << endl;
		}
		double modul()//модуль комплексного числа
		{
			return sqrt(re*re + im*im);
		}
		double arg()//аргумент комплексного числа
		{
			if (re > 0)
				return atan(im / re);
			else if (re < 0 && im >= 0)
				return M_PI + atan(im / re);
			else if (re < 0 && im < 0)
				return -M_PI + atan(im / re);
			else if (re == 0 && im > 0)
				return M_PI / 2;
			else
				return -M_PI / 2;
		}
};
int main()
{
	Complex c1;
	double r, i;
	cout << "Input complex value" << endl;
	cin >> r >> i;
	c1.define(r, i);
	cout << endl << "Complex value:" << endl;
	c1.display();
	cout << "Module: " << c1.modul() << endl;
	cout << "Argument: " << c1.arg() << endl;
	system("pause");
	return 0;
}
