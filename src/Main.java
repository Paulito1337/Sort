public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{4, 2, 1, 3};
        Sort sort = new BubbleSort();
        sort.sort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }



}
