#include <iostream>
#include <algorithm>

using namespace std;

int arr[1000001];
int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int n, t;
  cin >> n >> t;

  for (int i = 0; i < n; i++) cin >> arr[i];
  sort(arr, arr+t);

  for(int i = 0; i < n; i++) cout << arr[i] << " ";
  return 0;
}
