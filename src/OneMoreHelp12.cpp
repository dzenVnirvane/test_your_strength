#include "stdafx.h"                             //��� ����������
#include <iostream>
using namespace std;

int main()
{
	setlocale(LC_CTYPE, "Russian_Russia.1251"); //����� ��������� ������� �� ���������� Windows, ���. ��������� �� �������

	double a;                                   //double - �.�. ����� �.�. ������������
	cout << "������� �������� a: ";
	cin >> a;
	int n;                                      //���� �.�. ������������, �� ��� ����� ���� �� ����� ������
	cout << "������� �������� n: ";
	cin >> n;

	double sum = 1 / a;
	for (n; n != 0; n--)                        //������� �����, ������� � ���������� �������� �� �������
		sum += 1 / pow(a, pow(2, n));           //pow(a,n) - �������� ���������� a � ������� n, ���� �������� ��� ���� - ������� � ��������� ������
	cout << "����� = " << sum << endl << endl;

	system("pause");
	return 0;
}