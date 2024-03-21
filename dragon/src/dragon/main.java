package dragon;
import javax.swing.*;
public class main {
	public static void main(String[] args) {
		String personagem = JOptionPane.showInputDialog(null, "digite um personagem");
		String nomeImagem = "";
		String Origem = "";
		switch(personagem) {
		case "Goku":
			Origem = "Planeta Sayajin";
			nomeImagem = "goku-icone";
			break;	
			
		case "Bulma":
			Origem = "Planeta Terra";
			nomeImagem = "bulma-icone";
			break;	
			
		case "Vegeta":
			Origem = "Planeta Sayajin";
			nomeImagem = "vegeta-icone";
			break;	
			
		case "Kuririn":
			Origem = "Planeta Terra";
			nomeImagem = "kuririn-icone";
			break;	
			
		case "Piccolo":
			Origem = "Planeta Namekusei";
			nomeImagem = "piccolo-icone";
			break;	
			
			default:
			Origem = "desconhecido";
			nomeImagem = "default";	
		}
		String caminhoImagem = String.format("./imagens/%s.png",nomeImagem);
		ImageIcon icone = new ImageIcon(caminhoImagem);
		String informacoesPersonagem = String.format("Personagem:"+"%s\n Origem: %s", personagem,Origem);JOptionPane.showConfirmDialog(null,informacoesPersonagem,"Descrição",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,icone);
		}
	}

