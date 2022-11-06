import javax.swing.JOptionPane;

import splash.Splash;

public class Teste {

	public static void main(String[] args) {

		Integer diaDaSemana;
		Pessoa p = new Pessoa();
		DiaSemana ds = new DiaSemana();

		new Splash();

		p.setNome(JOptionPane.showInputDialog(null, "Informe o nome: "));
		p.setDia(JOptionPane.showInputDialog(null, "Informe um dia da semana: "));
		p.setPersonal(JOptionPane.showInputDialog(null, "Informe o nome do Personal Trainer: "));

		diaDaSemana = Integer.parseInt(p.getDia());

		JOptionPane.showMessageDialog(null, "Olá " + p.getNome() + ", seja bem vindo(a)", "ACADEMIA",
				JOptionPane.INFORMATION_MESSAGE);

		switch (diaDaSemana) {
			case 1:

				System.out.println("Segunda-Feira");
				ds.Segunda(p.getNome(), p.getPersonal());

				break;

			case 2:

				System.out.println("Terça-Feira");
				ds.Terca(p.getNome(), p.getPersonal());

				break;

			case 3:

				System.out.println("Quarta-Feira");
				ds.Quarta(p.getNome(), p.getPersonal());

				break;

			case 4:

				System.out.println("Quinta-Feira");
				ds.Quinta(p.getNome(), p.getPersonal());

				break;

			case 5:

				System.out.println("Sexta-Feira");
				ds.Sexta(p.getNome(), p.getPersonal());

				break;

			default:

				if (diaDaSemana != 5) {
					System.out.println("academia fechada");
					ds.academiaFechada();
				}

				break;
		}
	}
}