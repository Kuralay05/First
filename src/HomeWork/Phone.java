package HomeWork;
public class Phone {
    String number;
    String model;
    double weight;
    Firma firm;
    public Phone (String number, String model, double weight, String name, int year){
        this.number = number;
        this.weight = weight;
        this.model = model;
        this.firm = new Firma(name, year);
    }
   class Firma{
        String name;
        int year;
        public Firma (String name, int year){
            this.name = name;
            this.year = year;
        }
       public int getYear() {
           return year;
       }

       public String getName() {
           return name;
       }

       public void setName(String name) {
           this.name = name;
       }

       public void setYear(int year) {
           this.year = year;
       }
   }

    public String getNumber() {
        return this.number;
    }

    public String getModel() {
        return this.model;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public static String Updates (int year){
        if (year >=2019) return "Телефон поддерживает обновления";
        return "Телефон не будет обновляться";
    }
}
