#include <iostream>
#include <string>

int main(void) {
    char c;
    std::string str;
    std::cin >> c;
    
    if (c == 'M') str = "MatKor";
    else if (c == 'W') str = "WiCys";
    else if (c == 'C') str = "CyKor";
    else if (c == 'A') str = "AlKor";
    else str = "$clear";
    std::cout << str;
    return 0;
}