package oca.aufgabe07a;

import java.util.ArrayList;
import java.util.List;

public class Apartment {
    private List<Room> roomsList = new ArrayList<>();

    void addRoom(Room room) {

        switch (room.name){
//            case Toilet.name:
//                if (room.getClass() == SleepRoom.class) throw new MaxRoomReachedExeption();
            case "2":
                if ((room.getClass() != SleepRoom.class)) throw new MaxRoomReachedExeption();
            default:
                roomsList.add(room);

        }
    }

    class MaxRoomReachedExeption extends RuntimeException {
        @Override
        public String getMessage() {
            return "Maximum Number of Rooms reached";
        }
    }
}
