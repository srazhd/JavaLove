public class TestEnum {

    public static void main(String[] args) {
        for (EnumName en : EnumName.values()) {
            System.out.println(en.s + " " + en.sunamMet());
        }
    }

}

enum EnumName {

    sunam("Sunam1", 10) {
        int sunamMet() {
            return 10;
        }
    }, rakib("Rakib1", 20) {
        int sunamMet() {
            return 10;
        }
    }, saraf("Saraf1", 30) {
        int sunamMet() {
            return 10;
        }
    }, raz("Raz1", 50) {
        int sunamMet() {
            return 10;
        }
    };

    public String s;
    public int i;

    EnumName(String s, int i) {
        this.s = s;
        this.i = i;
    }

    abstract int sunamMet();

}