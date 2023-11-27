import java.util.ArrayList;

public class NutralEnding4 extends State{
private Model model;
	
	public NutralEnding4(Model model) {
		this.model = model;
	}

	@Override
	public String getDescription() {
		String description = "You choose not to talk to your friend. After the show you go home. Ending 6 of 10. Would you like to start a new game?";
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
