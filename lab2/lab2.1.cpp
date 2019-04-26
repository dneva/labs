#include<iostream>
using namespace std;
double sum(double a, double b)
{
	return a + b;
};
double min(double a, double b)
{
	return a - b;
};
double multiply(double a, double b)
{
	return a*b;
};
double divide(double a, double b)
{
	if (b != 0)
		return a/b;
	else return 0;
};
int main()
{
	double a, b;
	double(*act)(double a, double b);
	int s = 1;
	cout << "1 - sum, 2 - minus, 3 - multiply, 4 - divide,  0 - exit" << endl;//выбор
	cin >> s;
	while (s != 0)
	{
		switch (s)
		{
		case 1://сложение
		{
			cout << "Input a,b" << endl;
			cin >> a >> b;
			act = sum;
			cout << a << " + " << b << " = " << act(a, b) << endl;
		}
		break;
		case 2://вычитание
		{
			cout << "Input a,b" << endl;
			cin >> a >> b;
			act = min;
			cout << a << " - " << b << " = " << act(a, b) << endl;

		}
		break;
		case 3://умножение
		{
			cout << "Input a,b" << endl;
			cin >> a >> b;
			act = multiply;
			cout << a << " * " << b << " = " << act(a, b) << endl;

		}
		break;
		case 4://деление
		{
			cout << "Input a,b" << endl;
			cin >> a >> b;
			act = divide;
			cout << a << " / " << b << " = " << act(a, b) << endl;

		}
		break;
		case 0://выход из цикла
			break;
		default:
			cout << "Repeat input" << endl;
			break;
		}
		cout << "1 - sum, 2 - minus, 3 - multiply, 4 - divide,  0 - exit" << endl;
		cin >> s;
	}
	return 0;
}
