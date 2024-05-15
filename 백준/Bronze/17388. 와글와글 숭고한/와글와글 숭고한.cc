#include <iostream>

int main(void) {
  int arr[3];
  std::cin >> arr[0] >> arr[1] >> arr[2];
  if (arr[0]+arr[1]+arr[2] >= 100) std::cout << "OK";
  else {
    int minIndex = 0;
    if (arr[1] < arr[0]) minIndex = 1;
    if (arr[2] < arr[minIndex]) minIndex = 2;
    if (minIndex == 0) std::cout << "Soongsil";
    else if (minIndex == 1) std::cout << "Korea";
    else if (minIndex == 2) std::cout << "Hanyang";
  }
  return 0;
}

