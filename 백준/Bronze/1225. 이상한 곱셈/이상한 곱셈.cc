#include <iostream>
#include <string>

int main(void) {
  std::string A, B;
  std::cin >> A >> B;
  long result = 0;
  
  int aSize = A.size();
  int bSize = B.size();
  for(int aIndex = 0; aIndex < aSize; aIndex++) {
    for (int bIndex = 0; bIndex < bSize; bIndex++) {
      result += ((A[aIndex] - '0') * (B[bIndex] - '0'));
    }
  }
  std::cout << result;
  return 0;
}
