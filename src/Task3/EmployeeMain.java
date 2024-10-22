package Task3;

public class EmployeeMain {
    public static void main(String[] args) {
        String[] skills={"Java", "JAvaSript", "SQL"};

        EmployeeModel model= new EmployeeModel("Jeevan", 70, 5.9, 50.49, true, skills);
        EmployeeView view=new EmployeeView();
        EmployeeController controller=new EmployeeController(model, view);
        controller.updateView();
    }
}
