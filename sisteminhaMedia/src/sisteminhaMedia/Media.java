package sisteminhaMedia;

import javax.swing.JOptionPane;

public class Media {

	public static void main(String[] args) {

		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1 "));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2 "));
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 3 "));
		double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 4 "));

		double media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 50) {
			if (media >= 70) {
				JOptionPane.showMessageDialog(null, "Aluno aprovado com a m�dia " + media);
			} else {
				JOptionPane.showMessageDialog(null, "Aluno est� em recupera��o com a m�dia " + media);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Aluno est� reprovado com a m�dia " + media);
		}

	}

}
