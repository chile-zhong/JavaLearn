package com.lxg.hw.t051;

import java.util.Scanner;

/**
 * @author lxg
 * @description 输出单项链表中倒数第k个节点
 * @date 2021/10/5
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            int size = Integer.parseInt(in.nextLine().trim());
            String[] strs = in.nextLine().trim().split(" ");
            int[] a = new int[strs.length];
            for (int i = 0; i <strs.length ; i++) {
                a[i] = Integer.parseInt(strs[i]);
            }
            ListNode link = new ListNode(a[0]);
            ListNode p = link;
            for (int i = 1; i <a.length ; i++) {
                ListNode q = new ListNode(a[i]);
                p.setNext(q);
                p = q;
            }
            int k = Integer.parseInt(in.nextLine().trim());
            ListNode re = findKthToTail(link,size,k);
            if(re!=null){
                System.out.println(re.getVal());
            }else{
                System.out.println();
            }
        }
    }

    public static ListNode findKthToTail(ListNode link,int size,int k){
        if(k==0){
            return new ListNode(0);
        }
        if(k<0 || k>size){
            return null;
        }
        k = size - k;
        ListNode p =link;
        while(k!=0){
            p = p.getNext();
            k--;
        }
        return p;
    }
}


/**
 * 定义链表节点
 */
class ListNode{
    private int val;
    private ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
