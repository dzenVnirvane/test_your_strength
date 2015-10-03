#include "stdafx.h"
#include <iostream>
using namespace std;

int _tmain()
{
	int x, k;
	cout << "Vvedite x: ";
	cin >> x;
	cout << "Vvedite k: ";
	cin >> k;

	int factor = 2 * k + 1;
	int a = factor;
	while (a != 1)
	{
		factor = factor * (a - 1);
		a--;
	}
	cout << "Factorial 2k + 1 = " << factor << endl;

	double formula = pow(-1, k - 1) * (pow(x, 2 * k - 1) / factor);
	cout << "Resultat formuly dlya k = " << k << ": " << formula << endl;

	int f = 1;
	double sum = 0;
	for (int i = 1; i <= x; i++)
	{
		f = f * i;
		sum += 1.0 / f;
	}
	cout << sum << endl;

	system("pause");
	return 0;
}

