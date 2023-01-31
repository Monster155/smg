#include <iostream>

using namespace std;

int main()
{ int A,x;
   bool t;
   for (A=1;A<=1000;A++)
   {t=1;
      for (x=1;x<=10000;x++)
      {
          t = t*(((x % 7 ==0) <= (x % 21 != 0)) || (2*x + A >= 120));

      }
    if (t==1) cout << "A="<<A << endl;

   }

    return 0;
}
