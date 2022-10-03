#include "node.h"
#include<iostream>
#include <string>
using namespace std;

node::node() {

	name = "";
	fingers = 0;
	next = NULL;
	prev = NULL;

}

void node::setname(string n) {

	name = n;

}

string  node::getname() {

	return name;

}

void node::setfingers(int f) {

	fingers = f;

}

int node::getfingers() {

	return fingers;

}


void node::setnext(node* n) {

	next = n;


}

node* node::getnext() {

	return next;

}


void node::setprev(node* p) {


	prev = p;

}

node* node::getprev()
{

	return prev;

}