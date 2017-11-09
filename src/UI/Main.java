package UI;

import com.sun.javafx.application.LauncherImpl;

public class Main {
   public static void main(String[] args) {
      LauncherImpl.launchApplication(FirstUI.class, preloaded.class, args);
   }
}
