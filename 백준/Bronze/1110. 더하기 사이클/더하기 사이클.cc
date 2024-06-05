#include <iostream>

int main(void) {
  int N, result, count = 0;
  std::cin >> N;
  result = N;
  do {
    int t = (result/10) + (result%10);
    result = (result%10)*10 + (t%10);
    count ++;
  } while (result != N);
  std::cout << count;
  return 0;
}
