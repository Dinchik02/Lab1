
public class RunHouse {

    private final static int ROOM_NUMBER = 3;
    private final static int FROM_FLOOR = 1;
    private final static int TO_FLOOR = 4;
    private final static int AREA = 80;

    public static void getFlatWithRoomNumber(House[] houseMass, int number) {
        System.out.println("Task a: ");
        for (House house : houseMass) {
            if (house.getRoomNumber() == number) {
                System.out.println(house);
            }
        }
    }

    public static void getFlatBetweenFloors(House[] houseMass, int roomNumber, int fromFloor, int toFloor) {
        System.out.println("Task b: ");
        for (House house : houseMass) {
            if (house.getRoomNumber() == roomNumber && house.getFloor() >= fromFloor && house.getFloor() <= toFloor) {
                System.out.println(house);
            }
        }
    }

    public static void getFlatByArea(House[] houseMass, int area) {
        System.out.println("Task c: ");
        for (House house : houseMass) {
            String areaString = house.getArea();
            areaString = areaString.replace(areaString.substring(areaString.length()-2), "");
            int areaInt = Integer.parseInt(areaString);
            if (areaInt>area){
                System.out.println(house);
            }
        }
    }

    public static void main(String[] args) {
        House[] houseMass = {
                new House("Pushkina", "Duplex", "2a", 1, "100m2", 2, 4, "2015-2060"),
                new House("Pushkina", "Duplex", "1a", 1, "100m2", 1, 5, "2015-2060"),
                new House("Odesska", "Condominium", "3b", 2, "60m2", 4, 3, "2000-2030"),
                new House("Odesska", "Condominium", "3a", 2, "70m2", 4, 3, "2000-2030"),
                new House("Gogolya", "House", "16", 3, "180m2", 1, 6, "2013-2080"),
                new House("Gogolya", "Apartment block", "1a", 6, "100m2", 2, 3, "2015-2060"),
                new House("Univesity", "Apartment block", "18b", 4, "65m2", 8, 3, "2000-2030"),
                new House("Univesity", "Apartment block", "21a", 5, "110m2", 12, 4, "2000-2030"),
        };

        //        System.out.println(houseMass[1].toString());
        getFlatWithRoomNumber(houseMass, ROOM_NUMBER);
        getFlatBetweenFloors(houseMass, ROOM_NUMBER, FROM_FLOOR, TO_FLOOR);
        getFlatByArea(houseMass, AREA);
    }

}
