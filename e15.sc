(define (segundo ls)
	(if
		(null? (cdr ls)) ()
		(quote (car ls) (cdr (cdr ls)))
	)
)