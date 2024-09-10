public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(SimpleDate other) {
        if (this.year < other.year) {
            return true;
        }

        if (this.year == other.year
                && this.month < other.month) {
            return true;
        }

        if (this.year == other.year
                && this.month == other.month
                && this.day < other.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(SimpleDate other) {
        if (earlier(other)) {
            return other.differenceInYears(this);
        }

        int yearRemoved = 0;

        if (this.month < other.month) {
            yearRemoved = 1;
        } else if (this.month == other.month && this.day < other.day) {
            yearRemoved = 1;
        }

        return this.year - other.year - yearRemoved;
    }

    /*
    *The hashCode method in Java is used to generate an integer value (the hash code) for
    * an object, which can be used in hashing-based data structures like HashMap, HashSet,
    * etc. The purpose of the hashCode method is to provide a way to efficiently locate
    * objects in collections by using their hash codes as keys. The hashCode must be
    * overridden when the equals method is overridden, to maintain the general contract
    * for hashCode.
    */
    @Override
    public int hashCode() {
        /*
        *Initial Hash Value: It starts with an initial hash value of 7.
        *This value is arbitrary, but it's often a small prime number.
        */
        int hash = 7;

        /*
        *89 is another arbitrary prime number used to reduce the likelihood of hash
        *collisions (different objects having the same hash code).
        */
        hash = 89 * hash + this.day;
        hash = 89 * hash + this.month;
        hash = 89 * hash + this.year;
        return hash;
    }
}

/*
*Criteria for a Good hashCode Implementation
1. Consistent with equals: If two objects are equal according to the equals method,
they must have the same hash code. This is the most critical criterion.

2. Consistent During Lifetime: The hashCode method should consistently return the same
integer value for the same object as long as it is not modified (the fields used to
compute hashCode remain unchanged).

3.Efficient Distribution: The hashCode method should distribute hash codes uniformly to
minimize collisions. This means that different objects should, as much as possible,
have different hash codes.
*/
