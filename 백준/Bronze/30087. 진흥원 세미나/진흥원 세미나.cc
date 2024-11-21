#include <iostream>
#include <string>

int main() {
    int n;
    std::string str;
    std::cin >> n;
    
    while(n--) {
        std::cin >> str;
        if (str == "Algorithm") std::cout << "204";
        else if (str == "DataAnalysis") std::cout << "207";
        else if (str == "ArtificialIntelligence") std::cout << "302";
        else if (str == "CyberSecurity") std::cout << "B101";
        else if (str == "Network") std::cout << "303";
        else if (str == "Startup") std::cout << "501";
        else std::cout << "105";
        std::cout << "\n";
    }
    return 0;
}