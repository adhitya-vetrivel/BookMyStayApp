/**
 * =======================================================================
 * MAIN CLASS - UseCase2RoomInitialization
 * =======================================================================
 *
 * Use Case 2: Basic Room Types & Static Availability
 *
 * Description:
 * This class demonstrates room initialization
 * using domain models before introducing
 * centralized inventory management.
 *
 * Availability is represented using
 * simple variables to highlight limitations.
 *
 * @version 2.0
 */
public class UseCase2RoomInitialization {

    /**
     * Application entry point.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hotel Room Initialization\n");

        SingleRoom singleRoom = new SingleRoom();
        int singleRoomAvailable = 5;
        System.out.println("Single Room:");
        singleRoom.displayRoomDetails();
        System.out.println("Available: " + singleRoomAvailable + "\n");

        DoubleRoom doubleRoom = new DoubleRoom();
        int doubleRoomAvailable = 3;
        System.out.println("Double Room:");
        doubleRoom.displayRoomDetails();
        System.out.println("Available: " + doubleRoomAvailable + "\n");

        SuiteRoom suiteRoom = new SuiteRoom();
        int suiteRoomAvailable = 2;
        System.out.println("Suite Room:");
        suiteRoom.displayRoomDetails();
        System.out.println("Available: " + suiteRoomAvailable);
    }
}
