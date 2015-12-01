(define (ultimo ls)
	(if
		(null? (cdr ls))
		('())
		(cons '(car ls) (cdr ls))
	)
)