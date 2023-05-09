import java.util.ArrayList;

public class Classrooms implements UniversityCampus { //leaf

    private int floor;
    private String classroomName;

    private ArrayList<UniversityCampus> classroomElements=new ArrayList<>();

    public Classrooms(String classroomName, int floor) {
        this.classroomName = classroomName;
        this.floor=floor;
    }

    @Override
    public void Add(UniversityCampus universityCampus) {
        classroomElements.add(universityCampus);
    }

    @Override
    public void Remove(UniversityCampus universityCampus) {
        for (int i = 0; i< classroomElements.size(); i++) {
            if (classroomElements.get(i).getName() == universityCampus.getName()) {
                classroomElements.remove(i);
                return;
            }
        }
    }

    @Override
    public void Display(int idx) {

    }

    @Override
    public String getName() {
        return classroomName;
    }
}
