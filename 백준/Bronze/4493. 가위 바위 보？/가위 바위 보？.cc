#include <iostream>

int main(void) {
  int n;
  std::cin >> n;

  while (n-->0) {
    int r;
    std::cin >> r;
    int p1win = 0, p2win = 0;
    char p1[99], p2[99];

    for (int i = 0; i < r; i++) {
      std::cin >> p1[i];
      std::cin >> p2[i];
    }

    for (int i = 0; i < r; i++) {
      if (p1[i] == p2[i]) continue;
      if ((p1[i] == 'R' && p2[i] == 'S') || (p1[i] == 'S' && p2[i] == 'P') || (p1[i] == 'P' && p2[i] == 'R'))
        p1win++;
      else p2win++;
    }

    if (p1win > p2win)
      std::cout << "Player 1\n";
    else if (p1win < p2win)
      std::cout << "Player 2\n";
    else
      std::cout << "TIE\n";
  }
  return 0;
}
