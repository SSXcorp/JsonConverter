public class Main {
    public static void main(String[] args) {
        Address addressObj = new Address();
        addressObj.setCity("Chicago");
        addressObj.setStreet("Some Street");
        addressObj.setZip(12345);

        Id idObj = new Id();
        idObj.setAddress(addressObj);
        idObj.setFname("Test");
        idObj.setLname("Tester");

        System.out.println(ObjectConverterToJson.convert(idObj));
        // to prevent exception write to console : java --add-opens java.base/java.lang=ALL-UNNAMED
        // to be able to get private fields
    }
}