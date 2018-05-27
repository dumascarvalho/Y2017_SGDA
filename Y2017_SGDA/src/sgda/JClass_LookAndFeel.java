package sgda;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class JClass_LookAndFeel {

    public static void Aplicar() {
        try {
            UIManager.setLookAndFeel("com.alee.laf.WebLookAndFeel");
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            System.out.println("Exceção: " + ex);
        }
    }
}
