import java.util.ArrayList;

public class Departments implements UniversityCampus{ //composite

    private int floor;
    private String departmentName;

    private ArrayList<UniversityCampus> departmentElements=new ArrayList<>();

    public Departments(String departmentName,int floor) {
        this.departmentName=departmentName;
        this.floor = floor;
    }

    @Override
    public void Add(UniversityCampus universityCampus) {
        departmentElements.add(universityCampus);
    }

    @Override
    public void Remove(UniversityCampus universityCampus) {
        for (int i = 0; i< departmentElements.size(); i++) {
            if (departmentElements.get(i).getName() == universityCampus.getName()) {
                departmentElements.remove(i);
                return;
            }
        }

    }

    @Override
    public void Display(int idx) {

    }

    @Override
    public String getName() {
        return departmentName;
    }
}
