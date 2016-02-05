#include <QCoreApplication>
#include <iostream>
using namespace std;

int Counter(float **mas, int n)
{
    float temp = *(*mas + 1);
    for (int i = 0; i < n; i++)
        return temp;
}

int main()//точка входа в приложение
{
    setlocale(LC_ALL, "Russian");//переключение на русскую локализацию

    char proverka;//обьявление переменной проверки на повторное использование программы
    do
    {
        system("cls");//очищение консоли в случае повторного использования программы
        int n;
        cout << "Пожалуйста, введите размер массива: ";
        cin >> n;
        float *mas = new float[n];
        bool in;
        cout << "Желаете заполнить массив самостоятельно или воспользоваться функцией рандома? (1/0): ";
        cin >> in;
        if (in == true)
            for (int i = 0; i < n; i++)//заполнение его значениями
                cin >> mas[i];
        else
            for (int i = 0; i < n; i++)//рандомное заполнение массива
                for (int k = 0; k < n; k++)
                {
                    int signature = rand();//рандомно вычисляется число,
                    if (signature % 2 == 0)//и если оно четное,
                        mas[i] = -1 * (rand() % 100);//то в массив записывается новое рандомное число с отрицательным знаком,
                    else
                        mas[i] = rand() % 100;//а если нечетное - новое рандомное число с положительным знаком
                }//рандом масштабирован до значений от - 99 до 99, т.к. стандарт от 0 до константы RAND_MAX неуместен.

        system("cls");//очистка консоли

        cout << "Стартовый массив, размерностью " << n << " элементов: " << endl;//вывод массива
        for (int i = 0; i < n; i++)
            cout << mas[i] << '\t';
        cout << endl;

        bool vozrastanie = new bool[n];
        int counter = Counter(&mas, n);
        cout << counter << endl;

        do//проверка на повторное использование программы
        {
            cout << endl << "Хотите повторить? (Да == y / Нет == n): ";
            cin >> proverka;
            cout << endl;
            if (proverka != 'y' && proverka != 'n')
                cout << "Только y или n, будьте добры." << endl;
        } while (proverka != 'y' && proverka != 'n');
    } while (proverka == 'y');

    system("pause");
    return 0;
}
