import java.util.ArrayList;

public class Hallway1 extends State{
	private Model model;
	
	public Hallway1(Model model) {
		this.model = model;
	}
	@Override
	public String getDescription() {
		String description ="You choose to help the shy girl because you are really good at art. You leave the cafeteria and are in the hallway about to exit the school. You end up running into your best friend. Do you want to walk home with her?";
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
			model.setCurrentState(StateType.LivingRoom1);
		}
		if(choice == 2) {
			model.setCurrentState(StateType.LivingRoom1);
		}
	}
}