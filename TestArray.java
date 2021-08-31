  class TestArray{
  public static void main(String[] args) {

// defining array
    int[] a = {10,20,30,40,50};

    // display size of array
    System.out.println("Size = "+ a.length);

    // display array using length property
    System.out.println("Array elements:");
    for(int i=0; i < a.length; i++){
      System.out.print(a[i]+"\t");
    }

  }
}