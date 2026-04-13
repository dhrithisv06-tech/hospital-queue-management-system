package Hospital1Project;

public class Doctor extends Thread {
	private HospitalQueue queue;
    private String doctorName;

    public Doctor(String name, HospitalQueue queue) {
        this.doctorName = name;
        this.queue = queue;
    }

    public void run() {
        while (true) {
            Patient p = queue.getPatient();

            System.out.println(doctorName + " treating " + p);

            FileLogger.log(doctorName + " treated " + p);

            DatabaseHandler.insertPatient(p);

            try {
                Thread.sleep(2000);
            } catch (Exception e) {}
        }
    }

}
