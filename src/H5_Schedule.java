import java.util.Arrays;
public class H5_Schedule {
        private String [][] schedule= new String[7][2];

        public H5_Schedule(String[][] schedule){
            this.schedule=schedule;
        }

        public String[][] getSchedule() {
            return schedule;
        }

        public void setSchedule(String[][] schedule) {
            this.schedule = schedule;
        }

        @Override
        public String toString() {
            return "Schedule{" +
                    "schedule=" + Arrays.toString(schedule) +
                    '}';
        }
    }
