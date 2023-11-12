public class main {

        public static void main(String[] args) {
            Branch.Teacher[] teachers = new Branch.Teacher[4];
            teachers[0] = new Branch.Teacher(1, Branch.MATH);
            teachers[1] = new Branch.Teacher(2, Branch.PHYSICS);
            teachers[2] = new Branch.Teacher(3, Branch.CS);
            teachers[3] = new Branch.Teacher(4, Branch.ENG);

            for (Branch.Teacher teacher : teachers) {
                System.out.println("Branch.Teacher ID: " + teacher.getId());
                System.out.println("Branch: " + teacher.getBranch().getDescription());
                System.out.println();
            }
        }
    }
