public enum Gender {
    MALE("МУЖСКОЙ", ""),
    FEMALE("ЖЕНСКИЙ", "а");

    private final String gender;
    private final String genderCase;

    Gender(String gender, String genderCase) {
        this.gender = gender;
        this.genderCase = genderCase;
    }

    public String getGender() {
        return gender;
    }

    public String getGenderCase() {
        return genderCase;
    }
}

