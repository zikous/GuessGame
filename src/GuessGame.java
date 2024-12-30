import controller.GameController;
import model.GameModel;
import view.GameView;

public class GuessGame {

	public static void main(String[] args) {
		GameView view = new GameView();
		GameModel model = new GameModel();
		GameController controller = new GameController(model, view);
		controller.run();

	}

}
