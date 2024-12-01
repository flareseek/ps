#include <iostream>
#include <cstring>

int N;
int max = 0;
// down up right left
const int TRY = 10;
int levelMax[TRY] = {0};

int getMax(int field[20][20]) {
  int tempMax = 0;
  for (int row = 0; row < N; row ++) {
    for (int col = 0; col < N; col ++) {
      if (field[row][col] > tempMax) {
        tempMax = field[row][col];
      }
    }
  }
  return tempMax;
}

bool isSame(int prev[20][20], int curr[20][20]) {
  for (int row = 0; row < N; row++)
    for (int col = 0; col < N; col++)
      if (prev[row][col] != curr[row][col]) 
        return false;
  return true;
}
void setMax(int field[20][20]) {
  for (int row = 0; row < N; row ++) {
    for (int col = 0; col < N; col ++) {
      if (field[row][col] > max) {
        max = field[row][col];
        levelMax[TRY-1] = max;
        for (int i = TRY-2; i >=0; i--) {
          levelMax[i] = levelMax[i+1]/2;
        }
      }
    }
  }
}
void bt(int field[20][20], int cnt) {
  if (cnt == TRY) {
    setMax(field);
    return;
  }
  int newField[20][20];
  std::memcpy(newField, field, sizeof(newField));
  // up
  for (int col = 0; col < N; col ++) {
    int limit = 0;
    for (int row = 1; row < N; row ++) {
      if (!newField[row][col]) continue;
      int block = newField[row][col];
      newField[row][col] = 0;
      if (newField[limit][col] == block) {
        newField[limit][col] <<= 1;
        limit ++;
      } else if(newField[limit][col] == 0) {
        newField[limit][col] = block;
      } else if (newField[limit][col] != 0) {
        limit ++;
        newField[limit][col] = block;
      }
    }
  }
  if (levelMax[cnt] > getMax(newField)) {
    std::memcpy(newField, field, sizeof(newField));
  } else if (!isSame(field, newField)) {
    bt(newField, cnt+1);
    std::memcpy(newField, field, sizeof(newField));
  }
  // down
  for (int col = 0; col < N; col ++) {
    int limit = N-1;
    for (int row = N-2; row >= 0; row --) {
      if (!newField[row][col]) continue;
      int block = newField[row][col];
      newField[row][col] = 0;
      if (newField[limit][col] == block) {
        newField[limit][col] <<= 1;
        limit --;
      } else if(newField[limit][col] == 0) {
        newField[limit][col] = block;
      } else if (newField[limit][col] != 0) {
        limit --;
        newField[limit][col] = block;
      }
    }
  }
  if (levelMax[cnt] > getMax(newField)) {
    std::memcpy(newField, field, sizeof(newField));
  } else if (!isSame(field, newField)) {
    bt(newField, cnt+1);
    std::memcpy(newField, field, sizeof(newField));
  }
  // left
  for (int row = 0; row < N; row ++) {
    int limit = 0;
    for (int col = 1; col < N; col ++) {
      if (!newField[row][col]) continue;
      int block = newField[row][col];
      newField[row][col] = 0;
      if (newField[row][limit] == block) {
        newField[row][limit] <<= 1;
        limit ++;
      } else if(newField[row][limit] == 0) {
        newField[row][limit] = block;
      } else if (newField[row][limit] != 0) {
        limit ++;
        newField[row][limit] = block;
      }
    }
  }

  if (levelMax[cnt] > getMax(newField)) {
    std::memcpy(newField, field, sizeof(newField));
  } else if (!isSame(field, newField)) {
    bt(newField, cnt+1);
    std::memcpy(newField, field, sizeof(newField));
  }

  // right
  for (int row = 0; row < N; row ++) {
    int limit = N-1;
    for (int col = N-2; col >= 0; col --) {
      if (!newField[row][col]) continue;
      int block = newField[row][col];
      newField[row][col] = 0;
      if (newField[row][limit] == block) {
        newField[row][limit] <<= 1;
        limit --;
      } else if(newField[row][limit] == 0) {
        newField[row][limit] = block;
      } else if (newField[row][limit] != 0) {
        limit --;
        newField[row][limit] = block;
      }
    }
  }
  if (levelMax[cnt] <= getMax(newField) && !isSame(field, newField)) {
    bt(newField, cnt+1);
  }
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
  setMax(field);
  std::cout << max;
}
