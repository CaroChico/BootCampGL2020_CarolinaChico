package hibernate.example;

import hibernate.example.dao.MenuDao;
import hibernate.example.entity.Menu;

public class ExampleApplication2 {

	public static void main(String[] args) {

		MenuDao menuDao = new MenuDao();

		menuDao.createMenu(new Menu("Milanesa Clasica",
				"una delicada milanesa con crocantes papas fritas finamente seleccionadas", 500));

		menuDao.createMenu(new Menu("Lomo al Piedra",
				"un curioso plato donde se utilizan piedras calentadas al rojo vivo para cocinar el\r\n"
						+ "lomo junto a especias orientales y sudamericanas logrando un elixir entre la textura y el sabor",
				750));

		System.out.println(menuDao.getMenu());
	}

}
