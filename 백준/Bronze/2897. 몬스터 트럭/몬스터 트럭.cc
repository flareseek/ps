#include <iostream>

using namespace std;

char map[50][50] = {{0}};
int result[5] = {0};

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int R, C;
  cin >> R >> C;

  for (int r = 0; r < R; r++)
    for (int c = 0; c < C; c++)
      cin >> map[r][c];

  for (int r = 1; r < R; r++) {
    for (int c = 1; c < C; c++) {
      const char a[] = { map[r-1][c-1], map[r-1][c], map[r][c-1], map[r][c] };
      int X = 0, B = 0;
      for (int i = 0; i < 4; i++) {
        if (a[i] == '#') B++;
        else if(a[i] == 'X') X++;
      }
      if (B) continue;
      result[X] ++;
    }
  }
  for (int i = 0; i < 5; i++) cout << result[i] << "\n";
  return 0;
}
