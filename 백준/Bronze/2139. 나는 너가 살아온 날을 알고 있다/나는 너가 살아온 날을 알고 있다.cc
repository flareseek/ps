#include <iostream>

int main(void) {
  int days[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  while(true) {
    int d, m, y, count = 0;
    std::cin >> d >> m >> y;
    if (d == 0 && m == 0 && y == 0) break;

    for (int i = 1; i < m; i++) {
      count += days[i];
      if (i == 2 && ((y%4==0) && ((y%100 != 0) || (y%400 == 0)))) count ++;
    }
    count += d;
    std::cout << count << std::endl;
  }
  return 0;
}
