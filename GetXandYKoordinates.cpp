//This file is written in Visual c++ using Microsoft Visual Studio 2019 Community
#include <iostream>
#include <Windows.h>
using namespace std;
int a = 1;
int mx, my;
void moveMouse(int x, int y){
  SetCursorPos(x, y);
}
int main(){
  POINTER p = (NULL);
  while(a == 1){
    if(GetAsyncKeyState(VK_BACK)){
      GetCursorPos(&p);
      cout <<"x position: " <<p.x <<" y-position: " <<p.y <<endl;
      Sleep(200);
    }
     if(GetAsyncKeyState(VK_SPACE)){
     cout << "Set the x coordinate: ";
       cin >> mx >> endl;
       cout <<"Set the y coordinate: ";
       cin >> my >> endl;
       moveMouse(mx, my);
      
    }
  }
    
}
