#include "pch.h"
#include "Complex.h"
#include <iostream>
#include <fstream>
#include <string>
using namespace std;
int main()
{
	ifstream fin("Complex.txt");
	char s1,s2;
	int n,i=0;
	fin >> s1;
	n = s1 - '0';
	Complex *p=new Complex[n];
	while (fin >> s1)
	{
		fin >> s2;
		p[i].define(s1 - '0',s2 - '0');
		i++;
	}
	Complex max;
	for (int i=0; i < n; i++)
	{
		if (p[i].module() > max.module())
			max = p[i];
	}
	cout << "Complex number: " << max << " with max module: " << max.module() << endl;
	system("pause");
	return 0;
}

