public class test {
    public class student {
        private string rollNo;
        private string name;

        public String getRollNo() {
            return rollNo;
        }

        public void setRollNo(String rollNo) {
            this.rollNo = rollNo;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public class studentview {
        public void printStudentDetails(String studentDetail) {
            this.studentDetail = studentDetail;
        }
    }

    public class studentController {
        private student Model;
        private studentview view;

        public studentController(student model, studentView view) {
            this.model = model;
            this.view = view;
        }

        public void setstudentName(String studentName) {
            modle.setName(name);
        }

        public String getstudentName() {
            return model.getName();
        }

        public void setStudentRollNo(String StudentRollNo) {
            model.getRollNo(RollNo);
        }

        public String getStudentRollNo(String StudentRollNo) {
            return model.getRollNo();
        }

        public void updateView() {
            view.printStudentDetails(model.getName(), model.getRollNO());
        }
    }
}