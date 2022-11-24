import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
		Integer aux = 0;
		ArrayList<Integer> fila = new ArrayList<Integer>();
		fila.add(1);
		fila.add(2);
		fila.add(3);
		fila.add(4);
		fila.add(5);
		while(aux != 4) {
			String escolha = JOptionPane.showInputDialog(fila.toString() + "\n\n   1 - Inserir número\n"
					+ "   2 - Remover número\n   3 - Quantidade de elementos\n   4 - Sair");
			aux = Integer.valueOf(escolha);
			
			if (aux == 1) {
				if (fila.size() == 0 || fila.size() == 1) {
					String num = JOptionPane.showInputDialog("Digite o número que deseja inserir: ");
					Integer addFilaVazia = Integer.valueOf(num);
					fila.add(addFilaVazia);
					JOptionPane.showMessageDialog(null, "Número inserido com sucesso !");
				} else {
				    String add = JOptionPane.showInputDialog(fila.toString() + "\n\n Digite o número que deseja inserir: ");
				    String add2 = JOptionPane.showInputDialog(fila.toString() + "\n\n Digite a posição que deseja inserir o número: ");
				    Integer inserirNumero = Integer.valueOf(add);
				    Integer posicaoInserir = Integer.valueOf(add2);
				    if (posicaoInserir <= fila.size() & posicaoInserir != 0) {
					   fila.add(posicaoInserir - 1, inserirNumero);
					   JOptionPane.showMessageDialog(null, "Número inserido com sucesso !");
				    } else {
					  JOptionPane.showMessageDialog(null, "Não foi possível realizar essa operação !");
				    }
			    }
			
			}
			
			if (aux == 2) {
				String del = JOptionPane.showInputDialog(fila.toString() + "\n\n Digite a posição que deseja excluir o número: ");
				Integer excluirNumero = Integer.valueOf(del);
				if (excluirNumero <= fila.size() & excluirNumero != 0) {
					fila.remove(excluirNumero - 1);
					JOptionPane.showMessageDialog(null, "Número excluído com sucesso !");
				} else {
					JOptionPane.showMessageDialog(null, "Não foi possível realizar essa operação !");
				}
				
			}
			
			if (aux == 3) {
			    JOptionPane.showMessageDialog(null, "A quantidade de elementos é " + fila.size());
			}
		}
	}

}
