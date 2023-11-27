import java.util.ArrayList;

public class Backstage4 extends State{
private Model model;
	
	public Backstage4(Model model) {
		this.model = model;
	}

	@Override
	public String getDescription() {
		String description = "It is now opening night of the Musical one week later. You and the other girls are watching the show play out backstage. You see that your friend is alone. You and her have not seen eachother since you rejected her. Would you like to talk to her?";
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
			model.setCurrentState(StateType.GoodEnding4);
		}
		if(choice == 2) {
			model.setCurrentState(StateType.NutralEnding4);
		}
	}
}

