#include <iostream>

using namespace std;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int idx = 0;
  char input[4];
  char a = 0;
  while(cin >> a)
    input[idx++] = a == 'c' ? 26 : 10;
  int result = input[0];
  for (int i = 1; i < idx; i++)
    result *= (input[i] - (int)(input[i-1] == input[i]));
  cout << result;
  return 0;
}
