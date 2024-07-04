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

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        if (this.day < 30) {
            this.day += 1;
        } else if (this.day == 30) {
            this.day = 1;

            if (this.month < 12) {
                this.month += 1;
            } else if (this.month == 12) {
                this.month = 1;
                this.year += 1;
            }
        }
    }
    
    public void advance(int howManyDays) {
        if (this.day + howManyDays <= 30) {
            this.day += howManyDays;
        } else if (this.day + howManyDays > 30) {
            this.day = (this.day + howManyDays) % 30;

            if (this.month < 12) {
                this.month += 1;
            } else if (this.month == 12) {
                this.month = 1;
                this.year += 1;
            }
        }
    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate clone = new SimpleDate(this.day, this.month, this.year);
        for (int i = 0; i < days; i++) {
            clone.advance();
        }
        return clone;
    }
}
