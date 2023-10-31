package org.example;

import java.io.*;

public class Question20 {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        arr = new int[n+1];
        for(int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        mergeSort(arr, 1, n);
        for(int i = 1; i <= n; i++) {
            bw.write(arr[i] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
    public static void mergeSort(int[] arr, int start, int end) {
        if(start < end) {
            int mid = (start+end)/2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            merge(arr, start, mid, end);
        }
    }
    public static void merge(int[] arr, int start,int mid, int end) {
        int[] temp = new int[end-start+1];
        int i = start;
        int j = mid+1;
        int k = 0;
        while(i <= mid && j <= end) {
            if(arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            }
            else {
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
        while(i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j <= end) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for(int x = start; x <= end; x++) {
            arr[x] = temp[x-start];
        }
    }
}
