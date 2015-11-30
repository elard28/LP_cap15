(define (pot a b)
    (cond ((= b 0) 1)
          (else (* a (pot a (- b 1))))))