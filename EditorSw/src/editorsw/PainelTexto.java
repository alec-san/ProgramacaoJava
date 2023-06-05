/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package editorsw;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledEditorKit;
import javax.swing.undo.UndoManager;

/**
 *
 * @author Alecksandre
 */

public class PainelTexto extends JPanel {
    
    

    //painel
    JPanel painelMenu = new JPanel();
    JPanel painelTexto = new JPanel();
    JPanel painelSituacao = new JPanel();

    JFileChooser fc = new JFileChooser();

    // Barra principal
    JMenuBar barraMenu = new JMenuBar();

    //Barra de ferramentas com JToolBar
    JToolBar menuFerramentas = new JToolBar();

    //Botões
    JButton btnNovo;
    JButton btnAbrir;
    JButton btnSalvar;
    //JButton btnSalvarComo;
    JButton btnDesfazer;
    JButton btnRefazer;
    JButton btnCortar;
    JButton btnCopiar;
    JButton btnColar;
    JButton btnNegrito;
    JButton btnSublinhado;
    JButton btnCor;
    JButton btnItalico;
    JButton btnCentralizado;
    JButton btnEsquerda;
    JButton btnDireita;
    JButton btnJustificado;
    JButton btnInserirImagem;

    JSpinner cbxTamanho;
    JComboBox cbxFonte;

    //Rótulos de situação
    JLabel lblSituacao;
    JLabel lblVersao;

    //área de texto
    JTextPane txpTexto = new JTextPane();

    //estilo de fontes
    String[] fntNome = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

    //Gerenciador do desfazer e refazer
    UndoManager um = new UndoManager();

    //menus de atalho
    JPopupMenu menuAtalho = new JPopupMenu();
    
    
    Sobre sobre = new Sobre();

    //construtor da classe
    public PainelTexto() {

        this.setLayout(new BorderLayout());
        painelTexto.setLayout(new BorderLayout());
        
        barraDeMenu();
        barraDeFerramentas();
        barraDeSituacao();
        textoArea();
        menuSuspenso();
        
        FileFilter txtFiltro = new FileNameExtensionFilter("Planilha de texto", "txt");
        fc.setFileFilter(txtFiltro);
    }

