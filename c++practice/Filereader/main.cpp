#include <iostream>
#include <cctype>
#include <fstream>
using namespace std;

void secure(){
    cout << "The correct password was entered\n";
}

int main(){
    string name;
    int age;
    string dob;
    string gender;
    string password;
    string function;
    string pwd;
    cout << "would you like to login or signup? (login/signup)";
    cin >> function;
    if (function == "signup"){
        cout << "Enter your name: \n";
        cin >> name;
        cout << "Enter your age: \n";
        cin >> age;
        cout << "Enter your date of birth (DD-MM-YY): \n";
        cin >> dob;
        cout << "Enter your gender: \n";
        cin >> gender;
        ofstream outFile("personalinfo.txt");
        if (outFile.is_open()){
            outFile << "Name: " << name << "\n";
            outFile << "Age: " << age << "\n";
            outFile << "Date of Birth: " << dob << "\n";
            outFile << "Gender: " << gender << "\n";
            outFile.close();
        }
        cout << "Enter your password: \n";
        cin >> password;
        outFile.open("password.txt");
        if(outFile.is_open()){
            outFile << password;
            outFile.close();
        }
    }
    else if(function == "login"){
        string op;
        do {
            cout << "Enter your password: \n";
            cin >> pwd;
            ifstream inFile("password.txt");
            if (inFile.is_open()){
                while (getline(inFile, op)){
                    if (pwd == op){
                        secure();
                    }
                    else {
                        cout << "Wrong Password!\n";
                    }                
                }
            }
        }
        while (pwd != op);
    }
    return 0;
}