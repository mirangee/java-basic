package etc.api.io.obj;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SaveSnack {
    public static void main(String[] args) {

        List<Snack> snackList = new ArrayList<>();
        Collections.addAll( snackList,
                new Snack("콘칩", 1970, 1500, "Good"),
                new Snack("사브레", 1980, 2500, "Bad"),
                new Snack("오징어집", 1985, 1700, "Soso")
                );

        try (FileOutputStream fos = new FileOutputStream("C:/MyWorkspace/snack.sav")) {
            // 객체를 저장할 수 있는 보조 스트림에 매개값으로 fos 전달
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // writeObject()메서드의 매개값으로 저장하려는 대상 전달
            oos.writeObject(snackList);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
