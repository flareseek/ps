#include <iostream>

int min(int a, int b) {
  return a < b ? a : b;
}

int main(void) {
  int n;
  std::cin >> n;
  while(n--) {
    int c, y, su, sa, f;
    int b, gs, gc, w;
    std::cin >> c >> y >> su >> sa >> f;
    std::cin >> b >> gs >> gc >> w;

    int bs = min(c/((double)8/16), y/((double)8/16));
    bs = min(bs, su/((double)4/16));
    bs = min(bs, sa/((double)1/16));
    bs = min(bs, f/((double)9/16));

    int tp = b + gs/30 + gc/25 + w/10;
    std::cout << min(bs, tp) << std::endl;
  }
  return 0;
}
