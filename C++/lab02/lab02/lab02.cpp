#include "stdafx.h"
#include <iostream>
using namespace std;

int main(int var, double x, double y, int proverka)
{
	cout << "Svyatoslav Las'kov - Laboratornaya rabota #2\n\n";
M1:	cout << "Pozhaluysta, vvedite zhelaemyy variant dlya proverki (3,4,5,6) ";
	cin >> var;
	switch (var)
	{
	case 3:
		cout << "\nVybran variant #3\n";
		cout << "Pozhaluysta, vvedite znachenie x ";
		cin >> x;
		cout << "Pozhaluysta, vvedite znachenie y ";
		cin >> y;
		cout << "Vy zadali peremennoy x znachenie " << x << ", a peremennoy y znachenie " << y << endl;
		if (x >= -2 && x <= 2 && y >= 0 && y <= 6 || x >= -5 && x <= 5 && y >= -4 && y <= 0)
			cout << "Zadannaya tochka yavlyaetsya elementom figury\n\n";
		else
			cout << "Zadannaya tochka ne yavlyaetsya elementom figury\n\n";
		break;
	case 4:
		cout << "\nVybran variant #4\n";
		cout << "Pozhaluysta, vvedite znachenie x ";
		cin >> x;
		cout << "Pozhaluysta, vvedite znachenie y ";
		cin >> y;
		cout << "Vy zadali peremennoy x znachenie " << x << ", a peremennoy y znachenie " << y << endl;
		if (y >= -x + 6 && y <= x + 2 || y <= -x + 12 && y >= x - 4)
			cout << "Zadannaya tochka yavlyaetsya elementom figury\n\n";
		else
			cout << "Zadannaya tochka ne yavlyaetsya elementom figury\n\n";
		break;
	case 5:
		cout << "\nVybran variant #5\n";
		cout << "Pozhaluysta, vvedite znachenie x ";
		cin >> x;
		cout << "Pozhaluysta, vvedite znachenie y ";
		cin >> y;
		cout << "Vy zadali peremennoy x znachenie " << x << ", a peremennoy y znachenie " << y << endl;
		if (x * x + y * y <= 3.5 * 3.5 || x >= -7 && x <= 7 && y >= 0 && y <= 7)
			cout << "Zadannaya tochka yavlyaetsya elementom figury\n\n";
		else
			cout << "Zadannaya tochka ne yavlyaetsya elementom figury\n\n";
		break;
	case 6:
		cout << "\nVybran variant #6\n";
		cout << "Pozhaluysta, vvedite znachenie x ";
		cin >> x;
		cout << "Pozhaluysta, vvedite znachenie y ";
		cin >> y;
		cout << "Vy zadali peremennoy x znachenie " << x << ", a peremennoy y znachenie " << y << endl;
		if (x >= -7 && x <= 7 && y >= 0 && y <= 7 || x >= -7 && x <= 0 && y >= -3 && y <= 0 || x >= -7 && x <= -4 && y >= -5 && y <= -3)
			cout << "Zadannaya tochka yavlyaetsya elementom figury\n\n";
		else
			cout << "Zadannaya tochka ne yavlyaetsya elementom figury\n\n";
		break;
	default: cout << "\nVarianta " << var << " ne soderzhitsya v dannom fayle, poprobuyte eshche raz.\n\n";
		goto M1;
	}
	cout << "Zhelaete proverit' eshche variant? (1 - Da / 0 - Net) ";
	cin >> proverka;
	if (proverka == 1)
		goto M1;
	else if (proverka == 0)
		cout << "\nKonec prilozheniya\n";
	else
		cout << "\nTakogo varianta ne sushchestvuet, konec prilozheniya\n";
	system("Pause");
	return 0;
}