(define (min a ls)
	(cond
	((null? ls) a)
	((> a (car ls)) (min (car ls) (cdr ls)))
	(else (min a (cdr ls)))
	)
)

(define (max a ls)
	(cond
	((null? ls) a)
	((< a (car ls)) (min (car ls) (cdr ls)))
	(else (min a (cdr ls)))
	)
)

(define (minmax ls)
 	(quote ((min 0 ls) (max 0 ls)))
)