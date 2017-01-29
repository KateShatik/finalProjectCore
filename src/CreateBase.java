/**
 * Created by Катя on 30.01.2017.
 */
// Данный класс создан для администрирования и тестирования системы

public class CreateBase {

    static RoomDAO roomDAO = RoomDAO.getRoomDAO();
    static UserDAO userDAO = UserDAO.getUserDAO();
    static HotelDAO hotelDAO = HotelDAO.getHotelDAO();

    public static void main(String[] args) {
        //  createBase();












//        Hotel hotel = new Hotel(999, "NewHotel", "Krakov");
//        HotelDAO.getHotelDAO().add(hotel);    // добавили отель
//        Room room = new Room(888, 1000, 5, hotel);
//        RoomDAO.getRoomDAO().add(room);  // добавили комнату в новый отель
//        HotelDAO.getHotelDAO().edit(new Hotel(999, "OldHotel", "Krakov")); //изменили название отеля
//        HotelDAO.getHotelDAO().getBase().stream().forEach(System.out::println);
    }


    // Вызываем этот метод когда хотим создать базу с нуля.
    // Как в задании: три города, по два отеля в каждом городе, по 10 комнат в каждом отеле
    static void createBase (){
        userDAO.add(new User(100, "slava", "qwert"));
        userDAO.add(new User(101, "alex", "qwert"));
        userDAO.add(new User(102, "nata", "qwert"));
        userDAO.add(new User(103, "vadim", "qwert"));
        userDAO.add(new User(104, "andrey", "qwert"));
        Hotel h1 = new Hotel(200, "Desna", "Kiev");
        Hotel h2 = new Hotel(201, "Mir", "Kiev");
        Hotel h3 = new Hotel(202, "More", "Odessa");
        Hotel h4 = new Hotel(203, "Briz", "Odessa");
        Hotel h5 = new Hotel(204, "Lev", "Lviv");
        Hotel h6 = new Hotel(205, "Trizub", "Lviv");
        hotelDAO.add(h1);
        hotelDAO.add(h2);
        hotelDAO.add(h3);
        hotelDAO.add(h4);
        hotelDAO.add(h5);
        hotelDAO.add(h6);
        roomDAO.add(new Room(300, 200, 2, h1));
        roomDAO.add(new Room(301, 300, 3, h1));
        roomDAO.add(new Room(302, 350, 3, h1));
        roomDAO.add(new Room(303, 180, 1, h1));
        roomDAO.add(new Room(304, 250, 2, h1));
        roomDAO.add(new Room(305, 170, 1, h1));
        roomDAO.add(new Room(306, 220, 1, h1));
        roomDAO.add(new Room(307, 305, 2, h1));
        roomDAO.add(new Room(308, 230, 3, h1));
        roomDAO.add(new Room(309, 360, 2, h1));
        roomDAO.add(new Room(310, 300, 2, h2));
        roomDAO.add(new Room(311, 400, 3, h2));
        roomDAO.add(new Room(312, 450, 3, h2));
        roomDAO.add(new Room(313, 280, 1, h2));
        roomDAO.add(new Room(314, 500, 2, h2));
        roomDAO.add(new Room(315, 370, 1, h2));
        roomDAO.add(new Room(316, 340, 1, h2));
        roomDAO.add(new Room(317, 420, 2, h2));
        roomDAO.add(new Room(318, 380, 3, h2));
        roomDAO.add(new Room(319, 490, 2, h2));
        roomDAO.add(new Room(320, 200, 2, h3));
        roomDAO.add(new Room(321, 300, 3, h3));
        roomDAO.add(new Room(322, 350, 3, h3));
        roomDAO.add(new Room(323, 180, 1, h3));
        roomDAO.add(new Room(324, 250, 2, h3));
        roomDAO.add(new Room(325, 170, 1, h3));
        roomDAO.add(new Room(326, 220, 1, h3));
        roomDAO.add(new Room(327, 305, 2, h3));
        roomDAO.add(new Room(328, 230, 3, h3));
        roomDAO.add(new Room(329, 360, 2, h3));
        roomDAO.add(new Room(330, 300, 2, h4));
        roomDAO.add(new Room(331, 400, 3, h4));
        roomDAO.add(new Room(332, 450, 3, h4));
        roomDAO.add(new Room(333, 280, 1, h4));
        roomDAO.add(new Room(334, 500, 2, h4));
        roomDAO.add(new Room(335, 370, 1, h4));
        roomDAO.add(new Room(336, 340, 1, h4));
        roomDAO.add(new Room(337, 420, 2, h4));
        roomDAO.add(new Room(338, 380, 3, h4));
        roomDAO.add(new Room(339, 490, 2, h4));
        roomDAO.add(new Room(340, 200, 2, h5));
        roomDAO.add(new Room(341, 300, 3, h5));
        roomDAO.add(new Room(342, 350, 3, h5));
        roomDAO.add(new Room(343, 180, 1, h5));
        roomDAO.add(new Room(344, 250, 2, h5));
        roomDAO.add(new Room(345, 170, 1, h5));
        roomDAO.add(new Room(346, 220, 1, h5));
        roomDAO.add(new Room(347, 305, 2, h5));
        roomDAO.add(new Room(348, 230, 3, h5));
        roomDAO.add(new Room(349, 360, 2, h5));
        roomDAO.add(new Room(350, 300, 2, h6));
        roomDAO.add(new Room(351, 400, 3, h6));
        roomDAO.add(new Room(352, 450, 3, h6));
        roomDAO.add(new Room(353, 280, 1, h6));
        roomDAO.add(new Room(354, 500, 2, h6));
        roomDAO.add(new Room(355, 370, 1, h6));
        roomDAO.add(new Room(356, 340, 1, h6));
        roomDAO.add(new Room(357, 420, 2, h6));
        roomDAO.add(new Room(358, 380, 3, h6));
        roomDAO.add(new Room(359, 490, 2, h6));

    }
}
