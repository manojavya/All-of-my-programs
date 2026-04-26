#include <iostream>
#include <cctype>
using namespace std;
int main(){
    cout << "What is your name? \n";
    string name;
    cin >> name;
    cout << "Your name is: " << name << endl;
    cout << "Pleanse confirm (y/n) \n";
    char cnfrm;
    cin >> cnfrm;
    while (tolower(cnfrm) == 'n'){
        cout << "Please re-enter your name: \n";
        cin >> name;
        cout << "Your name is: " << name << endl;
        cout << "Pleanse confirm (y/n) \n";
        cin >> cnfrm;
    }

}