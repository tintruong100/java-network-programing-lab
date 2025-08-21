package Demo_Synchronized;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SVManager {
    private final String fileName = "SV.dat";
    public synchronized void readSV() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            List<SV> list = (List<SV>) ois.readObject();
            System.out.println("===== DANH SÁCH SV =====");
            for (SV sv : list) {
                System.out.println(sv);
            }
            System.out.println("========================");
        } catch (FileNotFoundException e) {
            System.out.println("File chưa tồn tại.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public synchronized void addSV(SV sv) {
        List<SV> list = new ArrayList<>();

        // Đọc danh sách cũ nếu có
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            list = (List<SV>) ois.readObject();
        } catch (FileNotFoundException e) {
            // File chưa tồn tại -> tạo mới
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Thêm SV mới
        list.add(sv);

        // Ghi lại file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(list);
            System.out.println("Đã thêm SV: " + sv);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}