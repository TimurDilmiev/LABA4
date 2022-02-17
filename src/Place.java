public class Place {
    protected String name;
    public Place(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public static class home{
        public String home(){
            return ("В доме");
        }
    }
    public static class room{
        public String room(){
            return (" В светлой, просторной комнате, стены которой были украшены портретами Роланда," +
                    "Мимишки и каких-то других собак. Посреди комнаты стояли три кровати.");

        }
    }
    public static class view{
        public String view(){
            return ("Мимишки и каких-то других собак. Посреди комнаты стояли три кровати.");
        }
    }
}
