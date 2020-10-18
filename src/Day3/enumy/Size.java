package Day3.enumy;

public enum Size {

    XS("super mały"){
        @Override
        public String getDescription(){
            return "Malutki";
        }
    },
    S("mały"),
    M("średni"),
    L("duży"),
    XL("super duży");

    private final String description;

    Size(String description){
        this.description = description;
    }

    public String getDescription(){
       return description;
    }


    public static void main(String[] args) {

        System.out.println(Size.L.getDescription());
        System.out.println(Size.L);
        System.out.println(Size.valueOf("M"));
        System.out.println(Size.L.ordinal());

        Size size = Size.valueOf("XS");
        System.out.println(size);
        System.out.println(size.toString());
    }
}
