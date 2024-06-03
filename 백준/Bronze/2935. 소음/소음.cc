#include <iostream>
#include <string>

int main(void) {
  char op;
  std::string first, second;
  std::cin >> first >> op >> second;
  if (first.size() < second.size()) {
    std::string temp = first;
    first = second;
    second = temp;
  }
  int size = second.size();
  if (op == '*') while (size-->1) first += '0';
  else first[first.size()-size] += 1;
  std::cout << first;
  return 0;
}
