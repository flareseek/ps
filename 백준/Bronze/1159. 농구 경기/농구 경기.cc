#include <iostream>
#include <string>

int main(void) {
  int N;
  int ln['z'-'a'+1] = {0};
  std::cin >> N;
  while(N-->0) {
    std::string name;
    std::cin >> name;
    ln[name[0]-'a'] ++;
  }

  bool is = false;
  for (int i = 0; i < 'z'-'a'+1; i++) {
    if (ln[i] < 5) continue;
    is = true;
    std::cout << (char)(i+'a');
  }
  if (!is) std::cout << "PREDAJA";
  return 0;
}
