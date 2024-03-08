package video.main;

import video.ui.AppUi;

import static video.ui.AppUi.*;

public class Main {

    public static void main(String[] args) {

        AppController controller = new AppController();

        while (true) {
            startScreen();
            int selectNumber = inputInteger(">>> ");
            controller.chooseSystem(selectNumber);
        }

    }
<<<<<<< HEAD

}










=======
}
>>>>>>> 2fbfa8a564dcaad5e3b0a600e28ed2192d624d95
