#include<iostream>
using namespace std;
#include "list.h"

list::list() {
	head = NULL;
	tail = NULL;
	no_players = 0;
	players = NULL;
	played = false;
	total_fingers = 0;
}

void list::input_no_players()
{
	cout << "Enter number of players : ";
	cin >> no_players;
}

void list::nof() {
	if (no_players != NULL) {

		string name = "";
		for (int i = 0; i < no_players; i++) {
			node* newnode = new node();
			cout << "Enter name : ";
			cin >> name;
			newnode->setname(name);
			int no_fingers;
			while (true) {
				cout << "Enter the number of fingers :";
				cin >> no_fingers;
				if (no_fingers < 6)
				{
					newnode->setfingers(no_fingers);
					total_fingers = total_fingers + no_fingers;
					break;
				}
				else {
					cout << "No of fingers should be less than 0 and greater than 6 " << endl;
				}
			}
			if (head == NULL) {
				newnode->setnext(NULL);
				newnode->setprev(NULL);
				head = tail = newnode;
			}
			else {
				newnode->setnext(head);
				newnode->setprev(tail);
				tail->setnext(newnode);
				tail = newnode;
			}
		}
	}
	else {
		cout << "Error! please enter number of players first." << endl;
	}
}

void list::play() {
	if (head != NULL) {

		played = true;
		players = new string[no_players];
		node* temp = head;
		temp = head;
		int i = 0;
		while (temp != NULL)
		{
			for (int j = 0; j < total_fingers; j++)
			{
				temp = temp->getnext();
			}
			players[i] = temp->getname();
			node* current = temp;
			if (current == head)
			{
				tail->setnext(head->getnext());
				head->getnext()->setprev(tail);
				head = head->getnext();
				temp = temp->getnext();
				delete current;
			}
			else if (current == tail) {
				head->setprev(tail->getprev());
				tail->getprev()->setnext(head);
				tail = tail->getprev();
				temp = temp->getnext();
				delete current;
			}
			else {
				current->getnext()->setprev(current->getprev());
				current->getprev()->setnext(current->getnext());
				temp = temp->getnext();
				delete current;
			}
			if (i == no_players - 1) {
				head = NULL;
				tail = NULL;

				temp = NULL;
			}
			i++;
		}
		cout << "Gameplay Successful!" << endl;
	}
	else {
		cout << "Error! No players added" << endl;
	}
}

void list::display_record() {

	if (played == true) {
		node* temp = head;
		cout << "Displaying the record!" << endl << endl;

		for (int i = 0; i < no_players; i++) {
			if (i < no_players - 1) {
				cout << players[i] << " was eliminated! " << i + 1 << endl;
			}
			else {
				cout << players[i] << " was eliminated last! " << endl;
			}
		}
	}
	else {
		cout << "No record found!" << endl;
	}
}

void list::display_position() {
	if (played == true) {
		cout << "Displaying the Positions:" << endl << endl;
		for (int i = 0; i < no_players; i++) {
			if (i < no_players - 1) {
				cout << players[i] << " is the winner no " << i + 1 << endl;
			}
			else {
				cout << players[i] << " is loser " << endl;
			}
		}
	}
	else {
		cout << "Please play the game!" << endl;
	}
}
