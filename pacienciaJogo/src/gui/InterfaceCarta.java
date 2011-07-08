package gui;

import javax.swing.*;
import java.util.*;

public abstract class InterfaceCarta extends JPanel implements Observer, Transferable {

    /**
     * 
     * @return 
     */
    public void calcularPosicao() {
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param o
     * @param arg
     * @return 
     */
    public void update(Observable o, Object arg) {
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param graphics
     * @return 
     */
    public void paint(Graphics graphics) {
        throw new UnsupportedOperationException();
    }

}