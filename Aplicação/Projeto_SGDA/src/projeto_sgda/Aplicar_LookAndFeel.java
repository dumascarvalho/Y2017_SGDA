package projeto_sgda;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Aplicar_LookAndFeel {

    public static void Aplicar() {
        try {
            UIManager.setLookAndFeel("com.alee.laf.WebLookAndFeel");
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            System.out.println("Exceção: " + ex);
        }
    }
}
