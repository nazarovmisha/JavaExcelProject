public enum StudyProfile {
    MEDICINE("Медицина"),
    PHYSICS("Физика"),
    MATHEMATICS("Математика"),
    LINGUISTICS  ("Лингвистика");
    public String profileName;
    StudyProfile(String profileName) {
        this.profileName = profileName;
    }
}