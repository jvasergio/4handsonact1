class BloodData {
    static String bloodType;
    static String rhFactor;
    public BloodData(){
        bloodType = "O";
        rhFactor = "+";
    }
    public BloodData(String bt, String rh){
        bloodType=bt;
        rhFactor=rh;
    }
    public static void display(){
        System.out.print(bloodType);
        System.out.print(rhFactor);
        System.out.println(" is added to he blood bank.");
    }
}