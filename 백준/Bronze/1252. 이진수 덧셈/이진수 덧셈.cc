#include <iostream>
#include <string>

int main(void) {
  std::string a, b, resultStr = "";
  std::cin >> a >> b;

  if (a.size() < b.size()) {
    std::string t = b;
    b = a;
    a = t;
  }

  int aSize = a.size();
  int bSize = b.size();
  int carry = 0;
  for(int index = 0; index < aSize; index++) {
    int ac = a[aSize - index - 1] - '0';
    int bc  = bSize - index - 1 >= 0 ? b[bSize - index - 1] - '0' : 0;
    int result = (ac+bc+carry);
    carry = result/2;
    resultStr = std::to_string(result % 2) + resultStr;
  }
  if (carry) {
    resultStr = "1" + resultStr;
  } else {
    size_t z = resultStr.find_first_not_of('0');
    if (z != std::string::npos) {
      resultStr = resultStr.substr(z);
    } else {
      resultStr = "0";
    }
  }

  std::cout << resultStr;
  return 0;
}
