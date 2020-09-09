import javax.swing.*;
import java.awt.*;

public class ClientGiuGameField extends JFrame {

    private static final int WIN_HEIGHT = 700;
    private static final int WIN_WIDTH = 1000;
    private JPanel gameField = new JPanel();
    private volatile static ClientGiuGameField clientGiuGameField;


    public static void startGameField(){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                if(clientGiuGameField == null) {
                    synchronized (ClientGiuGameField.class) {
                        if(clientGiuGameField == null) {
                            clientGiuGameField = new ClientGiuGameField();
                        }
                    }
                }
            }
        });
    }
    private ClientGiuGameField(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sea Battle");
        setResizable(true);
        setAlwaysOnTop(false);
        setSize(WIN_WIDTH, WIN_HEIGHT);
        add(gameField, BorderLayout.CENTER);

        setVisible(true);
    }
}
