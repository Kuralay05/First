package HomeWork;

public class Firma {
    public static void main (String[] args){
        Phone myPhone = new Phone("87086559700", "Iphone 12", 234.9, "Apple", 2020);
        int year = myPhone.firm.getYear();
        System.out.println(myPhone.Updates(year));
    }
}
