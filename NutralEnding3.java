import java.util.ArrayList;

public class NutralEnding3 extends State{
private Model model;
	
	public NutralEnding3(Model model) {
		this.model = model;
	}

	@Override
	public String getDescription() {
		String description = "You choose not to join the club. You leave the auditorium. Ending 3 of 10. Would you like to start a new game?";
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