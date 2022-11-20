package imagem;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ImagemService {

	public static final  String EXTENSAO = "png";
	
	public void salva(String nomeArquivo, String url) throws MalformedURLException, IOException {
		BufferedImage img = ImageIO.read(new URL(url));
		File file = new File(nomeArquivo + "." + EXTENSAO);
		ImageIO.write(img, EXTENSAO, file);
	}
	
	public static void main(String[] args) throws MalformedURLException, IOException {
		new ImagemService().salva("imagens/1", "https://static.wikia.nocookie.net/marvel-cosmic/images/9/99/Capit%C3%A3o_America.jpg/revision/latest?cb=20150715013805&path-prefix=pt-br");
	}
}
