package jogomodelado;

import Armar.*;
import java.util.ArrayList;
import java.util.List;

public class Personagem {
    Arma_IF arma;
    Arsenal arse;
    public static  List<Arma_IF> armament = new ArrayList<>(3);
    public void desenhar(){    
    }
    public void falar(){       
    }
    public void usarArma(){
        arma.usararma();
    }
    public void correr(){
        InOut.MsgDeInformacao("Fuga", "Correndo do Perigo");
    }
    public void voar(){
        InOut.MsgDeInformacao("Voo", "Voando para Longe do Perigo");
    }
    public boolean selectArsenal(){
        arse.addArma();
        if (arse.arsenal.isEmpty()) {
            InOut.MsgDeInformacao("Lista de Arsenal", "Adicione armas antes de realizar esta operação.");
            return false;
        }
        int i = 0;
        while(true){
            int op = InOut.leInt("Selecione até 3 armas: \n 1- Fuzil \n 2- Revolver \n 3- Soco \n 4- Faca \n 5- Sair");
          
            switch(op){
                case 1:            
                    armament.add(arse.arsenal.get(0));
                    i++;
                    InOut.MsgDeInformacao("Fuzil","Arma Adicionada");
                    break;

                case 2:
                    armament.add(arse.arsenal.get(1));
                    i++;
                    InOut.MsgDeInformacao("Revolver","Arma Adicionada");
                    break;
                case 3:
                    armament.add(arse.arsenal.get(2));
                    i++;
                    InOut.MsgSemIcone("Soco","Arma Adicionada");
                    break;

                case 4:
                    armament.add(arse.arsenal.get(3));
                    i++;
                    InOut.MsgSemIcone("Faca","Arma Adicionada");
                    break;               
                case 5:
                    InOut.MsgDeInformacao("Fim", "Voltando ao menu principal");           
                    return false;
                default:
                    InOut.MsgDeErro("Opção inválida", "Escolha uma opção válida.");
                    break;
            }               
            if (i == 3){
                InOut.MsgDeInformacao("Fim", "As 3 armas foram selecionadas \n Voltando ao menu principal"); 
                return false;
            }
        }      
    }
public boolean setArma(){ 
    if (armament.isEmpty()) {
        InOut.MsgDeInformacao("Lista de Arsenal", "Adicione armas antes de realizar esta operação.");
        return false;
    }
    while(true){           

        List<String> stringsArmament = convertToStringList(armament);
        int op = InOut.leInt("Selecione a Arma: \n 1- " + stringsArmament.get(0) + "\n 2- " + stringsArmament.get(1) + "\n 3- " + stringsArmament.get(2) + "\n 4- Sair");
        switch(op){
            case 1:            
                InOut.MsgDeInformacao("Troca de arma.",stringsArmament.get(0));
                while(true){
                    int r = InOut.leInt("Selecione: \n 1- Para usar armar \n 2- Voltar para menu.");
                    switch(r){
                        case 1:
                            InOut.MsgDeInformacao("Usando Arma", stringsArmament.get(0));
                            return true; // Adicionado retorno para sair do loop
                        case 2:
                            InOut.MsgDeInformacao("Fim", "Voltando para seleção de arma");
                            return false;
                    }
                }

            case 2:
                InOut.MsgDeInformacao("Troca de arma.",stringsArmament.get(1));
                while(true){
                    int r = InOut.leInt("Selecione: \n 1- Para usar armar \n 2- Voltar para menu.");
                    switch(r){
                        case 1:
                            InOut.MsgDeInformacao("Usando Arma", stringsArmament.get(1));
                            return true; // Adicionado retorno para sair do loop
                        case 2:
                            InOut.MsgDeInformacao("Fim", "Voltando para seleção de arma");
                            return false;
                    }
                }
            case 3:
                InOut.MsgDeInformacao("Troca de arma.",stringsArmament.get(2));
                while(true){
                    int r = InOut.leInt("Selecione: \n 1- Para usar armar \n 2- Voltar para menu.");
                    switch(r){
                        case 1:
                            InOut.MsgDeInformacao("Usando Arma", stringsArmament.get(2));
                            return true; // Adicionado retorno para sair do loop
                        case 2:
                            InOut.MsgDeInformacao("Fim", "Voltando para seleção de arma");
                            return false;
                    }
                }
            case 4:
                InOut.MsgDeInformacao("Fim", "Voltando ao menu principal");
                return false;
            default:
                InOut.MsgDeErro("Opção inválida", "Escolha uma opção válida.");
                break;
        }       
    }
}
 
    
    public static List<String> convertToStringList(List<Arma_IF> armaList) {
        List<String> stringList = new ArrayList<>();
        for (Arma_IF arma : armaList) {
            stringList.add(arma.toString());
        }
        return stringList;
    }
}
