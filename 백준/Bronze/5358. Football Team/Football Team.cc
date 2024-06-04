#include <iostream>
#include <string>

int main(void) {
  std::string line;
  std::getline(std::cin, line);
  while(!line.empty()) {
    int size = line.size();
    for(int i = 0; i < size; i++) {
      switch(line[i]) {
        case 'i':
          line[i] = 'e';
          break;
        case 'e':
          line[i] = 'i';
          break;
        case 'I':
          line[i] = 'E';
          break;
        case 'E':
          line[i] = 'I';
          break;
      }
    }
    std::cout << line << std::endl;
    std::getline(std::cin, line);
  }
  return 0;
}
