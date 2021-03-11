#include <iostream>
#include <Windows.h>
#include <time.h>
#include <stdlib.h>
#include <stdio.h> //include some stuff we need

using namespace std;

int main(){
    string dot = ".";
    char year[1000];
    char month[1000];
    char day[1000];
    time_t now;
   struct tm* nowLocal;
   time(&now);
    nowLocal = localtime(&now);


    strftime(year,1000,  "%Y", nowLocal); //This is the year we save in the char year[1000] 
    string y(year); //We convert the char array int a string and we convert the string later in l. 30 back to a char array. Why? Because it is easier (for me) to add strings upp.

    strftime(month, 1000, "%m", nowLocal); // Does the same with the month 
    string m(month);

    strftime(day, 1000, "%d", nowLocal); //The same with the day of the month 
    string d(day);
    string c = "class " +d + dot + m + dot + y; //add the file together 
    string fin = "mkdir \"" + c + "\""; // add the comand. Why the weird \" and \"? Because if we run the cmd command mkdir class day.month.year, it will create
    const char* cf = fin.c_str();       //2 folders 1 named class and the second with day.month.year. In order to prevent this we have to get the name in quotationmarks
    system(cf);                         //like mkdir "class day.month.year" but it uses quotationmarks which is a sign of a string, so we have to break the string with a \ in
                                        //order to quote something in a string
}                                       //This might be the most useful program I've ever written 
