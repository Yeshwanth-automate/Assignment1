import java.util.ArrayList;

public class Project {


    private String projectname;
    private int id;
    private String startdate;
    private String enddate;

    @Override
    public String toString() {
        return "Project{" +
                "projectname='" + projectname + '\'' +
                ", id=" + id +
                ", startdate='" + startdate + '\'' +
                ", enddate='" + enddate + '\'' +
                '}';
    }
    static int i=1;
    public Project(String projectname, String startdate, String enddate) {
        this.projectname = projectname;
        this.startdate = startdate;
        this.enddate = enddate;
        this.id=i++;


    }

    public String getProjectname() {
        return projectname;
    }

    public int getId() {
        return id;
    }

    public String getStartdate() {
        return startdate;
    }

    public String getEnddate() {
        return enddate;
    }
}
