package etc.exception.basic;

public class FinallyExample {
    public static void main(String[] args) {

        String[] pets = {"강아지", "고양이", "짹짹이"};

        for(int i = 0; i <= pets.length; i++) {
            try {
                System.out.println(pets[i] + " 키우고 싶다~~");
            } catch (Exception e) {
                System.out.println("애완동물의 정보가 없습니다!");
            } finally {
                /*
                finally 블록에는 예외 발생 여부와 상관없이 항상 실행하고 싶은 문장을 작성합니다.
                try 블록에서 예외가 발생하면 코드의 흐름이 바로 catch 블록으로 이어집니다.
                그러면 예외 발생 이후 문장은 실행되지 않습니다. 이런 상황에서 finally에
                꼭 실행이 필요한 문장을 넣으면 예외 발생과 상관없이 코드를 안정적으로 진행시킬 수 있습니다.
                객체를 반납하거나 메모리에서 해제할 때 (close()) finally를 주로 사용합니다.
                */
                System.out.println("퐈이날리~~~ 아무튼 실행되는 문장입니다.");
                System.out.println("-----------------------------------");
            }
        }


    }
}
