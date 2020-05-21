public class Administrador{

	//Atributos
	public String nombreDeAdministrador;
	public String contrasena;
	
	public String nombre;
	public String apellidoMaterno;
	public String apellidoPaterno;
	public double sueldo;

	//Constructor
	public Administrador(){
		nombreDeAdministrador = "Administrador";
		contrasena = "12345";
		nombre = "Ricardo";
		apellidoMaterno = "Mondragon";
		apellidoPaterno = "Cuevas";
		sueldo = 80000.00;

	}

	//Metodos
	public String getNombreDeAdministrador(){
		return this.nombreDeAdministrador;
	}

	public String getContrasena(){
		return this.contrasena;
	}

	//Setters
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public void setApellidoMaterno(String apellidoMaterno){
		this.apellidoMaterno = apellidoMaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno){
		this.apellidoPaterno = apellidoPaterno;
	}

	public void setSueldo(double sueldo){
		this.sueldo = sueldo;
	}

	//Gets
	public String getNombre(){
		return nombre + " " +apellidoPaterno + " " +apellidoMaterno;
	}

	public double getSueldo(){
		return this.sueldo;
	}
}