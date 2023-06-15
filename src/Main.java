import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static ArrayList<Integer> find(int arr[]){

        int n=arr.length;
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                ArrayList<Integer>temp=new ArrayList<>();
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    temp.add(arr[k]);
                }
                if(sum==0){
                    ans = temp;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of array");

        int size=sc.nextInt();

        int arr[]=new int[size];

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        if(!(find(arr).isEmpty())){
            System.out.println(find(arr));
        }else{
            System.out.println("No Elements found");
        }
    }
}