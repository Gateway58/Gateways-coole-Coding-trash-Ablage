#include <iostream>
#include <Windows.h>
#include <time.h>
#include <stdlib.h>
#include <stdio.h>

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


    strftime(year,1000,  "%Y", nowLocal);
    string y(year);

    strftime(month, 1000, "%m", nowLocal);
    string m(month);

    strftime(day, 1000, "%d", nowLocal);
    string d(day);
    string c = "class " +d + dot + m + dot + y;
    string fin = "mkdir \"" + c + "\"";
    const char* cf = fin.c_str();
    system(cf);

}
