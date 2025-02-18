package com.meet.tensordb;

public class TensorDB {
    static {
        System.load(System.getProperty("user.dir") + "/tensorlib.dll");
    }

    // Native methods (linked to Rust)
    public native void store(String key, String data);
    public native String get(String key);

    public static void main(String[] args) {
        TensorDB db = new TensorDB();

        // Store a tensor
        String tensorJson = "[[1.0, 2.0], [3.0, 4.0]]";
        db.store("tensor1", tensorJson);
        System.out.println("Stored tensor: " + tensorJson);

        // Retrieve the tensor
        String retrievedTensor = db.get("tensor1");
        System.out.println("Retrieved tensor: " + retrievedTensor);
    }
}
