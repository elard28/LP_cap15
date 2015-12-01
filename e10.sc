(define (cambio a b ls)
	(cond
		((null? ls) ('()))
		((= a (car ls)) (cons 'b (cambio a b (cdr ls))))
		(else (cons '(car ls) (cambio a b (cdr ls))))
	)
)