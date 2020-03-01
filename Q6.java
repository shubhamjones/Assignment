public class Q6 {
    public static void main(String[] args)
    {
     int[] arr={1,1,2,2,3,4,4,5,5,6,6};
     int count=arr[0];
     for(int i=1;i<arr.length;i=i+1)
     { count=count ^ arr[i];
    }
        System.out.println("Element occuring once ="+count);
}}
