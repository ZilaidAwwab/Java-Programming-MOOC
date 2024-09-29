/*
 * One exception that the user does not have to prepare for is 
 * IllegalArgumentException. The IllegalArgumentException tells the user that the 
 * values given to a method or a constructor as parameters are wrong. It can be used 
 * when we want to ensure certain parameter values.
 */

public class ConditionedExceptions {
    
    public class Grade {
        private int grade;

        public Grade(int grade) {
            // The grade has to be an integer between 0 and 5. If it is something else, we want to throw an exception.
            if(grade < 0 || grade > 5) {
                throw new IllegalArgumentException("Grade must be between 0 and 5");
            }
            this.grade = grade;
        }

        public int getGrade() {
            return this.grade;
        }
    }
}
