package etc.api.io.folder;

import java.io.File;

public class CreateFolder {
    
    public static void main(String[] args) {
            /*
         - 자바에서 외부 경로로 폴더를 생성할 때는 File 클래스를 사용합니다.
         - 생성자의 매개값으로 폴더를 생성할 경로 + 폴더명을 지정합니다.
         */
        File file = new File("C:/MyWorkspace/forder_test/test/apple");

        if(!file.exists()) { // 해당 디렉토리 경로가 존재하면 true, 존재하지 않으면 false
            // file.mkdir(); 만들고자 하는 상위 경로 디렉토리가 존재하지 않으면 동작 안 함 마지막 경로 하나만 만듦.
            file.mkdirs(); // 여러 경로 폴더 다 만들어줌
            System.out.println("폴더 작성 완료");
        } else {
            System.out.println("이미 존재해요.");
        }

        /////////////////////////////////////////////////////////////////////////
        /*
         - 폴더를 삭제할 때, 해당 폴더에 내부 경로가 더 존재하거나, 파일이 있는 경우에는
          폴더를 삭제할 수 없습니다.
         - listFiles()를 통해 파일 내부 경로 또는 파일명을 얻어와서 파일부터 삭제한 후에
          폴더를 삭제할 수 있습니다.
         - 지우고자 하는 경로가 여러 개라면 위의 행동을 반복해 주시면 됩니다.
         - 자바로 삭제하는 건 비추
         */
        if(file.exists()) {
            boolean flag = file.delete(); // 삭제 성공하면 true, 실패 시 false 리턴
            System.out.println("flag = " + flag);
            System.out.println("삭제 완료");
        } else {
            System.out.println("해당 경로 없음");
        }

    }
}
