import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SeaBattleStartMenu extends JFrame implements ActionListener{

    private static final int WIN_HEIGHT = 300;
    private static final int WIN_WIDTH = 400;

    private JButton btnOnePlayer = new JButton("One Player");
    private JButton btnMultiplayer = new JButton("Game with friend");
    private JButton btnExit = new JButton("Exit");
    private JPanel currentWindowPanel = new JPanel();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SeaBattleStartMenu();
        });
    }

    private SeaBattleStartMenu(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sea Battle");
        setResizable(true);
        setAlwaysOnTop(true);
        setSize(WIN_WIDTH, WIN_HEIGHT);

        currentWindowPanel.setLayout(new GridLayout(3,1, 10,10));
        currentWindowPanel.setBorder(BorderFactory.createEmptyBorder(70, 100, 70, 100));
        btnOnePlayer.addActionListener(this);
        btnMultiplayer.addActionListener(this);
        btnExit.addActionListener(this);

        currentWindowPanel.add(btnOnePlayer);
        currentWindowPanel.add(btnMultiplayer);
        currentWindowPanel.add(btnExit);
        add(currentWindowPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if(src == btnExit) System.exit(0);
        else if(src == btnOnePlayer){
            ClientGiuGameField.startGameField();

        }else if (src == btnMultiplayer){
            JOptionPane.showMessageDialog(null, "Unknown source: ", "Exception", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException("Unknown source: " + src);
        } else{
            JOptionPane.showMessageDialog(null, "Unknown source: ", "Exception", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException("Unknown source: " + src);
        }
    }

}
