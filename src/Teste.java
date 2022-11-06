import javax.swing.JOptionPane;

public class Teste {
	

	public static void main(String[] args) {
	
		  String numero;
		  String nome;
		  String dia;
		  String personal;
		   int number;
		
		Pessoa p= new Pessoa();
		DiaSemana d= new DiaSemana();
		
		nome = JOptionPane.showInputDialog(null,"Informe o nome: ");
		dia = JOptionPane.showInputDialog(null,"Informe um dia da semana ");
		personal =  JOptionPane.showInputDialog(null,"Informe o nome do Persoanl: ");
	
	
		/*p.setNome( JOptionPane.showInputDialog(null,"Informe o nome: "));
		p.setDia( JOptionPane.showInputDialog(null,"Informe um dia da semana: "));
		p.setPersonal(JOptionPane.showInputDialog(null,"Informe o nome do Personal Trainer: "));
		
		 numero = JOptionPane.showInputDialog("Digite um numero");*/
		 number = Integer.parseInt(dia);
		 
		 p.setNome(nome);
		 p.setDia(number);
		 p.setPersonal(personal);
		 
		JOptionPane.showMessageDialog(null,"Olá "+ p.getNome()+", seja bem vindo(a)","ACADEMIA",JOptionPane.INFORMATION_MESSAGE);
	
	
		switch(number) {
		case 1:
			d.Segunda(); break;
		case 2:
			d.Terca(); break;
		case 3:	
			d.Quarta(); break;
		}
       		
		

}
}

