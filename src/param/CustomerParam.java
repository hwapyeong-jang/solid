package param;

public class CustomerParam {

    private String name;
    private Integer age;

    // View 가 변경되어 필드가 추가됨
    private Type type;
    private String firstName;
    private String lastName;

    public CustomerParam(String name, Integer age, Type type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public CustomerParam(String firstName, String lastName, Integer age, Type type) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public Type getType() {
        return this.type;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public enum Type {
        LOCAL,
        FOREIGN;

        public boolean isLocal() {
            return this == LOCAL;
        }

        public boolean isForeign() {
            return this == FOREIGN;
        }
    }
}
