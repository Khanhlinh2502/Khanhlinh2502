
package mystack1;

import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node ( int x) {data=x; next = null;}
    Node ( int x, Node t) {data=x; next=t;}
    
}

public class MyStack1 {
    Node top;

    public MyStack1() {top = null;}
    boolean EmptyS () {return top ==null;}
    void Push (int x) { top = new Node (x,top);}
    int Pop(){
        int x=0;
        if ( EmptyS()) System.out.println("\n NX rong!");
        else { x=top.data; top = top.next;}
        return x;
    }
    void nhap(){
        int x=0;
        Scanner kb = new Scanner(System.in);
        while (true){
            System.out.print("Nhap x <> 0 de them vao NX:  ");
             x= kb.nextInt();
             if ( x==0) break; else Push(x);
             
        }
}
    void in(){
        MyStack1 t= new MyStack1();
        System.out.print("\n Noi dung NX: ");
        int x;
        while (!this.EmptyS()) {
            x = this.Pop(); System.out.print(" "+x); t.Push(x);
        }
        while (!t.EmptyS()) this.Push(t.Pop());
    }
    int TinhTong() {
        int tong = 0;
        MyStack1 t = new MyStack1();
        while (!EmptyS()) {
            int x = Pop();
            tong += x;
            t.Push(x);
        }
        while (!t.EmptyS()) {
            Push(t.Pop());
        }
        return tong;
    }

    int DemLe() {
        int dem = 0;
        MyStack1 t = new MyStack1();
        while (!EmptyS()) {
            int x = Pop();
            if (x % 2 != 0)
                dem++;
            t.Push(x);
        }
        while (!t.EmptyS()) {
            Push(t.Pop());
        }
        return dem;
    }

    int TimMax() {
        if (EmptyS()) {
            System.out.println("Nx Rong!");
            return Integer.MIN_VALUE;
        }
        int max = Integer.MIN_VALUE;
        MyStack1 t = new MyStack1();
        while (!EmptyS()) {
            int x = Pop();
            if (x > max)
                max = x;
            t.Push(x);
        }
        while (!t.EmptyS()) {
            Push(t.Pop());
        }
        return max;
    }

    void XoaCuoi() {
        if (EmptyS()) {
            System.out.println("Nx Rong!");
            return;
        }
        MyStack1 t = new MyStack1();
        while (!EmptyS()) {
            int x = Pop();
            t.Push(x);
        }
        t.Pop();
        while (!t.EmptyS()) {
            Push(t.Pop());
        }
    }

    void ThemVaoViTri() {
        Scanner kb = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("Nhap Gia Tri X Can Them: ");
        int x = kb.nextInt();
        System.out.println(" ");
        System.out.print("Nhap Vi Tri K Can Chen (1 La Tren Cung): ");
        int k = kb.nextInt();
        MyStack1 t = new MyStack1();
        int count = 1;
        while (!EmptyS() && count < k) {
            t.Push(Pop());
            count++;
        }
        Push(x);
        while (!t.EmptyS()) {
            Push(t.Pop());
        }
    }

    void ThemCuoi() {
        Scanner kb = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("Nhap Gia Tri X Can Them Vao Cuoi: ");
        int x = kb.nextInt();
        MyStack1 t = new MyStack1();
        while (!EmptyS()) {
            t.Push(Pop());
        }
        Push(x);
        while (!t.EmptyS()) {
            Push(t.Pop());
        }
    }
                
        
    
    public static void main(String[] args) {
        MyStack1 S = new MyStack1();
        /* S.Push(100); S.Push(1);S.Push(11);S.Push(9);S.Push(99);
        while (!S.EmptyS()) System.out.print(" "+ S.Pop()); */
        S.nhap();S.in();
        System.out.println("\nTong Cac Gia Tri: " + S.TinhTong());
        System.out.println("So Phan Tu Le: " + S.DemLe());
        System.out.println("Phan Tu Lon Nhat: " + S.TimMax());
        S.XoaCuoi();
        System.out.print("\nSau Khi Xoa Cuoi:");
        S.in();
        S.ThemVaoViTri();
        System.out.print("\nSau Khi Them Vao Vi Tri:");
        S.in();
        S.ThemCuoi();
        System.out.print("\nSau Khi Them Vao Cuoi:");
        S.in();
        System.out.println("\n XONG!");
    }
}
