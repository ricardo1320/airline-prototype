/*
	PROYECTO FINAL - JAVA BASICO
		RICARDO CUEVAS MONDRAGON
*/

import java.util.Scanner;
import java.util.ArrayList;

public class Main{

	//Atributos

	//Metodos
	//Main
	public static void main(String[] args) {
		
		//Variables
		//Administrador
		String nombreDeAdministrador;
		String nombre;
		String apellidoPaterno;
		String apellidoMaterno;
		double sueldo;

		//Cliente
		int edad;
		String nombreUsuario;
		String contrasena;

		//Vuelos
		String origen;
		String destino;

		String horaLlegada;
		String horaSalida;

		int lugaresPrimeraClase;
		int lugaresNegocio;
		int lugaresTurista;

		double costoPrimeraClase;
		double costoNegocio;
		double costoTurista;

		//Objetos
		Administrador administrador = new Administrador();
		Vuelos vuelos;
		Estadisticas estadisticas = new Estadisticas();
		Cliente cliente, cliente1;

		ArrayList<Vuelos> listaVuelos = new ArrayList<Vuelos>();
		ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

		Scanner entradaInt = new Scanner(System.in);
		Scanner entradaLine = new Scanner(System.in);

		//Otros
		int menu1, menu2, menu3, menu4, menu5, menu6, menu7, menu8;
		int i;
		int numeroMaxVuelos=-1;
		int contador=0,delete,modify;
		boolean admin = false, client = false;

		System.out.println("\n\t\t  BIENVENIDO A AERO-UOEE");

		do{
			System.out.println("\t\t-----SISTEMA DE VENTAS-----");
			System.out.print("\n1. Administrador.");
			System.out.print("\n2. Cliente. ");
			System.out.print("\n3. Salir.");
			System.out.print("\n\nDame una opcion: ");
			menu1 = entradaInt.nextInt();

			switch(menu1){

				//OPCION ADMINISTRADOR
				case 1:
	
					do{
						System.out.println("\n\t\t  -----ADMINISTRADOR-----");
						System.out.print("\n1. Ingresar.");
						System.out.print("\n2. Salir. ");
						System.out.print("\n\nDame una opcion: ");
						menu2 = entradaInt.nextInt();

						//Si decide ingresar
						if(menu2==1){
								
							System.out.print("\nNombre: ");
							nombreDeAdministrador = entradaLine.nextLine();

							System.out.print("Contrasena: ");
							contrasena = entradaLine.nextLine();

							while(!nombreDeAdministrador.equals(administrador.getNombreDeAdministrador()) || !contrasena.equals(administrador.getContrasena())){
								System.out.print("\nERROR Usuario o contrasena incorrectas.\n");
								System.out.print("Nombre: ");
								nombreDeAdministrador = entradaLine.nextLine();

								System.out.print("\nContrasena: ");
								contrasena = entradaLine.nextLine();
							}
								System.out.println("\nIngreso satisfactorio en modo administrador!");
								
								do{
									//System.out.print("\nRegresando el menu principal...\n\n");
									System.out.print("\n\t\t-----SISTEMA DE VENTAS-----");
					
									System.out.print("\n\n1. Ingresar no. maximo de vuelos\n2. Ingresar vuelos\n3. Listar vuelos\n4. Cancelar vuelos\n5. Actualizar vuelos\n");
									System.out.print("6. Estadisticas de pago\n7. Estadisticas de clases\n8. Informacion administrador\n9. Regresar\n\n");
									System.out.print("Dame una opcion: ");
									menu3 = entradaInt.nextInt();

									switch(menu3){
										case 1:
											System.out.print("\nCual es el numero maximo de vuelos? => ");
											numeroMaxVuelos = entradaInt.nextInt();
											break;

										case 2:
											if((numeroMaxVuelos==-1) || ((contador+1)>numeroMaxVuelos)){
											System.out.print("\nERROR Falla del sistema.\n");
											}else{
												contador+=1;

												System.out.print("\nIngresa un vuelo: \n");
												System.out.print("Origen: ");
												origen = entradaLine.nextLine();
												System.out.print("Destino: ");
												destino = entradaLine.nextLine();
												System.out.print("Hora salida: ");
												horaSalida = entradaLine.nextLine();
												System.out.print("Hora llegada ");
												horaLlegada = entradaLine.nextLine();
												System.out.print("Lugares primera clase: ");
												lugaresPrimeraClase = entradaInt.nextInt();
												System.out.print("Lugares negocio ");
												lugaresNegocio = entradaInt.nextInt();
												System.out.print("Lugares turista: ");
												lugaresTurista = entradaInt.nextInt();
												System.out.print("Costo de lugares primera clase: ");
												costoPrimeraClase= entradaInt.nextDouble();
												System.out.print("Costo de lugares negocio: ");
												costoNegocio= entradaInt.nextDouble();
												System.out.print("Costo de lugares turista: ");
												costoTurista= entradaInt.nextDouble();

												//Ya que pedimos los datos creamos el objeto de tipo Vuelos
												vuelos = new Vuelos(origen, destino, horaLlegada, horaSalida, lugaresPrimeraClase, lugaresNegocio, lugaresTurista, costoPrimeraClase, costoNegocio, costoTurista);
												//Lo agregamos al ArrayList de Vuelos
												listaVuelos.add(vuelos);

												System.out.print("\n\nVuelo ingresado correctamente.\n");
											}
											break;

										case 3:
											System.out.print("\nVuelos registrados: " +listaVuelos.size());
											System.out.println("");

											int noVuelo=1;
											for(Vuelos flights:listaVuelos){

												System.out.print("\nVuelo No.: " +noVuelo);
												System.out.print("\n\tOrigen: " +flights.getOrigen());
												System.out.print("\n\tDestino " +flights.getDestino());
												System.out.print("\n\tOrigen: " +flights.getOrigen());
												System.out.print("\n\tHora Salida: " +flights.getHoraSalida());
												System.out.print("\n\tHora Llegada: " +flights.getHoraLlegada());
												System.out.print("\n\tLugares Primera Clase: " +flights.getLugaresPrimeraClase());
												System.out.print("\n\tLugares Negocio " +flights.getLugaresNegocio());
												System.out.print("\n\tLugares Turista: " +flights.getLugaresTurista());
												System.out.print("\n\tCosto lugares Primera Clase: " +flights.getCostoPrimeraClase());
												System.out.print("\n\tCosto lugares Negocio: " +flights.getCostoNegocio());
												System.out.print("\n\tCosto lugares Turista: " +flights.getCostoTurista());
												System.out.println("");

												noVuelo++;
											}
											break;

										case 4:
											if(listaVuelos.isEmpty()){
												System.out.print("\nERROR Falla del sistema.\n\n");
											}else{
												System.out.print("\n\t\t-----Eliminar vuelo-----\n\n");
												System.out.print("\nIngrese el numero de vuelo a cancelar: ");
												delete = entradaInt.nextInt();
												delete = delete-1;

												if(delete>(contador-1) || delete<0){
												System.out.print("\nERROR Falla del sistema.\n\n");
												}else{
													listaVuelos.remove(delete);
													contador--;
													System.out.print("\nVuelo cancelado exitosamente\n\n");
												}
											}
											break;

										case 5:
											if(listaVuelos.isEmpty()){
												System.out.print("\nERROR Falla del sistema.\n\n");
											}else{
												System.out.print("\nIngrese el numero de vuelo a modificar: ");
												modify = entradaInt.nextInt();
												modify = modify-1;

												if(modify>(contador-1) || modify<0){
												System.out.print("\nERROR Falla del sistema.\n\n");
												}else{
													do{
														System.out.print("\n\t\t-----Modificar vuelo-----\n\n");
														System.out.print("\n1. Origen\n2. Destino\n3. Hora salida\n 4.Hora llegada\n 5. Lugares Primera Clase\n 6. Lugares Negocio\n 7. Lugares Turista\n 8. Costo lugares en Primera Clase\n 9. Costo lugares en Negocio\n 10. Costo lugares en Turista\n 11. Salir\n\n ");
														System.out.print("Dame una opcion: ");
														menu4 = entradaInt.nextInt();

														//Creamos la variable auxiliar. Para guardar los datos del vuelo de la posicion seleccionada
														Vuelos auxiliar = listaVuelos.get(modify);

														switch(menu4){
															case 1:
																System.out.print("\nNuevo origen: ");
																origen = entradaLine.nextLine();
																auxiliar.setOrigen(origen);
																break;

															case 2:
																System.out.print("\nNuevo destino: ");
																destino = entradaLine.nextLine();
																auxiliar.setDestino(destino);
																break;

															case 3:
																System.out.print("\nNueva Hora de Salida: ");
																horaSalida = entradaLine.nextLine();
																auxiliar.setHoraSalida(horaSalida);
																break;

															case 4:
																System.out.print("\nNueva Hora de Llegada: ");
																horaLlegada = entradaLine.nextLine();
																auxiliar.setHoraLlegada(horaLlegada);
																break;

															case 5:
																System.out.print("\nNuevos lugares de primera clase: ");
																lugaresPrimeraClase = entradaInt.nextInt();
																auxiliar.setLugaresPrimeraClase(lugaresPrimeraClase);
																break;

															case 6:
																System.out.print("\nNuevos lugares de Negocio: ");
																lugaresNegocio = entradaInt.nextInt();
																auxiliar.setLugaresNegocio(lugaresNegocio);
																break;

															case 7:
																System.out.print("\nNuevos lugares de Turista ");
																lugaresTurista = entradaInt.nextInt();
																auxiliar.setLugaresTurista(lugaresTurista);
																break;

															case 8:
																System.out.print("\nNuevo costo lugares de primera clase: ");
																costoPrimeraClase = entradaInt.nextDouble();
																auxiliar.setCostoPrimeraClase(costoPrimeraClase);
																break;

															case 9:
																System.out.print("\nNuevo costo lugares de Negocio: ");
																costoNegocio = entradaInt.nextDouble();
																auxiliar.setCostoNegocio(costoNegocio);
																break;

															case 10:
																System.out.print("\nNuevo costo lugares Turista: ");
																costoTurista = entradaInt.nextDouble();
																auxiliar.setCostoTurista(costoTurista);
																break;

															case 11:
																System.out.print("\nRegresando al menu principal...\n");
																break;

															default:
																System.out.print("\nOpcion incorrecta. Intentel de nuevo.\n\n");
														}

														//Regresamos a la posicion que habiamos seleccionado previamente.
														listaVuelos.set(modify, auxiliar);

													}while(menu4!=11);

													System.out.print("\nEl vuelo ha sido actualizado.\n");
												}
											}
											break;

										case 6:
											if(!client){
												System.out.print("\nERROR Falla del sistema.\n\n");
											}else{
												do{
													System.out.print("\n\t\t-----Estadisticas-----\n\n");
													System.out.print("\n1. Saldo total de Efectivo\n2. Saldo total de Tarjetas\n3. Saldo Total\n4. Numero de pagos en efectivo\n5. Numero de pagos con tarjeta\n6. Salir\n\n");
													System.out.print("Dame una opcion: ");
													menu5 = entradaInt.nextInt();
												

												switch(menu5){
													case 1:
														System.out.print("\nSaldo total de Efectivo: " +estadisticas.getSaldoEfectivo());
													break;

													case 2:
														System.out.print("\nSaldo total de Tarjetas " +estadisticas.getSaldoTarjeta());
													break;

													case 3:
														System.out.print("\nSaldo total: " +estadisticas.getEfectivoTotal());
													break;

													case 4:
														System.out.print("\nNumero de pagos en Efectivo: " +estadisticas.getPagosEfectivo());
													break;

													case 5:
														System.out.print("\nNumero de pagos con Tarjeta: " +estadisticas.getPagosTarjeta());
													break;

													case 6:
														System.out.print("\nRegresando al menu principal...\n");
													break;

													default:
														System.out.print("\nOpcion no valida. Intentelo de nuevo.\n");
												}
												}while(menu5!=6);
											}
											break;

										case 7:
											if(!client){
												System.out.print("\nERROR Falla del sistema.\n\n");
											}else{
												do{
													System.out.print("\n\t\t-----Estadisticas de Clase-----\n\n");
													System.out.print("\n1. Boletos vendido de Primera Clase\n2. Boletos vendidos de Negocio\n3. Boletos vendidos de Turista\n 4. Clase con mayor numero de ventas\n 5. Regresar\n\n");
													System.out.print("Dame una opcion: ");
													menu6 = entradaInt.nextInt();

												switch(menu6){
													case 1:
														System.out.print("\nBoletos vendidos dn Pimera Clase: " +estadisticas.getPrimeraClase());
													break;

													case 2:
														System.out.print("\nBoletos vendidos de Negocio: " +estadisticas.getNegocio());
													break;

													case 3:
														System.out.print("\nBoletos vendidos de Turista: " +estadisticas.getTurista());
													break;

													case 4:
														System.out.print("Clase con mayor numero de ventas: \n");
														estadisticas.mayor();
													break;

													case 5:
														System.out.print("\nRegresando al menu principal...\n");
													break;

													default:
														System.out.print("\nOpcion no valida. Intentelo de nuevo.\n");
												}
												}while(menu6!=5);
											}
											break;

										case 8: //Muestra la informacion del administrador.
											System.out.print("\nDATOS DEL ADMINISTRADOR:\n");
											System.out.print("\tNombre: " +administrador.getNombre());
											System.out.print("\n\tSueldo: $" +administrador.getSueldo());
											System.out.println("");
											break;

										case 9:
											System.out.print("\nSaliendo del modo administrador...\n");
											break;

										default:
											System.out.print("\nOpcion invalida. Intentelo de nuevo.\n");
									}
								}while(menu3!=9);
						}else{
							System.out.print("\nRegresando al menu principal..\n\n");
						}

					}while(menu2!=2);
					break;

				//OPCION CLIENTE
				case 2:
				do{
					System.out.println("\n\t\t  -----CLIENTE-----");
					System.out.print("\n1. Registrarse.");
					System.out.print("\n2. Iniciar sesion.");
					System.out.print("\n3. Salir. ");
					System.out.print("\n\nDame una opcion: ");
					menu7 = entradaInt.nextInt();

					switch(menu7){
						case 1:
							client = true;
							System.out.print("\nNombre: ");
							nombre = entradaLine.nextLine();
							System.out.print("\nApellido Paterno: ");
							apellidoPaterno = entradaLine.nextLine();
							System.out.print("\nApellido Materno: ");
							apellidoMaterno = entradaLine.nextLine();
							System.out.print("\nEdad: ");
							edad = entradaInt.nextInt();
							System.out.print("\nCrea un nuevo nombre de usuario: ");
							nombreUsuario = entradaLine.nextLine();

							if(listaClientes.isEmpty()){
								System.out.print("\nNombre de usuario guardado.");
							}else{
								boolean repeat = false;

								do{
									for(Cliente c : listaClientes){
										if(c.getNombreUsuario().equals(nombreUsuario)){
											repeat = true;
											break;

										}else{
											repeat = false;
										}
									}

									if(repeat){
										System.out.print("\nERROR Este usuario ya existe.\n");
										System.out.print("\nCrea un nuevo nombre de usuario: ");
										nombreUsuario = entradaLine.nextLine();
									}else{
										System.out.print("\nNombre de usuario guardado.");
									}

								}while(repeat);
							}

							System.out.print("\nCrea una contrasena: ");
							contrasena = entradaLine.nextLine();

							cliente = new Cliente(nombre,apellidoMaterno,apellidoPaterno,edad,nombreUsuario,contrasena);
							listaClientes.add(cliente);

							System.out.print("\nUsuario registrado exitosamente.\n");
						break;

						case 2:
							if(!client){
								System.out.print("\nERROR Falla del sistema.\n\n");
							}else{
								boolean exists = false;
								System.out.print("\nNombre de Usuario: ");
								nombreUsuario = entradaLine.nextLine();

								int j=0;
								cliente1 = listaClientes.get(j);
								//Verifica que exista el nombre.
								for(Cliente c : listaClientes){
										if(c.getNombreUsuario().equals(nombreUsuario)){
											exists = true;
											cliente1 = listaClientes.get(j);
											System.out.print("\nContrasena: ");
											contrasena = entradaLine.nextLine();

											while(!c.getContrasena().equals(contrasena)){
												System.out.print("\nERROR Contrasena incorrecta.");
												System.out.print("\nContrasena: ");
												contrasena = entradaLine.nextLine();
											}

											System.out.println("\nHas ingresado como " +nombreUsuario);
											break;


										}else{
											exists = false;
										}

										j++;
								}

								if(!exists){
									System.out.print("\nNombre de usuario no existe.\n");
									break;
								}else{

									do{
									System.out.println("\n\t\t  -----BIENVENIDO " +nombreUsuario +"-----");
									System.out.print("\n1. Ver vuelos disponibles.");
									System.out.print("\n2. Comprar boletos de avion.");
									System.out.print("\n3. Ver mi informacion. \n4. Salir ");
									System.out.print("\n\nDame una opcion: ");
									menu8 = entradaInt.nextInt();

									switch(menu8){
										case 1:
											System.out.print("\nVuelos disponibles: " +listaVuelos.size());
											System.out.println("");

											int noVuelo=1;
											for(Vuelos flights:listaVuelos){

												System.out.print("\nVuelo No.: " +noVuelo);
												System.out.print("\n\tOrigen: " +flights.getOrigen());
												System.out.print("\n\tDestino " +flights.getDestino());
												System.out.print("\n\tOrigen: " +flights.getOrigen());
												System.out.print("\n\tHora Salida: " +flights.getHoraSalida());
												System.out.print("\n\tHora Llegada: " +flights.getHoraLlegada());
												System.out.print("\n\tLugares Primera Clase: " +flights.getLugaresPrimeraClase());
												System.out.print("\n\tLugares Negocio " +flights.getLugaresNegocio());
												System.out.print("\n\tLugares Turista: " +flights.getLugaresTurista());
												System.out.print("\n\tCosto lugares Primera Clase: " +flights.getCostoPrimeraClase());
												System.out.print("\n\tCosto lugares Negocio: " +flights.getCostoNegocio());
												System.out.print("\n\tCosto lugares Turista: " +flights.getCostoTurista());
												System.out.println("");

												noVuelo++;
											}
										break;

										case 2:
											System.out.println("\n\t  -----COMPRANDO BOLETOS DE AVION-----");
											System.out.print("\nIngrese el numero de vuelo que desea comprar: ");
											int v = entradaInt.nextInt();
											v--;

											if(v>(contador-1) || v<0){
												System.out.print("\nERROR Ingrese un vuelo valido.");
												break;
											}else{ //Se pide el numero de boletos
												vuelos = listaVuelos.get(v);
												System.out.print("\nCuantos boletos desea comprar? ");
												int n = entradaInt.nextInt();

												int opc;
												do{ //Se pide la clase
													System.out.print("\nQue clase desea comprar? ");
													System.out.print("\n1. Primera Clase.\n2. Negocio\n3. Turista\n\n");
													System.out.print("\nDame una opcion: ");
													opc = entradaInt.nextInt();

												}while(opc<=0 || opc>3);

												char x='a';
												int cantidad=0;
												double costo=0.0;

												//Switch para enviar el char del tipo de clase, para las estadisticas.
												switch(opc){
													case 1:
														x='p';
														cantidad = vuelos.getLugaresPrimeraClase();
														cantidad = cantidad - n;

														vuelos.setLugaresPrimeraClase(cantidad);
														costo = vuelos.getCostoPrimeraClase() * n;
													break;

													case 2:
														x='n';
														cantidad = vuelos.getLugaresNegocio();
														cantidad = cantidad -n;

														vuelos.setLugaresNegocio(cantidad);
														costo = vuelos.getCostoNegocio() * n;
													break;

													case 3:
														x='t';
														cantidad = vuelos.getLugaresTurista();
														cantidad = cantidad -n;

														vuelos.setLugaresTurista(cantidad);
														costo = vuelos.getCostoTurista() * n;
													break;
												}

												int opc1;
												do{ //Se pide la forma de pago
													System.out.print("\nSeleccione la forma de pago: ");
													System.out.print("\n1. Tarjeta.\n2. Efectivo\n\n");
													System.out.print("\nDame una opcion: ");
													opc1 = entradaInt.nextInt();

												}while(opc1<=0 || opc1>2);

												//Aumentar en las estadisticas.
												if(opc1==1){
													estadisticas.agregarSaldoTarjeta(costo, x);
												}else{
													estadisticas.agregarSaldoEfectivo(costo, x);
												}

												System.out.print("\nTu compra ha sido registrada");
											}

										break;

										case 3:
											System.out.print("\nINFORMACION:\n");
											System.out.print("\n\tNombre: " +cliente1.getNombre());
											System.out.print("\n\tEdad: " +cliente1.getEdad());
											System.out.print("\n\tNombre de usuario: " +cliente1.getNombreUsuario());
											System.out.print("\n\tContrasena: " +cliente1.getContrasena());
											System.out.println("");
										break;

										case 4:
											System.out.print("\nSaliendo del modo cliente...\n");
										break;

										default:
											System.out.print("\nOpcion invalida. Intentelo de nuevo.\n");
									}
									}while(menu8!=4);
								}
							}

						break;

						case 3:
							System.out.print("\nRegresando al menu principal...\n\n");
						break;

						default:
							System.out.print("\nOpcion no valida. Intentelo de nuevo.\n");
					}

				}while(menu7!=3);
				break;

				//OPCION SALIR
				case 3:
					System.out.println("\n\tHasta luego, vuelva pronto.\n");
			}
		}while(menu1!=3);
	}
}
