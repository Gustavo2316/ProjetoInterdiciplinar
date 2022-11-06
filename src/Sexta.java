import javax.swing.JOptionPane;

public class Sexta extends Pessoa {
	
	
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
				+"\nDia de ombros!"
				+ "\n-Repetição 3x4 Elevação lateral do ombro"
				+ "\n-Repetição 2x4 Elevação frontal"
				+ "\n-Repetição 1x4 Arnold press"
				+ "\n-Repetição 3x5 Encolhimento de ombros");
	}
	public Sexta() {
		JOptionPane.showMessageDialog(null,"Nome: "+getNome()+" "	
		+"Personal: "+getPersonal()
		+"\n=====Dia de ombros!====="
		+ "\n-Repetição 3x4 Elevação lateral do ombro"
		+ "\n-Repetição 2x4 Elevação frontal"
		+ "\n-Repetição 1x4 Arnold press"
		+ "\n-Repetição 3x5 Encolhimento de ombros","SEXTA",JOptionPane.INFORMATION_MESSAGE);
	}
}
