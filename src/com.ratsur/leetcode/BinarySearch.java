package com.ratsur.leetcode;

public class BinarySearch {

    public static void main(String[] args) {
        int c[] = {1};
        assert binary(c,9)==-1;
        assert binary(c,1)==0;

        int a[] = {1,2,3,4,8,12,16};
        assert binary(a,9)==-1;
        assert binary(a,4)==3;
        assert binary(a,16)==6;
        assert binary(a,1)==0;

        int b[] = {1,1,1,1,1,1,1,2,2,3,4,4,5,6,6,8,8,8,8,8,9,10};

        assert binaryFirst(b,9)==20;
        assert binaryFirst(b,1)==0;
        assert binaryFirst(b,2)==7;
        assert binaryFirst(b,8)==15;
        assert binaryFirst(b,6)==13;

        assert binaryLast(b,1)==6;
        assert binaryLast(b,2)==8;
        assert binaryLast(b,8)==19;
        assert binaryLast(b,6)==14;

        System.out.println("Success");
    }

    public static int binaryLast(int a[],int target)
    {
        int high = a.length-1;
        int low = 0;
        int ans = -1;
        while(high>=low)
        {
            int mid = (high+low)/2;
            if(a[mid]==target)
            {
                ans = mid;
                low = mid+1;
            }
            else if(a[mid]>target)
            {
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }

    public static int binaryFirst(int a[],int target)
    {
        int high = a.length-1;
        int low = 0;
        int ans = -1;
        while(high>=low)
        {
            int mid = (high+low)/2;
            if(a[mid]==target)
            {
                ans = mid;
                high = mid-1;
            }
            else if(a[mid]>target)
            {
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }

    public static int binary(int a[],int target)
    {
        int high = a.length-1;
        int low = 0;
        int ans = -1;
        while(high>=low)
        {
            int mid = (high+low)/2;
            if(a[mid]==target)
            {
                ans = mid;
                break;
            }
            else if(a[mid]>target)
            {
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}
