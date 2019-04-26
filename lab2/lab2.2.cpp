#include<iostream>
#include<ctime>
#include<algorithm>
using namespace std;
bool comp(int a, int b)//компанатор
{
	return a > b;
}
int sum(int *mas, unsigned size)//функция для суммы
{
	int result=0;
	for (int i = 0; i < size; i++) result += mas[i];
	return result;
}
void f1(int *mas, unsigned size)//функция инвертации 
{
	reverse(&mas[0], &mas[size]);
}
void f2(int *mas, unsigned size)//функция отсортировать по неубыванию
{
	sort(&mas[0], &mas[size]);
}
void f3(int *mas, unsigned size)//функция отсортировать по невозрастанию
{
	sort(&mas[0], &mas[size],comp);
}
void(*switcher(int *mas, unsigned size))(int *mas, unsigned size)//выбор функции
{
	if (sum(mas, size) == mas[0])
		return f1;
	else if (sum(mas, size) > mas[0])
		return f2;
	else
		return f3;
}
int main()
{
	srand(time(0));
	int a[10];
	cout << "Original array:" << endl;
	for (int i = 0; i < 10; i++)
	{
		a[i] = rand() % 100-20;
		cout << a[i] << " ";
	}
	cout << endl;	
	void(*p)(int *mas, unsigned size);	
	p = switcher(a,10);
	p(a, 10);
	cout << "Сonverted array:" << endl;
	for (int i = 0; i < 10; i++) cout << a[i] << " ";
	cout << endl;
	system("pause");
	return 0;
}
