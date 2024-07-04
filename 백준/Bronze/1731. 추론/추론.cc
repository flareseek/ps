#include <iostream>

int main(void) {
  int N;
  int arr[50] = {0};
  std::cin >> N;
  for (int i = 0; i < N; i++)
    std::cin >> arr[i];

  int diff = arr[1]-arr[0];
  int difx = arr[1]/arr[0];
  for (int i = 2; i < N; i++) {
    if (diff != arr[i]-arr[i-1]) {
      std::cout << arr[N-1] * difx;
      return 0;
    } 
    if (difx != arr[i]/arr[i-1]) {
      std::cout << arr[N-1] + diff;
      return 0;
    }
    diff = arr[i] - arr[i-1];
    difx = arr[i] / arr[i-1];
  }
  std::cout << arr[N-1] + diff;
  return 0;
}
