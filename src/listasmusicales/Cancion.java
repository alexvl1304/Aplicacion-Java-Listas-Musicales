
package listasmusicales;

/*	COSAS QUE HACER	

		Validar atributos

*/

public class Cancion {

	private String titulo;
	private String ruta;
	private int duracion;
	
	/**
	 * Constructor del objeto Cancion.
	 * 
	 * @param titulo
	 * @param ruta
	 * @param duracion 
	 */
	public Cancion(String titulo, String ruta, int duracion) {
		this.titulo = titulo;
		this.ruta = ruta;
		this.duracion = duracion;
	}

	/**
	 * Devolver la duración de la Cancion.
	 * 
	 * @return la duración.
	 */
	public int getDuracion() {
		return this.duracion;
	}

	/**
	 * Devolver el título de la Cancion.
	 * 
	 * @return el título.
	 */
	public String getTitulo() {
		return this.titulo;
	}

	/**
	 * Devolver la ruta de la Cancion.
	 * 
	 * @return la ruta.
	 */
	public String getRuta() {
		return this.ruta;
	}

	/**
	 * Establecer la duración de la Cancion.
	 * 
	 * @param duracion nueva duración.
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	/**
	 * Establecer la ruta de la Cancion.
	 * 
	 * @param ruta nueva ruta.
	 */
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	/**
	 * Establecer el título de la Cancion.
	 * 
	 * @param titulo nueva título.
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	@Override
	public String toString() {
		return this.titulo+", "+this.duracion+"s. Ubicación del archivo: "+this.ruta;
	}
	
	/**
	 * Comprobar si dos objetos Cancion son iguales(tienen los mismos atributos).
	 * 
	 * @param can	objeto Cancion que se desea comparar
	 * @return true si los objetos son iguales, false si no.
	 */
	public boolean equals(Cancion can) {
		return (this.titulo.equals(can.titulo)&&this.duracion==can.duracion&&this.ruta.equals(can.ruta));
	}
	
	
	
}
