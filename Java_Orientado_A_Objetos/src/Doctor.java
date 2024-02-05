public class Doctor {
    // Atributos
    static Integer id=0;
    private String name;
    private String speciality;

    Doctor(){
        System.out.println("Construyendo el objeto doctor");

    }

    public Doctor(String name, String speciality) {
        id++;
        this.name = name;
        this.speciality=speciality;
    }

    // Metodos
    protected void showName(){
        System.out.println(name);
    }

    protected void showId(){
        System.out.println("ID Doctor: "+id);
    }
}