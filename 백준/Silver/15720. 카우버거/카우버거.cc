#include <iostream>
#include <algorithm>
#include <functional>
#include <numeric>

using namespace std;

int burgers[1000], sides[1000], bevers[1000];
int total, m, t;

void input(int* arr, int n) {
  for (int i = 0; i < n; i++) {
    cin >> arr[i];
    total += arr[i];
  }
  sort(arr, arr+n, greater<int>());
  t += accumulate(arr, arr+m, 0);
}

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int B, C, D;
  cin >> B >> C >> D;
  m = min({B, C, D});

  input(burgers, B);
  input(sides, C);
  input(bevers, D);

  cout << total << "\n" << ((total - t) + (int)(t*0.9));
  return 0;
}
