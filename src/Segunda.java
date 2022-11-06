import javax.swing.JOptionPane;
public class Segunda extends Pessoa {
	
/*
	public String getPersonal() {
		return getPersonal();		
	}
	
	public String getNome() {
		return getNome();
	}
	
	public String getDia() {
		return getDia();
	}
	*/
	
	public void mostra() {
				JOptionPane.showMessageDialog(null,"Nome: "+getNome()
				+"Dia: "+getDia()+""
				+"Personal: "+getPersonal()
				+"\nDia de perna!"
				+ "\n-Repetição 3x4 de Agachamento"
				+ "\n-Repetição 2x1 Leg Press"
				+"\n-Repetição 1x5 Búlgaro"	);
	}
	public Segunda() {
		JOptionPane.showMessageDialog(null,"Nome: "+getNome()+" "
		+"Personal: "+getPersonal()
		+"\n=====Dia de perna!====="
		+ "\n-Repetição: 3x4 de Agachamento"
		+ "\n-Repetição: 2x1 Leg Press"
		+"\n-Repetição: 1x5 Búlgaro","SEGUNDA",JOptionPane.INFORMATION_MESSAGE	);
		
		
	}
}
	



