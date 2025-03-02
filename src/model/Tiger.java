package model;

public class Tiger extends Mammal{

        //    public Tiger(){
        //        super(4,"Tigru", 36.0f, 92.0f);
        //    }
        public Tiger() {
            this.setNrOfLegs(4);
            this.setName("Tiger");
            this.setNormalBodyTemp(37.0f);
            this.setPercBodyHair(85.4f);
        }

        public Tiger(Integer nrOfLegs, String name, float normalBodyTemp, float percBodyHair) {
            super(nrOfLegs, name, normalBodyTemp, percBodyHair);
        }


}
