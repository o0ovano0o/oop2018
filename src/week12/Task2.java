package week12;

interface Sort
{
    public void sort(int arr[], int n);
}

class BubbleSort implements Sort {

    @Override
    public void sort(int arr[], int n) {
        System.out.println("Bubble Sort");
       for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

class SelectionSort implements Sort{

    @Override
    public void sort(int[] arr, int n) {
        System.out.println("Selection Sort");
            int i,imin,j,temp;
            for (i=0; i<=n-2; i++)
            {
                imin = arr[i];
                for (j=i+1; j<=n-1; j++)
                    if (arr[j] < imin)
                    {
                        imin = arr[j];
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
            }
        }
    }

public class Task2 {
    Sort sort;

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        int[] arr={3,2,5,7,9,5,3,6,8,9,4,1,0,7};
        task2.setSort(new BubbleSort());
        task2.sort.sort(arr,arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
