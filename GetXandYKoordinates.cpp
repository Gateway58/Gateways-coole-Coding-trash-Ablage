//This file is written in Visual c++ using Microsoft Visual Studio 2019 Community
#include <iostream>
#include <Windows.h>    //So we can do Sleep and get Asynchkeystate and GetCursorPos/SetCursorPos and other bomfortionöse Stuff.
using namespace std;
int a = 1;            //We declare a = 1, so later we can make a while loop and if we press a key in that while loop it changes a and the while loop returns false or so.
int mx, my;           // we use that later for the x and y coordinate in which we want to move the mous.
void moveMouse(int x, int y){
  SetCursorPos(x, y);     //Set the Cursor to x and y which we declare later
}
int main(){
  POINTER p = (NULL);   //We make a new Pointer to save the x and y coordinates of our mouse.
  while(a == 1){        //this while loop is true at first but later, if you press numpad 1 it is false
    if(GetAsyncKeyState(VK_BACK)){      //If you press backspace, this code will be executed
      GetCursorPos(&p);     //When we press back it gets the cursor pos and prints that out
      cout <<"x position: " <<p.x <<" y-position: " <<p.y <<endl;
      Sleep(200);         //Sleep so there is a little bit delay to have time to let go of the key
    }
     if(GetAsyncKeyState(VK_SPACE)){    //If you press Space, this code will be executed
     cout << "Set the x coordinate: ";
       cin >> mx >> endl;         //we get the x integer value of mx from the users input
       cout <<"Set the y coordinate: ";
       cin >> my >> endl;       //we get the integer value of my from the users input
       moveMouse(mx, my);       //We say that it should move the mouse to the x coordinate of mx and to the y coordinate of my.
      Sleep(200);
    }
    if(GetAsyncKeyState(VK_NUMPAD1){  //If you press the numpad 1, this code will be executed
      a = 2;                    //It just makes a == 1 false and breaks the loop. In this case it ends the program.
    }
  }
    return 0;
}
