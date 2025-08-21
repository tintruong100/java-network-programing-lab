package Demo_Synchronized;

public class Main {
    public static void main(String[] args) {
        SVManager manager = new SVManager();

        // Thread thêm SV mới
        Thread addThread = new SVThread(manager, "add", new SV("SV003", "Nguyen Van C", "CNTT3"));

        // Thread đọc danh sách SV
        Thread readThread = new SVThread(manager, "read");
        readThread.start();
        addThread.start();

    }
}