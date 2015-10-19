#include "stdafx.h"                             //все стандартно
#include <iostream>
using namespace std;

int main()
{
	setlocale(LC_CTYPE, "Russian_Russia.1251"); //мен§ем кодировку проекта на российскую Windows, доп. библиотек не требует

	double a;                                   //double - т.к. число м.б. вещественным
	cout << "¬ведите значение a: ";
	cin >> a;
	int n;                                      //тоже м.б. вещественным, но вас таким вр€д ли будут мучить
	cout << "¬ведите значение n: ";
	cin >> n;

	double sum = 1 / a;
	for (n; n != 0; n--)                        //считаем сумму, начина€ с последнего элемента до первого
		sum += 1 / pow(a, pow(2, n));           //pow(a,n) - оператор возведени€ a в степень n, если попросит без него - делаете с вложенным циклом
	cout << "—умма = " << sum << endl << endl;

	system("pause");
	return 0;
}