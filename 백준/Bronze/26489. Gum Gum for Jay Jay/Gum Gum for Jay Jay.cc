#include <iostream>
#include <string>
int main(void) {
    std::string str;
    int cnt = 0;
    std::ios::sync_with_stdio(false);
    std::cin.tie(0);
    while(getline(std::cin, str)) cnt ++;
    std::cout << cnt;
    return 0;
}