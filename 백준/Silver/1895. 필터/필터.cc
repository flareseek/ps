#include <iostream>
#include <algorithm>

#define MAX_R 41
#define MAX_C 41

using namespace std;

int arr[MAX_R][MAX_C];
int result[MAX_R*MAX_C];
int result_idx = 0;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int R, C;

  cin >> R >> C;

  for(int row = 0; row < R; row++){
    for (int col = 0; col < C; col++) {
      cin >> arr[row][col];
    }
  }

  for(int col = 2; col < C; col++) {
    for (int row = 2; row < R; row++) {
      int sort_arr[9] = {0};
      int sort_idx = 0;

      for (int c = col-2; c <= col; c++) {
        for (int r = row-2; r <= row; r++) {
          sort_arr[sort_idx++] = arr[r][c];
        }
      }

      sort(sort_arr, sort_arr+sort_idx);
      result[result_idx++] = sort_arr[4];
    }
  }

  int T;
  cin >> T;
  sort(result, result+result_idx);
  int* idx = lower_bound(result, result+result_idx, T);

  cout << ((result+result_idx) - idx);
  return 0;
}
