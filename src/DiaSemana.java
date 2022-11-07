import javax.swing.JOptionPane;

public class DiaSemana extends Pessoa {

	String nome;
	String dia;
	String personal;

	public void charger() {
		String[] charge = { "iniciando sistema", "carregando alunos", "leitura digital",
				"professores disponíveis" };

		for (int i = 0; i <= 3; i++) {
			JOptionPane.showMessageDialog(null, charge[i], "ACADEMIA TRAINER",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public void academiaFechada() {
		JOptionPane.showMessageDialog(null, "ACADEMIA FECHADA", "ACADEMIA TRAINER", JOptionPane.INFORMATION_MESSAGE);
	}

	public void Segunda(String nome, String personal) {
		setNome(nome);
		setPersonal(personal);
		JOptionPane.showMessageDialog(null,
				"Nome: " + getNome() + " "
						+ "\nPersonal: " + getPersonal() + " "
						+ "\n=====Dia de perna!====="
						+ "\n-Repetição: 3x4 de Agachamento"
						+ "\n-Repetição: 2x1 Leg Press"
						+ "\n-Repetição: 1x5 Búlgaro",
				"SEGUNDA-FEIRA", JOptionPane.INFORMATION_MESSAGE);

	}

	public void Terca(String nome, String personal) {
		setNome(nome);
		setPersonal(personal);
		JOptionPane.showMessageDialog(null,
				"Nome: " + getNome() + " "
						+ "\nPersonal: " + getPersonal()
						+ "\n=====Dia de braço!====="
						+ "\n-Repetição: 3x4 de Flexão de braços"
						+ "\n-Repetição: 1x4 Remada com halteres"
						+ "\n-Repetição: 4x4 Elevação frontal",
				"TERÇA-FEIRA", JOptionPane.INFORMATION_MESSAGE);
	}

	public void Quarta(String nome, String personal) {
		setNome(nome);
		setPersonal(personal);
		JOptionPane.showMessageDialog(null,
				"Nome: " + getNome() + " "
						+ "\nPersonal: " + getPersonal()
						+ "\n=====Dia de glúteo!====="
						+ "\n-Repetição: 3x4 Elevação do pé ao teto"
						+ "\n-Repetição: 1x3 Ponte"
						+ "\n- Repetição: 2x2 Agachamento lateral"
						+ "\n- Repetição: 3x2 Ponte com elevação de perna",
				"QUARTA-FEIRA", JOptionPane.INFORMATION_MESSAGE);
	}

	public void Quinta(String nome, String personal) {
		setNome(nome);
		setPersonal(personal);
		JOptionPane.showMessageDialog(null,
				"Nome: " + getNome() + " "
						+ "\nPersonal: " + getPersonal()
						+ "\n=====Dia de Costas!====="
						+ "\n-Repetição: 3x4 Barra fixa (chinup) pegada fechada"
						+ "\n-Repetição: 2x6 Barra fixa com pegada aberta"
						+ "\n-Repetição: 1x3 Remada curvada com barra e pegada pronada"
						+ "\n-Repetição: 2x2 Remada curvada com barra e pegada invertida (supinada)",
				"QUINTA-FEIRA",
				JOptionPane.INFORMATION_MESSAGE);
	}

	public void Sexta(String nome, String personal) {
		setNome(nome);
		setPersonal(personal);
		JOptionPane.showMessageDialog(null,
				"Nome: " + getNome() + " "
						+ "\nPersonal: " + getPersonal()
						+ "\n=====Dia de ombros!====="
						+ "\n-Repetição 3x4 Elevação lateral do ombro"
						+ "\n-Repetição 2x4 Elevação frontal"
						+ "\n-Repetição 1x4 Arnold press"
						+ "\n-Repetição 3x5 Encolhimento de ombros",
				"SEXTA-FEIRA", JOptionPane.INFORMATION_MESSAGE);
	}
}