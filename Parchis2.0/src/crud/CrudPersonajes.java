package crud;

	import model.Personajes;
	import controller.Acciones;

	public class CrudPersonajes {
		
		private Personajes a;
		private Acciones b;
		
		//SINCERAMENTE NO TENGO NI IDEA DE LA MAYORÍA DE COSAS SI ALGUNO DE LOS QUE TIENE POCO QUE HACER
		//VE ESTO Y SABE HACERLO QUE ME AVISE Y LO VAMOS HACIENDO EN DISCORD.
		

		public int sanar(int vidas) { //este método tiene que llamar a la tirada de dados
									  //POR LO QUE TENGO ENTENDIDO SI ESTO ES QUE SI LOS DOS JUGADORES DEL MISMO
									  // CAEN EN LA MISMA CASILLA SE SANA Y PARA ESO TENGO HAY QUE CREAR UNACLASE
									  // EQUIPO EN EL MODEL CREO YO.
			
			
			return vidas;
		}
		
		public int reiniciarVida(int vidaReiniciada) {//cuando mueres y vuelves a la casilla de inicio
			//este método llama a llevarAInicio
			
			vidaReiniciada = a.getVidas() - a.getVidas();
			return vidaReiniciada;
		}
	}
