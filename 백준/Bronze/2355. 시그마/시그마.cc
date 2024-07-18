#include <iostream>

int main(void) {
  long long A, B, result = 0;
  std::cin >> A >> B;
  if (A > B) {
    long long t = A;
    A = B;
    B = t;
  }

  result = ((double)(A+B)/2) * (B-A+1);
  std::cout << result;
  return 0;
}
