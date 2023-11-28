public class LecturerMarks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks for Java programming: ");
        int javaMarks = scanner.nextInt();

        System.out.println("Enter marks for Networking: ");
        int networkingMarks = scanner.nextInt();

        System.out.println("Enter marks for Maths: ");
        int mathsMarks = scanner.nextInt();

        double averageMarks = (javaMarks + networkingMarks + mathsMarks) / 3.0;

        System.out.println("Marks for Java programming is: " + javaMarks);
        System.out.println("Marks for Networking is: " + networkingMarks);
        System.out.println("Marks for Maths is: " + mathsMarks);
        System.out.println("The average is: " + averageMarks);
    }
}