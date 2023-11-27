import java.util.ArrayList;

public class TrueEnding2 extends State{
private Model model;
	
	public TrueEnding2(Model model) {
		this.model = model;
	}

	@Override
	public String getDescription() {
		String description = "You confess your love to your friend. She pulls you in for a kiss. Congraduations, you won the game! Ending 5 of 10. Would you like to start a new game?";
		return description;
	}

	@Override
	public ArrayList<String> getOptions() {
		ArrayList<String>getOptions = new ArrayList<String>();
		getOptions.add("Type 1 for yes");
		getOptions.add("Type 2 for no");
		return getOptions;
	}

	@Override
	public void processChoice(int choice) {
		if(choice == 1) {
			model.setCurrentState(StateType.StreetOutsideHouse);
		}
		if(choice == 2) {
			model.setCurrentState(StateType.EndOfGame);
		}
		
	}
	
}