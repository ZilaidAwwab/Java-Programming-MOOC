public class Main {
  public static void main(String[] args) {
    Person matti = new Person("Matti");
    matti.setHeight(180);

    Person juhana = new Person("Juhana");
    juhana.setHeight(132);

    Person awak = new Person("Awak");
    awak.setHeight(194);

    AmusementParkRide hurjakuru = new AmusementParkRide("Hurjakuru", 140);

    hurjakuru.isAllowedOn(matti);
    hurjakuru.isAllowedOn(juhana);
    hurjakuru.isAllowedOn(awak);

    System.out.println(hurjakuru);
    System.out.println(hurjakuru.averageHeightOfPeopleOnRide());

    System.out.println();
    System.out.println(hurjakuru.getTallest().getName());
    Person tallest = hurjakuru.getTallest();
    System.out.println(tallest.getName());
  }
}
