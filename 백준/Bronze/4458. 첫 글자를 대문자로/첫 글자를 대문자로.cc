#include <iostream>
#include <string>

int main(void) {
  int N;
  std::cin >> N;
  std::cin.ignore();
  while (N-->0) {
    std::string str;
    std::getline(std::cin, str);
    if ('a' <= str[0] && str[0] <= 'z')
      str[0] -= ('a'-'A');
    std::cout << str << std::endl;
  }
  return 0;
}
