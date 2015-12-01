(define (elimina a ls)
	(cond
		((null? ls) (()))
		((= a (car ls)) (elimina a (cdr ls)))
		(else (cons '(car ls) (elimina a (cdr ls))))
	)
)