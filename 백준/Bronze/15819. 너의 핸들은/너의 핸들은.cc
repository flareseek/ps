#include <iostream>
#include <algorithm>

using namespace std;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  string strs[100];
  int N, I;
  cin >> N >> I;
  for(int i = 0; i < N; i++)
    cin >> strs[i];

  sort(strs, strs+N);
  cout << strs[I-1];
  return 0;
}
