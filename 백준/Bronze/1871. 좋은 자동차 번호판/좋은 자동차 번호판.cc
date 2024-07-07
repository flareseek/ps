#include <iostream>
#include <string>

int main(void) {
  int N;
  std::cin >> N;

  while(N--) {
    std::string str;
    std::cin >> str;

    int cur = 1;
    int result = 0;
    for (int i = 2; i >= 0; i--) {
      char t = str[i] - 'A';
      result += (t*cur);
      cur *= 26;
    }
    result -= std::stoi(str.erase(0, 4));
    std::cout << ((-100 <= result && result <= 100) ? "nice\n" : "not nice\n");
  }
  return 0;
}
