package jogomodelado;

public class JogoModelado {

    public static void main(String[] args) {
        
        while(true) {
        int op = InOut.leInt("Selecione uma classe: \n 1- General \n 2- Soldado \n 3- LutadorDeSumo \n 4- Mago \n 5- Dragão Alado \n 6- Sair");
        switch(op){
            case 1:            
                General gen = new General();
                gen.desenhar();
                gen.falar();
                while(true){
                    int op1 = InOut.leInt("Selecione uma ação: \n 1- AddArsenal \n 2- SelectArma \n 3- Correr \n 4- Sair");
                    switch(op1){
                        case 1:            
                            gen.selectArsenal();
                            continue;
                        case 2:
                            gen.setArma();
                            continue;
                        case 3:
                            gen.correr();
                            continue;
                        case 4:
                            System.exit(0);
                            break;
                        }
                    }

            case 2:
                Soldado sold = new Soldado();
                sold.desenhar();
                sold.falar();
                while(true){
                    int op2 = InOut.leInt("Selecione uma ação: \n 1- AddArsenal \n 2- SelectArma \n 3- Correr \n 4- Sair");
                    switch(op2){
                        case 1:            
                            sold.selectArsenal();
                            continue;
                        case 2:
                            sold.setArma();
                            continue;
                        case 3:
                            sold.correr();
                            continue;
                        case 4:
                            System.exit(0);
                            break;
                        }
                    }
            
            case 3:
                LutSumo sumo = new LutSumo();
                sumo.desenhar();
                sumo.falar();
                while(true){
                    int op3 = InOut.leInt("Selecione uma ação: \n 1- AddArsenal \n 2- SelectArma \n 3- Correr \n 4- Sair");
                    switch(op3){
                        case 1:            
                            sumo.selectArsenal();
                            continue;
                        case 2:
                            sumo.setArma();
                            continue;
                        case 3:
                            sumo.correr();
                            continue;
                        case 4:
                            System.exit(0);
                            break;
                        }
                    }
            case 4:
                Mago mag = new Mago();
                mag.desenhar();
                mag.falar();
                while(true){
                    int op1 = InOut.leInt("Selecione uma ação: \n 1- AddArsenal \n 2- SelectArma \n 3- Correr \n 4- Voar \n 5- Sair");
                    switch(op1){
                        case 1:            
                            mag.selectArsenal();
                            continue;
                        case 2:
                            mag.setArma();
                            continue;
                        case 3:
                            mag.correr();
                            continue;
                        case 4:
                            mag.voar();
                            continue;
                        case 5:
                            System.exit(0);
                            break;
                        }
                    }
            case 5:
                DragãoAlado drag = new DragãoAlado();
                drag.desenhar();
                drag.falar();
                while(true){
                    int op1 = InOut.leInt("Selecione uma ação: \n 1- AddArsenal \n 2- SelectArma \n 3- Voar \n 4- Sair");
                    switch(op1){
                        case 1:            
                            drag.selectArsenal();
                            continue;
                        case 2:
                            drag.setArma();
                            continue;
                        case 3:
                            drag.voar();
                            continue;
                        case 4:
                            System.exit(0);
                            break;
                        }
                    }
            case 6:
                System.exit(0);
                break;
            }
        }
    }
    
}
