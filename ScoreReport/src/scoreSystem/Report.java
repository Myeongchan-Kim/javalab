package scoreSystem;

public interface Report {
	final int MAX_SCORE = 100;
	final int MIN_SCORE = 0;
	public abstract char	majorGrade(int score);
	public abstract char	minorGrade(int score);
	public abstract Student reportStudent(Student st);
	public abstract void reportSchool();
	public abstract void printStuList();
}
