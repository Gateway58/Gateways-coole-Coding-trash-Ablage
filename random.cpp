#include <Windows.h>
#include <iostream>
#include <conio.h>
#include <stdlib.h>
#include <random>
#include <ctime>
//finally some line of codes that generate a "random" Number and eliminate that numbers afterwards.Rhis is great for Quiz Applications (I'm working on an android quiz app)
using namespace std;
void randquest(); //declare a void, you dont have to do that but it looks cleaner
bool quest[3] = { true, true, true }; //it has 3 Questions
int main() {
	randquest(); //execute the lines which are in the randquest void 
}
void randquest() {
	srand(time(0)); //so that the numbers are tho most random i can get to 
	for (int i = 0; i < 3; i++)
	{
		bool questremain = false;
		if (quest[i]) {
			questremain = true;
		}
		while (questremain) {
			
			int ran = rand() % 3;   //generate a number between 0 and 2 (if you want 1-3. so 1, 2 or 3, just add +1 the rand function works like an array and so when it has the numbers
			if (quest[ran]) {       // 0, 1, 2, it works well together
				quest[ran] = false;   //it says that we wont want the random value again
				switch (ran) {        // a little switch 
				case 0: cout << "ran = 1" << endl; break;
				case 1: cout << "ran = 2" << endl; break;
				case 2: cout << "ran = 3" << endl; break;
				}
			
			{
					
			}
			}
			else if (!quest[0]) {
				if (!quest[1]) {
					if (!quest[2]) {
            //if evry 3 questions have been asked, it ends and says ended
						questremain = false;
						cout << "ended";
					}
				}
			}
			
		}
	}
}

