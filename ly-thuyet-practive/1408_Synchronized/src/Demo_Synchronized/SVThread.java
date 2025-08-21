package Demo_Synchronized;

public class SVThread extends Thread {
    private SVManager manager;
    private String action; // "read" hoặc "add"
    private SV sv;         // dùng khi action = "add"

    public SVThread(SVManager manager, String action) {
        this.manager = manager;
        this.action = action;
    }

    public SVThread(SVManager manager, String action, SV sv) {
        this.manager = manager;
        this.action = action;
        this.sv = sv;
    }

    @Override
    public void run() {
        if ("read".equalsIgnoreCase(action)) {
            manager.readSV();
        } else if ("add".equalsIgnoreCase(action) && sv != null) {
            manager.addSV(sv);
        } else {
            System.out.println("Hành động không hợp lệ!");
        }
    }
}
