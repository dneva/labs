#include<iostream>
#include<string>
using namespace std;
class Tiles
{
	public:
		string brand;//марка
		double size_h;//высота
		double size_w;//ширина
		double price;//цена
		void getData()//вывод информации
		{
			cout << "Brand: " << brand << endl;
			cout << "Size height: " << size_h << endl;
			cout << "Size weight: " << size_w << endl;
			cout << "Price: " << price << endl;
		}
};
int main()
{
	Tiles t1, t2;
	cout << "Input iformation(brand, size(height), size(weight), price) about the first tile" << endl;
	cin >> t1.brand >> t1.size_h >> t1.size_w >> t1.price;
	cout << "Input iformation(brand, size(height), size(weight), price) about the second tile" << endl;
	cin >> t2.brand >> t2.size_h >> t2.size_w >> t2.price;
	cout << endl;
	t1.getData();
	cout << endl;
	t2.getData();
	system("pause");
	return 0;
}
