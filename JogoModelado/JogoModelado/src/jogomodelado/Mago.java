package jogomodelado;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Mago extends Personagem{
    public void desenhar(){
        ImageIcon icon = new ImageIcon("mago.png");
        ImageIcon icont = tamanho(icon, 50, 50);
        JOptionPane.showMessageDialog(
                null,
                "Mago Selecionado",
                "Seleção de Classe",
                JOptionPane.INFORMATION_MESSAGE,
                icont);
    }
    
    public void falar(){
        InOut.MsgSemIcone("Mago", "Nobres espectadores e companheiros de jornada,\n\n" +
                "Diante de vocês está Gandalf, um simples aprendiz de mago dedicado às artes arcanas.\n" + "Nos reinos da magia, busco compreender os segredos que envolvem os elementos e as energias cósmicas.\n" +
                "Cada gesto, cada palavra sussurrada em antigas línguas, é um passo em direção ao desconhecido.\n");
    }
    
    public boolean selectArsenal(){
        int i = 0;
        arse.addArma();
        if (arse.arsenal.isEmpty()) {
            InOut.MsgDeInformacao("Lista de Arsenal", "Adicione armas antes de realizar esta operação.");
            return false;
        }
        while(true){
            int op = InOut.leInt("Selecione até 3 Magias: \n 1- Magia de Fogo \n 2- Magia de Agua \n 3- Magia de Escudo \n 4- Sair");
          
            switch(op){
                case 1:            
                    armament.add(arse.arsenal.get(4));
                    i++;
                    InOut.MsgDeInformacao("Magia de Fogo","Magia Adicionada");
                    break;

                case 2:
                    armament.add(arse.arsenal.get(5));
                    i++;
                    InOut.MsgDeInformacao("Magia de Agua","Magia Adicionada");
                    break;
                case 3:
                    armament.add(arse.arsenal.get(6));
                    i++;
                    InOut.MsgSemIcone("Magia de Escudo","Magia Adicionada");
                    break;

                case 4:
                    InOut.MsgDeInformacao("Fim", "Voltando ao menu principal");           
                    return false;
                default:
                    InOut.MsgDeErro("Opção inválida", "Escolha uma opção válida.");
                    break;
            }               
            if (i == 3){
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
