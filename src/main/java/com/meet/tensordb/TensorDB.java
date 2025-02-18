package com.meet.tensordb;
public class TensorDB{
    static {
        System.out.println("tensordb");
    }
    public native int processTensor();
    public static void main(String[] args){
        TensorDB db = new TensorDB();
        int result = db.processTensor();
        System.out.println("RUST_JNI::"+result);
    }
}