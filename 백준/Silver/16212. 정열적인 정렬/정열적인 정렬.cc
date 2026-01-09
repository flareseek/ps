#include <iostream>
#include <algorithm>

using namespace std;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);
  int N;
  cin >> N;
  int arr[500000] = {0};
  for(int i = 0; i < N; i++) cin >> arr[i];
  sort(arr, arr+N);
  for(int i = 0; i < N; i++) cout << arr[i] << " ";
  return 0;
}
