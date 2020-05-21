public class Estadisticas{

	//Atributos
	private double saldoEfectivo;
	private double saldoTarjeta;

	private double efectivoTotal;

	private int pagosEfectivo;
	private int pagosTarjeta;

	private int primeraClase;
	private int negocio;
	private int turista;

	//Metodos
	public void agregarSaldoEfectivo(double saldoEfectivo, char x){
		this.saldoEfectivo += saldoEfectivo;
		efectivoTotal += saldoEfectivo;
		pagosEfectivo++;

		if(x=='p'){
			primeraClase++;
		}else if(x=='n'){
			negocio++;
		}else{
			turista++;
		}
	}

	public void agregarSaldoTarjeta(double saldoTarjeta, char x){
		this.saldoTarjeta += saldoTarjeta;
		efectivoTotal += saldoTarjeta;
		pagosTarjeta++;

		if(x=='p'){
			primeraClase++;
		}else if(x=='n'){
			negocio++;
		}else{
			turista++;
		}
	}

	public void quitarSaldoEfectivo(double saldoEfectivo, char x){
		this.saldoEfectivo -= saldoEfectivo;
		efectivoTotal -= saldoEfectivo;
		pagosEfectivo--;

		if(x=='p'){
			primeraClase++;
		}else if(x=='n'){
			negocio++;
		}else{
			turista++;
		}
	}

	public void quitarSaldoTarjeta(double saldoTarjeta, char x){
		this.saldoTarjeta -= saldoTarjeta;
		efectivoTotal -= saldoTarjeta;
		pagosTarjeta--;

		if(x=='p'){
			primeraClase++;
		}else if(x=='n'){
			negocio++;
		}else{
			turista++;
		}
	}

	//Compara las clases, para saber cual tiene mas boletos vendidos.
	public void mayor(){
		if(primeraClase>negocio && primeraClase>turista){
				System.out.print("\nPrimera clase con " +primeraClase +" boletos vendidos");
		}else if(negocio>primeraClase && negocio>turista){
			System.out.print("\nNegocio con " +negocio +" boletos vendidos");
		}else{
			System.out.print("\nTurista con " +turista +" boletos vendidos");
		}
	}

	//Getters
	public double getSaldoEfectivo(){
		return this.saldoEfectivo = saldoEfectivo;
	}

	public double getSaldoTarjeta(){
		return this.saldoTarjeta = saldoTarjeta;
	}

	public double getEfectivoTotal(){
		return this.efectivoTotal = efectivoTotal;
	}

	public int getPagosEfectivo(){
		return this.pagosEfectivo = pagosEfectivo;
	}

	public int getPagosTarjeta(){
		return this.pagosTarjeta = pagosTarjeta;
	}

	public int getPrimeraClase(){
		return this.primeraClase = primeraClase;
	}

	public int getNegocio(){
		return this.negocio = negocio;
	}

	public int getTurista(){
		return this.turista = turista;
	}
}