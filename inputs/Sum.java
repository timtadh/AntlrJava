public class Sum {
  public int sum(int a, int b) {
    int c = a;
    a = a * 2;
    b = b - 1;

    a = 9;
    b = 2;
    a++;
    if (b < 5) {
      a = 4;
      a = a * 2;
    }

    if (a > 1) {
      b = 9;
      c = a;
    }

    while (a < 100) {
      b = 0;
      a = a + 4;
    }

    for (int i = 0; i < 10; i++) {
      System.out.println("Hello");
    }
    b = b + 8;
    return a + b;
  }
}