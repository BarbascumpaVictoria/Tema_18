class Employee {
    public String name;
    public String department;
    public boolean canConductInterview;
    public boolean canAttendTraining;
    public boolean isPayedPerHour;
    public int age;

    public Employee(String name, String department,
                    boolean canConductInterview, boolean canAttendTraining, boolean isPayedPerHour,int age) {
        this.name = name;
        this.department = department;
        this.canConductInterview = canConductInterview;
        this.canAttendTraining = canAttendTraining;
        this.isPayedPerHour = isPayedPerHour;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public boolean canConductInterview() {
        return canConductInterview;
    }
    public boolean canAttendTraining() {
        return canAttendTraining;
    }
    public int getAge() {
        return age;
    }
    public boolean getisPayedPerHour() {
        return isPayedPerHour;
    }


    @Override
    public String toString() {
        return String.format("Employee[name=%s, department=%s, canConductInterview=%s, canAttendTraining=%s, age = %s, isPayedPerHour = %s]",
                name, department, canConductInterview, canAttendTraining, age, isPayedPerHour);
  }
}
