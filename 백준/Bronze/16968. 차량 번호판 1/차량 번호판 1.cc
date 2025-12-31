#include <iostream>

using namespace std;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int idx = 0;
  char input[4];
  while(cin >> input[idx++]) {}
  idx --;

  const int C_SIZE = 'z' - 'a' + 1;
  const int D_SIZE = 10;

  if (idx == 0) cout << 0;

  int result = (input[0] == 'c') ? C_SIZE : D_SIZE;
  int dup = 0;
  for (int i = 1; i < idx; i++) {
    if (input[i-1] == input[i]) dup = 1;
    else dup = 0;
    result *= (((input[i] == 'c') ? C_SIZE : D_SIZE) - dup);
  }
  cout << result;
  return 0;
}
