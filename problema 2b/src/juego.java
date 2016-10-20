/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cesar velasco
 */
public class juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         java.util.Scanner leer = new java.util.Scanner(System.in);
        int PuntajeJugador = 0;
        int PuntajeComputador = 0;
        int TotalTurno = 0;
        int Total;
        boolean respuesta = true;
        boolean respuestac = true;
        System.out.println("lanzas tu");
        System.out.println("puntaje jugador = ");
        System.out.println(PuntajeJugador);
        while ((PuntajeJugador<=100)&&(PuntajeComputador<=100)){
            TotalTurno=dados();
            respuesta = true;
            respuestac= true;
            while((TotalTurno>1)&&(respuesta ==true)){
                System.out.println("¿desea tirar otra vez? true or false");
                respuesta=leer.nextBoolean();
                if (respuesta==true){
                    TotalTurno=dados();
                }
                PuntajeJugador=PuntajeJugador+TotalTurno;
            } 
            if(TotalTurno==0){
                
            }
            if(TotalTurno==1){
                PuntajeJugador=0;
            }
            
            System.out.println("lanza el computador");
            TotalTurno=dados();
            while((TotalTurno>1)&&(respuestac ==true)){
                PuntajeComputador=PuntajeComputador+TotalTurno;
                int tirar= (int)(Math.random()*2);
                if (tirar ==0){
                    respuestac=true;
                }
                else if (tirar==1){
                    respuestac=false;
                }
            }
            if(TotalTurno==0){
                
            }
            if(TotalTurno==1){
                PuntajeComputador=0;
            }
            System.out.println("puntaje computador = ");
            System.out.println(PuntajeComputador);
        }
        if (PuntajeJugador>=100){
            System.out.println("gansate");
        }
        else if (PuntajeComputador>=100){
            System.out.println("gano el computador");
        }
        
        
        // TODO code application logic here
    }
    public static int dados(){
        int x=0;
        int dado1= (int)(Math.random()*7);
        System.out.println(dado1);
        int dado2= (int)(Math.random()*7);
        System.out.println(dado2);
        if ((dado2==1)||(dado1==1)){
            x=0;
        }
        else if ((dado2==1)&&(dado1==1)){
            x=1;
        }
        else if (!(dado2==1)&&!(dado1==1)){
            x=dado1+dado2;
        }
        return x;
    }
  
}
