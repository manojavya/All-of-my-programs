#include <iostream>
#include <cmath>
#include <cctype>
using namespace std;

void generatecertificate(string name, int age, string dob, string degree){
    cout << "certificate under development!";
}

void ask_name(string auth){
    string name;
    int age;
    string dob;
    string degree;
    char cnfrm_name;
    if (auth == "authorised_call"){
        do {
            cout << "\033[0mPlease enter your name:\t\033[32m";
            cin >> name;
            cout << "\033[0mPlease enter your age:\t\033[32m";
            cin >> age;
            cout << "\033[0mPlease enter your dob:\t\033[32m";
            cin >> dob;
            cout << "\033[0mPlease enter your degree:\033[32m";
            cin >> degree;
            cout << "\n\033[0mconfirm details \"" << name << "\"" << " " << age << " " << dob << " " << degree <<"?(y/n)\t\033[32m\n";
            cin >> cnfrm_name;
            cin.ignore();
            if (tolower(cnfrm_name) == 'y'){
                generatecertificate(name, age, dob, degree);
            }
            else if (tolower(cnfrm_name) == 'n'){
                continue;
            }
        }
        while(tolower(cnfrm_name) == 'n');
    }
    else {
        cout << "UNAUTHORISED_CLASS_CALL!";
    }
}

void privacy(string auth){
    if (auth == "authorised_call"){
        cout << "This app is a very safe app, ok now I dont have the patience to do this one page thingy maybe later\n";
    }
    else {
        cout << "UNAUTHORISED_CLASS_CALL!";
    }
}

int main(){
    cout << "Hi user, I am here to give you a certificate please give me some details.\n";
    cout << "\033[32mFunction \t\t Number\n";
    cout << "Privacy Policy \t\t 1 \nGet certificate \t 2\n\033[0m";
    int process;
    cin >> process;
    if(process == 1){
        privacy("authorised_call");
    }
    else if(process == 2){
        ask_name("authorised_call");
    }
}
