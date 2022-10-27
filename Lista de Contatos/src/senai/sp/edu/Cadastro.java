package senai.sp.edu;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Cadastro extends JFrame implements ActionListener {

	private JLabel lblNome = new JLabel("Nome");
	private JLabel lblEndereco = new JLabel("Endereço");
	private JLabel lblFone = new JLabel("Telefone");
	private JLabel lblSexo = new JLabel("Sexo");

	private JTextField txtNome = new JTextField(null, 20);
	private JTextField txtEndereco = new JTextField(null, 30);
	private JTextField txtFone = new JTextField(null, 11);

	private JButton btnFechar = new JButton("Fechar");
	private JButton btnGravar = new JButton("Gravar");
	private JButton btnAbrir = new JButton("Abrir contatos");
	private JButton btnLimpar = new JButton("Limpar");

	private String[] sexos = { "Masculino", "Feminino" };
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private JComboBox cboSexo = new JComboBox(sexos);

	public Cadastro() {
		
		//cria a janela e configura sua propriedades básicas.
		setTitle("Lista de Contato");
		setBounds(50, 50, 400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container cp = getContentPane();
		cp.setLayout(new GridLayout(6, 1, 1, 1));

		cp.add(lblNome);
		cp.add(txtNome);

		cp.add(lblEndereco);
		cp.add(txtEndereco);

		cp.add(lblFone);
		cp.add(txtFone);

		cp.add(lblSexo);
		cp.add(cboSexo);

		cp.add(btnAbrir);
		btnAbrir.addActionListener(this);

		cp.add(btnLimpar);
		btnLimpar.addActionListener(this);

		cp.add(btnGravar);
		btnGravar.addActionListener(this);

		cp.add(btnFechar);
		btnFechar.addActionListener(this);

		//construir a janela
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnFechar) {
			System.exit(0); // fechar a janela.
		}
		
		if (e.getSource() == btnGravar) {
			String aux = "Nome: " + txtNome.getText() + " \nRua: " + txtEndereco.getText() + " \nTelefone: "
					+ txtFone.getText() + " \nSexo: " + cboSexo.getSelectedItem().toString() + "\n";
			salvarArquivos(aux);
			txtNome.setText("");
			txtEndereco.setText("");
			txtFone.setText("");
			cboSexo.setSelectedIndex(0);
		}

		if (e.getSource() == btnLimpar) {
			txtNome.setText("");
			txtEndereco.setText("");
			txtFone.setText("");
			cboSexo.setSelectedIndex(0);
		}

		if (e.getSource() == btnAbrir) {

			try {
				abrirContatos();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	public static void salvarArquivos(String aux) {

		File arquivo = new File("E:/contatos.txt"); // teste de gravação no diretorio.

		// Se o arquivo nao existir, ele cria
		if (!arquivo.exists()) {
			try {
				arquivo.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try {
			FileWriter fw = new FileWriter(arquivo, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(aux);

			// quebra em dua linhas
			bw.newLine();
			bw.newLine();

			bw.close();
			fw.close();

			JOptionPane.showMessageDialog(null, "Gravado com sucesso!");

		} catch (IOException e) {
			// entra nesta exceção quando o diretório não existir ou não permitir gravação.
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e);
		}
	}

	public static void abrirContatos() throws IOException {

		Runtime.getRuntime().exec("notepad E:/contatos.txt");

	}

}
