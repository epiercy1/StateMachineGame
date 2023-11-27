import java.util.ArrayList;

public class FrontLawn2 extends State{
private Model model;
	
	public FrontLawn2(Model model) {
		this.model = model;
	}
	@Override
	public String getDescription() {
		String description = "You and the cute girl go to the front lawn. She is just about to leave after a few more hours. Just then your best friend shows up. The cute girl leaves us alone to talk for a while. Out of nowhere, she tells you she is in love with you. Do you want to confess your love to her?";
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
			model.setCurrentState(StateType.TrueEnding2);
		}
		if(choice == 2) {
			model.setCurrentState(StateType.Backstage2);
		}
		
	}

}