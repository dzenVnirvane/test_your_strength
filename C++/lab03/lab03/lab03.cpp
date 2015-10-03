// Ласьков Святослав - лабораторная работа №3
// Дано целое число. Получить новое число, развернув в записи исходного числа его левую и правую половину на 180 градусов.

#include "stdafx.h"
#include <iostream>
using namespace std;


int main()
{
	int x, y, proverka0, proverka = 0, a, b, c, d = 1, result = 0, result2 = 0, result3, length = 0, length1 = 0;
M1:	cout << "Pozhaluysta, vvedite chislo: ";
	cin >> a;
	x = a;
	while (x != 0)
	{
		x /= 10;
		proverka++;
	}
	if (proverka % 2 == 0)
	{
		while (a != 0)
		{
			b = a % 10;
			result = b + result * 10;
			a /= 10;
			length++;
		}
		length1 = length;
		while (length1 != length / 2)
		{
			c = result % 10;
			result2 = c * d + result2;
			result /= 10;
			length1--;
			d *= 10;
		}
		int resultchet = result2 * pow(10, length1) + result;
		cout << resultchet << endl << "Vozvrashchenie k vvodu chisla" << endl;
		x = 0, y = 0, proverka0 = 0, proverka = 0, a = 0, b = 0, c = 0, d = 1, result = 0, result2 = 0, result3 = 0, length = 0, length1 = 0;
		goto M1;
	}
	else
	{
		while (a != 0)
		{
			b = a % 10;
			result = b + result * 10;
			a /= 10;
			length++;
		}
		length1 = length;
		while (length1 != length / 2 + 1)
		{
			c = result % 10;
			result2 = c * d + result2;
			result /= 10;
			length1--;
			d *= 10;
		}
		result3 = result % 10;
		result /= 10;
		int resultnechet = (result2 * 10 + result3) * pow(10, length1 - 1) + result;
		cout << resultnechet << endl << "Vozvrashchenie k vvodu chisla" << endl;
		x = 0, y = 0, proverka0 = 0, proverka = 0, a = 0, b = 0, c = 0, d = 1, result = 0, result2 = 0, result3 = 0, length = 0, length1 = 0;
		goto M1;
	}
	system("Pause");
	return 0;
}