package com.ratsur.leetcode;
import java.util.*;
class Ugly {
    public int nthUglyNumber(int n, int a, int b, int c) {
        HashSet<Integer> set = new HashSet();
        int[] arr = new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        Arrays.sort(arr);
        int min = arr[0], mid=arr[1], max=arr[2];
        int ans=0,i=1,j=1,k=1;
        while(set.size()!=n)
        {
            int[] ar = new int[3];
            ar[0] = min*i;
            ar[1] = mid*j;
            ar[2] = max*k;
            Arrays.sort(ar);
            ans = ar[0];
            if(ans==min*i)
            {
                set.add(ans);
                i++;
            }
            if(ans==mid*j)
            {
                set.add(ans);
                j++;
            }
            if(ans==max*k)
            {
                set.add(ans);
                k++;
            }
            System.out.println("set ="+ans);
        }
        System.out.println("ans =" + ans);
        return ans;
    }

    public static void main(String[] args) {
        Ugly u = new Ugly();
        int ans = Long.valueOf(15000000000000l).intValue();
        System.out.println(ans);
        //u.nthUglyNumber(1000000000,2,217983653,336916467);
    }
}
