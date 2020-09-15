package battleships.ships;

import battleships.ConsoleColors;

public class ShipsFactory {

    public static Ship carrier(){
        return new Ship(5,"Lotniskowiec", ConsoleColors.BLUE);
    }
    public static Ship warship(){
        return new Ship(4,"Wojownik", ConsoleColors.CYAN);
    }
    public static Ship cruiser(){
        return new Ship(3,"Krążownik", ConsoleColors.GREEN);
    }
    public static Ship destroyer(){
        return new Ship(2,"Niszczyciel", ConsoleColors.RED);
    }
    public static Ship submarine(){
        return new Ship(1,"Podwodny", ConsoleColors.YELLOW);
    }

}
