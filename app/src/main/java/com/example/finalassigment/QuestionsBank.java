package com.example.finalassigment;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    private static List<QuestionsList> Questions1() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Create object of QuestionsList class and pass a questions along with options and answer
        final QuestionsList question1 = new QuestionsList("I _____ tennis every Sunday morning.","play", "playing", "am playing", "am play","play");
        final QuestionsList question2 = new QuestionsList("Sorry, she can't come to the phone. She _____ her dinner!","is having", "having", "has", "have","is having");
        final QuestionsList question3 = new QuestionsList("_____ many times every winter in Frankfurt.","It snows", "It snowed", "It is snowing", "It is snow","It snows");
        final QuestionsList question4 = new QuestionsList("How many students in your class _____ from Korea?","will coming", "coming", "are come", "will be coming","will be coming");
        final QuestionsList question5 = new QuestionsList("Billy _____ his teeth before breakfast every morning.","will cleaned", "is cleaning", "cleans", "clean", "cleans");
        final QuestionsList question6 = new QuestionsList("It's 7PM in New York City and _____.","it snowed", "it snows", "it's snowing", "there is snow", "it's snowing");
        final QuestionsList question7 = new QuestionsList("Babies _____ when they are hungry.","cry", "cries", "cried", "are crying", "cry");
        final QuestionsList question8 = new QuestionsList("Jane _____ her blue jeans today, but usually she wears a skirt or a dress.","wears", "wearing", "wear", "is wearing", "is wearing");
        final QuestionsList question9 = new QuestionsList("I think I _____ a new calculator. This one does not work properly any more.","needs", "needed", "need", "am needing", "need");

        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);

        return questionsLists;
    }

    private static List<QuestionsList> Questions2() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Create object of QuestionsList class and pass a questions along with options and answer
        final QuestionsList question1 = new QuestionsList("It is not ____ mine.", "same as", "same like", "the same as", "the same like", "same as");
        final QuestionsList question2 = new QuestionsList("He _________ that the subject of holiday pay should be raised at the next meeting.", "Advised", "Proposed","Say","Make","Proposed");
        final QuestionsList question3 = new QuestionsList("You're looking very ______________ yourself! Have you won some money?", ".Afraid", "Angry", "Concerned", "Pleased", "Pleased");
        final QuestionsList question4 = new QuestionsList("Sorry I'm late. I ________ lost.", "Get", "Got", "Became", "Become", "Got");
        final QuestionsList question5 = new QuestionsList("I'm busy right now, but I'll be with you ___ a moment", "On", "At", "In", "Before", "In");
        final QuestionsList question6 = new QuestionsList("She ___________ a minister in the government in 1981.", "Get", "Got", "Became", "Become", "Became");

        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<QuestionsList> Questions3() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Create object of QuestionsList class and pass a questions along with options and answer
        final QuestionsList question1 = new QuestionsList("Complete using can, could, or (be) able to in the correct tense. They didn't want to come with us at first, but we ___________________ persuade them.", "Able to", "Were", "Were able to", "Could", "Were able to");
        final QuestionsList question2 = new QuestionsList("Add an appropriate reflexive pronoun. George's mother didn't want him to take the job on the oil rig. In fact, George didn't feel very happy about it _____________. ", "Itself", "Himself", "Herself", "None of the above", "Himself");
        final QuestionsList question3 = new QuestionsList("Call me after eight o'clock, we ____________________ dinner by then. (finish)", "Finished", "Finishing", "Will have finished", "Ate", "Will have finished");
        final QuestionsList question4 = new QuestionsList("Choose the more appropriate alternative: Later, in Rome, I was to meet Professor Taylor _________________. ", "But he left before I got there.", "And was very impressed by his knowledge.", "And I met his brother.", "None of the above.", "But he left before I got there.");
        final QuestionsList question5 = new QuestionsList("____________________ the car (I / wash)", "I was washing","I'm washing", "I washing", "Washing", "I'm washing");
        final QuestionsList question6 = new QuestionsList("House prices are very high. They've __________ a lot in the last few years.", "Going up", "Will have gone upv", "Going to go up", "Gone up", "Gone up");

        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<QuestionsList> Questions4() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Create object of QuestionsList class and pass a questions along with options and answer
        final QuestionsList question1 = new QuestionsList("She left the lights on overnight and in the morning couldn't ____________ the car started.", "Have", "Had", "Get", "Got", "Get");
        final QuestionsList question2 = new QuestionsList("Enter the word in brackets in the correct form The river_____________ (flow) very quickly today, much faster than usual.","Is flowing", "Was flowing", "Have been flowing", "Flew","Is flowing");
        final QuestionsList question3 = new QuestionsList("Complete using a reflexive pronoun Very young children should not go swimming by ________________.", "Themselves", "Ourselves", "Himself", "Herself", "Themselves");
        final QuestionsList question4 = new QuestionsList("We were the only guests at the hotel. ___________________________ ","Nobody else had stayed there", "Nobody else was staying there", "Nobody else even stayed there", "Nobody else stayed there", "Nobody else was staying there");
        final QuestionsList question5 = new QuestionsList("Choose the correct sentence that combines the following two sentences into one: A bus goes to the airport. It arrives every half hour.", "The bus, that goes to the airport, arrives every half hour", "The bus arrives every half hour, which goes to the airport", "The bus which goes to the airport arrives every half hour", "The bus goes to the airport which arrives every half hour", "The bus which goes to the airport arrives every half hour");
        final QuestionsList question6 = new QuestionsList("There was so much traffic, I was lucky to get ____________ the road without being knocked over.", "Across", "Over", "Along", "Through", "Across");

        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    public static List<QuestionsList> getQuestions(String selectedTopicName) {
        switch (selectedTopicName) {
            case "Quiz I":
                return Questions1();
            case "Quiz II":
                return Questions2();
            case "Quiz IV":
                return Questions4();
            default:
                return Questions3();
        }
    }
}
