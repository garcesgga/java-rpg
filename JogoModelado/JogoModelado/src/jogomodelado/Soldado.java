package jogomodelado;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Soldado extends Personagem {
    public void desenhar(){
        ImageIcon icon = new ImageIcon("sold.png");
        ImageIcon icont = tamanho(icon, 50, 50);
        JOptionPane.showMessageDialog(
                null,
                "Soldado Selecionado",
                "Seleção de Classe",
                JOptionPane.INFORMATION_MESSAGE,
                icont);
    }
    
    public void falar(){
        InOut.MsgSemIcone("Soldado", "Comandante e colegas soldados,\n\n" +
                "É uma honra estar diante de vocês como membro desta valente equipe.\n" + "Assumo o compromisso de servir com lealdade, coragem e disciplina.\n" +
                "Estamos unidos por um propósito comum: a defesa da nossa nação e o bem-estar do nosso povo.\n");
    }
    private static ImageIcon tamanho(ImageIcon icon, int width, int height) {
        Image img = icon.getImage();
        Image resizedImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImg);
    }
}
