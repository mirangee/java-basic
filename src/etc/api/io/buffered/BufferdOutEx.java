package etc.api.io.buffered;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferdOutEx {
    public static void main(String[] args) {

        System.out.println("시작!");

        //dummy data
        StringBuilder text = new StringBuilder();

        for (int i = 0; i < 1000000 ; i++) {
            text.append(i + "안녕하세요\n");
        }

        // Buffered가 붙은 객체들은 기존에 사용했던 객체를 생성자의 매개값으로 전달
        // ex) BufferedOutputStream -> FileOutputStream을 매개값으로 받아야 한다.
        // ex) BufferedInputStream -> FileInputStream을 매개값으로 받아야 한다.

        long start = System.currentTimeMillis();

        try(FileOutputStream fos = new FileOutputStream("C:\\MyWorkspace\\bout.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos) ) {

            // write() 메서드의 매개값으로 byte 타입의 data를 줘야 하는데
            // StringBuilder에는 getBytes() 메서드가 없으므로 이 메서드가 있는 String 객체로 변환이 필요하다.
            // dummy data를 StringBuilder로 생성했기에
            // 새로운 String 객체 생성 -> 생성자의 매개값으로 StringBuilder를 전달.
            // 바이트 데이터로 변환

            String str = new String(text); //StringBuilder를 String으로 변환
            byte[] data = str.getBytes();
            fos.write(data);

            for (byte b : data) {
                bos.write(b);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("소요시간: " + (end - start)* 0.001 + "초");


    }
}
