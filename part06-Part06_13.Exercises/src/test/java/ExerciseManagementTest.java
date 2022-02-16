import static org.junit.Assert.assertEquals;
import org.junit.Test;




public class ExerciseManagementTest {
    
    @Test
    public void ExerciseManagementInitialValueEmpty(){
        ExerciseManagement exercises = new ExerciseManagement();
        assertEquals(true,exercises.isEmpty());
    }

    @Test
    public void AddingExerciseToExerciseManagement(){
        ExerciseManagement exercises = new ExerciseManagement();
        exercises.addExercise("Cwiczenie1");
        assertEquals(true, exercises.getExercises().contains("Cwiczenie1"));
    }
}
