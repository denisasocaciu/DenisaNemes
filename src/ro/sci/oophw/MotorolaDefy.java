package ro.sci.oophw;

    public class MotorolaDefy extends Motorola {


        private static final int BATTERY_LIFE = 20;
        private String color;
        private String material;

        MotorolaDefy(String IMEI) {
            setIMEI(IMEI);
            setCurrentBatteryLevel(BATTERY_LIFE);
        }

        public static int getBatteryLife() {
            return BATTERY_LIFE;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }


    }

