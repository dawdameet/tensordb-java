package com.meet.tensordb;

public class TensorDB {
    static {
        System.load(System.getProperty("user.dir") + "/tensorlib.dll");
    }

    public native void store(String key, String data);
    public native String get(String key);
    public static void main(String[] args) {
        TensorDB db = new TensorDB();
        String tensorJson = "[[1.0, 2.0], [3.0, 4.0]]";
        db.store("tensor1", tensorJson);
        System.out.println("Stored tensor: " + tensorJson);
        String retrievedTensor = db.get("tensor1");
        System.out.println("Retrieved tensor: " + retrievedTensor);
        System.out.println("The required tensor was processed");
    }
}
