(define (cuad a b c)
(if (zero? a)
0
((display ( (+ (- b) (sqrt (- (* b b) (* 4 a c)))) )) (newline) 
(display ( (- (- b) (sqrt (- (* b b) (* 4 a c)))) )) (newline))
))