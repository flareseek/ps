#include <iostream>

using namespace std;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int n;
  int cnt = 1;
  while(true) {
    cin >> n;
    if (!n) return 0;
    string name[20];
    bool nagative[20][20] = {{false}};
    bool isb = true;
    for (int i = 0; i < n; i++) {
      cin >> name[i];
      for (int j = 0; j < n - 1; j++) {
        char t;
        cin >> t;
        if (t == 'N') {
          nagative[i][j] = true;
          isb = false;
        }
      }
    }

    cout << "Group " << cnt++ << "\n";
    if (isb) {
      cout << "Nobody was nasty\n\n";
      continue;
    }

    for (int i = 0; i < n; i++)
      for (int j = 0; j < n-1; j++)
        if (nagative[i][j])
          cout << name[(i+(n-1-j))%n] << " was nasty about " << name[i] << "\n";
    cout << "\n";
  }
  return 0;
}
