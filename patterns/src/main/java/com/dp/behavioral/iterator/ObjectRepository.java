package com.dp.behavioral.iterator;

public class ObjectRepository {

    //This is a text repository
    String[] txt = {"This","is", "a", "TestIterator","design","pattern"};



    public TestIterator getIterator(){
        return new ObjectTestIterator();
    }

    public TestIterator getIteratorRev(){
        return new ObjectTestIteratorRev();
    }


    public class ObjectTestIterator implements TestIterator {

        int index;
        public boolean hasNext() {
            if(index<txt.length)
                return true;
            return false;
        }

        public Object next() {
            if(this.hasNext())
                return txt[index++];
            else
                return null;
        }
    }


    public class ObjectTestIteratorRev implements TestIterator {

        int index=txt.length-1;
        public boolean hasNext() {
            if(index>=0)
                return true;
            return false;
        }

        public Object next() {
            if(this.hasNext())
                return txt[index--];
            else
                return null;
        }
    }
}
