#include <iostream>
#include <conio.h>
using namespace std;
#include "list.h"

int main()
{
	list l;
	int op;

	while (true) {
		cout << "X----------x----------x----------x----------X" << endl << endl;
		cout << "1. Input Number Of Players " << endl;
		cout << "2. Input the Record of Players " << endl;
		cout << "3. Play the Game " << endl;
		cout << "4. Display Record Of Players " << endl;
		cout << "5. Display Position of Players " << endl << endl;
		cout << "X----------x----------x----------x----------X" << endl;
		cin >> op;
		switch (op)
		{
		case 1:
			l.input_no_players();
			break;
		case 2:
			l.nof();
			break;
		case 3:
			l.play();
			break;
		case 4:
			l.display_record();
			break;
		case 5:
			l.display_position();
			break;
		default:
			exit(0);
			break;
		}
	}
}