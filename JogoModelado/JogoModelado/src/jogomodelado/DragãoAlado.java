package jogomodelado;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DragãoAlado extends Personagem{
    public void desenhar(){
        ImageIcon icon = new ImageIcon("drag.png");
        ImageIcon icont = tamanho(icon, 50, 50);
        JOptionPane.showMessageDialog(
                null,
                "Dragão Alado Selecionado",
                "Seleção de Classe",
                JOptionPane.INFORMATION_MESSAGE,
                icont);
    }
    
    public void falar(){
        InOut.MsgSemIcone("Dragão Alado", "Ouvintes corajosos e seres destemidos,\n\n" +
                "Eu sou o Dragão Alado, o guardião das chamas eternas e senhor dos céus.\n" + "Minhas escamas reluzem com a majestade dos tempos imemoriais, e minhas asas se estendem como a própria escuridão da noite.\n" +
                "Permitam-se ser inspirados pela presença majestosa de um dragão, e que a harmonia prevaleça.\n");
    }
    
    public boolean selectArsenal(){
        int i = 0;
        arse.addArma();
        if (arse.arsenal.isEmpty()) {
            InOut.MsgDeInformacao("Lista de Arsenal", "Adicione armas antes de realizar esta operação.");
            return false;
        }
        while(true){
            int op = InOut.leInt("Selecione as Habilidades: \n 1- Garras Afiadas \n 2- Sopro de Fogo \n 3- Sair");
          
            switch(op){
                case 1:            
                    armament.add(arse.arsenal.get(7));
                    i++;
                    InOut.MsgDeInformacao("Garras Afiadas","Habilidade Adicionada");
                    break;

                case 2:
                    armament.add(arse.arsenal.get(8));
                    i++;
                    InOut.MsgDeInformacao("Sopro de Fogo","Habilidade Adicionada");
                    break;
                case 3:
                    InOut.MsgDeInformacao("Fim", "Voltando ao menu principal");           
                    return false;
                default:
                    InOut.MsgDeErro("Opção inválida", "Escolha uma opção válida.");
                    break;
            }               
            if (i == 2){
                InOut.MsgDeInformacao("Fim", "As 3 magias foram selecionadas \n Voltando ao menu principal"); 
                return false;
            }
        }    
    }
    private static ImageIcon tamanho(ImageIcon icon, int width, int height) {
        Image img = icon.getImage();
        Image resizedImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImg);
    }
    
}
