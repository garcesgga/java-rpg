package jogomodelado;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class General extends Personagem {
    public void desenhar(){
        ImageIcon icon = new ImageIcon("general.png");
        ImageIcon icont = tamanho(icon, 50, 50);
        JOptionPane.showMessageDialog(
                null,
                "General Selecionado",
                "Seleção de Classe",
                JOptionPane.INFORMATION_MESSAGE,
                icont);
    }
    
    public void falar(){
        InOut.MsgSemIcone("General", "Soldados,\n\n" +
                "É uma honra estar diante de vocês como o General desta grandiosa força.\n" + "Nossos desafios serão muitos, mas juntos superaremos cada obstáculo.\n" +
                "A lealdade e a disciplina serão nossas maiores armas.\n");
    }
    
    private static ImageIcon tamanho(ImageIcon icon, int width, int height) {
        Image img = icon.getImage();
        Image resizedImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImg);
    }
}
