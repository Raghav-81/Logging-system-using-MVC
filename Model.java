public class Model {
    private String firstname;
    private String lastname;
    private String time;
    public Model(String firstname, String lastname, String time) {
     this.firstname = firstname;
     this.lastname = lastname;
     this.time = time;
    }
    public String getFirstname() {
     return firstname;
    }
    public void setFirstname(String firstname) {
     this.firstname = firstname;
    }
    public String getLastname() {
     return lastname;
    }
    public void setLastname(String lastname) {
     this.lastname = lastname;
    }

    public String gettime() {
        return time;
    }
    public void settime(String time) {
        this.time = time;
       }
   }