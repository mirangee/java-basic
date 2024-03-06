package etc.api.io.buffered;

import java.io.*;

public class BufferedRwEx {
    public static void main(String[] args) {
        System.out.println("시작!");

        //dummy data
        StringBuilder text = new StringBuilder();

        for (int i = 0; i < 1000000 ; i++) {
            text.append(i + "안녕하세요\n");
        }


        try(FileWriter fw = new FileWriter("C:/MyWorkspace/hello.txt");
            BufferedWriter bw = new BufferedWriter(fw)) {
            //문자 기반 stream 이기 때문에 byte 배열로 변환하지 않고 String으로 변환해서 넣어주기만 하면 됨
            fw.write(new String(text));
            System.out.println("파일 정상 출력 완료!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try(FileReader fr = new FileReader("C:/MyWorkspace/hello.txt");
            BufferedReader br = new BufferedReader(fr)) {

            // BufferedReader에는 readLine() 메서드가 있고 한 줄을 통째로 읽어서 String으로 리턴한다.
            // 더 이상 읽어들일 데이터가 없으면 null을 리턴한다.
            // FileReader는 readLine() 메서드 없다.
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
            System.out.println("파일 정상 입력 완료!");
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
