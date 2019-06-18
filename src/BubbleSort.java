public class BubbleSort implements Sort {


    @Override
    public void sort(int[] a) {
        for (int i = 0; i < a.length ; i++){
            int cur = 0;
            for (int j = 0; j < a.length  - i; j++)
                if(a[cur] > a[j])
                {
                    int temp = a[j];
                    a[j] = a[cur];
                    a[cur] = temp;
                    cur = j;
                }
            for (int i1 : a) {
                System.out.print(i1 + " ");
            }
            System.out.println();
        }
    }
}
