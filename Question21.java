package org.example;

import java.io.*;

public class Question21 {
    static long count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        String[] input = br.readLine().split(" ");
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        mergeSort(arr,0,n-1);
        bw.write(count + "");
        bw.flush();
        bw.close();
        br.close();
    }
    public static void mergeSort(int[] arr, int start, int end) {
        if(start < end) {
            int mid = (start+end)/2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            merge(arr,start,end);
        }
    }
    public static void merge(int[] arr, int start, int end) {
        int[] temp = new int[end-start+1];
        int i = start;
        int mid = (start+end)/2;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=end) {
            if(arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                count = count + (mid-i+1);
                j++;
                k++;
            }
        }
        while(i<=mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j<=end) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for(int x=start;x<=end;x++) {
            arr[x] = temp[x-start];
        }
    }
}
