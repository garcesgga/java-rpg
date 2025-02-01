package jogomodelado;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LutSumo extends Personagem{
    public void desenhar(){
        ImageIcon icon = new ImageIcon("sumo.png");
        ImageIcon icont = tamanho(icon, 50, 50);
        JOptionPane.showMessageDialog(
                null,
                "Lutador de Sumo Selecionado",
                "Seleção de Classe",
                JOptionPane.INFORMATION_MESSAGE,
                icont);
    }
    
    public void falar(){
        InOut.MsgSemIcone("Lutador de Sumo", "Respeitável público e amantes do sumô,\n\n" +
                "É com grande honra e humildade que me apresento a todos vocês como um lutador de sumô.\n" + "Cada vez que subo no dohyo, eu represento não apenas a mim mesmo, mas também a rica história e cultura do sumô.\n" +
                "Com treinamento árduo, disciplina e respeito, busco alcançar a excelência neste esporte.\n");
    }
    private static ImageIcon tamanho(ImageIcon icon, int width, int height) {
        Image img = icon.getImage();
        Image resizedImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImg);
    }
}
