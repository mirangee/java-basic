package etc.api.io.rw;

import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderEx {
    public static void main(String[] args) {
          /*
         - 문자기반으로 읽어들이는 클래스는 FileReader 입니다.
         - 2바이트 단위로 읽기 때문에 문자를 읽어들이기 적합합니다.
         */

        try (FileReader fr = new FileReader("C:\\MyWorkspace\\merong.txt")) { // 백슬래쉬(\)가 두 개인 이유: 하나면 이스케이프 문자로 인식
//            int data = 0;
//            while (data != -1) {
//                data = fr.read();
//                System.out.print((char) data);
//            }
            
            char[] arr = new char[50];
            // read()는 기본적으로 단일 문자 하나씩 읽어들임 -> 위에서는 반복문으로 한글자씩 계속 읽어들임.
            // 배열을 전달하면 배열의 크기 만큼 읽어들임.
            int result = fr.read(arr);
            System.out.println("문자의 개수: " + result); // 문자의 개수
            for (char c : arr) {
                System.out.print(c);
                if (c == 0) break; // 배열이 꽉 차지 않았다면 char의 기본값 0을 만나게 된다.
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
