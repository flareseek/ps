#include <iostream>

using namespace std;
int main() {
  ios::sync_with_stdio(false);
  cin.tie(0);

  int n, m;
  cin >> n >> m;
  int parent = n-m;

  int current_index = 0;
  while(parent--) {
    cout << current_index << " ";
    cout << (++current_index) << "\n";
  }

  for (int i = current_index + 1; i < n; i++)
    cout << current_index << " " << i << "\n";

  return 0;
}
