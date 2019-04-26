#include<iostream>
#include<ctime>
#include<string>
using namespace std;
class Child
{
	private:
		string name;//поле имени
		string fam;//поле фамилии
		int age;//поле возраста
	public:
		void define(string n, string f, int a)//метод ввода
		{
			name = n;
			fam = f;
			age = a;		
		}
		void display()//метод вывода
		{
			cout << "Name: " << name << endl;
			cout << "Surname: " << fam << endl;
			cout << "Age: " << age << endl;
		}
};
int main()
{
	Child c1, c2;
	string n, f;
	int a;
	cout << "Input iformation(name,surname,age) about first child:" << endl;
	cin >> n >> f >> a;
	c1.define(n,f,a);
	cout << "Input iformation(name,surname,age) about second child:" << endl;
	cin >> n >> f >> a;
	c2.define(n, f, a);
	c1.display();
	cout << endl;
	c2.display();
	system("pause");
	return 0;
}
