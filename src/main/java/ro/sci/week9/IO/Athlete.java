package main.java.ro.sci.week9.IO;

    public class Athlete {
        private int id;
        private String name;
        private String country;
        private String skiTime;
        private String firstShootResult;
        private String secondShootResult;
        private String thirdShootResult;
        private int totalTime;
        private int penalty;


        @Override
        public String toString() {
            return "{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", country='" + country + '\'' +
                    ", totalTime=" + (totalTime / 60) + ":" + (totalTime % 60) +
                    ", skiTime=" + skiTime +
                    ", penalty=" + penalty +
                    '}';
        }

        public Athlete(int id, String name, String country, String skiTime, String firstShootResult, String secondShootResult, String thirdShootResult) {
            this.id = id;
            this.name = name;
            this.country = country;
            this.skiTime = skiTime;
            this.firstShootResult = firstShootResult;
            this.secondShootResult = secondShootResult;
            this.thirdShootResult = thirdShootResult;
            calculateTotalTime();
        }


        public int getTotalTime() {
            return totalTime;
        }

        public void calculateTotalTime() {

            String[] tokens = skiTime.split(":");
            int minutes = Integer.parseInt(tokens[0]);
            int seconds = Integer.parseInt(tokens[1]);

            String shootResults = firstShootResult + secondShootResult + thirdShootResult;

            for (int j = 0; j < shootResults.length(); j++) {
                if (shootResults.charAt(j) == 'o') {
                    penalty += 10;
                }
            }

            totalTime = minutes * 60 + seconds + penalty;


        }
    }
