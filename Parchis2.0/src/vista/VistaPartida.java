package vista;

import model.Personajes;
import datos.NombrePersonajes;

public class VistaPartida {
	
	NombrePersonajes lista = new NombrePersonajes ();
	
	//MÃ©todo que imprime la portada
	public void imprimirPortada() {										
		System.out.println("-__ /\\\\                   ,,     /\\  ");
		System.out.println("  ||  \\\\   _              ||    (  ) ");
		System.out.println(" /||__||  < \\, ,._-_  _-_ ||/\\\\   // ");
		System.out.println(" \\||__||  /-||  ||   ||   || ||  //  ");
		System.out.println("  ||  |, (( ||  ||   ||   || || /(   ");
		System.out.println("_-||-_/   \\/\\\\  \\\\,  \\\\,/ \\\\ |/ {___ ");
		System.out.println("  ||                        _/       \n\n");
<<<<<<< HEAD
		System.out.println();
		System.out.println("                                                              _,-='`>");
		System.out.println("                                                        _,.-='`");
		System.out.println("                                                  _,.='`");
		System.out.println("                                            _,-='`  >      _       >");
		System.out.println("                         _.,_          _,-'`\\      >");
		System.out.println("                     _.-'`-  `'-._,.-'`     /_      >  ");
		System.out.println("               _.-'`` <>-  -<    /       .-'_>       >    -");
		System.out.println("              /~o    ,       \\  |      ,'  _  >  -    >           >");
		System.out.println("              (.-,   `    _   \\_ \\     \\  _  >  _     >    -");
		System.out.println("                (_,--=--'`  ,`/   \\    | _  >         >         >");
		System.out.println("               .-'       _,' /    /    / _ >     -   >    -");
		System.out.println("              /             '    /    / - >         >        >");
		System.out.println("       .-=-. /              ___./   .'  >          >     >");
		System.out.println("      /     Y               ````   /  >          >   >");
		System.out.println("    .' _/\\   \\                   ,'  >    >   >    ,-===--.");
		System.out.println("  /`  /   \\   `-              ,-`  >   >  ,>_    ,'        `\\");
		System.out.println("  (   >  : \\              ..-'   >  > _,>`   `--'            \\");
		System.out.println("   \\ / ) L\\ \\             `\\   >_,.--'             ,-'\"'\\    |");
		System.out.println("  `-./ (_\\ \\_____         `-'                  <'    _/    /");
		System.out.println("    (   :\\\\.```                                 \\ ,-'     /");
		System.out.println("      `\\_;_> `-.-~`'-_             ---._          Y  __,.-'");
		System.out.println("                       `'-...__  __,.-=- \\         \\ (_,-':");
		System.out.println("                             _.`\\_      ._>._       `-._='");
		System.out.println("                            <     `-._   \\   `'-._     `;");
		System.out.println("                            L _<`-.       \\       `'-.   \\");
		System.out.println("                            \\~ /   `-._  .'           `\\  \\");
		System.out.println("                             \\/        `'               L  \\_");
		System.out.println("                                                        \\   ;`'-.");
		System.out.println("                                                         \\___\\,.");
		}
	
	//Metodo que imprime una copa al ganador
	
	public void imprimirCopa() {
		System.out.println("\\'-=======-'/");
		System.out.println("_|   .=.   |_");
		System.out.println("((|  {{1}}  |))");
		System.out.println("\\|   /|\\   |/");
		System.out.println("\\__ '`' __/");
		System.out.println("_`) (`_");
		System.out.println("_/_______\\_");
		System.out.println("/___________\\");
	}
	
=======
		}
	
>>>>>>> 83e0b7a1230fa3d6b5025daec01779753fa00859
	//Método que imprime las vidas de un personaje
	
	public void imprimirVidas() {
		System.out.println("─────▄█▀█▄──▄███▄────");
		System.out.println("────▐█░██████████▌────");
		System.out.println("─────██▒█████████─────");
		System.out.println("──────▀████████▀──────");
		System.out.println("─────────▀██▀─────────");
	}
	
	//Método que imprime cuando un jugador muere
	
	public void imprimirMuerte() {
		System.out.println("──▄────▄▄▄▄▄▄▄────▄───");
		System.out.println("─▀▀▄─▄█████████▄─▄▀▀──");
		System.out.println("─────██─▀███▀─██──────");
		System.out.println("───▄─▀████▀████▀─▄────");
		System.out.println("─▀█────██▀█▀██────█▀──");
	}
	
	public void mostrarVida(Personajes p) { //Este mÃ©todo muestra la vida del personaje del cual sea el turno
		
		System.out.println("La vida de "+ p.getNombre() + " es: "+ p.getVidas());
		imprimirVidas();
		
	}

	public void imprimirDado(int dado) { //Este mÃ©todo imprime en pantalla el resultado del metodo lanzarDado
		System.out.println("Ha salido el: "+dado);
	}
	
	//MÃ©todo que imprime el combate y los resultados del mismo. Recibe por parÃ¡metro el daÃ±o, el String jugador 1
	//o jugador 2 o si pierde alguno recibe el String game over 1 o game over 2. Recibe los objetos personajes y
	//las tiradas de dados de ambos jugadores
	public void imprimirCombate(int danio, String resultado, Personajes p1, Personajes p2, int tirada1, int tirada2) {
		//ComprobaciÃ³n si hay un empate en el combate y muestra el mensaje de empate
		if(tirada1==tirada2) {
			System.out.println("Â¡HabÃ©is empatado! Ambos recibÃ­s un punto de daÃ±o por las heridas del combate");
			System.out.println("A " + p1.getNombre() + "  le quedan " + p1.getVidas() + " vidas");
			System.out.println("A " + p2.getNombre() + " le quedan " + p2.getVidas() + " vidas");
		}else if(resultado.equals("Jugador 1")) { //Si recibe jugador 1 es que ha perdido e imprime el mensaje
			//de derrota, daÃ±o y las vidas que le quedan
			System.out.println(p1.getNombre() + " ha recibido " + danio + " puntos de daÃ±o");
			System.out.println("A " + p1.getNombre() + " le quedan " + p1.getVidas() + " vidas");
		}else if(resultado.equals("Jugador 2")){//Si recibe jugador 2 es que ha perdido e imprime el mensaje
			//de derrota, daÃ±o y las vidas que le quedan
			System.out.println(p2.getNombre() + " ha recibido " + danio + " puntos de daÃ±o");
			System.out.println("A " + p2.getNombre() + " le quedan " + p2.getVidas() + " vidas");
		}else if(resultado.equals("game over 1")) {//Mensaje que se imprime si muere el jugador 1
			System.out.println(p1.getNombre() + " ha muerto, vuelve a la casilla inicial");
		}else if(resultado.equals("game over 2")) {//Mensaje que se imprime si muere el jugador 2
			System.out.println(p2.getNombre() + " ha muerto, vuelve a la casilla inicial");
		}
	}
	
	//Mensaje que imprime que un jugador ha ganado. Recibe por parÃ¡metro un objeto Personajes
	public void imprimirGanador(Personajes p) {
				System.out.println("Â¡" + p.getNombre() + " ha ganado!");
	}
	public void mostrarNombres() {
		for (int i = 0; i < lista.getNombres().length; i++) {
			System.out.println("OpciÃ³n " + (i+1) + "\t" + lista.getNombres()[i]);
		}
	}
	
	
	
}
