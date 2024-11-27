#include <iostream>

int main(void) {
    int n;
    std::cin >> n;
    
    if (n >= 620) std::cout << "Red";
    else if (n >= 590) std::cout << "Orange";
    else if (n >= 570) std::cout << "Yellow";
    else if (n >= 495) std::cout << "Green";
    else if (n >= 450) std::cout << "Blue";
    else if (n >= 425) std::cout << "Indigo";
    else if (n >= 380) std::cout << "Violet";
    return 0;
}