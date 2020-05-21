public class Cliente{

	//Atributos
	private String nombre;
	private String apellidoMaterno;
	private String apellidoPaterno;

	private int edad;
	private String nombreUsuario;
	private String contrasena;

	//Constructor
	public Cliente(String nombre, String apellidoMaterno, String apellidoPaterno,int edad, String nombreUsuario, String contrasena){
		this.nombre = nombre;
		this.apellidoMaterno = apellidoMaterno;
		this.apellidoPaterno = apellidoPaterno;
		this.edad = edad;
		this.nombreUsuario = nombreUsuario;
		this.contrasena = contrasena;
	}

	//Metodos
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

	public void setEdad(int edad){
		this.edad = edad;
	}

	public void setContrasena(String contrasena){
		this.contrasena = contrasena;
	}

	//Getters
	public String getNombre(){
		return nombre + " " +apellidoPaterno + " " +apellidoMaterno;
	}

	public int getEdad(){
		return this.edad;
	}

	public String getNombreUsuario(){
		return this.nombreUsuario;
	}

	public String getContrasena(){
		return this.contrasena;
	}

}