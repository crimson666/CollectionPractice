package CoolStuff;

public enum colorEnums {
    RED("red"),GREEN("green"),YELLOW("yellow");
    private String value;
    colorEnums(String value) {
        this.value = value;
    }
    public String getColor(){
        return this.value;
    }
}
