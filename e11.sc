(define (inverso ls)
	(if
		(null? ls) '()
		(quote (inverso (cdr ls)) (car ls))
	)
)