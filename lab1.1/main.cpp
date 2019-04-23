// ConsoleApplication2.cpp : Этот файл содержит функцию "main". Здесь начинается и заканчивается выполнение программы.
//

#include "pch.h"
#include "Complex.h"
#include <iostream>
using namespace std;
int main()
{
	Complex c1, c2;
	cin >> c1 >> c2;
	c1 = c1 + c2;
	cout << c1;

}

