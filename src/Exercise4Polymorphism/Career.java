package Exercise4Polymorphism;

import java.util.List;

public class Career {
    public static void main(String[] args) {
       /* new Doctor().perform();
        new GP().perform();
        new Surgeon().perform();*/

        Doctor doctor = new Doctor();
        GP gp = new GP();
        Surgeon surgeon = new Surgeon();

        List<Doctor> doctors = List.of(doctor, gp, surgeon);
        for (Doctor doctor1 : doctors) {
            doctor1.perform();
            System.out.println();
        }
    }
}
