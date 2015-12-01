(define (elimina a ls)
	(cond
		((null? ls) ('()))
		((= a (car ls)) (elimina a (cdr ls)))
		(else (cons '(car ls) (elimina a (cdr ls))))
	)
)

(define (elimina2 ls2 ls)
	(if (null? ls2) ls
		(elimina2 (cdr ls2) (elimina (car ls2) ls) 
	)
)