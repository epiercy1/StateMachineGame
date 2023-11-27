import java.util.ArrayList;

public class LivingRoom4 extends State{
private Model model;
	
	public LivingRoom4(Model model) {
		this.model = model;
	}

	@Override
	public String getDescription() {
		String description = "Your friend tells you that she wants to walk home alone today and so you walk home alone as well. The next day you and your friend are in your living room. You are working on the songs for the musical. Out of nowhere, she tells you she is in love with you. Do you want to confess your love to her?";
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
			model.setCurrentState(StateType.TrueEnding1);
		}
		if(choice == 2) {
			model.setCurrentState(StateType.Backstage4);
		}
	}
}