public class PeopleMOVES extends PeopleINT {
    PeopleMOVES(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
        if (gender.equals(Gender.FEMALE)) {
            ending = "ла";
        } else ending = "л";

    }

    public String sit() {
        return (name + " " + "присел");
    }

    public String caress(ObjectsACLASS o) {
        return ("принялся гладить" + " " + o.getName() + ".");
    }

    public String write(ObjectsACLASS c) {
        return (name + " " + "записал" + " " + c.getName());
    }

    public String and() {
        return ("и" + " ");
    }

    public String whoNamed() {
        return ("которую, кстати сказать, звали" + " " + getName());
    }

    public String then() {
        return ("а также");
    }

    public String afterThat() {
        return ("после чего");
    }

    public String say1() {
        return ("сказал");
    }

    public String mustPay() {
        return ("что" + " " + name + " " + "должен уплатить");
    }

    public String ifCant() {
        return ("если же у него нет, то чтоб принес, как только");
    }

    public String receive(ObjectsACLASS m) {
        return ("получит" + " " + m.getName() + ".");
    }

    public String onThis(ObjectsACLASS f) {
        try {
            return "На этом" + " " + f.getName() + " " + "были закончены,";
        } catch (MyException fdf) {
            System.out.println(fdf);
        }
        return null;
    }

    public String deleted() {
        return name + " удалился";
    }
    public String together() {
        return " в сопровождении " + getName();
    }
        public String fell() {
            return ("покатилась на своих коротеньких лапках прямо к");
        }
        public String sittoo() {
            return ("тоже уселась у его ног.");
        }
        public String mustlive() {
            return (" где теперь предстояло жить");
        }
        public String sleep() {
            return ("на них спали");
        }
    }
