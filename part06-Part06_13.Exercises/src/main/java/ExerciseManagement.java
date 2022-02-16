
import java.util.ArrayList;


public class ExerciseManagement {
    ArrayList<String> exercises;
    
    public ExerciseManagement(){
        this.exercises = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.exercises.isEmpty();
    }
    
    public void addExercise(String exercise){
        this.exercises.add(exercise);
    }

    public ArrayList<String> getExercises() {
        return exercises;
    }
    
}
