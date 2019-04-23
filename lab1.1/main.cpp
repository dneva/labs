#include "pch.h"
#include "Complex.h"
#include <iostream>
using namespace std;
int main()
{
	Complex a, b;
	int sw = 1;
	cout << "1 - sum, 2 - minus, 3 - multiply, 4 - divide,  0 - exit" << endl;//выбор
	cin >> sw;
	while (sw != 0)
	{
		switch (sw)
		{
		case 1://сложение
		{
			cout << "Input a,b" << endl;
			cin >> a >> b;
			cout << a << "+" << b << "=";
			cout<< a + b << endl;
		}
		break;
		case 2://вычитание
		{
			cout << "Input a,b" << endl;
			cin >> a >> b;
			cout << a << "-" << b << "=";
			cout<< a - b << endl;
		}
		break;
		case 3://умножение
		{
			cout << "Input a,b" << endl;
			cin >> a >> b;
			cout << a << "*" << b << "=";
			cout << a * b << endl;
		}
		break;
		case 4://деление
		{
			cout << "Input a,b" << endl;
			cin >> a >> b;
			cout << a << "/" << b << "=";
			cout << a / b << endl;
		}
		break;
		case 0://выход из цикла
			break;
		default:
			cout << "Repeat input" << endl;
			break;
		}
		cout << "1 - sum, 2 - minus, 3 - multiply, 4 - divide,  0 - exit" << endl;
		cin >> sw;
	}
	system("pause");
	return 0;


}

