#include <iostream>
#include <algorithm>

int main(void) {
  int arr[5];
  std::cin >> arr[0] >> arr[1] >> arr[2] >> arr[3] >> arr[4];
  std::sort(arr, arr+5);

  std::cout << (arr[0]+arr[1]+arr[2]+arr[3]+arr[4]) / 5 << std::endl;
  std::cout << arr[2];
  return 0;
}
