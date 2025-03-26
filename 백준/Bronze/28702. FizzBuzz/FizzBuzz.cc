#include <iostream>
#include <string>

using namespace std;

bool condition(string str) {
  if (str != "FizzBuzz" && str != "Fizz" && str != "Buzz") return true;
  return false;
}

string answer(int i) {
  if (i % 3 == 0 && i % 5 == 0) {
    return "FizzBuzz";
  } else if (i % 3 == 0) {
    return "Fizz";
  } else if (i % 5 == 0) {
    return "Buzz";
  } else {
    return to_string(i);
  }
}

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  string str1, str2, str3;
  cin >> str1 >> str2 >> str3;

  if (condition(str1)) cout << answer(stoi(str1) + 3);
  else if (condition(str2)) cout << answer(stoi(str2) + 2);
  else if (condition(str3)) cout << answer(stoi(str3) + 1);
  return 0;
}
