import quizmania.Quiz
import quizmania.Rank

class BootStrap {

    def init = { servletContext ->
        new Rank(score: 1500, name: "Daenerys Targaryen").save()
        new Rank(score: 1400, name: "Jon Snow").save()
        new Rank(score: 1300, name: "Tyrion Lannister").save()
        new Rank(score: 1200, name: "Arya Stark").save()
        new Rank(score: 1100, name: "Joffrey Baratheon").save()
        new Rank(score: 1000, name: "Tony Stark").save()
        new Rank(score: 900, name: "Bran Stark").save()
        new Rank(score: 800, name: "Shae").save()
        new Rank(score: 700, name: "Margaery Tyrell").save()


        // Level 1 init

        new Quiz(question:"1 Which song is Taylor Swift song?",
                level: 1,
                correctAnswer: "We are never getting back together",
                wrongAnswer1: "All about the base",
                wrongAnswer2: "Bad Romance",
                wrongAnswer3: "Girlfriend"
        ).save()

        new Quiz(question: "1 Who is she ?",
                imageUrl: "https://s-media-cache-ak0.pinimg.com/originals/a1/54/71/a154710a0e81f9774fbd1c44f810a8d4.jpg",
                level: 1,
                correctAnswer: "Megan Fox",
                wrongAnswer1: "Meghan Trainor",
                wrongAnswer2: "Megan Wolve",
                wrongAnswer3: "Megan Fish"
        ).save()

        new Quiz(question: "1 What color is the French wine Beaujolais?",
                imageUrl: "",
                level: 1,
                correctAnswer: "Red color",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "1 What should you do in the Arab countries to show that the food was delicious?",
                imageUrl: "",
                level: 1,
                correctAnswer: "Belch",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "1 Which nuts are used in marzipan?",
                imageUrl: "",
                level: 1,
                correctAnswer: "Almonds",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "1 From which cactus is tequila made?",
                imageUrl: "",
                level: 1,
                correctAnswer: "Agave",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "1 From which country does pitta bread originate?",
                imageUrl: "",
                level: 1,
                correctAnswer: "Greece",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "1 Which country is the origin of the cocktail Mojito?",
                imageUrl: "http://d3k19ysnp189dx.cloudfront.net/wp-content/uploads/2016/12/Pineapple-Mojitos-6.jpg",
                level: 1,
                correctAnswer: "Cuba",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "1 What is the well known drink from Greece?",
                imageUrl: "",
                level: 1,
                correctAnswer: "Ouzo",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "1 What is called a meal in open air?",
                imageUrl: "",
                level: 1,
                correctAnswer: "Picnic",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "1 Which cheese is traditionally used for pizzas?",
                imageUrl: "",
                level: 1,
                correctAnswer: "Mozzarella",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "Which country is the origin of the Stella beer?",
                imageUrl: "http://media.olivegarden.com/en_us/images/product/D_Stella_Web_154.jpg",
                level: 1,
                correctAnswer: "Belgium",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "1 From which country is the famous Emmental Cheese?",
                imageUrl: "",
                level: 1,
                correctAnswer: "Switzerland",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "1 What is the most famous Mexican beer?",
                imageUrl: "",
                level: 1,
                correctAnswer: "Corona",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "1 What is the name of the gas that let rise bread dough?",
                imageUrl: "http://steamykitchen.com/wp-content/uploads/2010/03/french-bread-dough-ball.jpg?eaa646",
                level: 1,
                correctAnswer: "Carbon dioxide",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "1 What is Japanese sake made from?",
                imageUrl: "",
                level: 1,
                correctAnswer: "Rice",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "1 What is bottled a lot in the French town Vichy?",
                imageUrl: "http://www.auvergne-tourism.com/docs/1546-5-003828-copie-jpg.jpg",
                level: 1,
                correctAnswer: "Water",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "1 Which French town is known for its mustard?",
                imageUrl: "",
                level: 1,
                correctAnswer: "Dijon",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "1 What is the chemical formula for Table Salt?",
                imageUrl: "",
                level: 1,
                correctAnswer: "NaCl",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "1 What beer is marketed as The king of beers?",
                imageUrl: "http://hensley.com/wp-content/uploads/2015/03/project-budweiser.jpg",
                level: 1,
                correctAnswer: "Budweiser",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "1 What is the name of the pan in which one makes paella?",
                imageUrl: "",
                level: 1,
                correctAnswer: "Paella (Paella means pan)",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "1 With which fruit is Kriek beer (a Belgium brew) is flavoured?",
                imageUrl: "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a5/Kriek_Beer.jpg/260px-Kriek_Beer.jpg",
                level: 1,
                correctAnswer: "Cherries",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        // Level 2 init

        new Quiz(question:"2 Which song is Taylor Swift song?",
                level: 2,
                correctAnswer: "We are never getting back together",
                wrongAnswer1: "All about the base",
                wrongAnswer2: "Bad Romance",
                wrongAnswer3: "Girlfriend"
        ).save()

        new Quiz(question: "2 Who is she ?",
                imageUrl: "https://s-media-cache-ak0.pinimg.com/originals/a1/54/71/a154710a0e81f9774fbd1c44f810a8d4.jpg",
                level: 2,
                correctAnswer: "Megan Fox",
                wrongAnswer1: "Meghan Trainor",
                wrongAnswer2: "Megan Wolve",
                wrongAnswer3: "Megan Fish"
        ).save()

        new Quiz(question: "2 What color is the French wine Beaujolais?",
                imageUrl: "",
                level: 2,
                correctAnswer: "Red color",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "2 What should you do in the Arab countries to show that the food was delicious?",
                imageUrl: "",
                level: 2,
                correctAnswer: "Belch",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "2 Which nuts are used in marzipan?",
                imageUrl: "",
                level: 2,
                correctAnswer: "Almonds",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "2 From which cactus is tequila made?",
                imageUrl: "",
                level: 2,
                correctAnswer: "Agave",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "2 From which country does pitta bread originate?",
                imageUrl: "",
                level: 2,
                correctAnswer: "Greece",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "2 Which country is the origin of the cocktail Mojito?",
                imageUrl: "http://d3k19ysnp189dx.cloudfront.net/wp-content/uploads/2016/12/Pineapple-Mojitos-6.jpg",
                level: 2,
                correctAnswer: "Cuba",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "2 What is the well known drink from Greece?",
                imageUrl: "",
                level: 2,
                correctAnswer: "Ouzo",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "2 What is called a meal in open air?",
                imageUrl: "",
                level: 2,
                correctAnswer: "Picnic",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "2 Which cheese is traditionally used for pizzas?",
                imageUrl: "",
                level: 2,
                correctAnswer: "Mozzarella",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "Which country is the origin of the Stella beer?",
                imageUrl: "http://media.olivegarden.com/en_us/images/product/D_Stella_Web_154.jpg",
                level: 2,
                correctAnswer: "Belgium",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "2 From which country is the famous Emmental Cheese?",
                imageUrl: "",
                level: 2,
                correctAnswer: "Switzerland",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "2 What is the most famous Mexican beer?",
                imageUrl: "",
                level: 2,
                correctAnswer: "Corona",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "2 What is the name of the gas that let rise bread dough?",
                imageUrl: "http://steamykitchen.com/wp-content/uploads/2010/03/french-bread-dough-ball.jpg?eaa646",
                level: 2,
                correctAnswer: "Carbon dioxide",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "2 What is Japanese sake made from?",
                imageUrl: "",
                level: 2,
                correctAnswer: "Rice",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "2 What is bottled a lot in the French town Vichy?",
                imageUrl: "http://www.auvergne-tourism.com/docs/1546-5-003828-copie-jpg.jpg",
                level: 2,
                correctAnswer: "Water",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "2 Which French town is known for its mustard?",
                imageUrl: "",
                level: 2,
                correctAnswer: "Dijon",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "2 What is the chemical formula for Table Salt?",
                imageUrl: "",
                level: 2,
                correctAnswer: "NaCl",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "2 What beer is marketed as The king of beers?",
                imageUrl: "http://hensley.com/wp-content/uploads/2015/03/project-budweiser.jpg",
                level: 2,
                correctAnswer: "Budweiser",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "2 What is the name of the pan in which one makes paella?",
                imageUrl: "",
                level: 2,
                correctAnswer: "Paella (Paella means pan)",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "2 With which fruit is Kriek beer (a Belgium brew) is flavoured?",
                imageUrl: "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a5/Kriek_Beer.jpg/260px-Kriek_Beer.jpg",
                level: 2,
                correctAnswer: "Cherries",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        // Level 3 init

        new Quiz(question:"3 Which song is Taylor Swift song?",
                level: 3,
                correctAnswer: "We are never getting back together",
                wrongAnswer1: "All about the base",
                wrongAnswer2: "Bad Romance",
                wrongAnswer3: "Girlfriend"
        ).save()

        new Quiz(question: "3 Who is she ?",
                imageUrl: "https://s-media-cache-ak0.pinimg.com/originals/a1/54/71/a154710a0e81f9774fbd1c44f810a8d4.jpg",
                level: 3,
                correctAnswer: "Megan Fox",
                wrongAnswer1: "Meghan Trainor",
                wrongAnswer2: "Megan Wolve",
                wrongAnswer3: "Megan Fish"
        ).save()

        new Quiz(question: "3 What color is the French wine Beaujolais?",
                imageUrl: "",
                level: 3,
                correctAnswer: "Red color",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "3 What should you do in the Arab countries to show that the food was delicious?",
                imageUrl: "",
                level: 3,
                correctAnswer: "Belch",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "3 Which nuts are used in marzipan?",
                imageUrl: "",
                level: 3,
                correctAnswer: "Almonds",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "3 From which cactus is tequila made?",
                imageUrl: "",
                level: 3,
                correctAnswer: "Agave",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "3 From which country does pitta bread originate?",
                imageUrl: "",
                level: 3,
                correctAnswer: "Greece",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "3 Which country is the origin of the cocktail Mojito?",
                imageUrl: "http://d3k19ysnp189dx.cloudfront.net/wp-content/uploads/2016/12/Pineapple-Mojitos-6.jpg",
                level: 3,
                correctAnswer: "Cuba",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "3 What is the well known drink from Greece?",
                imageUrl: "",
                level: 3,
                correctAnswer: "Ouzo",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "3 What is called a meal in open air?",
                imageUrl: "",
                level: 3,
                correctAnswer: "Picnic",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "3 Which cheese is traditionally used for pizzas?",
                imageUrl: "",
                level: 3,
                correctAnswer: "Mozzarella",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "Which country is the origin of the Stella beer?",
                imageUrl: "http://media.olivegarden.com/en_us/images/product/D_Stella_Web_154.jpg",
                level: 3,
                correctAnswer: "Belgium",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "3 From which country is the famous Emmental Cheese?",
                imageUrl: "",
                level: 3,
                correctAnswer: "Switzerland",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "3 What is the most famous Mexican beer?",
                imageUrl: "",
                level: 3,
                correctAnswer: "Corona",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "3 What is the name of the gas that let rise bread dough?",
                imageUrl: "http://steamykitchen.com/wp-content/uploads/2010/03/french-bread-dough-ball.jpg?eaa646",
                level: 3,
                correctAnswer: "Carbon dioxide",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "3 What is Japanese sake made from?",
                imageUrl: "",
                level: 3,
                correctAnswer: "Rice",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "3 What is bottled a lot in the French town Vichy?",
                imageUrl: "http://www.auvergne-tourism.com/docs/1546-5-003828-copie-jpg.jpg",
                level: 3,
                correctAnswer: "Water",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "3 Which French town is known for its mustard?",
                imageUrl: "",
                level: 3,
                correctAnswer: "Dijon",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "3 What is the chemical formula for Table Salt?",
                imageUrl: "",
                level: 3,
                correctAnswer: "NaCl",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "3 What beer is marketed as The king of beers?",
                imageUrl: "http://hensley.com/wp-content/uploads/2015/03/project-budweiser.jpg",
                level: 3,
                correctAnswer: "Budweiser",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "3 What is the name of the pan in which one makes paella?",
                imageUrl: "",
                level: 3,
                correctAnswer: "Paella (Paella means pan)",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()

        new Quiz(question: "3 With which fruit is Kriek beer (a Belgium brew) is flavoured?",
                imageUrl: "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a5/Kriek_Beer.jpg/260px-Kriek_Beer.jpg",
                level: 3,
                correctAnswer: "Cherries",
                wrongAnswer1: "Blue",
                wrongAnswer2: "Green",
                wrongAnswer3: "White"
        ).save()
    }


    def destroy = {
    }
}
