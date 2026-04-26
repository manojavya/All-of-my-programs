#include <iostream>
#include <cmath>
using namespace std;
int main(){
    double n1;
    double n2;
    int devpin;
    string operation;
    cout << "Enter the first number\n";
    cin >> n1;
    cout << "\nEnter the next number\n";
    cin >> n2;
    cout << "\nEnter what operation you would like to perform: \n";
    cout << "operation \t\t\tkeyword \nMultiply \t\t\tmul \nDivide \t\t\t\tdiv \nAdd \t\t\t\tadd \nSubtract \t\t\tsub \nModulus \t\t\tmod \nSquare root of first number \tsqrt1 \ncube root of second number \tcbrt2 \nPower \t\t\t\tpow \n\n";
    cin >> operation;
    if (operation == "mul"){
        double out = n1 * n2;
        cout << "The output is: " << out << "\n";
    }
    else if (operation == "div"){
        double out = n1 / n2;
        cout << "The output is: " << out << "\n";
    }
    else if (operation == "add"){
        double out = n1 + n2;
        cout << "The output is: " << out << "\n";
    }
    else if (operation == "sub"){
        double out = n1 - n2;
        cout << "The output is: " << out << "\n";
    }
    else if (operation == "mod"){
        double out = fmod(n1, n2);
        cout << "The output is: " << out << "\n";
    }
    else if (operation == "sqrt1"){
        double out = sqrt(n1);
        cout << "The output is: " << out << "\n";
    }
    else if (operation == "cbrt2"){
        double out = cbrt(n2);
        cout << "The output is: " << out << "\n";
    }
    else if (operation == "pow"){
        double out = pow(n1, n2);
        cout << "The output is: " << out << "\n";
    }
    else if (operation == "dev"){
        for (int pin = 0; pin < 10000; pin ++){
            cout << pin << "\n";
        }
        cout << "Initialising Program for developer\n";
        cout << &n1 << &n2 << &operation << "\n";
    }
    else{
        cout << "Please enter a valid operation!\n";
        return -1;
    }
    return 0;
}