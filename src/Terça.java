import javax.swing.JOptionPane;

public class Terça extends Pessoa{
	
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
				+"Personal: "+getPersonal()
				+"\nDia de braço!"
				+ "\n-Repetição 3x4 de Flexão de braços"
				+ "\n-Repetição 1x4 Remada com halteres"
				+"\n-Repetição 4x4 Elevação frontal");
	}
	public Terça() {
		JOptionPane.showMessageDialog(null,"Nome: "+getNome()+" "
		+"Personal: "+getPersonal()
		+"\n=====Dia de braço!====="
		+ "\n-Repetição: 3x4 de Flexão de braços"
		+ "\n-Repetição: 1x4 Remada com halteres"
		+"\n-Repetição: 4x4 Elevação frontal","TERÇA",JOptionPane.INFORMATION_MESSAGE);
	}
}