    public void barraDeMenu() {

        //instaciando os menus
        JMenu mnuArquivo = new JMenu("Arquivo");
        mnuArquivo.setMnemonic('a');

        JMenu mnuEditar = new JMenu("Editar");
        mnuEditar.setMnemonic('e');

        JMenu mnuExibir = new JMenu("Exibir");
        mnuExibir.setMnemonic('x');

        JMenu mnuFormatar = new JMenu("Formatar");
        mnuFormatar.setMnemonic('f');

        JMenu mnuSobre = new JMenu("Sobre");
        mnuSobre.setMnemonic('s');

        // adicionar na barra de menu
        barraMenu.add(mnuArquivo);
        barraMenu.add(mnuEditar);
        barraMenu.add(mnuExibir);
        barraMenu.add(mnuFormatar);
        barraMenu.add(mnuSobre);

        // adicionando ao menu Arquivo os itens
        JMenuItem novoArquivo = new JMenuItem("Novo");
        novoArquivo.setMnemonic('n');
        novoArquivo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
        novoArquivo.addActionListener(Novo);
        mnuArquivo.add(novoArquivo);

        JMenuItem abrirArquivo = new JMenuItem("Abrir...");
        abrirArquivo.setMnemonic('b');
        abrirArquivo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_DOWN_MASK));
        abrirArquivo.addActionListener(Abrir);
        mnuArquivo.add(abrirArquivo);

        JMenuItem salvarArquivo = new JMenuItem("Salvar");
        salvarArquivo.setMnemonic('s');
        salvarArquivo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
        salvarArquivo.addActionListener(Salvar);
        mnuArquivo.add(salvarArquivo);

        JMenuItem salvarComoArquivo = new JMenuItem("Salvar como...");
        salvarComoArquivo.setMnemonic('c');
        //salvarComoArquivo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
        salvarComoArquivo.addActionListener(SalvarComo);
        mnuArquivo.add(salvarComoArquivo);

        mnuArquivo.addSeparator();

        JMenuItem sairArquivo = new JMenuItem("Sair");
        sairArquivo.setMnemonic('r');
        sairArquivo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_DOWN_MASK));
        sairArquivo.addActionListener(Sair);
        mnuArquivo.add(sairArquivo);

        // adicionando ao menu Editar os itens
        JMenuItem desfazerEditar = new JMenuItem("Desfazer");
        desfazerEditar.setMnemonic('d');
        desfazerEditar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, InputEvent.CTRL_DOWN_MASK));
        desfazerEditar.addActionListener(Desfazer);
        mnuEditar.add(desfazerEditar);

        JMenuItem refazerEditar = new JMenuItem("Refazer");
        refazerEditar.setMnemonic('r');
        refazerEditar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, InputEvent.CTRL_DOWN_MASK));
        refazerEditar.addActionListener(Refazer);
        mnuEditar.add(refazerEditar);

        mnuEditar.addSeparator();

        JMenuItem cortarEditar = new JMenuItem("Cortar");
        cortarEditar.setMnemonic('c');
        cortarEditar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
        cortarEditar.addActionListener(new StyledEditorKit.CutAction());
        mnuEditar.add(cortarEditar);

        JMenuItem copiarEditar = new JMenuItem("Copiar");
        copiarEditar.setMnemonic('o');
        copiarEditar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
        copiarEditar.addActionListener(new StyledEditorKit.CopyAction());
        mnuEditar.add(copiarEditar);

        JMenuItem colarEditar = new JMenuItem("Colar");
        colarEditar.setMnemonic('l');
        colarEditar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
        colarEditar.addActionListener(new StyledEditorKit.PasteAction());
        mnuEditar.add(colarEditar);

        // adicionando ao menu Ferramentas os itens      
        JMenuItem exibirFerramentas = new JMenuItem("Barra de Ferramentas");
        exibirFerramentas.setMnemonic('f');
        //exibirFerramentas.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.CTRL_DOWN_MASK));
        //exibirFerramentas.addActionListener(exibirStatus);
        mnuExibir.add(exibirFerramentas);

        JMenuItem exibirStatus = new JMenuItem("Barra de Status");
        exibirStatus.setMnemonic('s');
        //exibirStatus.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.CTRL_DOWN_MASK));
        //exibirStatus.addActionListener(exibirStatus);
        mnuExibir.add(exibirStatus);

        //adicionando ao menu Formatar os itens
        JMenuItem formatarFonte = new JMenuItem("Fonte...");
        formatarFonte.setMnemonic('f');
        //formatarFonte.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.CTRL_DOWN_MASK));
        //formtarFonte.addActionListener(formatarFonte);
        mnuFormatar.add(formatarFonte);

        JMenuItem formatarQuebra = new JMenuItem("Quebra de linha");
        formatarQuebra.setMnemonic('q');
        //formatarQuebra.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.CTRL_DOWN_MASK));
        //formatarQuebra.addActionListener(formatarQuebra);
        mnuFormatar.add(formatarQuebra);

        // adicionando ao menu Sobre os itens
        JMenuItem sobreDesenvolvimento = new JMenuItem("Sobre");
        sobreDesenvolvimento.setMnemonic('o');
        sobreDesenvolvimento.addActionListener(iSobre);
        mnuSobre.add(sobreDesenvolvimento);

        //adiciona ao painel
        this.add(barraMenu, BorderLayout.NORTH);

    }

    public void barraDeFerramentas() {

        //barra de ferramenta fixa
        menuFerramentas.setFloatable(false);

        //instaciando os botões
        btnNovo = new JButton(new ImageIcon("src\\imagem\\novo.png"));
        btnAbrir = new JButton(new ImageIcon("src\\imagem\\abrir.png"));
        btnSalvar = new JButton(new ImageIcon("src\\imagem\\salvar.png"));
        //btnSalvarComo = new JButton(new ImageIcon("src\\imagem\\salvarcomo.png"));
        btnDesfazer = new JButton(new ImageIcon("src\\imagem\\desfazer.png"));
        btnRefazer = new JButton(new ImageIcon("src\\imagem\\refazer.png"));
        btnCortar = new JButton(new ImageIcon("src\\imagem\\cortar.png"));
        btnCopiar = new JButton(new ImageIcon("src\\imagem\\copiar.png"));
        btnColar = new JButton(new ImageIcon("src\\imagem\\colar.png"));
        btnNegrito = new JButton(new ImageIcon("src\\imagem\\negritoPT.png"));
        btnItalico = new JButton(new ImageIcon("src\\imagem\\italico.png"));
        btnSublinhado = new JButton(new ImageIcon("src\\imagem\\sublinhado.png"));
        btnJustificado = new JButton(new ImageIcon("src\\imagem\\justificado.png"));
        btnEsquerda = new JButton(new ImageIcon("src\\imagem\\aliEsquerda.png"));
        btnDireita = new JButton(new ImageIcon("src\\imagem\\aliDireita.png"));
        btnCentralizado = new JButton(new ImageIcon("src\\imagem\\centralizado.png"));
        btnInserirImagem = new JButton(new ImageIcon("src\\imagem\\quadro.png"));
        btnCor = new JButton(new ImageIcon("src\\imagem\\cor2.png"));

        cbxFonte = new JComboBox(fntNome);
        cbxTamanho = new JSpinner(new SpinnerNumberModel(10, 0, 80, 2));

        cbxFonte.setSelectedIndex(12);

        //adicionando na barra de menu
        menuFerramentas.add(btnNovo);
        menuFerramentas.add(btnAbrir);
        menuFerramentas.add(btnSalvar);
        //menuFerramentas.add(btnSalvarComo);
        menuFerramentas.addSeparator();

        menuFerramentas.add(btnDesfazer);
        menuFerramentas.add(btnRefazer);
        menuFerramentas.addSeparator();

        menuFerramentas.add(btnCortar);
        menuFerramentas.add(btnCopiar);
        menuFerramentas.add(btnColar);
        menuFerramentas.addSeparator();

        menuFerramentas.add(cbxFonte);
        menuFerramentas.add(cbxTamanho);
        menuFerramentas.addSeparator();

        menuFerramentas.add(btnNegrito);
        menuFerramentas.add(btnItalico);
        menuFerramentas.add(btnSublinhado);
        menuFerramentas.addSeparator();

        menuFerramentas.add(btnEsquerda);
        menuFerramentas.add(btnCentralizado);
        menuFerramentas.add(btnDireita);
        menuFerramentas.add(btnJustificado);
        menuFerramentas.addSeparator();

        menuFerramentas.add(btnInserirImagem);
        menuFerramentas.add(btnCor);

        //descrição dos botões
        btnNovo.setToolTipText("Novo arquivo");
        btnAbrir.setToolTipText("Abrir arquivo");
        btnSalvar.setToolTipText("Salvar");
        //btnSalvarComo.setToolTipText("Salvar como");
        btnDesfazer.setToolTipText("Desfaz uma ação");
        btnRefazer.setToolTipText("Refaz uma ação");
        btnCortar.setToolTipText("Cortar");
        btnCopiar.setToolTipText("Copiar");
        btnColar.setToolTipText("Colar");
        cbxFonte.setToolTipText("Altera a fonte");
        cbxTamanho.setToolTipText("Altera o tamanho da fonte");
        btnNegrito.setToolTipText("Altera fonte para negrito");
        btnItalico.setToolTipText("Altera a fonte para itálico");
        btnSublinhado.setToolTipText("Sublinha a fonte");
        btnEsquerda.setToolTipText("Alinhar à esquerda");
        btnCentralizado.setToolTipText("Alinhar ao centro");
        btnDireita.setToolTipText("Alinhar à direita");
        btnJustificado.setToolTipText("Justificar");

        //implementado as ações
        btnNovo.addActionListener(Novo);

        //Botão abrir
        btnAbrir.addActionListener(Abrir);

        //Botão salvar
        btnSalvar.addActionListener(Salvar);

        //Botão salvar como
        //btnSalvarComo.addActionListener(SalvarComo);
        //desfazer
        btnDesfazer.addActionListener(Desfazer);

        //refazer  
        btnRefazer.addActionListener(Refazer);

        //cortar
        btnCortar.addActionListener(new StyledEditorKit.CutAction());

        //copiar
        btnCopiar.addActionListener(new StyledEditorKit.CopyAction());

        //colar
        btnColar.addActionListener(new StyledEditorKit.PasteAction());

        //negrito
        btnNegrito.addActionListener(new StyledEditorKit.BoldAction());

        //italico
        btnItalico.addActionListener(new StyledEditorKit.ItalicAction());

        //sublinhado
        btnSublinhado.addActionListener(new StyledEditorKit.UnderlineAction());

        //alinhamento a esquerda
        btnEsquerda.addActionListener(new StyledEditorKit.AlignmentAction("Esquerda", StyleConstants.ALIGN_LEFT));

        //alinhamento a direita
        btnDireita.addActionListener(new StyledEditorKit.AlignmentAction("Direita", StyleConstants.ALIGN_RIGHT));

        //alinhamento centralizado
        btnCentralizado.addActionListener(new StyledEditorKit.AlignmentAction("Centralizado", StyleConstants.ALIGN_CENTER));

        //alinhamento justificado
        btnJustificado.addActionListener(new StyledEditorKit.AlignmentAction("Justificado", StyleConstants.ALIGN_JUSTIFIED));

        //inserir imagem
        btnInserirImagem.addActionListener(InserirImagem);

        //alterar cor
        btnCor.addActionListener(AlterarCor);

        //alterar tamanho
        cbxTamanho.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                SimpleAttributeSet atributo = new SimpleAttributeSet(txpTexto.getCharacterAttributes());
                StyleConstants.setFontSize(atributo, (int) cbxTamanho.getValue());
                txpTexto.setCharacterAttributes(atributo, false);

            }
        });

        //altear fonte
        cbxFonte.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                SimpleAttributeSet atrib = new SimpleAttributeSet(txpTexto.getCharacterAttributes());

                StyleConstants.setFontFamily(atrib, (String) cbxFonte.getSelectedItem());
                txpTexto.setCharacterAttributes(atrib, false);
            }
        });

        //adicionando no painel
        painelTexto.add(menuFerramentas, BorderLayout.NORTH);
        this.add(painelTexto, BorderLayout.CENTER);

    }

    public void textoArea() {

        //Escuta o gerenciador de desfazer e refazer
        txpTexto.getDocument().addUndoableEditListener(
                new UndoableEditListener() {
            @Override
            public void undoableEditHappened(UndoableEditEvent e) {
                um.addEdit(e.getEdit());
            }
        });

        //barra de rolagem de texto
        JScrollPane rolagem = new JScrollPane(txpTexto);

        //ativando a roldana do apontador de tela
        rolagem.setWheelScrollingEnabled(true);
        rolagem.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        rolagem.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        //Ativando o texto com o painel de rolagem
        painelTexto.add(rolagem, BorderLayout.CENTER);

    }

    public void barraDeSituacao() {

        this.add(painelSituacao, BorderLayout.SOUTH);

    }

    public void menuSuspenso() {

        //cria a caixa do menu atalho
        JMenuItem desfazer = new JMenuItem("Desfazer");
        desfazer.setMnemonic('d');

        JMenuItem refazer = new JMenuItem("Refazer");
        refazer.setMnemonic('r');

        JMenuItem cortar = new JMenuItem("Cortar");
        cortar.setMnemonic('c');

        JMenuItem copiar = new JMenuItem("Copiar");
        copiar.setMnemonic('o');

        JMenuItem colar = new JMenuItem("Colar");
        colar.setMnemonic('l');

        //adiciona as ações as respectivas opções.
        desfazer.addActionListener(Desfazer);
        refazer.addActionListener(Refazer);
        cortar.addActionListener(new StyledEditorKit.CutAction());
        copiar.addActionListener(new StyledEditorKit.CopyAction());
        colar.addActionListener(new StyledEditorKit.PasteAction());

        menuAtalho.add(desfazer);
        menuAtalho.add(refazer);
        menuAtalho.addSeparator();
        menuAtalho.add(cortar);
        menuAtalho.add(copiar);
        menuAtalho.add(colar);
        
        //captura no text area o pressionar do botão direito do apontador
        txpTexto.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (SwingUtilities.isRightMouseButton(e)) {
                    menuAtalho.show(txpTexto, e.getX(), e.getY());
                }
            }
        });
    }

    //implementações das ações
    Action Novo = new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {

            txpTexto.setText("");

        }
    };

    Action Abrir = new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {

            JFileChooser seletor = new JFileChooser();
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Arquivos de texto", "txt", "rtf");

            seletor.setFileFilter(filtro);
            int selecionado = seletor.showOpenDialog(barraMenu);

            if (selecionado == seletor.APPROVE_OPTION) {

                File ficheiro = seletor.getSelectedFile();
                try ( FileReader arquivo = new FileReader(ficheiro)) {

                    String cadeia = "";
                    int valor = arquivo.read();
                    while (valor != -1) {
                        cadeia = cadeia + (char) valor;
                        valor = arquivo.read();
                    }

                    txpTexto.setText(cadeia);
                    arquivo.close();
                } catch (IOException ex) {
                    System.out.println("Não existe arquivo");
                }
            }
        }
    };

    Action Salvar = new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {

            if (fc.showSaveDialog(PainelTexto.this) == JFileChooser.APPROVE_OPTION) {
                FileWriter fw = null;
                try {
                    fw = new FileWriter(fc.getSelectedFile().getAbsolutePath());
                    txpTexto.write(fw);
                    fw.close();
                } catch (IOException ed) {
                    ed.printStackTrace();
                }
            }
        }
    };

    Action SalvarComo = new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {

            JFileChooser seletor2 = new JFileChooser();
            int selecao2 = seletor2.showSaveDialog(barraMenu);

            if (selecao2 == seletor2.APPROVE_OPTION) {

                File ficheiro2 = seletor2.getSelectedFile();
                if (ficheiro2.exists()) {
                    int abrir = JOptionPane.showConfirmDialog(null, "O arquivo já existe!");
                    if (abrir != 0) {
                        //return false
                    }
                } else {
                    File dir = ficheiro2.getParentFile();
                    dir.mkdir();

                    try {
                        ficheiro2.createNewFile();
                    } catch (IOException et) {
                        System.out.println("Não foi possível criar!");
                    }
                }
                try {
                    FileWriter f = new FileWriter(ficheiro2);
                    String texto2 = txpTexto.getText();
                    String linhas[] = texto2.split("\n");
                    for (String linha : linhas) {
                        f.write(linha + "\n");
                    }
                    f.close();
                } catch (IOException ef) {
                    System.out.println("Não foi possível salvar");
                }

            }
        }
    };

    Action Sair = new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    };

    Action Desfazer = new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            um.undo();
        }
    };

    Action Refazer = new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            um.redo();
        }
    };

    Action InserirImagem = new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {

            //invoca o seletor de arquivos
            JFileChooser inserirImagem = new JFileChooser();

            //parametriza os tipos de imagens que aplicação trabalhará
            FileNameExtensionFilter filtroImagem = new FileNameExtensionFilter("gif", "png", "jpg", "bmp");
            inserirImagem.setFileFilter(filtroImagem);

            //invoca o quadro de dialago
            int seleciona = inserirImagem.showOpenDialog(null);
            if (seleciona == inserirImagem.APPROVE_OPTION) {

                //obtem o arquivo
                File arquivo = inserirImagem.getSelectedFile();
                ImageIcon imgInserir = new ImageIcon(arquivo.getAbsolutePath());
                int posicaoImagem = txpTexto.getCaretPosition();
                txpTexto.setCaretPosition(posicaoImagem);
                txpTexto.insertIcon(imgInserir);
            }

        }
    };

    Action AlterarCor = new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {

            //Obtem os atributos atuais
            SimpleAttributeSet abributo = new SimpleAttributeSet(txpTexto.getCharacterAttributes());
            //seleciona a cor 
            Color cor = JColorChooser.showDialog(null, "Escolha a Cor", txpTexto.getSelectedTextColor());

            if (cor == null) {
                System.out.println("A cor não foi escolhida!");
            }

            //a cor das letras
            StyleConstants.setForeground(abributo, cor);
            // a cor do atributo ao texto
            txpTexto.setCharacterAttributes(abributo, false);
        }
    };

    Action Selecionar = new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {

            SimpleAttributeSet abributo = new SimpleAttributeSet(txpTexto.getCharacterAttributes());
            Color cor = JColorChooser.showDialog(null, "Seleciona a cor Realçada!", txpTexto.getSelectedTextColor());
            StyleConstants.setBackground(abributo, cor);
            txpTexto.setCharacterAttributes(abributo, false);

        }
    };
    
    Action iSobre = new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            sobre.setVisible(true);
        }
    };
    

}
