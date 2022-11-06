import javax.swing.JOptionPane;

public class Quarta extends Pessoa {
	
	
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
				+"Dia: "+getDia()
				+"Personal"+getPersonal()
				+"\nDia de gluteo!"
				+ "\n-Repetição 3x4 Elevação do pé ao teto"
				+ "\n-Repetição 1x3 Ponte"
				+"\n- Repetição 2x2 Agachamento lateral"
				+ "\n- Repetição 3x2 Ponte com elevação de perna");
	}
	public Quarta() {
		JOptionPane.showMessageDialog(null,"Nome: "+getNome()+" "
		+"Personal: "+getPersonal()
		+"\n=====Dia de gluteo!====="
		+ "\n-Repetição: 3x4 Elevação do pé ao teto"
		+ "\n-Repetição: 1x3 Ponte"
		+"\n- Repetição: 2x2 Agachamento lateral"
		+ "\n- Repetição: 3x2 Ponte com elevação de perna","QUARTA",JOptionPane.INFORMATION_MESSAGE);
	}
}
