import java.util.LinkedList;
import java.util.Queue;

public class QueueCaseStudy {
    private static void printQueue(Queue<String> queue) {
        if (queue.isEmpty()) {
            System.out.println("Queue ว่างเปล่า ไม่มีผู้ป่วยรอ");
            return;
        }
        int position = 1;
        for (String patient : queue) {
            String label = (position == 1) ? "หน้าแถว" : "          ";
            System.out.println(label + patient + " ลำดับที่ " + position + "");
            position++;
        }
    }

    public static void main(String[] args) {
        Queue<String> patientQueue = new LinkedList<>();

        patientQueue.add("P001");
        patientQueue.add("P002");
        patientQueue.add("P003");
        patientQueue.add("P004");
        patientQueue.add("P005");

        System.out.println("สถานะ Queue เริ่มต้น");
        printQueue(patientQueue);

        System.out.println("เรียกผู้ป่วยเข้ารับบริการ 2 คน");
        for (int i = 1; i <= 2; i++) {
            if (!patientQueue.isEmpty()) {
                String servedPatient = patientQueue.remove();
                System.out.println("เรียกคนที่ " + i + ": " + servedPatient + " เข้ารับบริการ");
            }
        }

        System.out.println("ตรวจสอบผู้ป่วยคนถัดไป");
        if (!patientQueue.isEmpty()) {
            System.out.println("ผู้ป่วยคนถัดไปที่จะได้รับบริการคือ: " + patientQueue.peek());
        } else {
            System.out.println("ไม่มีผู้ป่วยรออยู่");
        }

        System.out.println("มีผู้ป่วยรออยู่ทั้งหมด " + patientQueue.size() + " คน");

        System.out.println("สถานะ Queue สุดท้าย");
        printQueue(patientQueue);
    }
}
