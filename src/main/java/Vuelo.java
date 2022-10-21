import java.util.ArrayList;

public class Vuelo {
	private date fechaVuelo;
	public ArrayList<Pasajero> pasajeros = new ArrayList<Pasajero>();
	public ArrayList<Piloto> pilotos = new ArrayList<Piloto>();
	public Ciudad ciudadOrigen;
	public Ciudad ciudadDestino;

	public date getFechaVuelo() {
		return this.fechaVuelo;
	}

	public void setFechaVuelo(date fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}
}