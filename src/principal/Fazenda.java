package principal;

public class Fazenda {

	private Coordenada _c1, _c2;
	private int _numMet = 0;
	
	
	public Fazenda(Coordenada coordenada, Coordenada coordenada2) {
		_c1 = coordenada;
		_c2 = coordenada2;
	}

	public void cair(Coordenada meteoro) {
		
		
		if (
			meteoro.getX()>=_c1.getX() && meteoro.getY()>=_c1.getY() &&
			meteoro.getX()<=_c2.getX() && meteoro.getY()<=_c2.getY()
			)
		
			_numMet++;
		
					
		/*return true;
		
		else return false;*/
		
	}
	
	public int getNumMet() {
		return _numMet;
	}
	
}
