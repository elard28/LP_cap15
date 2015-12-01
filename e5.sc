(define (ceros ls)
	(cond
	((null? ls) 0)
	((= 0 (car ls)) (+ 1 (ceros (cdr ls))))
	(else (ceros (cdr ls))
	)
)