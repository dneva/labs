#include<iostream>
#include<cmath>

using namespace std;
class Vector
{
	private:
		double x;
		double y;
		double z;
	public:
		void define(double x1, double y1, double z1)//метод ввода
		{
			x = x1;
			y = y1;
			z = z1;
		}
		void display()//метод вывода
		{
			cout << " (" << x << ";" << y << ";" << z << ")" <<  endl;
		}
		double modul()//модуль вектора
		{
			return sqrt(x*x + y*y + z*z);
		}
		void sum(Vector v)//сумма векторов
		{
			x += v.x;
			y += v.y;
			z += v.z;
		}
		void min(Vector v)//разница векторов
		{
			x -= v.x;
			y -= v.y;
			z -= v.z;
		}
};
int main()
{
	Vector v1,v2;
	double x, y, z;
	cout << "Input vector" << endl;
	cin >> x >> y >> z;
	v1.define(x,y,z);
	cout << "Module: " << v1.modul() << endl;
	cout << "Input vector for sum" << endl;
	cin >> x >> y >> z;
	v2.define(x, y, z);
	cout << "Result:" << endl;
	v1.sum(v2);
	v1.display();
	cout << "Input vector for subtraction" << endl;
	cin >> x >> y >> z;
	v2.define(x, y, z);
	cout << "Result:" << endl;
	v1.min(v2);
	v1.display();
	system("pause");
	return 0;
}
