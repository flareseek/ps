#include <iostream>
#include <string>

int main(void) {
  int n;
  std::cin >> n;
  while(n-->0) {
    std::string name;
    std::cin >> name;
    int size = name.size();
    for (int i = 0; i < size; i++) {
      if (name[i] == 'S') {
        std::cout << name;
        return 0;
      }
    }
  }
  return 0;
}

