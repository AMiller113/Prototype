package com.example.prototype;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class UserData implements Serializable {
    private static final String user_data_path = "user.bin";
    private boolean preferences_quiz_completed;
    private boolean personality_quiz_completed;
    private boolean topic_quiz_completed;
    private List<String> added_users;
    private List<String> test_numbers;
    private static UserData current_user;

    private UserData(){
        personality_quiz_completed = false;
        preferences_quiz_completed = false;
        topic_quiz_completed = false;
        added_users = new LinkedList<>();
    }

    public static UserData getInstance(){
        if(current_user!=null){
            return current_user;
        }
        else {
            current_user = new UserData();
            return current_user;
        }
    }

    public void Save(){
        try(FileOutputStream fileOutputStream = new FileOutputStream(user_data_path)){
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(current_user);
            objectOutputStream.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public static boolean Load(){
        try(FileInputStream fileInputStream = new FileInputStream(user_data_path)){
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
            current_user = (UserData) inputStream.readObject();
        }
        catch (IOException e){
            e.printStackTrace();
            return false;
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean getPreferencesQuizCompleted(){
        return preferences_quiz_completed;
    }

    public boolean getPersonalityQuizCompleted(){
        return personality_quiz_completed;
    }

    public boolean getTopicsQuizCompleted(){
        return topic_quiz_completed;
    }

    public void setPreferencesQuizCompleted(boolean isComplete){
        preferences_quiz_completed = isComplete;
    }

    public void setPersonalityQuizCompleted(boolean isComplete){
        personality_quiz_completed = isComplete;
    }

    public void setTopicsQuizCompleted(boolean isComplete){
        topic_quiz_completed = isComplete;
    }
}
