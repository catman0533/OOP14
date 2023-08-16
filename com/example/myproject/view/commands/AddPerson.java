                  


// import com.example.myproject.view.ConsoleUI;



public class AddPerson extends Command{

    public AddPerson(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Добавить студента";
    }

    public void execute(){
        consoleUI.addPerson();
    }
}