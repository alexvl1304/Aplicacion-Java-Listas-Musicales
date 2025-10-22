package listasmusicales;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeloListaCancion extends AbstractTableModel {

	private ArrayList<Cancion> listaCanciones;
	private final String nombreColumnas [] = {"Titulo", "Duracion", "Ruta"};

	/**
	 * Constructor del ModeloListaCancion
	 */
	public ModeloListaCancion() {
		this.listaCanciones = new ArrayList<>();
	}

	/**
	 * Añadir objeto Cancion a la lista.
	 * 
	 * @param us Cancion a añadir.
	 */
	public void añadirCancion(Cancion us) {
		this.listaCanciones.add(us);
	}
	
	/**
	 * Vaciar lista.
	 */
	public void clear() {
		listaCanciones.clear();
	}
	
	/**
	 * Reemplazar una Cancion de la lista por otra.
	 * 
	 * @param us nueva Cancion.
	 * @param index posición en la lista de la Cancion que se desea reemplazar.
	 */
	public void modificarCancion(Cancion us, int index) {
		this.listaCanciones.remove(index);
		this.listaCanciones.add(index, us);
	}
	
	/**
	 * Devolver un objeto Cancion de la lista.
	 * 
	 * @param index posición en la lista de la Cancion que se desea devolver.
	 * @return El objeto Cancion.
	 */
	public Cancion getCancion(int index){
		return listaCanciones.get(index);
	}
	
	/**
	 * Delvolver cuantas Canciones hay en la lista.
	 * @return  la longitud de la lista de Canciones.
	 */
	public int getNumeroCanciones(){
		return listaCanciones.size();
	}
	
	/**
	 * Eliminar una Cancion de la lista.
	 * 
	 * @param index posición en la lista de la Cancion que se desea eliminar.
	 * @return true si se ha eliminado con exito, false si ha habido algún error.
	 */
	public Cancion eliminarCancion(int index) {
		return this.listaCanciones.remove(index);
	}

	@Override
	public int getRowCount() {
		return this.listaCanciones.size();
	}

	@Override
	public int getColumnCount() {
		return 3;
	}
	
	@Override
	public String getColumnName(int index){
		return this.nombreColumnas[index];
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		if(columnIndex==0){
			return this.listaCanciones.get(rowIndex).getTitulo();
		}else if(columnIndex==1){
			int duracion = this.listaCanciones.get(rowIndex).getDuracion();
			if(duracion==-1){
				return "???";
			}else{
				return duracion;
			}
		}else{
			return this.listaCanciones.get(rowIndex).getRuta();
		}
	}
}
