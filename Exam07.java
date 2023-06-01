class Exam07 {
  public static void main(String[] args) {

    // times table

    for (int i = 2; i < 10; i = i + 1)
    {
      System.out.print(i + " : ");
      for (int j = 1; j < 10; j = j + 1)
        {
          System.out.print(j * i + " ");
        }
      System.out.println();
    }
    System.out.println();
  }
}