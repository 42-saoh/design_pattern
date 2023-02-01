package strategy.one;

public class Subject {
    private String name;
    private int scorePoint;
    private int majorCode;
    private EvaluationStrategy strategy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScorePoint() {
        return scorePoint;
    }

    public void setScorePoint(int scorePoint) {
        this.scorePoint = scorePoint;
    }

    public int getMajorCode() {
        return majorCode;
    }

    public void setMajorCode(int majorCode) {
        this.majorCode = majorCode;
        switch (majorCode) {
            case Student.MAJOR -> strategy = new MajorEvaluationStrategy();
            case Student.BASIC -> strategy = new BasicEvaluationStrategy();
            default -> {}
        }
    }

    public String getGrade() {
        return strategy.evaluate(scorePoint);
    }
}
