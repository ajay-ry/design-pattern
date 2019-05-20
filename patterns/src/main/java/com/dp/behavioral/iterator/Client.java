package com.dp.behavioral.iterator;

public class Client {
    public static void main(String[] args) {
        ObjectRepository or = new ObjectRepository();
        TestIterator itr = or.getIteratorRev();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
