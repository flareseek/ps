#include <iostream>
#include <string>

int main(void) {
    std::string str = "WelcomeToSMUPC";
    int n;
    std::cin >> n;
    n--;
    std::cout << str[n%14];
    return 0;
}