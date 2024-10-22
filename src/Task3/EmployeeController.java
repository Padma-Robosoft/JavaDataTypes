package Task3;

public class EmployeeController {
    private EmployeeModel model;
    private EmployeeView view;

    public EmployeeController(EmployeeModel model, EmployeeView view){
        this.model=model;
        this.view=view;
    }

    public void updateView(){
        String fullName="Mr. "+model.getName()+" Jain";
        long ageInSeconds=model.getAge()*365l*24*60*60;
        int numberOfSkills=model.getSkills().length;
        long roundedWeight=Math.round(model.getWeight());

        view.printEmployeeDetails(model.getName(), fullName, ageInSeconds, numberOfSkills, roundedWeight);
    }
}
