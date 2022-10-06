#include <iostream>
using namespace std;

struct Node {
    int data;
    Node *next;
    Node *prev;
};

Node *head;

void insert(int data) {
    Node *temp = new Node();
    temp->data = data;
    temp->next = head;
    temp->prev = NULL;
    if (head != NULL) {
        head->prev = temp;
    }
    head = temp;
}

void print() {
    Node *temp = head;
    cout << "Forward: ";
    while (temp != NULL) {
        cout << temp->data << " ";
        temp = temp->next;
    }
    cout << endl;
}

void reversePrint() {
    Node *temp = head;
    if (temp == NULL) {
        return;
    }
    while (temp->next != NULL) {
        temp = temp->next;
    }
    cout << "Reverse: ";
    while (temp != NULL) {
        cout << temp->data << " ";
        temp = temp->prev;
    }
    cout << endl;
}

int main(int argc, const char * argv[]) {
    head = NULL;
    insert(2);
    insert(4);
    insert(6);
    insert(5);
    print();
    reversePrint();
}