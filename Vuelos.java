public class Vuelos{

	//Atributos
	private String origen;
	private String destino;

	private String horaLlegada;
	private String horaSalida;

	private int lugaresPrimeraClase;
	private int lugaresNegocio;
	private int lugaresTurista;

	private double costoPrimeraClase;
	private double costoNegocio;
	private double costoTurista;

	//Contructor
	public Vuelos(String origen, String destino, String horaLlegada, String horaSalida, int lugaresPrimeraClase, int lugaresNegocio, int lugaresTurista, double costoPrimeraClase, double costoNegocio, double costoTurista ){
		this.origen = origen;
		this.destino = destino;

		this.horaLlegada = horaLlegada;
		this.horaSalida = horaSalida;

		this.lugaresPrimeraClase = lugaresPrimeraClase;
		this.lugaresNegocio = lugaresNegocio;
		this.lugaresTurista = lugaresTurista;

		this.costoPrimeraClase = costoPrimeraClase;
		this.costoNegocio = costoNegocio;
		this.costoTurista = costoTurista;
	}

	//Metodos
	//Setters
	public void setOrigen(String origen){
		this.origen =origen;
	}

	public void setDestino(String destino){
		this.destino = destino;
	}

	public void setHoraLlegada(String horaLlegada){
		this.horaLlegada = horaLlegada;
	}

	public void setHoraSalida(String horaSalida){
		this.horaSalida = horaSalida;
	}

	public void setLugaresPrimeraClase(int lugaresPrimeraClase){
		this.lugaresPrimeraClase = lugaresPrimeraClase;
	}

	public void setLugaresNegocio(int lugaresNegocio){
		this.lugaresNegocio = lugaresNegocio;
	}

	public void setLugaresTurista(int lugaresTurista){
		this.lugaresTurista = lugaresTurista;
	}

	public void setCostoPrimeraClase(double costoPrimeraClase){
		this.costoPrimeraClase = costoPrimeraClase;
	}

	public void setCostoNegocio(double costoNegocio){
		this.costoNegocio = costoNegocio;
	}

	public void setCostoTurista(double costoTurista){
		this.costoTurista = costoTurista;
	}

	//Getters
	public String getOrigen(){
		return this.origen;
	}

	public String getDestino(){
		return this.destino;
	}

	public String getHoraLlegada(){
		return this.horaLlegada;
	}

	public String getHoraSalida(){
		return this.horaSalida;
	}

	public int getLugaresPrimeraClase(){
		return this.lugaresPrimeraClase;
	}

	public int getLugaresNegocio(){
		return this.lugaresNegocio;
	}

	public int getLugaresTurista(){
		return this.lugaresTurista;
	}

	public double getCostoPrimeraClase(){
		return this.costoPrimeraClase;
	}

	public double getCostoNegocio(){
		return this.costoNegocio;
	}

	public double getCostoTurista(){
		return this.costoTurista;
	}
}