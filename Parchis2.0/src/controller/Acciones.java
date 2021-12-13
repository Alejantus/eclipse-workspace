package controller;

import crud.CrudTablero;
import model.Personajes;
import controller.Aleatorio;

public class Acciones {

		//Atributos
		
		
		//Métodos 
		
		public int lanzarDado() { //Este método genera un aleatorio y lo devuelve.
			int hasta = 6;
			int desde = 1;
			int dado = 0;
			Aleatorio random = new Aleatorio();
			
			dado = random.generarAleatorio(hasta, desde);
			
			return dado;
		}
		
		public void imprimirDado(int dado) { //Este método imprime en pantalla el resultado del metodo lanzarDado
			System.out.println("Ha salido el: "+dado);
		}
		
		//public int bufar() { //Este método suma dos casillas a la posición del jugador aliado
			
		//}
		
		public int combatir(Personajes p1, Personajes p2, CrudTablero crudTablero, String[][] matriz) {
			int lanzarDadoP1 = this.lanzarDado();
			int lanzarDadoP2 = this.lanzarDado();
			int danio = 0;
		
			if(p1.getVidas()>0 && p2.getVidas()>0) {
				
				if(lanzarDadoP1>lanzarDadoP2) {
					danio = lanzarDadoP1 - lanzarDadoP2;
					p2.setVidas(p2.getVidas()-danio);
					this.imprimirCombate(danio, "Jugador 2", p1, p2);
				}else if(lanzarDadoP1<lanzarDadoP2) {
					danio = lanzarDadoP2 - lanzarDadoP1;
					p1.setVidas(p1.getVidas()-danio);
					this.imprimirCombate(danio, "Jugador 1", p1, p2);
				}else {
					danio=1;
					p1.setVidas(p1.getVidas()-danio);
					p2.setVidas(p2.getVidas()-danio);
					this.imprimirCombate(danio, null, p1, p2);
				}
			}else if(p1.getVidas()<=0) {
				p1.setColumActual(0);
				p1.setVidas(6);
				crudTablero.moverPersonaje(matriz, danio, p1);
				this.imprimirCombate(danio, "game over 1", p1, p2);
			}else if(p2.getVidas()<=0) {
				p2.setColumActual(0);
				p2.setVidas(6);
				crudTablero.moverPersonaje(matriz, danio, p2);
				this.imprimirCombate(danio, "game over 2", p1, p2);
			}
			return danio;
		}
		
		public void imprimirCombate(int danio, String resultado, Personajes p1, Personajes p2) {
			
			if(danio==1) {
				System.out.println("¡Habéis empatado! Ambos recibís un punto de daño por las heridas del combate");
				System.out.println("Al jugador 1 le quedan " + p1.getVidas() + " vidas");
				System.out.println("Al jugador 2 le quedan " + p2.getVidas() + " vidas");
			}else if(resultado.equals("Jugador 1")) {
				System.out.println("El jugador 1 ha recibido " + danio + " puntos de daño");
				System.out.println("Al jugador 1 le quedan " + p1.getVidas() + " vidas");
			}else if(resultado.equals("Jugador 2")){
				System.out.println("El jugador 2 ha recibido " + danio + " puntos de daño");
				System.out.println("Al jugador 2 le quedan " + p2.getVidas() + " vidas");
			}else if(resultado.equals("game over 1")) {
				System.out.println("El jugador 1 ha muerto, vuelve a la casilla inicial");
			}else if(resultado.equals("game over 2")) {
				System.out.println("El jugador 2 ha muerto, vuelve a la casilla inicial");
			}
		}
		
		public void imprimirGanador(Personajes p) {
			System.out.println("¡El jugador " + p.getNombre() + " ha ganado!");
		}
		
	}
