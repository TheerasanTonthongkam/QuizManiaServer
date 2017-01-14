package quizmania

class Quiz {

    String question
    String imageUrl;
    int level
    String correctAnswer
    String wrongAnswer1
    String wrongAnswer2
    String wrongAnswer3

    static constraints = {
        question()
        imageUrl(nullable:true, blankable:true)
        level (min:1, max: 3)
        correctAnswer()
        wrongAnswer1()
        wrongAnswer2()
        wrongAnswer3()
    }
}
