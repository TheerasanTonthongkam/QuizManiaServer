package quizmania

import grails.converters.JSON

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class QuizController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Quiz.list(params), model:[quizCount: Quiz.count()]
    }

    def show(Quiz quiz) {
        respond quiz
    }

    def create() {
        respond new Quiz(params)
    }

    @Transactional
    def save(Quiz quiz) {
        if (quiz == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (quiz.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond quiz.errors, view:'create'
            return
        }

        quiz.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'quiz.label', default: 'Quiz'), quiz.id])
                redirect quiz
            }
            '*' { respond quiz, [status: CREATED] }
        }
    }

    def edit(Quiz quiz) {
        respond quiz
    }

    @Transactional
    def update(Quiz quiz) {
        if (quiz == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (quiz.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond quiz.errors, view:'edit'
            return
        }

        quiz.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'quiz.label', default: 'Quiz'), quiz.id])
                redirect quiz
            }
            '*'{ respond quiz, [status: OK] }
        }
    }

    @Transactional
    def delete(Quiz quiz) {

        if (quiz == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        quiz.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'quiz.label', default: 'Quiz'), quiz.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'quiz.label', default: 'Quiz'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }

    def getQuizzes() {
        println("Rate = " + params.rate)
        def quizCriteria = Quiz.createCriteria()
        def List results

        int rate = Integer.parseInt(params.rate)

        if (rate < -5) {
            results = quizCriteria.list {
                and {
                    eq ("level", 1)
                }
            }
        } else if (rate > 5) {
            results = quizCriteria.list {
                and {
                    eq ("level", 3)
                }
            }
        } else {
            results = quizCriteria.list {
                and {
                    eq ("level", 2)
                }
            }
        }

        Collections.shuffle(results)

        render results.subList(0, 15) as JSON
    }
}
