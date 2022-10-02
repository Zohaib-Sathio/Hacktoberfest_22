#pragma once
using namespace std;
#include "node.h"

class list
{
private:

	node* head;

	node* tail;

	int total_fingers;

	int no_players;

	string* players;

	bool played = false;

public:

	list();

	void input_no_players();

	void nof();

	void play();

	void display_record();

	void display_position();

};