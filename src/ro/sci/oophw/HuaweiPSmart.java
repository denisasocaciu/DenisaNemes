package ro.sci.oophw;

public class HuaweiPSmart extends Phone {
    private static final int BATTERY_LIFE = 60;
    private String color;
    private String material;

    HuaweiPSmart(String IMEI) {
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

