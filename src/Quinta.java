import javax.swing.JOptionPane;

public class Quinta extends Pessoa {

	
	public String getPersonal() {
		return getPersonal();		
	}
	
	public String getNome() {
		return getNome();
	}
	
	public String getDia() {
		return getDia();
	}

	public void mostra() {
		
		JOptionPane.showMessageDialog(null,"Nome: "+getNome()
				+"Dia: "+getDia()+""
				+"Personal"+getPersonal()
				+"\nDia de Costas!"
				+ "\n-Repetição 3x4 Barra fixa (chinup) pegada fechada"
				+ "\n-Repetição 2x6 Barra fixa com pegada aberta"
				+"\n-Repetição 1x3 Remada curvada com barra e pegada pronada"
				+"\n-Repetição 2x2 Remada curvada com barra e pegada invertida (supinada)");
	}
	public Quinta() {
		JOptionPane.showMessageDialog(null,"Nome: "+getNome()+" "
		+"Personal: "+getPersonal()
		+"\n=====Dia de Costas!====="
		+ "\n-Repetição: 3x4 Barra fixa (chinup) pegada fechada"
		+ "\n-Repetição: 2x6 Barra fixa com pegada aberta"
		+"\n-Repetição: 1x3 Remada curvada com barra e pegada pronada"
		+"\n-Repetição: 2x2 Remada curvada com barra e pegada invertida (supinada)","QUINTA",JOptionPane.INFORMATION_MESSAGE);
	}
}
