package controller;

import crud.CrudTablero;
import vista.VistaPartida;
import model.Personajes;
import utilidades.Aleatorio;
import utilidades.Leer;
import crud.CrudPersonaje;
import vista.VistaPartida;

public class Acciones {
	
	CrudPersonaje p = new CrudPersonaje ();
	VistaPartida vista = new VistaPartida ();
	
		//Métodos 
		
		public int lanzarDado() { //Este método genera un aleatorio entre 3 y 1 y lo devuelve. Sirve solo para
			//desaplazamiento
			int hasta = 3;
			int desde = 1;
			int dado = 0;
			Aleatorio random = new Aleatorio();
			
			dado = random.generarRandom(hasta, desde);
			
			return dado;
		}
		
		public int lanzarDadoCombate() { //Este método genera un aleatorio y lo devuelve. Aleatorio entre 1 y 6
			//porque es para el combate
			int hasta = 6;
			int desde = 1;
			int dado = 0;
			Aleatorio random = new Aleatorio();
			
			dado = random.generarRandom(hasta, desde);
			
			return dado;
		}
		
		//Este método gestiona el combate entre el jugador 1 y el jugador 2
		public int combatir(Personajes p1, Personajes p2, CrudTablero crudTablero, String[][] matriz) {
			
			System.out.println(p1.getNombre() + " pulsa una tecla para atacar");
			Leer.dato();//No se guarda la tecla pulsada porque solo sirve para darle más interacción al
			//lanzamiento del dado
			int lanzarDadoP1 = this.lanzarDadoCombate(); //guarda en una variable de tipo entero el lanzamiento
			//del dado para el combate
			vista.imprimirDado(lanzarDadoP1);//imprime el resultado del lanzamiento del dado
			
			System.out.println(p2.getNombre() + " pulsa una tecla para atacar");
			Leer.dato();
			int lanzarDadoP2 = this.lanzarDadoCombate();
			vista.imprimirDado(lanzarDadoP2);
			int danio = 0;
		
			//Comprobación de que ambos personajes están vivos para combatir
			if(p1.getVidas()>0 && p2.getVidas()>0) {
				//Comprobación de que el jugador 1 ha ganado el combate
				if(lanzarDadoP1>lanzarDadoP2) {
					//el daño al perdedor es la diferencia entre las tiradas
					danio = lanzarDadoP1 - lanzarDadoP2;
					//Actualiza la vida con el daño
					p2.setVidas(p2.getVidas()-danio);
					//Si el jugador dos sigue vivo imprime el mensaje del combate con la vida que le falta
					if(p2.getVidas()>0) {
						//Si no muere imprime esto
						vista.imprimirCombate(danio, p2.getNombre(), p1, p2, lanzarDadoP1, lanzarDadoP2);
					}else {
						//Si muere imprime esto, lo devuelve a la posición inicial y le restaura la vida
						vista.imprimirCombate(danio, "game over 2", p1, p2, lanzarDadoP1, lanzarDadoP2);
						vista.imprimirMuerte();
						p.reiniciarVida(p2);
						//Mueve el personaje dentro del carril correspondiente. Recibe la matriz del carril del
						//jugador, la posición actual y el objeto jugador
						crudTablero.moverPersonaje(matriz, p2.getColumActual(), p2);
					}
				//En caso de que el jugador dos gane el combate	
				}else if(lanzarDadoP1<lanzarDadoP2) {
					//El daño al jugador 1 es la diferencia entre las tiradas
					danio = lanzarDadoP2 - lanzarDadoP1;
					//Actualiza la vida restándole el daño
					p1.setVidas(p1.getVidas()-danio);
					//Si la vida es mayor que cero imprime el combate y la vida restante
					if(p1.getVidas()>0) {
						vista.imprimirCombate(danio, p1.getNombre(), p1, p2, lanzarDadoP1, lanzarDadoP2);
					}else {
						//Si no, imprime el mensaje de derrota, lleva al jugador a la posición inicial
						//le restaura las 6 vidas
						vista.imprimirCombate(danio, "game over 1", p1, p2, lanzarDadoP1, lanzarDadoP2);
						vista.imprimirMuerte();
						p.reiniciarVida(p1);
						//Mueve el personaje dentro del carril correspondiente. Recibe la matriz del carril del
						//jugador, la posición actual y el objeto jugador
						crudTablero.moverPersonaje(matriz, p1.getColumActual(), p1);
					}
				//Si el valor de los dados es el mismo en el combate, hubo un empate	
				}else {
					//Se imprime el mensaje del combate y se le resta 1 de vida a cada jugador
					danio=1;
					p1.setVidas(p1.getVidas()-danio);
					p2.setVidas(p2.getVidas()-danio);
					vista.imprimirCombate(danio, null, p1, p2, lanzarDadoP1, lanzarDadoP2);
				}
			//Si pierde todas las vidas, vuelve a la posición inicial y se le restauran las vidas
			}else if(p1.getVidas()<=0) {
				p.reiniciarVida(p1);
				//Mueve el personaje dentro del carril correspondiente. Recibe la matriz del carril del
				//jugador, la posición actual y el objeto jugador
				crudTablero.moverPersonaje(matriz, danio, p1);
				//Imprimir el mensaje de derrota
				vista.imprimirCombate(danio, "game over 1", p1, p2, lanzarDadoP1, lanzarDadoP2);
			//En caso de que el jugador dos sea el que pierde todas las vidas
			}else if(p2.getVidas()<=0) {
				p.reiniciarVida(p2);
				crudTablero.moverPersonaje(matriz, danio, p2);
				vista.imprimirCombate(danio, "game over 2", p1, p2, lanzarDadoP1, lanzarDadoP2);
			}
			return danio;
		}
		
	}
