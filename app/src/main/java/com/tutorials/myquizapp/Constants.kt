package com.tutorials.myquizapp

object Constants {

    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia",
            "Armenia", "Austria",
            1
        )
        questionList.add(que1)

        val que2 = Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Argentina", "Australia",
            "Armenia", "Austria",
            2
        )
        questionList.add(que2)

        val que3 = Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Argentina", "Australia",
            "Armenia", "belgium",
            4
        )
        questionList.add(que3)

        val que4 = Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Argentina", "Australia",
            "Brazil", "Austria",
            3
        )
        questionList.add(que4)

        val que5 = Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Argentina", "Austria",
            "Brazil", "No_Answer",
            4
        )
        questionList.add(que5)

        val que6 = Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Argentina", "Fiji",
            "Brazil", "Austria",
            2
        )
        questionList.add(que6)

        val que7 = Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Argentina", "Australia",
            "Brazil", "Germany",
            4
        )
        questionList.add(que7)

        val que8 = Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "India", "Australia",
            "Brazil", "Austria",
            1
        )
        questionList.add(que8)

        val que9 = Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Brazil", "New_Zealand",
            "Brazil", "Fiji",
            3
        )
        questionList.add(que9)

        return questionList
    }
}