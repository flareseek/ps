#include <iostream>
#include <string>

int main(void) {
  std::string plain, enc;
  std::getline(std::cin, plain);
  std::getline(std::cin, enc);

  int size = plain.size();
  int eSize = enc.size();
  int e = 0;
  for(int i = 0; i < size; i++) {
    char r = plain[i];
    if (plain[i] != ' ') {
      char k = enc[e] - 'a' + 1;
      char t = plain[i] - 'a';
      r = (t - k + 26) % 26 + 'a';
    }
    std::cout << r;
    e = (e+1)%eSize;
  }
  return 0;
}
