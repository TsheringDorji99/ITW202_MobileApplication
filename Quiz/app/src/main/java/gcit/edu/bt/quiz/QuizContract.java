package gcit.edu.bt.quiz;

import android.provider.BaseColumns;

public final class QuizContract {
    private QuizContract() {
    }
        public static class QuestionsTable implements BaseColumns {
        public static final String TABLE_NAME = "Questions";
        public static final String COLUMN_QUESTION = "Question";
        public static final String COLUMN_OPTION1 = "Option1";
        public static final String COLUMN_OPTION2 = "Option2";
        public static final String COLUMN_OPTION3 = "Option3";
        public static final String COLUMN_OPTION4 = "Option4";
        public static final String COLUMN_ANSWER_NR = "Answer";
    }
}
