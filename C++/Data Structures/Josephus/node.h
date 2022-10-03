#pragma once
#include<iostream>
#include <string>
using namespace std;

class node
{

public:
	string name;

	int fingers;

	node* next;

	node* prev;

	bool out = false;

	int position = 0;



	node();

	void setname(string n);

	string getname();

	void setfingers(int f);

	int getfingers();

	void setnext(node* n);

	node* getnext();

	void setprev(node* n);

	node* getprev();

};