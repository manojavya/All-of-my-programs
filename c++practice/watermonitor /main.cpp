// Not a commercial release just made for educational purposes!
#include <iostream>
#include <fstream>
#include <ctime>

using namespace std;

int main(){
  time_t timestamp;
  time(&timestamp);
  ofstream os;
  os.open("log.txt");
  cout << "Program begin at " << ctime(&timestamp) << endl;
  os << ctime(&timestamp) << endl;
  os << "successfully started program..." << endl;

  //Now I will begin the ph detection
  //Initialising the variables
  double ph;

  //Asking the ph
  cout << "Please enter the pH value" << endl;
  os << ctime(&timestamp) << endl;
  os << "asked ph to user" << endl;


  //Getting the input
  cin >> ph;
  os << ctime(&timestamp) << endl;
  os << "pH was given to the program..." << endl;

  //Calculate the pH
  /*
pH must be only between 0 to 14
pure water is 7pH
acidic water is 0 to 6
base/alkali water is 8 to 14
  */

  if (ph == 7){
    cout << "This is pure water suitable for drinking..." << endl;
    os << ctime(&timestamp) << endl;
    os << "Got the input as 7pH will display normal water..." << endl;
  }
  else if (ph < 6 && ph > 0){
    cout << "This is acidic water dispose immidiately..." << endl;
    os << ctime(&timestamp) << endl;
    os << "Got the input as between 0 to 6pH will display acidic water..." << endl;
  }
  else if (ph < 14 && ph > 8){
    cout << "This is basic/alkali water..." << endl;
    os << ctime(&timestamp) << endl;
    os << "Got the input between 14 to 8 displaying base/alkali..." << endl;
  }
  else{
    cerr << "INVALID_pH_LEVEL, the log file may have more information" << endl;
  }
  cout << "Program executed!";
  os << ctime(&timestamp) << endl;
  os << "Program exit..." << endl;
  return(0);
}
