package etc.api.io.rw;

import java.io.FileWriter;

public class FileWriterEx {

    /*
         - 문자를 써서 저장할 때 사용하는 클래스 FileWriter 입니다.
         - 기본적으로 2바이트 단위로 처리하기 때문에 문자 쓰기에 적합합니다.
    */
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("")){

        }
    }

}
