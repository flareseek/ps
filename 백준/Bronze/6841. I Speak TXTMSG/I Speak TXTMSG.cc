#include <iostream>
#include <string>

int main(void) {
    std::string str;

    while(std::cin >> str) {
        if (str == "CU") {
            std::cout << "see you\n";
        } else if (str == ":-)") {
            std::cout << "I’m happy\n";
        } else if (str == ":-(") {
            std::cout << "I’m unhappy\n";
        } else if (str == ";-)") {
            std::cout << "wink\n";
        } else if (str == ":-P") {
            std::cout << "stick out my tongue\n";
        } else if (str == "(~.~)") {
            std::cout << "sleepy\n";
        } else if (str == "TA") {
            std::cout << "totally awesome\n";
        } else if (str == "CCC") {
            std::cout << "Canadian Computing Competition\n";
        } else if (str == "CUZ") {
            std::cout << "because\n";
        } else if (str == "TY") {
            std::cout << "thank-you\n";
        } else if (str == "YW") {
            std::cout << "you’re welcome\n";
        } else if (str == "TTYL") {
            std::cout << "talk to you later\n";
            break;
        } else {
            std::cout << str << std::endl;
        }
    }
    return 0;
}
