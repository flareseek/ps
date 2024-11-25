#include <iostream>

int N;
int max = 0;
// down up right left
const int DIR[4][2] = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

void copy(int prev[20][20], int curr[20][20]) {
  for (int i = 0; i < 20; i++)
    for (int j = 0; j < 20; j++)
      curr[i][j] = prev[i][j];
}
void bt(int field[20][20], int cnt) {
  if (cnt == 5) {
    for (int row = 0; row < N; row ++) {
      for (int col = 0; col < N; col ++) {
        if (field[row][col] > max) {
          max = field[row][col];
        }
      }
    }
    return;
  }
  int newField[20][20];
  copy(field, newField);
  // up
  for (int col = 0; col < N; col ++) {
    int limit = 0;
    for (int row = 1; row < N; row ++) {
      if (!newField[row][col]) continue;
      int block = newField[row][col];
      newField[row][col] = 0;
      if (newField[limit][col] == block) {
        newField[limit][col] *= 2;
        limit ++;
      } else if(newField[limit][col] == 0) {
        newField[limit][col] = block;
      } else if (newField[limit][col] != 0) {
        limit ++;
        newField[limit][col] = block;
      }
    }
  }
  bt(newField, cnt+1);

  copy(field, newField);
  // down
  for (int col = 0; col < N; col ++) {
    int limit = N-1;
    for (int row = N-2; row >= 0; row --) {
      if (!newField[row][col]) continue;
      int block = newField[row][col];
      newField[row][col] = 0;
      if (newField[limit][col] == block) {
        newField[limit][col] *= 2;
        limit --;
      } else if(newField[limit][col] == 0) {
        newField[limit][col] = block;
      } else if (newField[limit][col] != 0) {
        limit --;
        newField[limit][col] = block;
      }
    }
  }
  bt(newField, cnt+1);
  copy(field, newField);
  // left
  for (int row = 0; row < N; row ++) {
    int limit = 0;
    for (int col = 1; col < N; col ++) {
      if (!newField[row][col]) continue;
      int block = newField[row][col];
      newField[row][col] = 0;
      if (newField[row][limit] == block) {
        newField[row][limit] *= 2;
        limit ++;
      } else if(newField[row][limit] == 0) {
        newField[row][limit] = block;
      } else if (newField[row][limit] != 0) {
        limit ++;
        newField[row][limit] = block;
      }
    }
  }
  bt(newField, cnt+1);
  copy(field, newField);
  // right
  for (int row = 0; row < N; row ++) {
    int limit = N-1;
    for (int col = N-2; col >= 0; col --) {
      if (!newField[row][col]) continue;
      int block = newField[row][col];
      newField[row][col] = 0;
      if (newField[row][limit] == block) {
        newField[row][limit] *= 2;
        limit --;
      } else if(newField[row][limit] == 0) {
        newField[row][limit] = block;
      } else if (newField[row][limit] != 0) {
        limit --;
        newField[row][limit] = block;
      }
    }
  }
  bt(newField, cnt+1);
}

int main(void) {
  int field[20][20];
  std::cin >> N;
  for (int i = 0; i < N; i++) {
    int t;
    for (int j = 0; j < N; j++) {
      std::cin >> t;
      field[i][j] = t;
    }
  }
  bt(field, 0);

  std::cout << max;
}
