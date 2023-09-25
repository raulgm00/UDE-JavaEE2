package rpa.proceso.random.win;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.security.SecureRandom;

enum Tipos{
	Todos, RandomPregunta, RandomAdjetivo,RandomPaginas,RandomCambioIP,RandomBusquedaPag
}

public class RandomWin {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Tipos tp = null;
		
		// TODO args = 0 , escribe todo en archivo
		// TODO args != 0 , realiza la op correspondiente
		
		if(args[0].equals("Todos")) {
			tp = Tipos.Todos;
	    }else if(args[0].equals("RandomPregunta")) {
			tp = Tipos.RandomPregunta;
		}else if(args[0].equals("RandomAdjetivo")) {
			tp = Tipos.RandomAdjetivo;
		}else if(args[0].equals("RandomPaginas")) {
			tp = Tipos.RandomPaginas;
		}else if(args[0].equals("RandomCambioIP")) {
			tp = Tipos.RandomCambioIP;
		}else if(args[0].equals("RandomBusquedaPag")) {
			tp = Tipos.RandomBusquedaPag;
		}
		
		
		 /*System.out.println("Argumento [0] = " +  args[0]);
		 System.out.println("Argumento [1] = " + args[1]);*/
		//Integer resultado = RandomWin.setRandom(tp);
		RandomWin.setRandom(tp, args[1]);
		//System.out.println("Valor ==>" + resultado);

	}
	
	private static void setRandom(Tipos tipo, String a) {
		//System.out.print("Tipo de parametro ==> ");
		//System.out.println(tipo);
		
		Integer r= null;
		Integer rango =null;
		
		
		SecureRandom sr = null;
		try {
			sr = SecureRandom.getInstance("SHA1PRNG", "SUN");
			// para garantizar el caracter aleatorio generemos una nueva semilla
			// La lista byte[] es suficiente, la llamada se hace únicamente para causar la generación de una nueva semilla
			sr.nextBytes(new byte[1]);
		}catch (Exception e) {
				 e.printStackTrace();
			}
		
		
		FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
        	/*if(tipo.equals("Todos") && a.equals("0"))
        		fichero = new FileWriter("C:/Users/HP/Desktop/Robot.win/randoms/r_jar.txt");
        	else if (tipo.equals("Todos") && a.equals("1"))
        		fichero = new FileWriter("C:/Users/HP/Desktop/Robot.win/randoms/dinamicos_jar.txt");
        	else*/
        	fichero = new FileWriter("C:/Users/HP/Desktop/Robot.win/randoms/r_jar.txt");
        	pw = new PrintWriter(fichero);

            switch(tipo) {
    		
    		case Todos:
    			System.out.println(Tipos.Todos);
    			pw.println(Tipos.Todos);
    		case RandomPregunta:
    			System.out.print(Tipos.RandomPregunta);
    			pw.print(Tipos.RandomPregunta);
    			rango = 16;
    			r = sr.nextInt(rango);
    			//no sumamos el 1 para que nos de un numero entre 0-2
    			//r = sr.nextInt(rango)+1;
    			System.out.println("=" + r);
    			pw.println("=" + r);
    			if(!a.equals("0"))
    				if(!a.equals("1"))
    					break;
    		case RandomAdjetivo:
    			System.out.print(Tipos.RandomAdjetivo);
    			pw.print(Tipos.RandomAdjetivo);
    			//rango = 29942;
    			//no sumamos el 1 para que nos de un numero entre 0-14
    			rango = 14;
    			r = sr.nextInt(rango);
    			//r = sr.nextInt(rango)+1;
    			System.out.println("=" + r);
    			pw.println("=" + r);
    			if(!a.equals("0"))
    				if(!a.equals("1"))
    					break;
    		case RandomBusquedaPag:
    			System.out.print(Tipos.RandomBusquedaPag);
    			pw.print(Tipos.RandomBusquedaPag);
    			// no sumamos el 1 para que nos de un numero entre 0-9
    			rango = 8;
    			r = sr.nextInt(rango);
    			//r = sr.nextInt(rango)+1;
    			System.out.println("=" + r);
    			pw.println("=" + r);
    			if(!a.equals("0"))
    				if(a.equals("1"))
    					break;
    		case RandomPaginas:
    			System.out.print(Tipos.RandomPaginas);
    			pw.print(Tipos.RandomPaginas);
    			rango = 30;
    			r = sr.nextInt(rango)+1;
    			System.out.println("=" + r);
    			pw.println("=" + r);
    			if(!a.equals("0"))
    			break;
    		case RandomCambioIP:
    			System.out.print(Tipos.RandomCambioIP);
    			pw.print(Tipos.RandomCambioIP);
    			rango = 25;
    			r = sr.nextInt(rango)+1;
    			System.out.println("=" + r);
    			pw.println("=" + r);
    			if(!a.equals("0"))
    			break;
    		default:
    			//System.out.println("La generacion del random no es posible");
    			r=0;
    		}
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
		
	}

}
