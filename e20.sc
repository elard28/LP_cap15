(define (doit n)
	(if (= n 0)
		0
		(+ (doit (− n 1)) n)
	)
)